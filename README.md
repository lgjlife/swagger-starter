# 一个包含swagger的spring boot starter项目

项目的相关说明查看我的博客[创建swagger的springboot-stater,并在spring cloud zuul网关中引入](https://www.cnblogs.com/lgjlife/p/10980199.html)

├─demo 测试应用

├─swagger  swagger-spring-boot-starter

├─zuul  spring cloud zuul网关

# 如何使用

* 引入依赖
```xml
<dependency>
    <groupId>com.swagger</groupId>
    <artifactId>swagger-springboot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

* controller中使用

@Api
@ApiOperation
@ApiParam
```java
@Api(value = "/demo",description = "demo controller")
@RestController
@RequestMapping("/demo")
public class WebController {


    @ApiOperation(value = "/demo/1",notes="这是demo1",tags="{tag1,tag2}",response=String.class,httpMethod= "GET")
    @ApiParam(name = "name",value = "libai")
    @GetMapping("/1")
    public String demo1(String name){

        return   name + ":" + new Date().toString();
    }

    @ApiOperation(value = "/demo/2",notes="这是demo2",tags="{tag3,tag4}",response=String.class,httpMethod= "POST")
    @PostMapping("/2")
    public String demo2(String name){

        return   name + ":" + new Date().toString();
    }
}
```
* 启动类添加注解　@EnableSwagger2

* yml 配置
```yaml
server:
  port: 8900
swagger:
  basePackage: com
  title: "demo ui doc"
  contactName: "libai"
  contactUrl: contactUrl-demo
  contactEmail: contactEmail-demo
  version: v1.0.0
  description: description-demo
  termsOfServiceUrl: termsOfServiceUrl-demo
  license: license-demo
  licenseUrl: licenseUrl-demo
```

* 启动，访问http://localhost:8900/swagger-ui.html
