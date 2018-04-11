package by.gsu.pmslab1;
import java.util. *;

public class ComparatorInt implements Comparator <Manager>{
	
	public ComparatorInt(){
		super();
	}
	
	public int compare(Manager arg0, Manager arg1){
		
		return (int)(arg0.getAge() - arg1.getAge());
	}
}


