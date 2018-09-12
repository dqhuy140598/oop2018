package week1;
import java.util.ArrayList;
import java.util.HashSet;
// Cau 2
public class StudentManagement {
	//cau 11
	private static ArrayList<Student> students = new ArrayList<Student>(100);
	//cau 9
    public static boolean sameGroup(Student s1, Student s2) {
       return s1.getGroup().equals(s2.getGroup());
    }
	//cau 12
    public static void studentsByGroup() {
       HashSet<String> Class = new HashSet<String>();
	    for(Student st: students) {
	    	Class.add(st.getGroup());
	    }
	    for(String Group : Class) {
	    	System.out.println("Lop"+ Group);
	    	for(Student st:students) {
	    		if(st.getGroup().equals(Group)) {
	    			System.out.println(st.getInfo());
	    		}
	    	}
	    }
    }
	//cau 13
	public static void removeStudent(String id) {
       int index = -1;
		for(int i=0;i<students.size();++i) {
			if(students.get(i).getID().equals(id)) {
				index = i;
				break;
			}
		}
		if(index!=-1)	students.remove(index);
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
		students.add(Student1);
		students.add(Student2);
		students.add(Student3);
		students.add(Student4);
		removeStudent("17020166");
		studentsByGroup();
		//cau 10
		if(sameGroup(Student1,Student2))	System.out.println("YES");
		else System.out.println("NO");
    }
}
