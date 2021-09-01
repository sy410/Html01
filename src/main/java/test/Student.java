package test;

import java.util.ArrayList;

public class Student extends Person{
	// ** 맴버변수
	int java;
	int html;
	int sum;
	// ** 생성자
	public Student(String idNo,String name,int java, int html) {
		super(idNo,name);
		this.java = java;
		this.html = html;
		this.sum = java+html;
	}
	@Override
	public void infoPrint() {
		super.infoPrint();
		System.out.println("Java : "+java);
		System.out.println("Html : "+html);
		System.out.println("총점 : "+sum);
	}
	static void studentSort01(Student[] students) {
		System.out.println("\n** Sort01 결과 **");
        for (int i=0; i<students.length; i++) {
            for (int j=i+1; j<students.length; j++) {
                if (students[i].sum < students[j].sum) {
                    Student tmp;
                    tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                } //if
            } //for_j
            System.out.printf(" %s, %s, %d \n"
            		, students[i].getIdNo()
            		, students[i].getName()
            		, students[i].sum);
        } // for_i
    } //studentSort01
	
	// ** ArrayList 적용하기
	static void studentSort02(ArrayList<Student> list) {
		System.out.println("\n** Sort02_ ArrayList적용 결과 **");
        for (int i=0; i<list.size(); i++) {
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(i).sum < list.get(j).sum) {
                    Student tmp;
                    tmp = list.get(i);
                    list.add(i,list.get(j));
                    list.add(j,tmp);
                } //if
            } //for_j
            System.out.printf(" %s, %s, %d \n"
            		, list.get(i).getIdNo()
            		, list.get(i).getName()
            		, list.get(i).sum);
        } // for_i
    } //studentSort02
	
}//Student
