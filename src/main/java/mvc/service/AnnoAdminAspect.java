package mvc.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AnnoAdminAspect {
	
	HttpSession session;
	HttpServletResponse response;
	
	@Pointcut("execution(* mvc.control.admin.*.*(..))")
	void adadmin() {}
	
	@Around("adadmin()")
	Object aroundGo(ProceedingJoinPoint joinPoint) throws Throwable {
		Object res = null;
		System.out.println("around - adadmin()");
		for(Object obj : joinPoint.getArgs()) {
			if(obj instanceof HttpSession) {
				session = (HttpSession)obj;
			}
			if(obj instanceof HttpServletResponse) {
				response = (HttpServletResponse)obj;
			}
		}
		
		if(session.getAttribute("pid")==null) {
			
			response.sendRedirect("/board/");
			return res;
		}
		
		res = joinPoint.proceed();
		
		return res;
	}
}
