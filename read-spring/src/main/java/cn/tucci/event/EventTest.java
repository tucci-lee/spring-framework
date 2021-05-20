package cn.tucci.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tucci.lee
 */
public class EventTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext("cn.tucci.event");
		ApplicationEventBean bean = new ApplicationEventBean("nihao");
		ac.publishEvent(bean);
	}
}
