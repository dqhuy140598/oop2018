package week4.task1;

public class Orange extends Fruit {
    /**
     * Lớp quả Cam.
     * 2 thuộc tính là loại cam và hạn sử dụng(tính bằng ngày)
     */
    private String typeOfOrange;
    private int days;

    /**
     * phương thức kiểm tra xem cam có còn ăn được không
     * @param day là số ngày đã trôi qua từ khi nhập cam về
     * @return  true nếu còn có thể ăn được và false nếu không.
     */
    public boolean canEat(int day){
        if(day >= this.days) return false;
        return true;
    }

    /**
     * phương thức trả về công ty mua cam
     * @param typeOfOrange  loại cam mà công ty đó muốn mua
     * @return  tên của công ty muốn mua loại cam đó.
     */
    public String companyBuyOrange(String typeOfOrange){
        if(typeOfOrange.equals("CamSanh"))  return "Vingroup";
        else if(typeOfOrange.equals("CamCaoPhong")) return "HAGL";
        else return "FLC";
    }

    /**
     * phương thức lấy tên loại cam
     * @return  tên loại cam
     */
    public String getTypeOfOrange() {
        return typeOfOrange;
    }

    /**
     * phương thức khởi tạo tên loại cam
     * @param typeOfOrange  tên loại cam cần khởi tạo
     */
    public void setTypeOfOrange(String typeOfOrange) {
        this.typeOfOrange = typeOfOrange;
    }

    /**
     * phương thức lấy số ngày sử dụng
     * @return  số ngày còn có thể sử dụng cam
     */
    public int getDays() {
        return days;
    }

    /**
     * phương thức khởi tạo số ngày sử dụng
     * @param days  số ngày sử dụng cần khởi tạo
     */
    public void setDays(int days) {
        this.days = days;
    }
}
