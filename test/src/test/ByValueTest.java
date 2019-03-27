package test;

/**
 *Java中没有引用传递只有值传递
 * 不管是对象、基本类型还是对象数组、基本类型数组，在函数中都不能改变其实际地址但能改变其中的内容
 * 
 * 
 */
class Person1 {

    private String name;

    private String sex;

    public Person1(String x, String y) {
        this.name = x;
        this.sex = y;
    }

    // 重写toString()方法，方便输出
    public String toString() {

        return name + " " + sex;
    }

    // 交换对象引用
    public static void swapObject(Person1 p1, Person1 p2) {
        Person1 tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    // 交换基本类型
    public static void swapInt(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    // 交换对象数组
    public static void swapObjectArray(Person1[] p1, Person1[] p2) {
        Person1[] tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    // 交换基本类型数组
    public static void swapIntArray(int[] x, int[] y) {
        int[] tmp = x;
        x = y;
        y = tmp;
    }

    // 改变对象数组中的内容
    public static void changeObjectArray(Person1[] p1, Person1[] p2) {
        Person1 tmp = p1[1];
        p1[1] = p2[1];
        p2[1] = tmp;
        
        // 再将p1[1]修改
        Person1 p = new Person1("wjl", "male");
        p1[1] = p;
    }

    // 改变基本类型数组中的内容
    public static void changeIntArray(int[] x, int[] y) {
        int tmp = x[1];
        x[1] = y[1];
        y[1] = tmp;

        x[1] = 5;
    }
}

public class ByValueTest {

    public static void main(String[] args) {

        // 建立并构造两个对象
        Person1 p1 = new Person1("Alexia", "female");
        Person1 p2 = new Person1("Edward", "male");

        System.out.println("对象交换前：p1 = " + p1.toString());
        System.out.println("对象交换前：p2 = " + p2.toString());
        
        // 交换p1对象和p2对象
        Person1.swapObject(p1, p2);
        // 从交换结果中看出，实际对象并未交换
        System.out.println("\n对象交换后：p1 = " + p1.toString());
        System.out.println("对象交换后：p2 = " + p2.toString());

        // 建立两个对象数组
        Person1[] arraya = new Person1[2];
        Person1[] arrayb = new Person1[2];

        // 分别构造数组对象
        arraya[0] = new Person1("Alexia", "female");
        arraya[1] = new Person1("Edward", "male");
        arrayb[0] = new Person1("jmwang", "female");
        arrayb[1] = new Person1("hwu", "male");

        System.out.println('\n' + "对象数组交换前：arraya[0] = "
                + arraya[0].toString() + ", arraya[1] = "
                + arraya[1].toString());
        System.out.println("对象数组交换前：arrayb[0] = "
                + arrayb[0].toString() + ", arrayb[1] = "
                + arrayb[1].toString());
        
        // 交换这两个对象数组
        Person1.swapObjectArray(arraya, arrayb);
        System.out.println('\n' + "对象数组交换后：arraya[0] = "
                + arraya[0].toString() + ", arraya[1] = "
                + arraya[1].toString());
        System.out.println("对象数组交换后：arrayb[0] = "
                + arrayb[0].toString() + ", arrayb[1] = "
                + arrayb[1].toString());

        // 建立两个普通数组
        int[] a = new int[2];
        int[] b = new int[2];

        // 给数组个元素赋值
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i + 1;
        }

        System.out.println('\n' + "基本类型数组交换前：a[0] = " + a[0] + ", a[1] = " + a[1]);
        System.out.println("基本类型数组交换前：b[0] = " + b[0] + ", b[1] = " + b[1]);

        // 交换两个基本类型数组
        Person1.swapIntArray(a, b);
        System.out.println('\n' + "基本类型数组交换后：a[0] = " + a[0] + ", a[1] = " + a[1]);
        System.out.println("基本类型数组交换后：b[0] = " + b[0] + ", b[1] = " + b[1]);
        
        // 改变对象数组的内容
        Person1.changeObjectArray(arraya, arrayb);
        System.out.println('\n' + "对象数组内容交换并改变后：arraya[1] = " + arraya[1].toString());
        System.out.println("对象数组内容交换并改变后：arrayb[1] = " + arrayb[1].toString());
        
        // 改变基本类型数组的内容
        Person1.changeIntArray(a, b);
        System.out.println('\n' + "基本类型数组内容交换并改变后：a[1] = " + a[1]);
        System.out.println("基本类型数组内容交换并改变后：b[1] = " + b[1]);
    }
}