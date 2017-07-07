import java.util.HashMap;

public class PrefixListSnapshot implements PrefixListable{

	@Override
	public HashMap<Integer, String> generatePrefixList(int itemLevel) {
		HashMap<Integer, String> prefixList = new HashMap<Integer, String>();
		if (itemLevel >= 2){
			prefixList.put(2, "Ample. +(10-20)to Maximum Charges.");
		}
		if (itemLevel >= 3){
			prefixList.put(3, "Perpetual. (20-40)% increased Charge Recovery.");
		}
		if (itemLevel >= 8){
			prefixList.put(8, "Surgeon's. 20% chance to gain a Flask Charge when you deal a Critical Strike.");
		}
		if (itemLevel >= 12){
			prefixList.put(12, "Avenger's. Recharges 3 Charges when you take a Critical Strike.");
		}
		if (itemLevel >= 14){
			prefixList.put(14, "Chemist's. (25-20)% reduced Charges used.");
		}
		if (itemLevel >= 20){
			prefixList.put(20, "Experimenter's. (30-40)% increased Duration.");
		}
		if (itemLevel >= 20){
			prefixList.put(20, "Alchemist's. 33% reduced Duration. 25% increased effect.");
		}
		return prefixList;
	}
	
}
