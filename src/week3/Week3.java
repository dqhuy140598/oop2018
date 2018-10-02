package week3;

public class Week3 {
    /**
     * Chương trình tính số lớn hơn trong hai số nguyên
     * @param m số nguyên thứ nhất
     * @param n số nguyên thứ hai
     * @return  số lớn hơn trong hai số
     */
    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        return Math.max(m,n);
    }

    /**
     * chương trình tìm số nhỏ nhất trong mảng số nguyên.
     * @param array mảng số nguyên
     * @return giá trị nhỏ nhất trong mảng
     */
    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
       int min = array[0];
       for(int i: array){
           if(i<=min){
               min = i;
           }
       }
       return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight / (Math.pow(height,2));
        if(BMI<18.5)    return "Thiếu cân";
        else if(BMI>=18.5 && BMI<=22.99)    return "Bình thường";
        else if(BMI >= 23 && BMI<=24.99)    return "Thừa cân";
        return "Bèo phì";
    }
    public static void main(String Args []){

    }
}
