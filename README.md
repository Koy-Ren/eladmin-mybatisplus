# eladmin-mybatisplus

项目基于 https://github.com/elunez/eladmin 1.5正式版

增加了集成多数据源版mp。方便广大G友二次开发。

修改说明如下

## 1,增加多数据源和mp代码生成器依赖
```
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.0.7.1</version>
        </dependency>
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-generator</artifactId>
            <version>3.0.7.1</version>
        </dependency>
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>dynamic-datasource-spring-boot-starter</artifactId>
            <version>2.5.0</version>
        </dependency>
```
## 2,mp配置mapper位置
```
mybatis-plus:
  # 扫描 mapper.xml
  mapper-locations: classpath:/mapper/**/*Mapper.xml
```
## 3,AppRun调整  
  所在包向上移动一层,并添加排除Druid数据源自动配置项    
  增加@ComponentScan(basePackages = {"me.zhengjie",    "xxx.xxx"})，方便扩展2次开发。
## 4,增加signin接口和返回JsonResponse对象
