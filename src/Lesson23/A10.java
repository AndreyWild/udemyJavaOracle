package Lesson23;

public class A10 {
    String s1 = "Hello";
    static double pi = 3.14;

    int summa (int ...i){
        int result = 0;
        for(int a: i){
            result +=a;
        }
        return result;
    }

    static void abc(){
        System.out.println("Static method");
    }
}

class B10 extends A10{
    String s1 = super.s1 + ", drug!";
    double d1 = super.pi; // можем заменить static переменную

    int summa (int ...i){
        int result = super.summa(i);

        System.out.println("Summa =  " + result);
        super.abc(); // можно вызвать static метод
        return result;
    }


    public static void main(String[] args) {
        B10 b10 = new B10();
        System.out.println(b10.s1);
    }
}
// Hello, drug!