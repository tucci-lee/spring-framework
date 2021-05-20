package cn.tucci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author tucci.lee
 */
@Component
public class B {

	@Autowired
	private A a;

	public void testPrint(){
		System.out.println("testPrint:B");
	}
}
