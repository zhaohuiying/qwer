package com.zhaohuiying.utils;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.zhaohuiying.common.DateUtils;

public class DateUtilsTest {

	@Test
	public void testGetDateByInitMonth() {
		Calendar c =Calendar.getInstance();
		c.set(2018, 10, 10);
		
		Date date = DateUtils.getDateByInitMonth(c.getTime());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm-ss");
		String string = format.format(date);
		System.out.println(string);
	}

	@Test
	public void testGetDateByFullMonth() {
		
		Calendar c =Calendar.getInstance();
		c.set(2018, 10, 11);
		
		Date date = DateUtils.getDateByFullMonth(c.getTime());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = format.format(date);
		System.out.println(string);
	}

}
