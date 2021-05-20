| 功能 | 处理类 | 方法 | 类型 | 
|----|----|----|----|
|aop |AnnotationAwareAspectJAutoProxyCreator|postProcessAfterInitialization|BeanPostProcessor|
|ioc处理ComponentScan等注解 |ConfigurationClassPostProcessor|postProcessBeanDefinitionRegistry|BeanFactoryPostProcessor|
|ioc依赖注入|AutowiredAnnotationBeanPostProcessor|postProcessPropertyValues|BeanPostProcessor|