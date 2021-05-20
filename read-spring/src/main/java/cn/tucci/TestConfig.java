package cn.tucci;

import cn.tucci.scan.MyService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author tucci.lee
 */
@Configuration
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@ComponentScan(value = "cn.tucci", includeFilters = @ComponentScan.Filter(MyService.class))
//@MyServiceScan(basePackage = "cn.tucci")
//@Import(SpringBean.class)
@EnableAspectJAutoProxy
@Aspect
public class TestConfig {


	@Pointcut("execution(* test*(..))")
	public void pointcut(){}

	@Around("pointcut()")
	public Object invoike(ProceedingJoinPoint point) throws Throwable {
		System.out.println("begin");
		Object proceed = point.proceed();
		System.out.println("end");
		return proceed;
	}
}
