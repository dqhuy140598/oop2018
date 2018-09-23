package week2.task3;

public class Task3 {
}
class Teacher{
    private String Name;
    private String Address;
    private String Gender;
    public void Teaching(){
        System.out.println("You are leaning Object Oriented Programming");
    }
    public void Running(){System.out.println("The teacher is running");}
    public void Playing(){System.out.println("The teacher is playing football");}

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
class LapTop{
    private int Price;
    private String Name;
    private String Users;
}
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
