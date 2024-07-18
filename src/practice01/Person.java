package practice01;

public class Person {
	
	public static void printData(String firstName, String lastName, int age, double height, double weight) {
		System.out.println("--------------------");
		System.out.println("打印个人信息：");
		System.out.println("姓名为" + fullName(firstName, lastName) + "。");
		System.out.println("年龄" + age + "岁。");
		if (age >= 18) {
			System.out.println("已成年。");
		} else {
			System.out.println("未成年。");
		}
		System.out.println("身高" + height + "m。");
		System.out.println("体重" + weight + "kg。");
		System.out.println("BMI指数" + Math.round(bmi(height, weight)) + "。");
		if (isHealthy(bmi(height, weight))) {
			System.out.println("根据BMI指数，健康状态良好。");
		} else {
			System.out.println("根据BMI指数，健康状态堪忧。");
		}
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + lastName;
	}
	
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
	
	public static boolean isHealthy(double bmi) {
		return bmi >= 18.5 && bmi < 25.0;
	}
}
