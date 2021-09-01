package test;

import java.util.Calendar;

public class Person {
// ** 맴버필드 정의	
	private String idNo;
	private String name;
	private int age;
	private char gender;
// ** 생성자 정의		
	public Person(String idNo, String name) {
		this.idNo = idNo;
		this.name = name;
		setAgeGender();
	}
// ** 주민번호로 나이 와 성별 set 하기
	private void setAgeGender() {
		// 1) 성별
		gender = idNo.charAt(idNo.indexOf('-') + 1);
		// 2) AGE
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); //2021
		age = year - Integer.parseInt(idNo.substring(0, 2));
		if (gender=='1' || gender=='2')      age -= 1900;
		else if (gender=='3' || gender=='4') age -= 2000;
	}
// ** setter 
	public void setName(String name) {	
		this.name = name; }
// ** getter	
	public String getName() { 
		return name;}
	public int getAge() {
		return age; }
	
	public String getIdNo() {
		return idNo.replace(idNo.substring(7),"xxxxxxx") ;  }
	public char getGender() {
		if( gender=='1' || gender=='3') { return '남' ; }
		else if( gender=='2' || gender=='4') { return '여'; }
		else return ' ';
	}
// ** info 출력하기
	public void infoPrint() {
		System.out.println("======================");
		System.out.println("* 이름 => "+name);
		System.out.println("* 번호 => "+getIdNo());
		System.out.println("* 나이 => "+age);
		System.out.println("* 성별 => "+getGender());
	} //infoPrint
} // class
