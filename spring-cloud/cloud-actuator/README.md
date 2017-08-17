# cloud-actuator
> 监控集群信息，并提供管理操作

## 整合
前提：已整合springMvc
1. pom配置
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
2. 关闭security
```properties
management.security.enabled=false
```
3. 启动项目
可访问信息如下：
![](http://oplcffkqi.bkt.clouddn.com/17-8-17/98145118.jpg)
4. 浏览器访问测试
eg：http://localhost:8080/health

---
参考[spring官方文档][1]可解决跨域、访问控制、节点开关、自定义监控点等问题

---
1. [1]: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready-endpoints  "万能的文档"