
import java.util.*;
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
public class VectorRemove
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		for (Iterator<String> it = list.iterator(); it.hasNext() ; )
		{
			String ele = it.next();
			if (ele.equals("111"))
			{
				list.remove(ele);
			}
		}
	}
}
