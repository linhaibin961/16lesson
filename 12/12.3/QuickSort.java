
import java.util.*;
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
//定义一个数据包装类
class DataWrap implements Comparable<DataWrap>
{
	int data;
	String flag;
	public DataWrap(int data, String flag)
	{
		this.data = data;
		this.flag = flag;
	}
	public String toString()
	{
		return data + flag;
	}
	//根据data实例变量来决定两个DataWrap的大小
	public int compareTo(DataWrap dw)
	{
		return this.data > dw.data ? 1 
			: (this.data == dw.data ? 0 : -1);
	}
}
public class QuickSort
{
	//将指定数组的i和j索引处的元素交换
    private static void swap(DataWrap[] data, int i, int j)
    {
        DataWrap tmp;
        tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
	//对data数组中从start～end索引范围的子序列进行处理
	//使之满足所有小于分界值的放在左边，所有大于分界值的放在右边
	private static void subSort(DataWrap[] data
		, int start , int end)
	{
		//需要排序
		if (start < end)
		{
			//以第一个元素作为分界值
			DataWrap base = data[start];
			//i从左边搜索，搜索大于分界值的元素的索引
			int i = start;
			//j从右边开始搜索，搜索小于分界值的元素的索引
			int j = end + 1;
			while(true)
			{
				//找到大于分界值的元素的索引，或i已经到了end处
				while(i < end && data[++i].compareTo(base) <= 0);
				//找到小于分界值的元素的索引，或j已经到了start处
				while(j > start && data[--j].compareTo(base) >= 0);
				if (i < j)
				{
					swap(data , i , j);
				}
				else
				{
					break;
				}
			}
			swap(data , start , j);
			//递归左子序列
			subSort(data , start , j - 1);
			//递归右边子序列
			subSort(data , j + 1, end);
		}
	}
	public static void quickSort(DataWrap[] data) 
	{
		subSort(data , 0 , data.length - 1);
	}
	public static void main(String[] args)
	{
		DataWrap[] data = {
			new DataWrap(9 , ""),
			new DataWrap(-16 , ""),
			new DataWrap(21 , "*"),
			new DataWrap(23 , ""),
			new DataWrap(-30 , ""),
			new DataWrap(-49 , ""),
			new DataWrap(21 , ""),
			new DataWrap(30 , "*"),
			new DataWrap(13 , "*")
		};
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("排序之后：\n" 
			+ java.util.Arrays.toString(data));
	}
}
