package week5_6;

import java.util.ArrayList;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Diagram {
    private ArrayList<Layer> listLayer = new ArrayList<>();

    /**
     * phương thức xóa tất cả các đối tượng trong diagram
     */
    public void deleteCricle(){
        for(int i=0;i<listLayer.size();i++){
            listLayer.get(i).deleteCricle();
        }
    }

    /**
     * phương thức thêm 1 đối tượng lớp layer vào diagram
     * @param other đối tượng cần thêm
     */
    public void addLayer(Layer other){
        listLayer.add(other);
    }

    /**
     * phương thức kiểm tra xem trong diagram có còn đối tượng lớp circle hay không
     * @return
     */
    public boolean isEmtpryCircle1(){
        for(int i=0;i<listLayer.size();i++){
            if(listLayer.get(i).isEmptyCircle()==false){
                return false;
            }
        }
        return true;
    }
}
