import java.util.HashMap;

public class Flask extends Item{
	private HashMap<Integer, String> prefixList = new HashMap<Integer, String>();
	private HashMap<Integer, String> suffixList = new HashMap<Integer, String>();
	
	public Flask(String name, int itemLevel, PrefixListable prefixList, SuffixListable sufixList) {
		super(name, itemLevel);
		this.prefixList = prefixList.generatePrefixList(itemLevel);
		this.suffixList = sufixList.generateSufixList(itemLevel);
	}

	public HashMap<Integer, String> getPrefixList() {
		return prefixList;
	}

	public HashMap<Integer, String> getSuffixList() {
		return suffixList;
	}
}
