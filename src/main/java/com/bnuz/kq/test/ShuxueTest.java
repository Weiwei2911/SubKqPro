package com.bnuz.kq.test;

public class ShuxueTest {
	public static void main(String[] args) {
		String result = "2019-9-24 15:56:2";
		String temp[]=result.split("-| ");
		for(int i = 0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
}
