package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Circle extends Shape  {
    static final double PI = 3.14;
    private double radius;
    /**
     * Hàm tạo không có tham số. Mặc định giá trị của radius = 1.0.
     */
    public Circle(){
        radius = 1.0;
    }

    /**
     * Hàm tạo có 1 tham số truyền vào
     * @param radius bán kính ta muốn tạo
     */
    public Circle(double radius){
        this.radius = radius;
    }


    /**
     * phương thức lấy giá trị bán kinh
     * @return  bán kính của đối tượng ta muốn lấy
     */
    public double getRadius() {
        return radius;
    }

    /**
     * phương thức thay đổi giá trị bán kính
     * @param radius bán kính ta muốn thay đổi
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * phương thức tính diện tích hình tròn
     * @return  diện tích hình tròn
     */
    @Override
    public double getArea(){
        return PI*Math.pow(radius,2);
    }

    /**
     * phương thức tính chu vi hình tròn
     * @return  chu vi hình tròn
     */
    @Override
    public double getPerimeter(){
        return PI*radius*2;
    }

}

