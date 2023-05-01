package OOP;

public class Program {
    public static void main(String[] args) {
        Foo foo1 = new Foo() {
            @Override
            public void m1() {
            System.out.println("Привет");
                
            }
            @Override
            public void m2() {
                System.out.println("трололо");
            }
        };
        foo1.m1();
        Foo foo2 = new Foo() {
            @Override
            public void m1() {
            System.out.println("111111");
                
            }
            @Override
            public void m2() {
                System.out.println("-------");
            }
        };
        foo2.m1();
    }
}
