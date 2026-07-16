package ExceptionHandling;

public class C_02_CheckedException_T {
    int x = 143;

    public void m1() {
        System.out.println("Value of x is: " + x);
    }

    public static void main(String[] args) throws InterruptedException {

        C_02_CheckedException_T obj = new C_02_CheckedException_T();
        obj.m1();
        Thread.sleep(0);
    }
}
