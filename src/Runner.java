import java.util.Arrays;

import by.gsu.pmslab1.ComparatorInt;
import by.gsu.pmslab1.ComparatorString;
import by.gsu.pmslab1.Manager;

public class Runner {
	public static void main(String[] args) {

		final Manager[] managers = new Manager[10];

		managers[0] = new Manager("Artemenko", 20, "yes");
		managers[1] = new Manager("Afonina", 20, "no");
		managers[2] = new Manager("Kuchin", 22, "yes");
		managers[3] = new Manager("Pirogov", 20, "yes");
		managers[4] = new Manager("Potapenok", 20, "no");
		managers[5] = new Manager("Kuznetsov", 23, "yes");
		managers[6] = new Manager("Ivanov", 28, "yes");
		managers[7] = new Manager("Petrov", 32, "no");
		managers[8] = new Manager("Smirnov", 29, "yes");
		managers[9] = new Manager("Sobolev", 29, "no");

		for (int i = 0; i < managers.length; i++) {
			System.out.println(managers[i]);
		}

		System.out.println("=================================");

		Arrays.sort(managers, new ComparatorInt());
		for (int i = 0; i < managers.length; i++) {
			System.out.println(managers[i]);
		}

		System.out.println("=================================");

		Arrays.sort(managers, new ComparatorString());
		for (int i = 0; i < managers.length; i++) {
			System.out.println(managers[i]);
		}

		System.out.println("=================================");

		int responsibilities = 0;

		for (final Manager song : managers) {
			if (song.getResponsibilities() == "yes") {
				++responsibilities;
			}
		}

		System.out.println("Number of employees who cope with responsibilities = " + responsibilities);
		System.out.println("=================================");

		int summAges = 0;
		for (final Manager manager : managers) {
			summAges += manager.getAge();

		}
		System.out.println("The average age is = " + summAges / managers.length + "years");
	}

}
