package com.zhaohuiying.utils;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.zhaohuiying.common.StreamUtils;

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

}
