package test;
//值传递
public class PassByValueExample {
	public static void main(String[] args) {
        Dog dog = new Dog("A");
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        func(dog);
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        System.out.println(dog.getName());  
        func2(dog);
        System.out.println(dog.getObjectAddress()); 
        System.out.println(dog.getName()); 
    }

    private static void func(Dog dog) {
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        dog = new Dog("B");
        System.out.println(dog.getObjectAddress()); // Dog@74a14482
        System.out.println(dog.getName());          // B
    }
    private static void func2(Dog dog) {
        dog.setName("B");
    }
}
