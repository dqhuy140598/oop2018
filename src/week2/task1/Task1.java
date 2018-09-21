package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a==0)    return b;
        if(b==0)    return a;
        return a>=b? gcd(a%b,b) : gcd(a,b% a);
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n<=1)    return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String Args[]){
        System.out.println(gcd(10,10));
        System.out.println(fibonacci(5));
    }
}
