

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
public class CompositeAssign2
{
	public static void main(String[] args) 
	{
		//定义两个字符串
		Object he = new CompositeAssign2();
		String crazy = "crazyit.org ,";
		//+=左边变量的类型是String，因此下面语句是正确
		//he将自动转换为String（也就是使用它的toString()返回值）
		crazy += he;
		System.out.println(crazy);
		//因为+=左边变量的类型不是String类型，所以下面语句是错误的
//		he += crazy;
	}
}
