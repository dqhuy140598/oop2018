package week1;
import java.util.ArrayList;
import java.util.HashSet;
// Cau 2
public class StudentManagement {
	//cau 11
	private Student[] students = new Student[100];
	private int numberOfStudent = 4;

	//cau 9
    public boolean sameGroup(Student s1, Student s2) {
		if(s1.getGroup()==null || s2.getGroup()==null)	return false;
    	return s1.getGroup().equals(s2.getGroup());
    }
	//cau 12
    public void studentsByGroup() {
       HashSet<String> StudentClass = new HashSet<String>();
	    for(int i=0;i<numberOfStudent;++i) {
	    	StudentClass.add(students[i].getGroup());
	    }
	    for(String Group : StudentClass) {
	    	System.out.print("*Danh sach sinh vien lop"+ Group);
	    	for(int i=0;i<numberOfStudent;++i) {
	    		if(students[i].getGroup().equals(Group)) {
	    			System.out.println(students[i].getInfo());
	    		}
	    	}
	    }
    }
	//cau 13
	public void removeStudent(String id) {
		int index = -1;
		for(int i=0;i<numberOfStudent;++i) {
			if(students[i].getID().equals(id)) {
				index = i;
				break;
			}
		}
		if(index!=-1){
			students[index]=null;
			for(int i = index;i<numberOfStudent-1;i++) {
				students[i] = students[i + 1];
			}
			students[numberOfStudent-1]=null;
			numberOfStudent--;
			System.out.println("Delete Successfully");
		}
		else System.out.println("Invalid To Remove Student By This " + id + " ID");
    }
    public static void main(String[] args) {
		Student Student1 = new Student();
		Student1.setName("DAO QUANG HUY");
		Student1.setGroup("INT22042");
		Student1.setID("17020165");
		Student1.setEmail("daoquanghuy.uet.140598@gmail.com");
	/*	System.out.println(Student1.getName());
		System.out.println(Student1.getInfo());*/
		// cau 8
		Student Student2 = new Student();
		Student Student3 = new Student("NGUYEN MANH HUNG","17024567","nguyenhung@vnu.edu.vn");
		Student Student4 = new Student(Student2);

		StudentManagement StudentManagament1 = new StudentManagement();

		StudentManagament1.students[0]=Student1;
		StudentManagament1.students[1]=Student2;
		StudentManagament1.students[2]=Student3;
		StudentManagament1.students[3]=Student4;
		StudentManagament1.studentsByGroup();
		StudentManagament1.removeStudent("17020165");
		StudentManagament1.studentsByGroup();
		//cau 10
		if(StudentManagament1.sameGroup(Student1,Student2))	System.out.println("YES");
		else System.out.println("NO");
    }
}
