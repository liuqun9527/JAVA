package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Sort {
	public static void main(String[] args) {
//		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		    arrayList.add(-1);
//		    arrayList.add(3);
//		    arrayList.add(3);
//		    arrayList.add(-5);
//		    arrayList.add(7);
//		    arrayList.add(4);
//		    arrayList.add(-9);
//		    arrayList.add(-7);
//		    System.out.println("原始数组:");
//		    System.out.println(arrayList);
//		    // void reverse(List list)：反转
//		    Collections.reverse(arrayList);
//		    System.out.println("Collections.reverse(arrayList):");
//		    System.out.println(arrayList);
//		    
//		    TreeMap<Person, String> pdata = new TreeMap<Person, String>();
//		    pdata.put(new Person("张三", 30), "zhangsan");
//		    pdata.put(new Person("李四", 20), "lisi");
//		    pdata.put(new Person("王五", 10), "wangwu");
//		    pdata.put(new Person("小红", 5), "xiaohong");
//		    // 得到key的值的同时得到key所对应的值
//		    Set<Person> keys = pdata.keySet();
//		    for (Person key : keys) {
//		        System.out.println(key.getAge() + "-" + key.getName());
//
//		    }
		 List<Integer> list1 = new ArrayList<Integer>();
		    list1.add(1);
		    list1.add(2);
		    list1.add(3);
		    list1.add(4);

		    List<Integer> list2 = new ArrayList<Integer>();
		    list2.add(2);
		    list2.add(3);
		    list2.add(4);
		    list2.add(5);
		    // 并集
		    // list1.addAll(list2);
		    // 交集
		    //list1.retainAll(list2);
		    // 差集
		    //list1.removeAll(list2);
		    // 无重复并集
		    list2.removeAll(list1);
		    list1.addAll(list2);
		    for (Integer i : list1) {
		        System.out.println(i);
		    }
	}
}
