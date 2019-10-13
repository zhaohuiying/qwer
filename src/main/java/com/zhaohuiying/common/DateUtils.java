package com.zhaohuiying.common;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	
	public static Date getDateByMonthSub(Date date ,Integer month) {
		Calendar c= Calendar.getInstance();
		
		c.setTime(date);
		c.add(Calendar.MONTH, -month);
		
		return c.getTime();
		
	}
	
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//TODO 实现代码
		//首先new一下
		Calendar c = Calendar.getInstance();
		//获取你传过来的时间
		c.setTime(src);
		//进行时间初始化
		c.set(Calendar.DAY_OF_MONTH,1);//日
		c.set(Calendar.HOUR_OF_DAY,0);//小时
		c.set(Calendar.MINUTE,0);//分钟
		c.set(Calendar.SECOND,0);//秒
		//把这个时间的初始化返回
		return c.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//首先new一下
		Calendar c = Calendar.getInstance();
		//获取你传过来的时间
		c.setTime(src);
		//把你这个时间的月份加1
		c.add(Calendar.MONTH, 1);
		
		//用上一个方法把时间初始化为（月份加上1的第一天）
		Date date =getDateByInitMonth(c.getTime());
		//获取你初始化后的日期
		c.setTime(date);
		//把这个时间减去一秒，就是上一个月的最后一秒
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
	
	public static Date randomDate(Date minDate ,Date maxDate) {
		//从1970年到minDate的毫米数
		long l1 = minDate.getTime();
		//从1970年到maxDate的毫米数
		long l2 = maxDate.getTime();
		
		Calendar c = Calendar.getInstance();
		
	//	
		long l3 = (long) (Math.random() * (l2-l1 +1 )+l1);
		c.setTimeInMillis(l3);
		
		return c.getTime();
		
		
	}

}
