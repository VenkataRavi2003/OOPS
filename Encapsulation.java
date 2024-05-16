import java.util.Scanner;
class Student{

	private int id; 
	private String studentName;
	private String dept;
	private int age;
	private long aadhar;

	public Student(int id,String studentName,String dept,int age,long aadhar){
		this.id = id;
		this.studentName = studentName;
		this.dept = dept;
		this.age  = age;
		this.aadhar = aadhar;
	}
	public int getID(){
		return id;
	}
	public String getStudentName(){
		return studentName;
	}
	public String getDept(){
		return dept;
	}
	public int getAge(){
		return age;
	}
	public long getAadhar(){
		return aadhar;
	}

	@Override
	public String toString(){
		return "Student ID   : "+id+"\n"+
		       "Student Name : "+studentName+"\n"+
		       "Deparment    : "+dept+"\n"+
		       "Student Age  : "+age+"\n"+
		       "Aadhar Num   : "+aadhar;
	}
}
public class Encapsulation{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter SID : ");
		int sid = sc.nextInt();
		sc.nextLine();

		System.out.print("\nEnter Student Name : ");
		String sname = sc.nextLine();

		System.out.print("\nEnter Department : ");
		String dept = sc.nextLine();
		sc.nextLine();

		System.out.print("\nEnter Student Age : ");
		int age = sc.nextInt();

		System.out.print("\nEnter Aadhar Number : ");
		long aadhar = sc.nextLong();

		Student student = new Student(sid,sname,dept,age,aadhar);

      /*toString(): Provides a complete representation of the student object,
                     useful for logging or displaying all details at once.*/
		System.out.println("\nStudent Details by overriding toString()");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(student.toString());

      /*Getters (): Allow access to individual attributes, 
                   useful when you need specific data from the object.*/
		System.out.println("\nStundet Details Using (getters methods())");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nStudent ID   : "+student.getID());
		System.out.println("Student Name   : "+student.getStudentName());
		System.out.println("Deparment      : "+student.getDept());
		System.out.println("Student Age    : "+student.getAge());
		System.out.println("Aadhar Number  : "+student.getAadhar());

		sc.close();
	}
}
