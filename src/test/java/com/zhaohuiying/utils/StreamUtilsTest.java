package com.zhaohuiying.utils;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.zhaohuiying.common.StreamUtils;
import com.zhaohuiying.common.StringUtil;

public class StreamUtilsTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() {
		try {
			String string = StreamUtils.readTextFile(new FileInputStream("F:\\1111\\1705F\\hello2.txt"));
			System.out.println(string);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testReadTextFileFile() {
		  String string = StreamUtils.readTextFile(new File("F:\\\\1111\\\\1705F\\\\hello2.txt"));
		  System.out.println(string);
	}

	@Test
	public void testnumber() {
		String src ="12.2";
		boolean b = StringUtil.isNumber(src);
		System.out.println(b);
	}
	
	
//	@Test
//	public void redisZsetTest() throws UnsupportedEncodingException {
//		String str = StreamUtil.readTextFile(new File("d:/test.txt"));
//		str = str.replace("姓名", "");
//		String[] split = str.split("\\,");
//
//		for (String string : split) {
//			
//			Product pro = new Product();
//			String[] sp = string.split("\\|");
//			for (int i = 0; i < sp.length; i++) {
//				pro.setId(sp[0].trim());
//				pro.setName(sp[1].trim());
//				pro.setPrice(Double.parseDouble(sp[2].trim()));
//				pro.setPercent(sp[3].trim());
//			}
//			redisTemplate.opsForZSet().add("set1",pro,pro.getPrice());
//		}
//	}
//
//	// 取Zset里的数据
//	@Test
//	public void redisZsetTest1() {
//		
//		Set range = redisTemplate.opsForZSet().reverseRange("set1", 0, -1);
//		for (Object object : range) {
//			System.out.println(object);
//		}
//	}
}
