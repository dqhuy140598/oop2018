package week7.task2;

import org.omg.CORBA.Object;

import java.io.*;
import java.util.ArrayList;

/**
 * 2 class bên ngoài phục vụ việc sinh ClassCastException
 */
class Animal{
    public void SayHello(){

    }
}
class Dog extends Animal{
    @Override
    public void SayHello(){
        System.out.println("Gâu Gâu");
    }
}
public class Task2 {
    /**
     * phương thức sinh ngoại lệ NullPointerException
     * @param str1 xâu ký tự 1
     * @param str2 xâu ký tự 2
     * @return  trả về true nếu 2 xâu có giá trị giống nhau, false nếu ngược lại
     * @throws NullPointerException ngoại lệ NullPointerException nếu 1 trong 2 hoặc cả 2 xâu bằng null
     */
    public boolean getNullPointerException(String str1, String str2) throws NullPointerException{
        if(str1==null || str2==null)    throw new NullPointerException();
        return str1.equals(str2);
    }

    /**
     * phương thức sinh ngoại lệ ArrayIndexOutOfBoundsException
     * @param Arr   Một mảng các số nguyên
     * @param position vị trí của phần tử cần xóa
     * @return  Mảng mới sau khi đã xóa phần tử ở vị trí position
     * @throws ArrayIndexOutOfBoundsException ngoại lệ sinh ra khi vị trí cần xóa nhở hơn 0 hoặc lớn hơn size của mảng.
     */
    public int[] deleteInPosition(int Arr[], int position) throws ArrayIndexOutOfBoundsException{
        if(position >= Arr.length || position < 0)   throw new ArrayIndexOutOfBoundsException();
        int []Brr = new int[Arr.length-1];
        for(int i = position; i < Arr.length - 1; i++){
            Arr[i] = Arr[i+1];
        }
        for(int i=0;i<Brr.length;i++){
            Brr[i]= Arr[i];
        }
        return Brr;
    }

    /**
     * phương thức sinh ngoại lệ ArithmeticException
     * @param a số nguyên thứ nhất
     * @param b số nguyên thứ hai
     * @return thương của 2 số nguyên
     * @throws ArithmeticException sinh ra khi số chia bằng 0.
     */
    public double getArithmeticException(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException();
        return (1.0*a)/b;
    }

    /**
     * phương thức sinh ngoại lệ ClassCastException
     * @throws ClassCastException sinh ra khi ta ép kiểu của object của subclass theo object của superclass.
     */
    public void getClassCastException() throws ClassCastException{
        Animal animal = new Animal();
        Dog dog = (Dog)animal;
        throw new ClassCastException();
    }

    /**
     * phương thức sinh ngoại lệ IOException
     * @param path đường dẫn tới file cần đọc vào
     * @throws IOException sinh ra khi đường dẫn không hợp lệ hoặc file không tồn tại
     */
    public void getIOException(String path) throws IOException{
        File file = new File(path);
        if(file.canRead()==false) throw new IOException();
        FileInputStream fileInputStream = new FileInputStream(file);
        try{
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * phương thức sinh ngoại lệ FileNotFoundException
     * @param path đường dẫn tới file cần đọc vào
     * @throws FileNotFoundException sinh ra khi đường dẫn không hợp lệ hoặc file không tồn tại.
     */
    public void getFileNotFoundException(String path) throws FileNotFoundException {
        File file = new File(path);
        if(file.canRead()==false) throw new FileNotFoundException();
        FileInputStream fileInputStream = new FileInputStream(file);
        try{
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        // Test NullPointerException
        String str1 = null;
        String str2 = "HUY";
        Task2 task2 = new Task2();
        try {
            System.out.println(task2.getNullPointerException(str1, str2));
        }
        catch (NullPointerException e){
            System.out.println("Lỗi NullPointerException.");
        }
        //Test ArrayIndexOfBoundException
        int Arr[] = {1,2,3,4,5};
        int position = -1;
        try{
            Arr = task2.deleteInPosition(Arr,position);
            for(int i:Arr){
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi ArrayIndexOutOfBoundsException.");
        }
        // Test ArithmeticException
        try {
            System.out.println(task2.getArithmeticException(1,0));
        }
        catch (ArithmeticException e){
            System.out.println("Lỗi ArithmeticException");
        }
        // Test ClassCastException
        try {
            task2.getClassCastException();
        }
        catch (ClassCastException ex){
            System.out.println("Lỗi ClassCastException.");
        }
        //Test IOEXception
        try
        {
         task2.getIOException("src/week7/task2/File1.txt");
        }
        catch (IOException e){
            System.out.println("Lỗi IOException");
        }
        //Test FileNotFoundException
        try{
            task2.getFileNotFoundException("src/week7/task2/File3.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Lỗi FileNotFoundException");
        }
    }
}
