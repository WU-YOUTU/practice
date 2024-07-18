package practice01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("您要输入几个人的信息：");
		int n = scanner.nextInt();
		
		int minAge = Integer.MAX_VALUE;
		int maxAge = Integer.MIN_VALUE;
		double totalAge = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("====================");
			
			System.out.println("*请输入第" + (i + 1) + "位的信息");
			
			System.out.print("姓：");
			String firstName = scanner.next(); 
			
			System.out.print("名：");
			String lastName = scanner.next();
			
			System.out.print("年龄：");
			int age = scanner.nextInt();
			if (age < minAge) {
				minAge = age;
			}
			if (age > maxAge) {
				maxAge = age;
			}
			totalAge += age;
			
			System.out.print("身高（m）：");
			double height = scanner.nextDouble();
			
			System.out.print("体重（kg）：");
			double weight = scanner.nextDouble();
			
			Person.printData(firstName, lastName, age, height, weight);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("最小年龄为" + minAge + "岁。");
		System.out.println("最大年龄为" + maxAge + "岁。");
		System.out.println("平均年龄为" + totalAge / n + "岁。");
		
		scanner.close();
	}
}
