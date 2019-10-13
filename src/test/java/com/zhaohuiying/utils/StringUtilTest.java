package com.zhaohuiying.utils;



import org.junit.Test;

import com.zhaohuiying.common.StringUtil;

public class StringUtilTest {
	/**
	 * 
	 * @Title: testToHtml 
	 * @Description: 
	 * @return: void
	 */
	@Test
	public void testToHtml() {
		String text ="bbbbbbbbb";
		String html = StringUtil.toHtml(text);
		System.out.println(html);
	}
	/**
	 * 
	 * @Title: testIdPhoneNumber 
	 * @Description: 是否是手机号
	 * @return: void
	 */
	@Test
	public void testIdPhoneNumber() {
		String src ="18360291415";
		boolean number = StringUtil.idPhoneNumber(src );
		System.out.println(number);
	}
	/**
	 * 
	 * @Title: testIdEmail 
	 * @Description: 测试是否是邮箱
	 * @return: void
	 */
	@Test
	public void testIdEmail() {
		String email="673950766@qq.com";
		boolean isEmail = StringUtil.idEmail(email);
		System.out.println(isEmail);
	}
	
	

}
