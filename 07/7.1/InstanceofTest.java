

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
public class InstanceofTest
{
	public static void main(String[] args) 
	{
		//声明hello时使用Object类，则hello的编译时类型是Object，
		//Object是所有类的父类，但hello变量的实际类型是String
		Object hello = "Hello";
		//String是Object类的子类，所以可以进行instanceof运算。返回true。
		System.out.println("字符串是否是Object类的实例：" 
			+ (hello instanceof Object));
		//返回true。
		System.out.println("字符串是否是String类的实例：" 
			+ (hello instanceof String));
		//Math是Object类的子类，所以可以进行instanceof运算。
		//返回false。
		System.out.println("字符串是否是Math类的实例：" 
			+ (hello instanceof Math));
		//String实现了Comparable接口，所以返回true。
		System.out.println("字符串是否是Comparable接口的实例：" 
			+ (hello instanceof Comparable));
		//声明str时使用了String类，则str的编译时类型是String类型
		String str = "Hello";
		//String类（编译时类型）既不是Math类，也不是Math类的父、子类
		//，所以下面代码编译无法通过
		System.out.println("字符串是否是Math类的实例："
			+ (str instanceof Math));
		//String类（编译时类型）既不是Serializable类，但它是Serializable类的子类
		//因此下面代码可以编译成功，输出true。
		System.out.println("字符串是否是Serializable类的实例："
			+ (str instanceof java.io.Serializable));
	}
}
