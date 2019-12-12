package com.bnuz.kq.controller;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//�����ѯ���Ļ��ٽ���ѯ�����û���������ŵ�SimpleAuthenticationInfo�����У�Shiro���Զ������û����������Ͳ�ѯ�����������ƥ�䣬���ƥ�䲻�Ͼͻ��׳��쳣��ƥ����֮��ͻ�ִ��doGetAuthorizationInfo()������Ӧ��Ȩ����֤��
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
			   System.out.println("��½ʧ��:" + ae.getMessage());
		   }
	   }
	   return "redirect:/list.jsp";
	  
	}
}
