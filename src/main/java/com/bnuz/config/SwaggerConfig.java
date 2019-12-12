package com.bnuz.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = {"com.bnuz.kq.controller"})
public class SwaggerConfig {
    public Docket myDocket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("MySwagger[Api�ӿ��ĵ�]") // ����
                .description("") // ����
                .contact(new Contact("", "", "")) // ��ϵ��ʽ
                .version("1.0") // �汾��
                .build();
        docket.apiInfo(apiInfo);
        //����ֻ���ɱ�Api���ע��ע�����Ctrl������ApiOperationע���api�ӿڵ��ĵ�
        docket.select().apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
        return docket;
    }
}
