package Lesson_09.Ex000;

public class Program {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void m1() {
                // TODO Auto-generated method stub
                System.out.println("m1");
            }

            @Override
            public void m2() {
                // TODO Auto-generated method stub
                System.out.println("m2");
            }
        };
        foo.m1();
    }
}
