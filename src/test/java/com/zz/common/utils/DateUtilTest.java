package com.zz.common.utils;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		String str="2017-12-12 12:12:12";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   Date date = DateUtil.getDateByInitMonth(new Date());
		System.out.println(df.format(date));
		
	}

	@Test
	public void testGetDateByFullMonth() throws ParseException {
		String str="2000-02-12 12:12:12";
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 Date date = DateUtil.getDateByFullMonth(df.parse(str));
		 System.out.println(df.format(date));
	}
	/**
	 * 
	 * @Title: test1 
	 * @Description: 拼接下面根据时间范围查询订单的SQL：
String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
	 * @return: void
	 */
	@Test
	public void test1() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		String sql2 = sql.replace("{1}", df.format(date)).replace("{2}", df.format(date2));
		System.out.println(sql2);
	}

}
