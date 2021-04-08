package cn.tucci;

import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tucci.lee
 */
@EnableCaching
public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
		Object bean = ac.getBean(Cat.class);
		System.out.println(bean);
		TestConfig bean1 = ac.getBean(TestConfig.class);
		System.out.println(bean1);
	}
}
