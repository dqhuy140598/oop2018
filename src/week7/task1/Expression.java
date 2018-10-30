package week7.task1;

public abstract class Expression {
    /**
     * phương thức tính giá trị biểu thức
     * @return một số nguyên là giá trị biểu thức cần tính
     */
    abstract int Evaluate();

    /**
     * phương thức chuyển thành xâu ký tự
     * @return một xâu ký tự của biểu thức cần trả về
     */
    @Override
    public String toString() {
        return "Expression{}";
    }
}
