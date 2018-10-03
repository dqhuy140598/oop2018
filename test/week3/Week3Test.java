package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test{

    // TODO: Viết 5 testcase cho phương thức max()

    /**
     * Chương trình tạo 5 test case cho hàm max trong Week3
     */
    @Test
    public void testMax1(){
        Assert.assertEquals(5,Week3.max(5,2));
    }
    @Test
    public void testMax2(){
        Assert.assertEquals(1000,Week3.max(1000,8));
    }
    @Test
    public void testMax3(){
        Assert.assertEquals(15,Week3.max(15,6));
    }
    @Test
    public void testMax4(){
        Assert.assertEquals(555,Week3.max(555,-10));
    }
    @Test
    public void testMax5(){
        Assert.assertEquals(54,Week3.max(45,54));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()

    /**
     * Chương trình tạo 5 test case cho hàm minOfArray trong Week3
     */
    @Test
    public void testMinArray1(){
        int[] A = {1,2,3,4,5};
        Assert.assertEquals(1,Week3.minOfArray(A));
    }
    @Test
    public void testMinArray2(){
        int[] B ={4,6,3,-1,7,9,11};
        Assert.assertEquals(-1,Week3.minOfArray(B));
    }
    @Test
    public void testMinArray3(){
        int[] C ={18,56,2,44,50000,623};
        Assert.assertEquals(2,Week3.minOfArray(C));
    }
    @Test
    public void testMinArray4(){
        int[] D ={123,-1,7,7777,999999,5544};
        Assert.assertEquals(-1,Week3.minOfArray(D));
    }
    @Test
    public void testMinArray5(){
        int[] E ={1,1,1,1,1,1,1,1,1,1};
        Assert.assertEquals(1,Week3.minOfArray(E));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()

    /**
     * Chương trình tạo 5 test case cho hàm caculateBMI trong week3
     */
    @Test
    public void testBMI1(){
        Assert.assertEquals("Thiếu cân",Week3.calculateBMI(42,1.7));
    }
    @Test
    public void testBMI2(){
        Assert.assertEquals("Bình thường",Week3.calculateBMI(61,1.7));
    }
    @Test
    public void testBMI3(){
        Assert.assertEquals("Thừa cân",Week3.calculateBMI(66,1.65));
    }
    @Test
    public void testBMI4(){
        Assert.assertEquals("Béo phì",Week3.calculateBMI(80,1.68));
    }
    @Test
    public void testBMI5(){
        Assert.assertEquals("Bình thường",Week3.calculateBMI(67,1.81));
    }
}
