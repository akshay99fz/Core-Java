
public class Male extends Humans implements Eat{

	public Male(String name, int age, String country) {
		super(name, age, country);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Eat_Food() {
		System.out.println(name + " Male is eating food");
	}
		
}
