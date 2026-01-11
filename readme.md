- 'var' keyword came from java 10 and it provides type inference.
- spring container - manages spring beans and their lifecycle ( ioc container )
- 2 types of ioc container

1. bean factory: basic spring container
2. application context: advanced spring container with enterprise specific features.
   - easy to use in web applications
   - easy i18n
   - easy integration with spring aop

- difference between pojo, java bean and spring bean
- pojo is generally every object
- javabean means like enterprise java beans ( ejb )
- javabean should have a no argument constructor, it should have getters and setters, it should be serializable
- anything managed by spring is known as spring beans
- spring uses ioc container ( bean factory or application context ) to manage these objects

- how can I list all beans managed by spring

1. active learning
2. regular review

- @Primary - a bean should be given preference when multiple candidates are qualified
- @Qualifer - a specific bean should be auto-wired
- @Autowired - it gives the preferred bean
- @Autowirted + @Qualifier - it gives the specific bean
