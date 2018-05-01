package shop.payover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan(value="shop.payover.manager.*")
public class PayoverManagerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PayoverManagerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        application.listeners();
        return application.sources(applicationClass);
    }

    private static Class<PayoverManagerApplication> applicationClass = PayoverManagerApplication.class;

}