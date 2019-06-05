package com.swagger.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    //需要扫描的包路径
    private String basePackage = "com";
    //显示的标题
    private String title = "swagger";
    //联系人
    private  String contactName;
    //联系地址
    private  String contactUrl;
    //联系邮件地址
    private  String contactEmail;
    //文档版本号
    private String version;
    //描述
    private  String description;
    //
    private  String termsOfServiceUrl;

    private  String license;
    private  String licenseUrl;

}
