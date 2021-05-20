package cn.tucci.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author tucci.lee
 */
//@Component
public class AwareBean implements BeanNameAware {

	/**
	 * 会在bean实例化并填充属性后调用，在bean初始化方法前调用
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("beanName:" + name);
	}

}
