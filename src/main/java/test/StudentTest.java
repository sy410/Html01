package test;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		// Student 인스턴스 정의 및 출력
		Student s1 = new Student("030213-3039444","Banana", 70, 80);
		Student s2 = new Student("990314-2039444","Apple", 90, 88);
		Student s3 = new Student("880528-1659884","Grape", 50, 100);
		Student s4 = new Student("000713-4039888","Melon", 76, 76);
		Student s5 = new Student("030213-1039999","Lemon", 100, 100);

		Student[] students = {s1,s2,s3,s4,s5};
		for(int i=0;i<students.length;i++) {
			students[i].infoPrint();
		}
		// ** 성적순 출력하기 1 : 배열 적용
		Student.studentSort01(students);
		
		// ** 성적순 출력하기 2 : ArrayList 적용
		ArrayList<Student> list = new ArrayList<Student>();
		// => 배열 students 를 list 로 add
		for (Student s:students)  list.add(s) ;
		// => Sort & Print
		Student.studentSort02(list);
		
	}//main
}//class

