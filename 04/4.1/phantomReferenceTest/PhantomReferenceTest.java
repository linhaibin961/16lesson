package phantomReferenceTest;

import java.lang.ref.*;
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
public class PhantomReferenceTest
{
	public static void main(String[] args) 
		throws Exception
	{
		//创建一个字符串对象
		String str = new String("疯狂Java讲义");
		//创建一个引用队列
		ReferenceQueue<String> rq = new ReferenceQueue<String>();
		//创建一个虚引用，让此虚引用引用到"疯狂Java讲义"字符串
		PhantomReference<String> pr = 
			new PhantomReference<String>(str , rq);
		//切断str引用和"Struts2权威指南"字符串之间的引用
		str = null;
		//试图取出虚引用所引用的对象，
		//程序并不能通过虚引用访问被引用的对象，所以此处输出null
		System.out.println(pr.get());  //①
		//强制垃圾回收
		System.gc();
		System.runFinalization();
		//取出引用队列中最先进入队列中引用与pr进行比较
		System.out.println(rq.poll() == pr);   //②
	}
}