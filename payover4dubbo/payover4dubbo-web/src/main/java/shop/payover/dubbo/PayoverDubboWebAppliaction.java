package shop.payover.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"shop.payover"})
public class PayoverDubboWebAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(PayoverDubboWebAppliaction.class, args);
    }
}
