##springcloud个人学习
###eureka，zookeeper，zonsul异同点
 组件名  | 语言  | CAP | 服务健康检查  | 对外暴露接口   | spring cloud集成 
 ---- | ----- | ------ |---- | ----- | ------ 
 Eureka  | Java | AP |可配支持  | HTTP | 已集成 
 Consul  | Go | CP |支持  | HTTP/DNS | 已集成
 Zookeeper  | Java | CP |支持  | 客户端 | 已集成
 
 >**CAP**
 >>C：Consistency（强一致性），A：Availability（可用性），P：
 Partition tolerance（分区容错性）
 
 CAP理论关注粒度是数据，而不是整体系统设计的策略
 
 >**AP架构**
 >>当网络分区出现后，为了保证可用性，另一关联系统可以返回旧值，保证当前系统的可用性。
 
 结论：违背了一致性C的要求，只满足可用性和分区容错，即AP。
 >**CP架构**
 >> 当网络分区出现后，为了保证一致性，就必须拒接请求，否则无法保证一致性。
 
 结论：违背了可用性A的要求，只满足一致性和分区容错，即CP。
 
 
 
 