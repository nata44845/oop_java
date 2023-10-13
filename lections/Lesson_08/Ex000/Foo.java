package Lesson_08.Ex000;

public class Foo {
    public Integer value;

    private static Integer count = 0;

    static {
        count = 0;
    }

    public static Integer getCount() {
        return count;
    }

    public Foo() {
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
