package cn.tucci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author tucci.lee
 */
@Component
public class A {

	@Autowired
	private B b;

	public void testPrint(){
		System.out.println("testPrint:A");
	}

}
