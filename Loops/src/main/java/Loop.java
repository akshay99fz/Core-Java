
public class Loop {
	public static void main(String args[]) {
		String str = "Animals are living beings. "+
				"There are some categories in animals. category:Dog category:Fish category:cow etc etc...";
		Loop.calc(str);
	}
	
	public static void calc(String str) {
		int count=0;
		while(true) {
			int found = str.indexOf("category", count);
			if(found == -1) break;
			int start = found+9;
			int end = str.indexOf(" ", start); 
			System.out.println(str.substring(start, end));
			count=end+1;
		}
	}
}
