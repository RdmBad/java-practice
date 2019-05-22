package day48_inheritance01;

public class School {
	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student();

		p1.name = "Obama";
		p1.age = 57;
		p1.gender = 'm';

		s1.name = "maaaaaaan";
		s1.age = 32;
		s1.gender = 'm';

		p1.eat("okroshka");
		p1.walk();
		p1.sleep(11);

		s1.eat("grechka");
		s1.walk();
		s1.sleep(8);

		Student s2 = new Student();
		
		s2.name = "Orhan";
		s2.age = 40;
		s2.gender = 'm';
		s2.studentID = 4040;
		s2.clazz = "Agile Scrum";
		s2.code("c++");
		s2.attendClass();
		s2.eat("kebab");
		s2.walk();
		
		s1.code("Python");
		s1.attendClass();
		
	}
}
