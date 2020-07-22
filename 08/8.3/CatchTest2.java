
import java.io.*;
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
public class CatchTest2
{
	public static void main(String[] args) 
	{
		test1();
		test2();
	}
	public static void test1()
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("a.bin");
			System.out.println("www.crazyit.org");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//关闭文件输入流
			if (fis != null)
			{
				try
				{
					fis.close();
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}
	public static void test2()
	{
		try
		{
			//加载一个类
			Class.forName("org.crazyit.learning.Student");
			System.out.println("www.crazyit.org");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
