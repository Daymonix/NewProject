package by.gsu.pmslab1;

public class Manager {

	private String surname;
	private int age;
	private String responsibilities;
	
	public Manager(String surname, int age, String responsibilities) {
		super();
		this.surname = surname;
		this.age = age;
		this.responsibilities = responsibilities;
	}
	
	public Manager() {
		super();
		
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getResponsibilities() {
		return responsibilities;
	}
	
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	
	public String toString() {
		return surname + ";" + age + ";" + responsibilities;
	}
}
