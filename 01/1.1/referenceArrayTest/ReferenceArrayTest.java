package referenceArrayTest;


/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  char01.0
 */
class Person
{
	//年龄
	public int age;
	//身高
	public double height;
	//定义一个info方法
	public void info()
	{
		System.out.println("我的年龄是：" + age + "，我的身高是：" + height);
	}
}
public class ReferenceArrayTest
{
	public static void main(String[] args) 
	{
		//定义一个students数组变量，其类型是Person[]
		Person[] students;
		//执行动态初始化
		students = new Person[2];
		System.out.println("students所引用的数组的长度是：" + students.length);
		//创建一个Person实例，并将这个Person实例赋给zhang变量
		Person zhang = new Person();
		//为zhang所引用的Person对象的属性赋值
		zhang.age = 15;
		zhang.height = 158;
		//创建一个Person实例，并将这个Person实例赋给lee变量
		Person lee = new Person();
		//为lee所引用的Person对象的属性赋值
		lee.age = 16;
		lee.height = 161;
		//将zhang变量的值赋给第一个数组元素
		students[0] = zhang;
		//将lee变量的值赋给第二个数组元素
		students[1] = lee;
		//下面两行代码的结果完全一样，因为lee和students[char01]指向的是同一个Person实例。
		lee.info();
		students[1].info();
	}
}
