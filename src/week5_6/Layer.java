package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Layer {
    private ArrayList<Shape> listShape = new ArrayList<Shape>();

    /**
     * phương thức xóa tấy cả các đối tượng lớp triagle trong layer
     */
    public void deleteTriagle() {
        Iterator<Shape> temp = listShape.iterator();
        while (temp.hasNext()) {
            Shape shape = temp.next();
            if (shape instanceof Triangle) {
                temp.remove();
            }
        }
    }

    /**
     * phương thức xóa tất cả các đối tượng lớp circle trong layer
     */
    public void deleteCricle(){
        Iterator<Shape> temp = listShape.iterator();
        while(temp.hasNext()){
            Shape shape = temp.next();
            if(shape instanceof Circle){
                temp.remove();
            }
        }
    }
    /**
     * phương thức kiểm tra có còn đối tượng lớp triagle trong layer hay khong
     * @return  true neu khong va false neu con
     */
    public boolean isEmptyTriagle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                return false;
            }
        }
        return true;
    }

    /**
     * phương thức kiểm tra có còn đối tượng lớp circle trong layer hay khong
     * @return  true neu khong va false neu con
     */
    public boolean isEmptyCircle() {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                return false;
            }
        }
        return true;
    }

    /**
     * phương thưc thêm mot đối tượng lớp shape vào layer
     * @param b đối tượng lớp shape cần thêm
     */
    public void addShape(Shape b){
        listShape.add(b);
    }
}
