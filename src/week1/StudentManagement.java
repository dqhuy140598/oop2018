package week1;
import java.util.ArrayList;
import java.util.HashSet;
// Cau 2
public class StudentManagement {
	//cau 11
	private Student[] students = new Student[100];
	private int numberOfStudent = 3;

	//cau 9
    public boolean sameGroup(Student s1, Student s2) {
       return s1.getGroup().equals(s2.getGroup());
    }
	//cau 12
    public void studentsByGroup() {
       HashSet<String> StudentClass = new HashSet<String>();
	    for(int i=0;i<numberOfStudent;++i) {
	    	StudentClass.add(students[i].getGroup());
	    }
	    for(String Group : StudentClass) {
	    	System.out.println("Lop"+ Group);
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
			for(int i = index;i<2;i++) {
				students[i] = students[i+1];
			}
		}
		else System.out.println("Invalid To Remove Student By This Id");
    }
    public static void main(String[] args) {
		Student Student1 = new Student();
		Student1.setName("DAO QUANG HUY");
		Student1.setGroup("INT22042");
		Student1.setID("17020165");
		Student1.setEmail("daoquanghuy.uet.140598@gmail.com");
		System.out.println(Student1.getName());
		System.out.println(Student1.getInfo());
		// cau 8
		Student Student2 = new Student();
		Student Student3 = new Student("NGUYEN MANH HUNG","17024567","nguyenhung@vnu.edu.vn");
		Student Student4 = new Student(Student2);

		StudentManagement sm = new StudentManagement();

		sm.students[0]=Student1;
		sm.students[1]=Student2;
		sm.students[2]=Student3;
		sm.students[3]=Student4;
		sm.removeStudent("17020166");
		sm.studentsByGroup();
		//cau 10
		if(sm.sameGroup(Student1,Student2))	System.out.println("YES");
		else System.out.println("NO");
    }
}
