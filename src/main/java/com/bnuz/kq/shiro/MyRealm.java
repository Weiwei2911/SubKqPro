/*package com.bnuz.kq.shiro;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.bnuz.kq.bean.BusUser;
import com.bnuz.kq.service.UserService;

public class MyRealm extends AuthorizingRealm {
	
@Resource
private UserService userService;
*//**
* ���ڵ�Ȩ�޵���֤��
* @param principalCollection
* @return
*//*
@Override
protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		String username = principalCollection.getPrimaryPrincipal().toString() ;
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo() ;
		Set<String> roleName = userService.findRoles(username) ;
		Set<String> permissions = userService.findPermissions(username) ;
		info.setRoles(roleName);
		info.setStringPermissions(permissions);
		return info;
}
*//**
* ����ִ�������¼��֤
* @param token
* @return
* @throws AuthenticationException
*//*
@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)throws AuthenticationException {
		//��ȡ�û��˺�
		String username = token.getPrincipal().toString() ;
		BusUser user = userService.findUserByUsername(username) ;
		if (user != null){
		//����ѯ�����û��˺ź������ŵ� authenticationInfo���ں����Ȩ���жϡ���������������һ�������ˡ�
		AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"a");
		    return authenticationInfo ;
		}else{
			return null ;
		}
	}
}*/