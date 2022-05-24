//package com.poc.userservice;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//class OpenApiConfig {
//    @Value("${application-name}")
//    String appName;
//
//    @Value("${application-tos}")
//    String appTos;
//
//    @Bean
//    public OpenAPI customOpenAPI(@Value("${application-description}")
//                                         String appDescription,
//                                 @Value("${application-version}")
//                                         String appVersion) {
//        return new OpenAPI()
//                .info(new Info()
//                        .title(appName)
//                        .version(appVersion)
//                        .description(appDescription)
//                        .termsOfService(appTos)
//                        .license(new License().
//                                name("Apache 2.0").
//                                url("http://springdoc.org")));
//    }
//
//}