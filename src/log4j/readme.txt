log4j配置文件位置详解 
http://blog.csdn.net/lifuxiangcaohui/article/details/11042375

第一、如果采用log4j输出日志，要对log4j加载配置文件的过程有所了解。log4j启动时，默认会寻找source folder下的log4j.xml配置文件，若没有，会寻找log4j.properties文件。然后加载配置。配置文件放置位置正确，不用在程序中手动加载log4j配置文件。如果将配置文件放到了config文件夹下，在build Path中设置下就好了。
	即自动加载有两种：1.就放到src/log4j.properties 2.若放到log4g-config/log4j.properties下则在config上右键-Build Path-Use as Source Filer，让其成为一个 Source Filer
	手动加载看第二
第二、若要手动加载配置文件如下：
（1）PropertyConfigurator.configure("log4j.properties") 
	默认读取的是项目根目录的路径。此时的log4j.properties要放在项目目录下。
	如图，log4j.properties和src是同级目录，同在根目录下。
	图意：即放到项目名称下如：tech02JarMain/log4j.properties
（2）一般，一个java项目会有很多的配置文件，建议把所有的配置文件放到一个文件夹下，
	例如，放到config文件夹。那么在读取这些配置文件的时候要加上子目录名称。
	如图在项目目录下创建config文件夹（注意：不是在src文件下）,此时，config和src是同级目录
 	图意：即放到项目名称下的文件夹中如：tech02JarMain/config/log4j.properties
	这时，读取路径改为：
	PropertyConfigurator.configure("config/log4j.properties");
（3）：如果不手动设置，不用人为的写加载log.properties文件的代码时，直接放src目录下，千万要记得，如果新建一个JAVA项目，src文件要弄成原文件包才行，我就是用的这个
（4）项目打成jar包时，一般不会把配置文件也打进jar包。
	如果是第一种方式，直接将log4j.properties文件和生成的HelloWorld.jar放在同一目录下，项目就能顺利读取配置文件。
	如果是第二种方式，要建立config文件夹，把配置文件放入其中，再将config文件和生成的HelloWorld.jar放在同一目录下，项目就能顺利读取配置文件。
 思考：log4j.properties配置文件，配置简单，但不支持复杂过滤器filter，log4j.xml虽然配置文件看似复杂，但支持复杂过滤器和Log4j的新特性。推荐使用log4j.xml



