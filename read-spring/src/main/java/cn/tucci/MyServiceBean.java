package cn.tucci;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author tucci.lee
 */
//@MyService
public class MyServiceBean {

	private SpringBean springBean;

	@Autowired
	public void setSpringBean(SpringBean springBean) {
		this.springBean = springBean;
	}
}
