class Person {
	void work() {
		System.out.println("人です。仕事します。");
	}
}

class Student extends Person {
	void work() {
		System.out.println("学生です。勉強します。");
	}
}

class Teacher extends Person {
	void work() {
		System.out.println("教員です。授業をします。");
	}
	void makeTest() {
		System.out.println("試験問題を作ります。");
	}
}

class Car {

}


public class InstanceofExample {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();

		((Teacher)persons[2]).makeTest();

		for(int i = 0; i < persons.length; i++) {
			persons[i].work();
//			if(persons[i] instanceof Person) {
//				System.out.println("persons[" + i + "]はPersonクラスのインスタンスです");
//			}
//			if(persons[i] instanceof Student) {
//				System.out.println("persons[" + i + "]はStudentクラスのインスタンスです");
//			}
//			if(persons[i] instanceof Teacher) {
//				System.out.println("persons[" + i + "]はTeacherクラスのインスタンスです");
//			}
		}
	}

}
