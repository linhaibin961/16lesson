﻿   

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
public class LinkListTest
{
	public static void main(String[] args) 
	{
		LinkList<String> list = new LinkList<String>();
		list.insert("aaaa" , 0);
		list.add("bbbb");
		list.add("cccc");
		//在索引为1处插入一个新元素
		list.insert("dddd" , 1);
		//输出顺序线性表的元素
		System.out.println(list);
		//删除索引为2处的元素
		list.delete(2);
		System.out.println(list);
		//获取cccc字符串在链表中的位置
		System.out.println("cccc在链表中的位置：" 
			+ list.locate("cccc"));
		System.out.println("链表中索引2处的元素：" 
			+ list.get(2));
	}
}
