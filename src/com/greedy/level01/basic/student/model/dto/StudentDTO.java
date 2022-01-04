package com.greedy.level01.basic.student.model.dto;

public class StudentDTO {
	
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//기본 생성자
	public StudentDTO() {}
	
	//
	public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//
	public String getInformation() {
		int avg = (this.kor + this.eng + this.math) / 3;
		return "학년=" + this.grade + ", 이름=" + this.name  + ", 국어=" + this.kor  + ", 영어=" + this.eng  + ", 수학=" + this.name  + ", 평균=" + avg;
	}
	
	
	
}
