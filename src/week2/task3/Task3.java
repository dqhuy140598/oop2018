package week2.task3;

public class Task3 {
    public static void main(String Args[]){
        Teacher DangCaoCuong = new Teacher();
        Cat Miu = new Cat();
        Cars myCar = new Cars();
        DangCaoCuong.HomeWork("object oriented programming");
        Miu.Show();
        myCar.changeUser("NGUYEN MANH HUNG");
    }
}
class Teacher{
    private String Name;
    private String Address;
    private String Gender;
    private String Subject;
    private static double figure = 3.5;
    public double Salary(){
        return figure * 1000000;
    }
    public void Teaching(){
        System.out.println("the Teacher is teaching"+ this.Subject);
    }
    public void HomeWork(String subject){
        System.out.println("the Student have to finish "+ subject);
    }
    public void setSubject(String subject){
        this.Subject = subject;
    }
    public String getSubject(){
        return this.Subject;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
class Cat{
    private String Name;
    private int Weight;
    private String User;
    public void Show(){System.out.println("Meo Meo");}
    public void Jumping(){System.out.println("The Cat is Jumping");}
    public void Scratch(){System.out.println("The Cat is Scratching you");}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }
}
class Cars{
    private int Price;
    private String Name;
    private String Users;
    public boolean BuyCar(int money){
        if(money < this.Price)  return false;
        return true;
    }
    public boolean isRangerRover(){
        if(Name.equals("RangerRover"))  return true;
        return true;
    }
    public void changeUser(String newUser){
        System.out.println("The User now is "+ newUser);
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getUsers() {
        return Users;
    }

    public void setUsers(String users) {
        Users = users;
    }
}
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
