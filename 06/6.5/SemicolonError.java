

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
public class SemicolonError
{
	public static void main(String[] args) 
	{
		String[] books = {
			"疯狂Java讲义",
			"轻量级Java EE企业应用实战",
			"疯狂XML讲义"
		};
		//遍历books数组
		for (int i = 0 ; i < books.length ; i++);
		{
			System.out.println("第i个元素的值：" + books[i]);
		}
	}
}
