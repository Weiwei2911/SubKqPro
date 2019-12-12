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
	* ���ڵ�Ȩ�޵���֤��
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
	* ���ڵ�½��֤��
	* @param principalCollection
	* @return
	*/
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		//1.��AuthenticationToken ת��ΪUserNamePasswordToken
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		//2.���л�ȡusername
		String username = upToken.getUsername();
		System.out.println("-------------��ȡ��username"+username+"-----------\n");
		//3.�������ݿⷽ����username��Ӧ��¼
		/*BusUser user = userService.findUserByUsername(username);*/
		//4.�������׳��쳣
		if("unknown".equals(username)){
			throw new UnknownAccountException("�û�������!");
		}
		//5.�����������
		//6�����ݶ�Ӧ�������AuthenticationInfo������
		//һ����Ϣ�Ǵ����ݿ���л�ȡ��1.principal��֤ʵ����Ϣ
//		Object principal = username;
//	    Object credentials = "123456";
//	    String realmName = getName();
	    
	    BusUser busUser = userService.findUserByUsername(username);
	    
	    System.out.println("-------------���ݿ�ĵ���Ϣ"+busUser+"-----------\n");
	    
	    String password= String.valueOf(upToken.getPassword());
	    
	    
	    if(!password.equals(busUser.getPassword())){
	    	throw new AuthenticationException("�������");
			
	    }
	    SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(busUser.getUserName(), busUser.getPassword(),"a");
	    return info;
		/*SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(),"a");*/
	    
	}



	

	


}
