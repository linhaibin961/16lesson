
import org.junit.runner.*;
import org.junit.runners.*;
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
@RunWith(Suite.class)   
@Suite.SuiteClasses({  
	org.crazyit.tools.MyMathTest.class,
	org.crazyit.tools.HelloWorldTest.class
})   
public class AllTests
{
	public static void main(String[] args) 
	{
		JUnitCore.main("AllTests");
	}
}
