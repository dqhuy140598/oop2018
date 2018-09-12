package week1;
// Cau 1
public class Student{
	// Cau 3
    private String studentName;
	private String studentID;
	private String studentGroup;
	private String studentEmail;
    // TODO: khai báo các phương thức getter, setter cho Student
	// Cau 4
	public String getName(){
			return this.studentName;
	}
	public void setName(String name){
		this.studentName = name;
	}
	public String getGroup(){
		return this.studentGroup;
	}
	public void setGroup(String group){
		this.studentGroup = group;
	}
	public String getID(){
		return this.studentID;
	}
	public void setID(String Id){
		this.studentID = Id;
	}
	public String getEmail(){
		return this.studentEmail;
	}
	public void setEmail(String email){	
		this.studentEmail = email;
	}
	//cau 7
    /**
     * Constructor 1
     */
    Student() {
        this.studentName = "Student";
		this.studentID ="000";
		this.studentGroup ="INT22041";
		this.studentEmail ="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this.studentName= n;
		this.studentID = sid;
		this.studentGroup = "INT22041";
		this.studentEmail = em;
    }

    /**
     * Constructor 3
     * @param s
     */
	 public Student(Student s){
		this.studentName = s.studentName;
		this.studentGroup =s.studentGroup;
		this.studentID = s.studentID;
		this.studentEmail = s.studentEmail;
    }
	// Cau 5
    String getInfo() {
        String temp = "";
		temp = temp + '\n' + this.studentName +'\n'+ this.studentGroup +'\n'+ this.studentID +'\n'+ this.studentEmail;
		return temp;
    }
}
