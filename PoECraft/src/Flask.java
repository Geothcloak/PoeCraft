import java.util.HashMap;

public class Flask extends Item{
	public Flask(String name, int itemLevel) {
		super(name, itemLevel);
	}
	private HashMap<Integer, String> affixMap = new HashMap<Integer, String>();
	private HashMap<Integer, String> suffixMap = new HashMap<Integer, String>();
	
}
