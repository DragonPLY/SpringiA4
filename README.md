Spring in Action, Fourth Edition
--
<a href="https://www.manning.com/books/spring-in-action-fourth-edition">The Book</a>

```
目录
第1部分Spring的核心
第1章Spring之旅3
1.1简化Java开发4
1.1.1激发POJO的潜能5
1.1.2依赖注入5
1.1.3应用切面11
1.1.4使用模板消除样板式代码16
1.2容纳你的Bean18
1.2.1使用应用上下文19
1.2.2bean的生命周期20
1.3俯瞰Spring风景线21
1.3.1Spring模块22
1.3.2Spring Portfolio24
1.4Spring的新功能27
1.4.1Spring3.1新特性27
1.4.2Spring3.2新特性28
1.4.3Spring4.0新特性30
1.5小结30
第2章装配Bean33
2.1Spring配置的可选方案34
2.2自动化装配bean35
2.2.1创建可被发现的bean35
2.2.2为组件扫描的bean命名38
2.2.3设置组件扫描的基础包39
2.2.4通过为bean添加注解实现自动装配40
2.2.5验证自动装配42
2.3通过Java代码装配bean44
2.3.1创建配置类44
2.3.2声明简单的bean45
2.3.3借助JavaConfig实现注入46
2.4通过XML装配bean48
2.4.1创建XML配置规范48
2.4.2声明一个简单的＜bean＞49
2.4.3借助构造器注入初始化bean50
2.4.4设置属性56
2.5导入和混合配置61
2.5.1在JavaConfig中引用XML配置61
2.5.2在XML配置中引用JavaConfig63
2.6小结65
第3章高级装配67
3.1环境与profile67
3.1.1配置profilebean69
3.1.2激活profile73
3.2条件化的bean75
3.3处理自动装配的歧义性78
3.3.1标示首选的bean79
3.3.2限定自动装配的bean80
3.4bean的作用域84
3.4.1使用会话和请求作用域86
3.4.2在XML中声明作用域代理87
3.5运行时值注入88
3.5.1注入外部的值89
3.5.2使用Spring表达式语言进行装配93
3.6小结99
第4章面向切面的Spring101
4.1什么是面向切面编程102
4.1.1定义AOP术语103
4.1.2Spring对AOP的支持105
4.2通过切点来选择连接点107
4.2.1编写切点108
4.2.2在切点中选择bean109
4.3使用注解创建切面109
4.3.1定义切面110
4.3.2创建环绕通知114
4.3.3处理通知中的参数115
4.3.4通过注解引入新功能118
4.4在XML中声明切面120
4.4.1声明前置和后置通知122
4.4.2声明环绕通知124
4.4.3为通知传递参数125
4.4.4通过切面引入新的功能127
4.5注入AspectJ切面128
4.6小结131
第2部分Web中的Spring
第5章构建Spring Web应用程序135
5.1Spring MVC起步136
5.1.1跟踪Spring MVC的请求136
5.1.2搭建Spring MVC138
5.1.3Spittr应用简介142
5.2编写基本的控制器143
5.2.1测试控制器145
5.2.2定义类级别的请求处理146
5.2.3传递模型数据到视图中147
5.3接受请求的输入153
5.3.1处理查询参数153
5.3.2通过路径参数接受输入155
5.4处理表单1.58
5.4.1编写处理表单的控制器160
5.4.2校验表单163
5.5小结166
第6章渲染Web视图167
6.1理解视图解析167
6.2创建JSP视图170
6.2.1配置适用于JSP的视图解析器170
6.2.2使用Spring的JSP库172
6.3使用Apache Tiles视图定义布局185
6.3.1配置Tiles视图解析器185
6.4使用Thymeleaf190
6.4.1配置Thymeleaf视图解析器191
6.4.2定义Thymeleaf模板192
6.5小结196
第7章Spring MVC的高级技术199
7.1Spring MVC配置的替代方案200
7.1.1自定义DispatcherServlet配置200
7.1.2添加其他的Servlet和Filter201
7.1.3在web.xml中声明DispatcherServlet203
7.2处理multipart形式的数据206
7.2.1配置multipart解析器207
7.2.2处理multipart请求210
7.3处理异常214
7.3.1将异常映射为HTTP状态码215
7.3.2编写异常处理的方法216
7.4为控制器添加通知218
7.5跨重定向请求传递数据219
7.5.1通过URL模板进行重定向220
7.5.2使用flash属性221
7.6小结223
第8章使用Spring Web Flow225
8.1在Spring中配置Web Flow226
8.1.1装配流程执行器226
8.1.2配置流程注册表226
8.1.3处理流程请求227
8.2流程的组件228
8.2.1状态228
8.2.2转移232
8.2.3流程数据233
8.3组合起来：披萨流程234
8.3.1定义基本流程235
8.3.2收集顾客信息238
8.3.3构建订单244
8.3.4支付246
8.4保护Web流程248
8.5小结248
第9章保护Web应用251
9.1Spring Security简介252
9.1.1理解Spring Security的模块252
9.1.2过滤Web请求253
9.1.3编写简单的安全性配置254
9.2选择查询用户详细信息的服务257
9.2.1使用基于内存的用户存储257
9.2.2基于数据库表进行认证259
9.2.3基于LDAP进行认证261
9.2.4配置自定义的用户服务265
9.3拦截请求267
9.3.1使用Spring表达式进行安全保护269
9.3.2强制通道的安全性271
9.3.3防止跨站请求伪造272
9.4认证用户273
9.4.1添加自定义的登录页274
9.4.2启用HTTP Basic认证276
9.4.3启用Remember—me功能276
9.4.4退出277
9.5保护视图278
9.5.1使用Spring Security的JSP标签库278
9.5.2使用Thymeleaf的Spring Security方言282
9.6小结283
第3部分后端中的Spring
第10章通过Spring和JDBC征服数据库287
10.1Spring的数据访问哲学288
10.1.1了解Spring的数据访问异常体系289
10.1.2数据访问模板化291
10.2配置数据源293
10.2.1使用JNDI数据源294
10.2.2使用数据源连接池294
10.2.3基于JDBC驱动的数据源296
10.2.4使用嵌入式的数据源297
10.2.5使用profile选择数据源298
10.3在Spring中使用JDBC300
10.3.1应对失控的JDBC代码301
10.3.2使用JDBC模板304
10.4小结309
第11章使用对象—关系映射持久化数据311
11.1在Spring中集成Hibernatc312
11.1.1声明Hibernate的Session工厂313
11.1.2构建不依赖于Spring的Hibernate代码315
11.2Spring与Java持久化API317
11.2.1配置实体管理器工厂317
11.2.2编写基于JPA的Repository322
11.3借助Spring Data实现自动化的JPA Repository324
11.3.1定义查询方法327
11.3.2声明自定义查询330
11.3.3混合自定义的功能331
11.4小结332
第12章使用NoSQL数据库335
12.1使用MongoDB持久化文档数据336
12.1.1启用MongoDB337
12.1.2为模型添加注解，实现MongoDB持久化340
12.1.3使用MongoTemplate访问MongoDB343
12.1.4编写MongoDB Repository344
12.2使用Ne04j操作图数据349
12.2.1配置Spring Data Neo4j349
12.2.2使用注解标注图实体352
12.2.3使用Neo4jTemplate355
12.2.4创建自动化的Neo4j Repository356
12.3使用Redis操作key—value数据361
12.3.1连接到Redis361
12.3.2使用RedisTemplate362
12.3.3使用key和value的序列化器366
12.4小结367
第13章缓存数据369
13.1启用对缓存的支持370
13.1.1配置缓存管理器371
13.2为方法添加注解以支持缓存375
13.2.1填充缓存376
13.2.2移除缓存条目380
13.3使用XML声明缓存381
13.4小结385
第14章保护方法应用387
14.1使用注解保护方法388
14.1.1使用@Secured注解限制方法调用388
14.1.2在Spring Security中使用JSR—250的@RolesAllowed注解389
14.2使用表达式实现方法级别的安全性390
14.2.1表述方法访问规则391
14.2.2过滤方法的输入和输出393
14.3小结397
第4部分Spring集成
第15章使用远程服务401
15.1Sprulg远程调用概览402
15.2使用RMI404
15.2.1导出RMI服务405
15.2.2装配RMI服务407
15.3使用Hessian和Burlap发布远程服务409
15.3.1使用Hessian和Burlap导出bean的功能410
15.3.2访问Hessian／Burlap服务413
15.4使用Spring的HttpInvoker415
15.4.1将bean导出为HTTP服务415
15.4.2通过HTTP访问服务416
15.5发布和使用Web服务418
15.5.1创建基于Spring的JAX—WS端点418
15.5.2在客户端代理JAX—WS服务421
1.5.6小结423
第16章使用Spring MVC创建REST API425
16.1了解REST426
16.1.1REST的基础知识426
16.1.2Spring是如何支持REST的427
16.2创建第一个REST端点428
16.2.1协商资源表述430
16.2.2使用HTTP信息转换器435
16.3提供资源之外的其他内容440
16.3.1发送错误信息到客户端440
16.3.2在响应中设置头部信息445
16.4编写REST客户端447
16.4.1了解RestTemplate的操作448
16.4.2GET资源449
16.4.3检索资源450
16.4.4抽取响应的元数据451
16.4.5PUT资源452
16.4.6DELETE资源453
16.4.7POST资源数据454
16.4.8在POST请求中获取响应对象454
16.4.9在POST请求后获取资源位置455
16.4.10交换资源456
16.5小结458
第17章Spring消息459
17.1异步消息简介460
17.1.1发送消息461
17.1.2评估异步消息的优点463
17.2使用JMS发送消息465
17.2.1在Spring中搭建消息代理465
17.2.2使用Spring的JMS模板467
17.2.3创建消息驱动的POJO476
17.2.4使用基于消息的RPC479
17.3使用AMQP实现消息功能481
17.3.1AMQP简介482
17.3.2配置Spring支持AMQP消息483
17.3.3使用RabbitTemplate发送消息486
17.3.4接收AMQP消息488
17.4小结491
第18章使用WebSocket和STOMP实现消息功能493
18.1使用Spring的低层级WebSocketAPI494
18.2应对不支持WebSocket的场景499
18.3使用STOMP消息502
18.3.1启用STOMP消息功能503
18.3.2处理来自客户端的STOMP消息506
18.3.3发送消息到客户端509
18.4为目标用户发送消息513
18.4.1在控制器中处理用户的消息514
18.4.2为指定用户发送消息516
18.5处理消息异常517
18.6小结518
第19章使用Spring发送Email519
19.1配置Spring发送邮件520
19.1.1配置邮件发送器520
19.1.2装配和使用邮件发送器522
19.2构建丰富内容的Email消息623
19.2.1添加附件523
19.2.2发送富文本内容的Email524
19.3使用模板生成Emzul526
19.3.1使用Velocity构建Email消息526
19.3.2使用Thymeleaf构建Email消息528
19.4小结530
第20章使用JMX管理SpringBean531
20.1将Spring bezu1导出为MBean532
20.1.1通过名称暴露方法535
20.1.2使用接口定义MBean的操作和属性537
20.1.3使用注解驱动的MBean538
20.1.4处理MBean冲突540
20.2远程MBean541
20.2.1暴露远程MBean541
20.2.2访问远程MBean542
20.2.3代理MBean544
20.3处理通知545
20.3.1监听通知546
20.4小结547
第21章借助Spring Boot简化Spring开发549
21.1Spring Boot简介550
21.1.1添加Starter依赖550
21.1.2自动配置554
21.1.3Spring BootCLI554
21.1.4Actuator555
21.2使用Spring Boot构建应用555
21.2.1处理请求558
21.2.2创建视图560
21.2.3添加静态内容562
21.2.4持久化数据563
21.2.5尝试运行565
21.3组合使用Groovy与·Spring Boot CLI568
21.3.1编写Groovy控制器568
21.3.2使用Groovy Repository实现数据持久化571
21.3.3运行Spring Boot CLI572
21.4通过Actuator获取了解应用内部状况573
21.5小结576
```
