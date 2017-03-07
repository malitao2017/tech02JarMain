1.log4j加载过程：log4j启动时，默认会寻找source folder下的log4j.xml配置文件，若没有，会寻找log4j.properties文件。然后加载配置。

2.使用 log4j.xml 的形式 ,直接替换 log4j.properties,作用一样

3.log4j.properties配置文件，配置简单，但不支持复杂过滤器filter，log4j.xml虽然配置文件看似复杂，但支持复杂过滤器和Log4j的新特性。推荐使用log4j.xml

