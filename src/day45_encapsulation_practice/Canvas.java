package day45_encapsulation_practice;

import java.util.*;

public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();

		course1.setName("Java Programming");
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Murodil");
		javaTeachers.add("Vasyl");
		javaTeachers.add("Maria");
		javaTeachers.add("Muhtar");
		javaTeachers.add("Marufjon");

		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());

		List<String> javaStudents = new ArrayList<>();

		javaStudents.add("Sreten");
		javaStudents.add("AigErim");
		javaStudents.add("Gulnar");
		javaStudents.add("Sung");
		javaStudents.add("Ethem");

		course1.setStudents(javaStudents);
		System.out.println(javaStudents.toString());

		course1.addTeacher("Luis");
		course1.addStudent("Kate");

		if (course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		} else {
			System.out.println("Maria is not a teacher");
		}

		if (course1.getStudents().contains("Kate")) {
			System.out.println("Kate is a student");
		} else {
			System.out.println("Kate is not a teacher");
		}

		course1.removeTeachers("Murodil");
		course1.removeStrudents("Sung");

		if (!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is removed successfully");
		} else {
			System.out.println("Murodil is still a teacher");
		}

		if (!course1.getStudents().contains("Roman")) {
			System.out.println("Roman is removed successfully");
		} else {
			System.out.println("Roman is still a student");
		}

		System.out.println(course1.toString());
	}
}
