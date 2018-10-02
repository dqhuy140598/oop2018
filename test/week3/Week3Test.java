package week3;

import org.junit.Assert;
public class Week3Test{

    // TODO: Viết 5 testcase cho phương thức max()

    /**
     * Chương trình tạo 5 test case cho hàm max trong Week3
     */
    public void testMax(){
        Assert.assertEquals(5,Week3.max(5,2));
        Assert.assertEquals(1000,Week3.max(1000,8));
        Assert.assertEquals(15,Week3.max(15,6));
        Assert.assertEquals(555,Week3.max(555,-10));
        Assert.assertEquals(54,Week3.max(45,54));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()

    /**
     * Chương trình tạo 5 test case cho hàm minOfArray trong Week3
     */
    public void testMinArray(){
        int[] A = {1,2,3,4,5};
        int[] B ={4,6,3,-1,7,9,11};
        int[] C ={18,56,2,44,50000,623};
        int[] D ={123,-1,7,7777,999999,5544};
        int[] E ={1,1,1,1,1,1,1,1,1,1};
        Assert.assertEquals(1,Week3.minOfArray(A));
        Assert.assertEquals(-1,Week3.minOfArray(B));
        Assert.assertEquals(2,Week3.minOfArray(C));
        Assert.assertEquals(-1,Week3.minOfArray(D));
        Assert.assertEquals(1,Week3.minOfArray(E));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()

    /**
     * Chương trình tạo 5 test case cho hàm caculateBMI trong week3
     */
    public void testBMI(){
        Assert.assertEquals("Thiếu cân",Week3.calculateBMI(42,1.7));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(61,1.7));
        Assert.assertEquals("Thừa cân",Week3.calculateBMI(66,1.65));
        Assert.assertEquals("Bèo phì",Week3.calculateBMI(80,1.68));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(67,1.81));
    }
}
