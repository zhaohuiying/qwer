package com.zhaohuiying.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	//AutoCloseable ables
	public static void closeAll(AutoCloseable ... ables){
		//TODO 实现代码
		if(ables.length!=0) {
			for (AutoCloseable autoCloseable : ables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	@SuppressWarnings("unused")
	public static String readTextFile(InputStream src){
		//TODO 实现代码
		//首先new 一个字节数组输出流
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		//并进行边读边写
		byte[] b=new byte[1024];
		String str =null;
		int x= 0;
		try {
			while((x=src.read(b))!=-1) {
				stream.write(b);
			}
			str =stream.toString("utf-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭流 用我们第一个那个方法，因为我们用了两个流，所有传这两个值
		closeAll(stream,src);
		return str;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		//TODO 实现代码
		try {
			//调用第二个方法
			return readTextFile(new FileInputStream(txtFile));//这里参数得把我们测试穿过来的File 转成 InputStream
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
