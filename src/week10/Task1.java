package week10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /**
     * phương thức tách các hàm static ra từ file
     * @param path  đường dẫn tới file cần tách
     * @return  một danh sách cac xâu là các hàm static có trong file đó
     */
    public List<String> getAllFunctions(String path){
        List<String> myList = new ArrayList<>();
        try{
            FileInputStream fin = new FileInputStream(path);
            int i= 0;
            String str = "";
            while((i=fin.read())!=-1){
                str+=(char)i;
            }
            while(str.indexOf("public static")!=-1){
                int posStart = str.indexOf("public static");
                int posEnd = str.indexOf("//end");
                String temp = str.substring(posStart,posEnd);
                str = str.substring(posEnd+1);
                myList.add(temp);
            }
            return myList;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * phương thức tìm kiếm một phương thức trong tệp
     * @param name tên của phương thức cần tìm kiếm trong tệp
     * @return  một xâu ký tự là mã nguồn của phương thức cần tìm kiếm, hoặc null nếu không tìm được xâu đó
     */
    public String findFunctionByName(String name){
        Task1 task1 = new Task1();
        List<String> myFuctions =  task1.getAllFunctions("src/week9/Utils.java");
        String standarName = name.substring(0,name.indexOf("("));
        for(int i=0;i<myFuctions.size();i++){
            if(myFuctions.get(i).indexOf(standarName)!=-1){
                return myFuctions.get(i);
            }
        }
        return null;
    }
    public static void main(String Args[]){
        Task1 task1 = new Task1();
        System.out.println(task1.findFunctionByName("readContentFormFile(String)"));
    }
}
