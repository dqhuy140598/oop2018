package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Triangle extends Shape {
    private Point a,b,c;

    /**
     * phương thức tạo mặc định
     */
    public Triangle(){
        a = new Point(1,1);
        b = new Point(2,3);
        c = new Point(4,5);
    }

    /**
     * phương thức tạo có 3 tham sô
     * @param a điểm a
     * @param b điểm b
     * @param c điểm c
     */
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * phương thức tính chu vi tam giác
     * @return  chu vi tam giác
     */
    @Override
    public double getPerimeter(){
        double dic1 = this.a.Distance(this.b);
        double dic2 = this.a.Distance(this.c);
        double dic3 = this.b.Distance(this.c);
        return dic1+ dic2 + dic3;
    }

    /**
     * phương thức tính diện tích tam giác
     * @return  diện tích tam giác
     */
    @Override
    public double getArea(){
        double dic1 = this.a.Distance(this.b);
        double dic2 = this.a.Distance(this.c);
        double dic3 = this.b.Distance(this.c);
        double tmp = (dic1+dic2+dic3)/2;
        return Math.sqrt(tmp*(tmp-dic1)*(tmp-dic2)*(tmp-dic3));
    }
}
