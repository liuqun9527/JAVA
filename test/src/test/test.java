package test;

public class test{

    public static void main(String[] args) {

//        Employee e = new Employee("test");
//        System.out.println(e.empId);
    	double i =2.2;
    	double j =Double.NaN;
    	System.out.println(i> j || i<=j);
    	int in =Integer.MAX_VALUE;
    	System.out.println(in+1);
    	System.out.println(in+1<in);

    }
}

class Person {
    String name = "do1";

    public Person(String name) {
        this.name = name;
    }
    public Person() {
    }
}

class Employee extends Person {

    String empId = "0001";
    public Employee(String name) {
            empId = name;
    }
}

