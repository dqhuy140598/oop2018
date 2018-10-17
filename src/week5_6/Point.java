package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Point {
    private double X;
    private double Y;

    /**
     * phương thức khởi tạo mặc định
     */
    public Point(){
        this.X = 1.0;
        this.Y = 1.0;
    }
    /**
     * phương thức khỏi tạo 2 tham sô
     * @param X hoàng độ
     * @param Y tung độ
     */
    public Point(double X, double Y){
        this.X = X;
        this.Y= Y;
    }

    /**
     * phương thức tính khoảng cách giữa 2 điểm
     * @param other điểm cần tính khoảng cách
     * @return  khoảng cách cần tính
     */
    public double Distance(Point other){
        double temp1 = Math.pow(this.X- other.X,2);
        double temp2 = Math.pow(this.Y-other.Y,2);
        return Math.sqrt(temp1 + temp2);
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
