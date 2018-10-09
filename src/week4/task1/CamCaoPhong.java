package week4.task1;

public class CamCaoPhong extends Orange {
    private double weight;
    private String fromWhere;

    /**
     * phương thức lấy giá cam từ nơi bán cam
     * @return  giá cam
     */
    public double getPriceForm(){
        if(fromWhere.equals("HaNoi"))   return 10000;
        else if(fromWhere.equals("HoChiMinh"))  return 15000;
        return 20000;
    }

    /**
     * phương thức lấy tên công ty từ nơi mua cam
     * @return  tên công ty
     */
    public String getCompanyOrange(){
        if(fromWhere.equals("HaNoi"))   return "Vingroup";
        else if(fromWhere.equals("HoChiMinh"))  return "HAGL";
        return "FLC";
    }

    /**
     * phương thức lấy số kg cam
     * @return  số kg cam
     */
    public double getWeight() {
        return weight;
    }

    /**
     * phương thức thay đổi số kg cam
     * @param weight số kg cam cần thay đổi
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * phương thức tên nới mua cam
     * @return  tên nới mua cam
     */
    public String getFromWhere() {
        return fromWhere;
    }

    /**
     * phương thức thay đổi tên nơi mua cam
     * @param fromWhere tên nơi mua cam cần thay đổi.
     */
    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }
}
