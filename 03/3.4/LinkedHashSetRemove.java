
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
public class LinkedHashSetRemove
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("111");
		set.add("222");
		set.add("333");
		for (Iterator<String> it = set.iterator(); it.hasNext() ; )
		{
			String ele = it.next();
			if (ele.equals("333"))
			{
				set.remove("111");
			}
		}
	}
}
