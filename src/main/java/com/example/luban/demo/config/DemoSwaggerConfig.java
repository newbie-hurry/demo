package com.example.luban.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: dxq
 * @Date: 2021/3/7 1:58
 * @Version 1.0
 */

@Configuration
public class DemoSwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为controller包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.luban.demo"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot使用 Swagger2 构建RestFul API")
                //创建人
                .contact(new Contact("小川", "http://localhost:8764/swagger-ui.html", "1598078574@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("跑圈模块接口文档")
                .build();

    }
}
