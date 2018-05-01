package shop.payover;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import shop.payover.filter.AccessFilter;

/**
 * @Description: xxpay网关服务
 * @author dingzhiwei jmdhappy@126.com
 * @date 2017-07-05
 * @version V1.0
 * @Copyright: www.xxpay.org
 */
@EnableZuulProxy
@SpringCloudApplication
public class PayoverGatewayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(PayoverGatewayApplication.class).web(true).run(args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

}
