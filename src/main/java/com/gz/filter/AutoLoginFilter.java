package com.gz.filter;


import com.gz.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutoLoginFilter implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("调用了拦截器");
		try {
			// 先判断，现在session中还有没有那个userBean.
			Object user1 = request.getSession().getAttribute("user");
			// 还有，有效。
			if (user1 != null) {
				System.out.println("456");
				return true;
			} else {
				request.setAttribute("msg","没有权限请先登陆");
				request.getRequestDispatcher("/index.jsp").forward(request,response);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
