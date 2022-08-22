package com.wwq.worklite;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@Configuration
@EnableOpenApi
public class WorkliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkliteApplication.class, args);
    }

}
