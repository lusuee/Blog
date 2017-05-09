package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SystemAspects {

	@Around("SystemArchitercture.businessService()")
	public Object beforeAdvice(ProceedingJoinPoint pjp) {
		Object obj = null;
		System.out.println(System.currentTimeMillis());
		try {
			Object[] args = pjp.getArgs();
			obj = pjp.proceed(args);
			System.out.println(pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis());
		return obj;
	}
	
}
