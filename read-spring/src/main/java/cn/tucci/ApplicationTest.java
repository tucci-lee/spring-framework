package cn.tucci;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author tucci.lee
 */
public class ApplicationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
	}

}
