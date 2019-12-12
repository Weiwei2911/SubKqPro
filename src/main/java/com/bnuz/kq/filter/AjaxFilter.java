package com.bnuz.kq.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class AjaxFilter extends OncePerRequestFilter{  

    @Override  
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)  
            throws ServletException, IOException {  
    	System.out.println(123);
        response.setHeader("Access-Control-Allow-Origin", "*"); 
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, If-Modified-Since");  
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");  
        response.setHeader("Access-Control-Max-Age", "3600");  
        response.addHeader("Access-Control-Allow-Credentials", "true");  
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("application/json");  
        //此行代码确保请求可以继续执行至Controller  
        filterChain.doFilter(request, response);   
    }  
}