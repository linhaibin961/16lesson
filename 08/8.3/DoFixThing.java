

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
public class DoFixThing
{
	public static void main(String[] args) 
	{
		test();
	}
	public static void test()
	{
		try
		{
			//加载一个类
			Class.forName("org.crazyit.learning.Student");
			System.out.println("www.crazyit.org");
		}
		catch (ClassNotFoundException ex)
		{
			//不做任何修复，试图再次调用test()方法
			test();
		}
	}
}
