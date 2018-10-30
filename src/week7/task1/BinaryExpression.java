package week7.task1;

public abstract class BinaryExpression extends Expression{
    /**
     * phương thức trả về biểu thức bên trái
     * @return  biểu thức ở phía bên trái
     */
    abstract Expression left();

    /**
     * phương thức trả về biểu thức ở bên phải
     * @return  biểu thức ở bên phải
     */
    abstract Expression right();
}
