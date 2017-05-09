package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SystemArchitercture {

	@Pointcut("execution(* serviceimpl.*.*(..))")
	public void businessService() {}
	
}
