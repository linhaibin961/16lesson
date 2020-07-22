

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class SleepTest
{
	public static void main(String[] args) 
		throws Exception
	{
		long start = System.currentTimeMillis();
		//让当前程序暂停2ms
//		Thread.sleep(2);
		Thread.sleep(10);
		System.out.println(System.currentTimeMillis() - start);
	}
}
