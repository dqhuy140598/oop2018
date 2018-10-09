package week4.task1;

public class Apple extends Fruit {
    /**
     * lớp quả táo
     * 2 thuộc tính là loại táo và hạn sử dụng(tính bằng ngày)
     */
    private String typeOfApple;
    private int days;

    /**
     * phương thưc kiểm tra táo có còn ăn được không
     * @param day số ngày đã qua từ khi nhập táo
     * @return  true nếu táo còn ăn được và false nếu không
     */
    public boolean canEat(int day){
        if(day >= this.days) return false;
        return true;
    }

    /**
     * phương thức trả về tên công ty mua táo.
     * @param typeOfApple   loại táo mà công ty cần mua
     * @return  tên của công ty muốn mua loại táo đó
     */
    public String companyBuyApple(String typeOfApple){
        if(typeOfApple.equals("TaoMy"))  return "Vingroup";
        else if(typeOfApple.equals("TaoTau")) return "HAGL";
        else return "FLC";
    }

    /**
     * phương thức trả về loại táo
     * @return  trả về tên của loại táo đó
     */
    public String getTypeOfApple() {
        return typeOfApple;
    }

    /**
     * phương thức khởi tạo loại táo
     * @param typeOfApple   tên của loại táo cần khởi tạo
     */
    public void setTypeOfApple(String typeOfApple) {
        this.typeOfApple = typeOfApple;
    }

    /**
     * phương thức lấy số ngày sử dụng
     * @return  số ngày còn có thể sử dụng táo
     */
    public int getDays() {
        return days;
    }

    /**
     * phương thức khởi tạo số ngày sử dụng
     * @param days  số ngày sử dụng mà ta muốn khởi tạo
     */
    public void setDays(int days) {
        this.days = days;
    }
}
