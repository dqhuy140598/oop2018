package week7.task1;

public class Numeral extends Expression{
    /**
     * thuộc tính giá trị hằng số
     */
    private int value;

    /**
     * phương thức tạo có 1 tham số là số nguyên
     * @param value giấ trị cần khởi tạo
     */
    public Numeral(int value){
        this.value = value;
    }

    /**
     * phương thức tạo mặc định
     */
    public Numeral(){
        this.value = 0;
    }

    /**
     * phương thức tính giá trị biểu thức hằng số
     * @return trả về hằng số đó.
     */
    @Override
    int Evaluate() {
        return value;
    }

    /**
     * phương thức trả về xâu ký tự
     * @return trả về xâu ký tự là hằng số.
     */
    @Override
    public String toString() {
        String temp = this.value+"";
        return temp;
    }
}
