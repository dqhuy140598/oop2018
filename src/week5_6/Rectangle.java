package week5_6;


/**
 * Created by CCNE on 17/10/2018.
 */
public class Rectangle extends Shape{
    private double width;
    private double height;

    /**
     * phương thức tạo mặc định
     */
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    /**
     * phương thức tạo có 2 tham số
     * @param width chiều rộng
     * @param height chiều dài
     */
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    /**
     * phương thức tính diện tích hình chữ nhật
     * @return  diện tích hình chữ nhật
     */
    public double getArea(){
        return width*height;
    }
    @Override
    /**
     * phương thức tính chu vi hình chữ nhật
     * @return  chu vi hình chữ nhật
     */
    public double getPerimeter(){
        return (width+height)*2;
    }

    /**
     * phương thức lấy chiều rộng
     * @return  chiều dài
     */
    public double getWidth() {
        return width;
    }

    /**
     * phương thức tạo giá trị cho chiều rộng
     * @param width giá trị cần tạo
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * phương thức lấy giá trị cho chiều dài
     * @return  chiều dài
     */
    public double getHeight() {
        return height;
    }

    /**
     * phương thức tạo giá trị cho chiều dài
     * @param height    giá trị cần tạo
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
