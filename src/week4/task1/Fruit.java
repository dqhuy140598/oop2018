package week4.task1;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class Fruit {
    /**
     * Lớp hoa quả
     * các thuộc tính gồm price: giá hoa quả và amount: số lượng hoa quả
     */
    private double price;
    private int amount;

    /**
     * phương thức trả về tổng giá trị lô hàng hoa quả
     * @return  tổng giá trị lô hàng hoa quả = giá bán * số lượng.
     */
    public double totalCost(){
        return price* amount;
    }

    /**
     * phương thức lấy ngày nhập lô hàng hoa quả
     * @return  ngày tháng năm nhập lô hàng hoa quả. ở đây mặc định là 12/9/2018.
     */
    public String getDate(){
        return "12/9/2018";
    }

    /**
     * phương thức lấy giá hoa quả
     * @return giá hoa quả
     */
    public double getPrice() {
        return price;
    }

    /**
     * phương thức khởi tạo giá trị cho thuộc tính giá hoa quả.
     * @param price là giá hoa quả mà ta muốn khởi tạo.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * phương thức lấy số lượng hoa quả.
     * @return  số lượng hoa quả mà ta nhập.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * phương thức khởi tạo giá trị cho số lượng hoa quả.
     * @param amount là số lượng hoa quả mà ta muốn khởi tạo.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public static void main(String Args[]){
        Orange orange = new Orange();
        Apple apple = new Apple();
        CamCaoPhong cam1 = new CamCaoPhong();
        CamSanh cam2 = new CamSanh();
        orange.setDays(18);
        System.out.println(orange.canEat(17));
        System.out.println(apple.companyBuyApple("TaoTau"));
        cam1.setFromWhere("HaNoi");
        System.out.println(cam1.getCompanyOrange());
        cam2.setFromWhere("HaNoi");
        System.out.println(cam2.getPriceForm());
    }
}
