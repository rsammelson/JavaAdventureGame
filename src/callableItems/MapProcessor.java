package callableItems;

public class MapProcessor implements CallableItemFunction {
	@Override
	public void call (String [] args) {
		System.out.println("The map says \"ennw.\"");
	}
}
