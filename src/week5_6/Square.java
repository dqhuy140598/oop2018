package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Square extends Rectangle {
    /**
     * phương thức tạo có 1 tham số
     * @param side chiều dài 1 cạnh hình vuông
     */
    public Square(double side){
        super(side,side);
    }
    /**
     * phương thức tạo mặc định
     */
    public Square(){
        super();
    }

    /**
     * phương thức tính chu vi hình vuông
     * @return chu vi hình vuông
     */
    @Override
    public double getArea(){
        return super.getArea();
    }

    /**
     * phương thức tính chu vi hình vuông
     * @return  chu vi hình vuông
     */
    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
}
