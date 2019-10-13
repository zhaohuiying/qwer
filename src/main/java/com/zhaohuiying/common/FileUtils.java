package com.zhaohuiying.common;

import java.io.File;

public class FileUtils {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		//TODO 实现代码
		
		//首先判断fileName不为空或长度不等于0
		if(null!=fileName && fileName.length()!=0) {
			//lastIndexOf(int ch) 
			//返回在指定字符的最后一个发生的字符串内的索引。 
			//切割字符串substring切割.最后一次出现的位置之后的字符
			return fileName.substring(fileName.lastIndexOf("."));
		}
		return "不是有效的文件";
	}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
		//TODO 实现代码
		//运用这个方法去--操作系统临时目录
		String string = System.getProperty("java.io.tmpdir");
		// 返回值是file 所有
		return new File(string);
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		//TODO 实现代码
		//运用这个方法去--返回操作系统用户目录
		String string = System.getProperty("user.home");
		// 返回值是file 所有
		return new File(string);
	}


}
