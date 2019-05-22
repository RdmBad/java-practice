package day30_methods02;

public class StudentAtSchool {
public static void main(String[] args) {
	study("agile");
	study("SQL");
	sleep(8);
}
public static void study(String topic) {
	System.out.println("Student studying " + topic);
}

public static void sleep(int hours) {
	System.out.println("Student sleep " + hours + " hours");
}
}
