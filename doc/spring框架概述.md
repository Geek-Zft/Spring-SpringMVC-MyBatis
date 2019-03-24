<h1 align="center">Spring框架概述</h1>

>Spring框架是Java应用最广的框架。它的理念包括了`IoC`(控制反转)和`AOP`(面向切面编程)

## 什么是Spring

1. Spring 是一个轻量级的 DI / IoC 和 AOP 容器的开源框架，来源于 Rod Johnson 在其著作《Expert one on one J2EE design and development》中阐述的部分理念和原型衍生而来。

2. Spring 提倡以** “最少侵入” **的方式来管理应用中的代码，这意味着我们可以随时安装或者卸载 Spring

## Spring的优势

* 低侵入 / 低耦合 （降低组件之间的耦合度，实现软件各层之间的解耦）
* 声明式事务管理 （基于切面）
* 方便集成其他框架 （如MyBatis）
* 降低Java开发难度
* Spring框架中包括了 J2EE 三层的每一层的解决方案（一站式）

## Spring能帮我们做什么

1. Spring 能帮我们根据配置文件创建及组装对象之间的依赖关系。
2. Spring 面向切面编程能帮助我们无耦合的实现日志记录，性能统计，安全控制。
3. Spring 能非常简单的帮我们管理数据库事务。
4. Spring 还提供了与第三方数据访问框架无缝集成，而且自己也提供了一套JDBC访问模板来方便数据库访问。
5. Spring 还提供与第三方Web框架无缝集成，而且自己也提供了一套Spring MVC框架，来方便web层搭建。
6. Spring 能方便的与Java EE（如Java Mail、任务调度）整合，与更多技术整合（比如缓存框架）。

## Spring的框架结构

![](https://upload-images.jianshu.io/upload_images/7896890-a7c003d175bd41af.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* Data Access/Integration层包含有JDBC、ORM、OXM、JMS和Transaction模块。
* Web层包含了Web、Web-Servlet、WebSocket、Web-Porlet模块。
* AOP模块提供了一个符合AOP联盟标准的面向切面编程的实现。
* Core Container(核心容器)：包含有Beans、Core、Context和SpEL模块。
* Test模块支持使用JUnit和TestNG对Spring组件进行测试。
