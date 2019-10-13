package com.zhaohuiying.common;

import java.util.HashSet;
import java.util.Random;

public class RandomUtils {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		//TODO 实现代码
		//首先把随机数函数写上
		Random r = new Random();
		//这个公式 1,4 4+1=5 因为他的这个范围就是  ：5就是他的范围就在1-4
		return r.nextInt(max-min+1)+min;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		//TODO 实现代码
		//首先先把这个subs的随机数放在数组里
		int dest[]=new int[subs];
		//因为hashset不允许有重复的值
		HashSet<Integer> set = new HashSet<Integer>();
		//循环添加不重复的随机数，在调用第一个方法时候，这个subs的意思就是我现在在测试方法定义的subs个数
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		//遍历set放入数组
		int i=0;
		for (Integer s : set) {
			//把值给数组
			dest[i]=s;
			i++;
		}
		
		return dest;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		//TODO 实现代码
		//吧1-9,a-Z都输出来
		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//java.lang.String.charAt()方法 返回 指定索引 处的 char值。索引范围 是从0 到length() - 1。 
		//random也是用了第一个方法
		return str.charAt(random(0,str.length()-1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		//TODO 实现代码
		//首先定义一个字符串
		String str="";
		//定义一个for循环，循环randomCharacter方法length次
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();
		}
		return str;
	}


}
