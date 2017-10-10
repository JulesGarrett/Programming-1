import java.util.Scanner;
public class KUStudentTest {
	
	public static void main(String[] args){
		KUStudent stu=new KUStudent();
		Scanner s=new Scanner(System.in);
		String fn;
		String ln;
		String id;
		String dpt;
		System.out.println("Please input the student's name (firstname lastname)");
		fn=s.next();
		ln=s.next();
		System.out.println("Please input the student's KUID and department:");
		id=s.next();
		dpt=s.next();
		stu.SetName(fn, ln);
		stu.SetKuinfo(id, dpt);
		writeOutput(stu);
	}
	public static void writeOutput(KUStudent stu){
		System.out.println("Student:"+stu.get_fname()+" "+stu.get_lname());
		System.out.println("KUID: "+stu.get_id());
		System.out.println("Department: "+stu.get_dept());
	}
}
