package week2.task2;
import week2.task1.Task1;
public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numarator;
    private int denominator;
    public void checkContructor(int numarator, int denominator) throws Exception{
        if(denominator==0) throw new ArithmeticException();
        return;
    }
    public Fraction(int numerator, int denominator){
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
            try{
                checkContructor(numarator,denominator);
                this.numarator = numerator;
                this.denominator = denominator;
            }
            catch(Exception e){
                System.out.println("*Error: the Denominator equals Zero");
                System.exit(-1);
            }
    }
    public void irreducibleFraction(){
            int Gcd = Task1.gcd(Math.abs(this.numarator),Math.abs(this.denominator));
            this.numarator/=Gcd;
            this.denominator/=Gcd;
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction Temp = new Fraction(0,1);
        Temp.numarator = this.numarator*other.denominator + this.denominator* other.numarator;
        Temp.denominator = this.denominator*other.denominator;
        Temp.irreducibleFraction();
        return Temp;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction Temp = new Fraction(0,1);
        Temp.numarator = this.numarator*other.denominator - this.denominator* other.numarator;
        Temp.denominator = this.denominator*other.denominator;
        Temp.irreducibleFraction();
        return Temp;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction Temp= new Fraction(0,1);
        Temp.numarator = this.numarator*other.numarator;
        Temp.denominator = this.denominator*other.denominator;
        Temp.irreducibleFraction();
        return Temp;
    }
    public Fraction divide(Fraction other) throws  Exception{
                // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        if(other.numarator==0){
            throw new ArithmeticException();
        }
        else{
            Fraction Temp = new Fraction(0,1);
            Temp.numarator = this.numarator * other.denominator;
            Temp.denominator = this.denominator* other.numarator;
            Temp.irreducibleFraction();
            return Temp;
        }
    }
    public int getNumarator() {
        return this.numarator;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public String displayFraction(){
        String temp = "";
        if(this.denominator==1){
            temp = Integer.toString(this.numarator);
        }
        else if(this.denominator==-1){
            this.numarator*=-1;
            temp = Integer.toString(this.numarator);
        }
        else if(this.numarator==this.denominator){
            temp = "1";
        }
        else if(this.numarator==-this.denominator){
            temp = "-1";
        }
        else if(this.numarator==0){
           temp = "0";
        }
        else if(this.denominator<0){
            this.numarator*=-1;
            this.denominator*=-1;
            temp  = Integer.toString(this.numarator)+"/" +Integer.toString(this.denominator);
        }
        else temp = Integer.toString(this.numarator)+ "/"+Integer.toString(this.denominator);
        return temp;
    }
    public boolean equals(Object obj){
        Fraction temp = (Fraction)obj;
        double result1  = 1.0*temp.numarator/temp.denominator;
        double result2 = 1.0*this.numarator/this.denominator;
        if(result1==result2)    return true;
        return false;
    }
    public static void main(String Args[]){
        Fraction Result = new Fraction(1,2);
        Fraction other = new Fraction(0,3);
        Fraction Add = Result.add(other);
        Fraction Sub = Result.subtract(other);
        Fraction Multi = Result.multiply(other);
        System.out.print("*Add Two Fraction: ");
        System.out.println(Add.displayFraction());
        System.out.print("*Subtract Two Fraction: ");
        System.out.println(Sub.displayFraction());
        System.out.print("*Multiply Two Fraction: ");
        System.out.println(Multi.displayFraction());
        try{
            Fraction divide = Result.divide(other);
            System.out.print("*Divide Two Fraction: ");
            System.out.println(divide.displayFraction());
        }
        catch(Exception e){
            System.out.println("*Error: Divide by Zero");
        }
        Fraction Temp1 = new Fraction(1,3);
        Fraction Temp2 = new Fraction(2,6);
        System.out.println(Temp1.equals(Temp2));
    }
}
