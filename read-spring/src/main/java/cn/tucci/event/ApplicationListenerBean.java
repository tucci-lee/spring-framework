package cn.tucci.event;

import org.springframework.context.ApplicationListener;

/**
 * @author tucci.lee
 */
//@Component
public class ApplicationListenerBean implements ApplicationListener<ApplicationEventBean> {
	@Override
	public void onApplicationEvent(ApplicationEventBean event) {
		Object source = event.getSource();
		System.out.println(source);
	}
}
