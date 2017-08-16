# web
> spring-boot basic features

## controller & mockmvc
1. com.stonecj.webtest.web.HelloController

## properties configuration (yaml)
1. com.stonecj.webtest.web.YamlPropertyController
2. com.stonecj.webtest.config.ApplicationProperties
3. with @value or @ConfigurationProperties, fields must have both getter and setter methods.
4. 属性加载优先级(优先级高的覆盖优先级低的)
    1. 命令行传入的参数
    2. SPRING_APPLICATION_JSON中属性。SPRING_APPLICATION_JSON以JSON格式配置在系统环境变量中的内容
    3. java:comp/env中的JNDI属性。
    4. java的系统属性, 可以通过System.getProperties()获得
    5. 操作系统环境变量
    6. 通过random.*配置的随机属性
    7. 位于当前jar之外，针对不同{profile}环境的配置文件内容。例如application-{profile}.properties或是YAML定义的配置文件
    8. 位于当前jar之内，针对不同{profile}环境的配置文件内容。例如application-{profile}.properties或是YAML定义的配置文件
    9. 位于当前jar之外的application.properties和YAML配置内容
    10. 位于当前jar之内的application.properties和YAML配置内容
    11. 在@Configuration注解修改的类中，通过@PropertySource注解定义的属性
    12. 应用默认属性，使用SpringApplication.setDefaultProperties定义的内容
    
