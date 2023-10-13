package Lesson_08.Ex000;

public class Program {

    void A(){
        System.out.println("A()");
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.A();

        Foo f1 = new Foo();
        f1.value = 123;
        f1.printCount();
        System.out.println(f1.value);

        //Foo.count = 123000;

        Foo f2 = new Foo();
        f2.value = 222;
        f2.printCount();
        System.out.println(f2.value);

        Foo f3 = new Foo();
        f3.value = 444;
        f3.printCount();
        System.out.println(f3.value);        
    }
}
