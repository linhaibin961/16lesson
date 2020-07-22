
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
class Name
{
    private String first;
	private String last;
    public Name(String first, String last) 
	{
        this.first = first;
        this.last = last;
    }
    public boolean equals(Object o) 
	{
		if (this == o)
		{
			return true;
		}
		if (o.getClass() == Name.class)
		{
			Name n = (Name)o;
			return n.first.equals(first)
				&& n.last.equals(last);
		}
		return false;
    }
}
public class HashSetTest
{
	public static void main(String[] args) 
	{
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("abc", "123"));
		System.out.println(
			s.contains(new Name("abc", "123")));
	} 
}

