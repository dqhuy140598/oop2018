package week7.task1;

public class Square extends Expression {
    /**
     * thuộc tính là biểu thức cần tính bình phương
     */
    private Expression expression;

    /**
     * phương thức khởi tạo có 1 tham số
     * @param expression biểu thức cần khởi tạo
     */
    public Square (Expression expression){
        this.expression = expression;
    }

    /**
     * phương thức tính biểu thức bình phương
     * @return  giá trị của biểu thức bình phương
     */
    @Override
    int Evaluate() {
        return (int)Math.pow(expression.Evaluate(),2);
    }

    /**
     * phương thức trả về xâu ký tự
     * @return  xâu ký tự biểu diễn biểu thức bình phương.
     */
    @Override
    public String toString() {
        return expression.toString()+"^2";
    }
}
