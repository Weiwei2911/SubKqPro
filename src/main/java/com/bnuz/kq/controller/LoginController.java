package com.bnuz.kq.controller;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//如果查询到的话再将查询到的用户名和密码放到SimpleAuthenticationInfo对象中，Shiro会自动根据用户输入的密码和查询到的密码进行匹配，如果匹配不上就会抛出异常，匹配上之后就会执行doGetAuthorizationInfo()进行相应的权限验证。
@Controller
@RequestMapping("/shiro")
public class LoginController {
	/*@Resource
	private UserService userservice ;*/
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,@RequestParam("password")String password){
	   Subject currentUser = SecurityUtils.getSubject() ;
	   if(!currentUser.isAuthenticated()){
		   UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		   token.setRememberMe(true);
		   try{
			   currentUser.login(token);
		   }
		   catch (AuthenticationException ae){
			   System.out.println("登陆失败:" + ae.getMessage());
		   }
	   }
	   return "redirect:/list.jsp";
	  
	}
}
