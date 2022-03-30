package com.abc;

import com.abc.beans.Book;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class ConfigPropsApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder applicationBuilder =
                new SpringApplicationBuilder(ConfigPropsApplication.class);
        applicationBuilder.bannerMode(Banner.Mode.CONSOLE);
        SpringApplication springApplication = applicationBuilder.build();
        ApplicationContext context = springApplication.run(args);
        Book book = context.getBean(Book.class);
        System.out.println(book);

    }

}
