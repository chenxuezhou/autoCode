项目介绍
-------------------
> **autoCode介绍**

> - autoCode是一个代码生成工具。基于velocity模板引擎，采用SpringMVC + mybatis + jquery easyUI + mysql

> **其特点主要有**
> - 依赖[durcframework-core](https://git.oschina.net/durcframework/durcframework-core)框架



> **部署程序步骤:**


> 4. 启动项目,运行Maven命令:mvn jetty:run


maven点击闪电可以跳过单元测试，更新代码后加个clean 清除掉原有


.${ModelName} 指的是什么，一定要设置模块名

jsp 和mapper.xml移动到对应位置，applicationContext.xml和MVC.xml文件增加扫描包

org.mybatis.spring.mapper.MapperScannerConfigurer 对应的bean配置basePackage


