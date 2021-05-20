package cn.tucci.scan;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * @author tucci.lee
 */
public class MyServiceBeanPostProcessor implements BeanDefinitionRegistryPostProcessor {
	private String[] basePackages;


	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		ClassPathMyServiceBeanDefinitionScanner scanner = new ClassPathMyServiceBeanDefinitionScanner(registry);
		scanner.addIncludeFilter(new AnnotationTypeFilter(MyService.class));
		scanner.scan(basePackages);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// do nothing
	}

	public void setBasePackage(String[] basePackages) {
		this.basePackages = basePackages;
	}
}
