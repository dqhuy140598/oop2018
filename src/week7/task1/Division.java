package week7.task1;

public class Division extends BinaryExpression {
    /**
     * 2 thuộc tính là biểu thức bên trái và biểu thức bên phải
     */
    private Expression left;
    private Expression right;
    /**
     * Hàm tạo có 2 tham số là 2 đối tượng thuộc lớp Expression
     * @param left đối tượng Expression bên trái.
     * @param right đối tượng Expression bên phải.
     */
    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    /**
     * phương thức tính giá trị biểu thức chia
     * @return trả về giá trị biểu thức bên trái nhân với giá trị biểu thức bên phải.
     */
    @Override
    int Evaluate() throws ArithmeticException{
        if(right.Evaluate()==0) throw new ArithmeticException();
        return left.Evaluate() / right.Evaluate();
    }
    /**
     * phương thức trả về xâu ký tự
     * @return xâu ký tự là biểu thức nhân
     */
    @Override
    public String toString()
    {
        return left.Evaluate() + " / "+ right.Evaluate();
    }
    /**
     * phương thức trả về biểu thức bên trái
     * @return  biểu thức bên trái
     */
    @Override
    public Expression left() {
        return this.left;
    }
    /**
     * phương thức trả về biểu thức bên phải
     * @return  biểu thức bên phải.
     */
    @Override
    public Expression right() {
        return this.right;
    }
}
