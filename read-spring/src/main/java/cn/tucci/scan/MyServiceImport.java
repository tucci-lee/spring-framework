package cn.tucci.scan;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author tucci.lee
 */
public class MyServiceImport implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AnnotationAttributes attributes = AnnotationAttributes
				.fromMap(importingClassMetadata.getAnnotationAttributes(MyServiceScan.class.getName()));
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyServiceBeanPostProcessor.class);
		builder.addPropertyValue("basePackages", attributes.getStringArray("basePackages"));
		registry.registerBeanDefinition("myServiceBeanPostProcessor", builder.getBeanDefinition());
	}
}
