package com.zhaohuiying.utils;



import org.junit.Test;

import com.zhaohuiying.common.RandomUtils;

public class RandomUtilsTest {

	@Test
	public void testRandom() {
		int i = RandomUtils.random(1, 3);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		//获取从1-120岁之间的10个随机年龄
		int[] random = RandomUtils.subRandom(1, 120, 10);
		for (int i : random) {
			System.out.print(i+",");
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtils.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtils.randomString(10);
		System.out.println(string);
	}

}
