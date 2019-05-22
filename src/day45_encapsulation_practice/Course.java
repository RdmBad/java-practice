package day45_encapsulation_practice;

import java.util.*;

public class Course {

	private String name;
	private List<String> teachers = new ArrayList<>();
	private List<String> students = new ArrayList<>();

	public void addStudent(String stName) {
		students.add(stName);
	}

	public void addTeacher(String thName) {
		teachers.add(thName);
	}

	public void removeStrudents(String stName) {
		students.remove(stName);
	}

	public void removeTeachers(String thName) {
		teachers.remove(thName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
	}

}
