package com.zhaohuiying.utils;



import java.io.File;

import org.junit.Test;

import com.zhaohuiying.common.FileUtils;

public class FileUtilsTest {

	@Test
	public void testGetExtendName() {
		String name = FileUtils.getExtendName("bjt.txt");
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtils.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtils.getUserDirectory();
		System.out.println(file);
	}

}
