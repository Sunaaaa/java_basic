package workshop_inheritance;

public class StudentTest {
	public static void main(String[] args) {
		Student[] studentArray = new Student[3];
//		Student[] studentArray= null;
		Student s1 = new Student("홍길동", 15, 171, 81);
		Student s2 = new Student("한사람", 13, 183, 72);
		Student s3 = new Student("임걱정", 16, 175, 65);

		studentArray[0] = s1;
		studentArray[1] = s2;
		studentArray[2] = s3;

//		studentArray = new Student[]{s1,s2,s3};

		System.out.println("이름\t나이\t신장\t몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.printf("%s\t%2d\t%3d\t%3d\t%n", studentArray[i].getName(), studentArray[i].getAge(),
					studentArray[i].getHeight(), studentArray[i].getWeight());
		}
		int sum = 0;
		for (int i = 0; i < studentArray.length; i++) {
			sum += studentArray[i].getAge();
		}
		System.out.printf("나이의 평균 : %.2f %n", ((double)sum / (double)studentArray.length));

		sum = 0;
		for (int i = 0; i < studentArray.length; i++) {
			sum += studentArray[i].getHeight();
		}
		System.out.printf("신장의 평균 : %.2f %n", (double) ((double)sum / (double)studentArray.length));

		sum = 0;
		for (int i = 0; i < studentArray.length; i++) {
			sum += studentArray[i].getWeight();
		}
		System.out.printf("몸무게의 평균 : %.2f %n", ((double)sum / (double)studentArray.length));

	}
}
