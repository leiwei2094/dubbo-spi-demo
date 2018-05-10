# 概述

该Demo是用于演示Dubbo的可扩展机制的。Dubbo中的可扩展点很多，本Demo选择了LoadBalance，演示了自定义一个LoadBalance，并和Dubbo集成。    

# 如何开始
1. 启动provider        
provider模块中有一个单元测试`ProviderTest`。里面有两个测试方法:
* start_provider_1
* start_provider_2

运行这两个单元测试方法，就可以启动两个provider。这两个provider会监听20881和20882端口，如果出现端口被占用，可以自行调整。

2. 启动consumer
Consumer是一个spring boot项目，运行ConsumerApp的main()方法即可启动Consumer。
Consumer包含一个嵌入的web容器，可以运行
```bash
curl localhost:8088/hello
```
会返回
```text
hello tom
```

观察Consumer，会发现输出了一条日志`DemoLoadBalance : Select the first invoker...`。说明我们自定义的LoadBalance在Dubbo中生效了。

