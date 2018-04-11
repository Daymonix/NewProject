package by.gsu.pmslab1;
import java.util.Comparator;

public class ComparatorString implements Comparator <Manager>{
	public ComparatorString() {
		super();
	}

	public int compare(Manager arg0, Manager arg1) {

		return  arg0.getSurname().compareTo(arg1.getSurname()) ;
	}
}
