package week9;
import javax.rmi.CORBA.Util;
import java.io.*;

public class Utils {
    /**
     * phương thức đọc vào 1 xâu ký tự từ file
     * @param path  đường dẫn tới thư mục chưa file cần đọc
     * @return  một xâu ký tự là nội dung của file
     */
    public static String readContentFormFile(String path){
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            String result="";
            int i = 0;
            while((i=fileInputStream.read())!=-1){
                result+=(char)i;
            }
            fileInputStream.close();
            return result;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }//end

    /**
     * phương thức ghi một xâu ký tự mới vào file, nếu file đó đã có nội dung thì ta xóa nội dung cũ đi vào thêm nội dung mới vào
     * @param path  đường dẫn tới file cần ghi nội dung
     * @param newContent  Nội dung muốn ghi vào file
     */
    public static void writeContentToFile(String path, String newContent){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            byte[] temp = newContent.getBytes();
            fileOutputStream.write(temp);
            fileOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//end

    /**
     * phương thức ghi vào thêm vào file nội dung mới mà không xóa đi nội dung cũ
     * @param path  đường dẫn tới file cần ghi
     * @param newContent  một xâu kí tự chứa nội dung mới cần ghi
     */
    public static void appendNewContentToFile(String path,String newContent){
        try{
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write("\n");
            fileWriter.write(newContent);
            fileWriter.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//end

    /**
     * phương thức tìm kiếm một file trong một thư mục
     * @param folderPath  đường dẫn của thư mục chưa file
     * @param fileName  tên của file cần tìm kiếm
     * @return  file cần tìm kiếm nếu có tồn tại hoăc null nếu nó không tồn tại
     */
    public static File findFileByName(String folderPath, String fileName){
        try{
            File dic = new File(folderPath);
            File[] arrFile = dic.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith(fileName) && name.endsWith(".txt");
                }
            });
            return arrFile[0];
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }//end
    public static void main(String args[]){
        String readFormFile = Utils.readContentFormFile("src/week9/Number.txt");
        System.out.println(readFormFile);
        String newContent = "Hi World";
        Utils.writeContentToFile("src/week9/Number.txt",newContent);
        String newString = Utils.readContentFormFile("src/week9/Number.txt");
        System.out.println(newString);
        Utils.appendNewContentToFile("src/week9/Number.txt","Hello i'm Huy");
        File searchFile = Utils.findFileByName("src/week9/","Number.txt");
        if(searchFile!=null)    System.out.println("File is exist");
        else System.out.println("File is not exist");
    }//end
}
