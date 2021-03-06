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
public class CloseResource3
{
	public static void main(String[] args) 
		throws Exception
	{
		Wolf w = new Wolf("灰太狼");
		System.out.println("Wolf对象创建完成～");
		Wolf w2 = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try
		{
			//创建对象输出流
			oos = new ObjectOutputStream(
				new FileOutputStream("a.bin"));
			//创建对象输入流
			ois = new ObjectInputStream(
				new FileInputStream("a.bin"));
			//序列化输出Java对象
			oos.writeObject(w);
			oos.flush();
			//反序列化恢复Java对象
			w2 = (Wolf)ois.readObject();
		}
		//使用finlly块来回收资源
		finally
		{
			if (oos != null)
			{
				try
				{
					oos.close();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
			if (ois != null)
			{
				try
				{
					ois.close();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}
}
