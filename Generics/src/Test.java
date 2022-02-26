import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Container<String, Integer> con = new Container<String, Integer>("Akshay", 12);
		String a = con.getItem1();
		System.out.println(a);
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		set1.add("Akshay");
		set1.add("Kumar");
		set1.add("Patidar");
		set2.add("Akshay");
		set2.add("Kumar");
		set2.add("Patidar");
		Set<String> res= Test.Union(set1, set2);
		
		Iterator itr = res.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static <E> Set<E> Union(Set<E> set1, Set<E> set2){
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

}
