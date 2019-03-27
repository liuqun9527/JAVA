package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TT {
	/** * 获取现在时间 * @return返回字符串格式yyyyMMddHHmmss */
	public static String getStringDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateString = formatter.format(currentTime);
		System.out.println("TIME:::" + dateString);
		return dateString;
	}

	/** * 由年月日时分秒+3位随机数 * 生成流水号 * @return */
	public static String Getnum() {
		String t = getStringDate();
		int x = (int) (Math.random() * 900) + 100;
		System.out.println(x);
		String serial = t + x;
		return serial;
	}

	public static void main(String[] args) throws ParseException {
		/*
		 * String EOP = "1"; String LIFE_PRODUCE = "2"; String EXCUTE_TIME_PLAN = "3";
		 * String sqls =
		 * "update   FY_BIZCHANGE_PART set (LIFE_PRODUCE,EXCUTE_TIME_PLAN,EOP)  = " +
		 * "('" + LIFE_PRODUCE + "','" + EXCUTE_TIME_PLAN + "','" + EOP +
		 * "') WHERE PART_ID =''"; System.out.println(sqls);
		 */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();

		// 过去七天
		c.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-10-05 09:30:30"));
		c.add(Calendar.DATE, -7);
		Date d = c.getTime();
		String day = format.format(d);
		System.out.println("过去七天：" + day);
		// 过去一月
		c.setTime(new Date());
		c.add(Calendar.MONTH, -1);
		Date m = c.getTime();
		String mon = format.format(m);
		System.out.println("过去一个月：" + mon);

		// 过去三个月
		c.setTime(new Date());
		c.add(Calendar.MONTH, -3);
		Date m3 = c.getTime();
		String mon3 = format.format(m3);
		System.out.println("过去三个月：" + mon3);

		// 过去一年
		c.setTime(new Date());
		c.add(Calendar.YEAR, -1);
		Date y = c.getTime();
		String year = format.format(y);
		System.out.println("过去一年：" + year);
	}

}
