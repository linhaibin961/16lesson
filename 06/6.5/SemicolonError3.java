

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
public class SemicolonError3
{
	public static void main(String[] args) 
	{
		for (int[] intArr = {5, 6, -10} ; int i = 0
			; i < intArr.length ; i++)
		{
			System.out.println("intArr数组的元素为" + intArr[i]);
		}
	}
}
