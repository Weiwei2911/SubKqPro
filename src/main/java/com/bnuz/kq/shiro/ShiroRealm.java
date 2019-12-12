package com.bnuz.kq.shiro;



import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.bnuz.kq.bean.BusUser;
import com.bnuz.kq.service.UserService;


public class ShiroRealm extends AuthorizingRealm{
	
	@Autowired
	private UserService userService;
	
	
	
	/**
	* 用于的权限的认证。
	* @param principalCollection
	* @return
	*/
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		String username = principals.getPrimaryPrincipal().toString() ;
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo() ;
		Set<String> roleName = userService.selectRolesByUsername(username);
		Set<String> permissions = userService.findPermissions(username) ;
		/*Set<String> roleName = new HashSet<String>();
		Set<String> permissions = userService.findPermissions(username) ;*/
		info.setRoles(roleName);
		info.setStringPermissions(permissions);
		return info;
	}
	
	/**
	* 用于登陆认证。
	* @param principalCollection
	* @return
	*/
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		//1.把AuthenticationToken 转化为UserNamePasswordToken
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		//2.从中获取username
		String username = upToken.getUsername();
		System.out.println("-------------获取的username"+username+"-----------\n");
		//3.调用数据库方法查username对应记录
		/*BusUser user = userService.findUserByUsername(username);*/
		//4.不存在抛出异常
		if("unknown".equals(username)){
			throw new UnknownAccountException("用户不存在!");
		}
		//5.根据其他情况
		//6。根据对应情况构建AuthenticationInfo并返回
		//一下信息是从数据库库中获取：1.principal认证实体信息
//		Object principal = username;
//	    Object credentials = "123456";
//	    String realmName = getName();
	    
	    BusUser busUser = userService.findUserByUsername(username);
	    
	    System.out.println("-------------数据库的的信息"+busUser+"-----------\n");
	    
	    String password= String.valueOf(upToken.getPassword());
	    
	    
	    if(!password.equals(busUser.getPassword())){
	    	throw new AuthenticationException("密码错误！");
			
	    }
	    SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(busUser.getUserName(), busUser.getPassword(),"a");
	    return info;
		/*SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(),"a");*/
	    
	}



	

	


}
