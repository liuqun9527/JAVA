package test;

public class ExtendTest {
	public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        String s="11";
       System.out.println( s.equals(""));
 //       System.out.println(a1.show(b)); 
 //       System.out.println(a1.show(c)); 
//       System.out.println(a1.show(d)); 
    //    System.out.println(a2.show(b)); 
//        System.out.println(a2.show(c)); 
//        System.out.println(a2.show(d)); 
//        System.out.println(b.show(b));  
//        System.out.println(b.show(c));  
//        System.out.println(b.show(d));  
    }
	
	
}
class A {
    public String show(D obj) {
    	System.out.println("A.show(D)");
        return ("A and D");
    }

    public String show(A obj) {
    	System.out.println("A.show(A)");
        return ("A and A");
    }
}

class B extends A {
    public String show(B obj) {
    	System.out.println("B.show(B)");
        return ("B and B");
    }

    public String show(A obj) {
    	System.out.println("B.show(A)");
        return ("B and A");
    }
}

class C extends B {
}

class D extends B {
}
