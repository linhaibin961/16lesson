

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class SemicolonRight
{
	public static void main(String[] args) 
	{
		for (int j = 1 , i = 0 ; i < 5 && j < 20; i++ , j *= 2)
		{
			System.out.println(i + "-->" + j);
		}
	}
}
