package week7.task1;

public class ExpresstionTest {
    public static void main(String args[]){
        Numeral num1 = new Numeral(10);
        Numeral num2 = new Numeral(1);
        Numeral num3 = new Numeral(2);
        Numeral num4 = new Numeral(3);
        Square square1 = new Square(num1);
        Subtraction sub1 = new Subtraction(square1,num2);
        Multiplication multi1 = new Multiplication(num3,num4);
        Addition add2 = new Addition(sub1,multi1);
        Square square2 = new Square(add2);
        System.out.println(square2.Evaluate());
        System.out.println("...........................");

        Division div1 = new Division(new Numeral(1),new Numeral(3));
        try{
            System.out.println(1.0*div1.left().Evaluate()/div1.right().Evaluate());
        }
        catch (ArithmeticException e){
            System.out.println("“Lỗi chia cho 0");
        }
    }
}
