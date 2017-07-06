import java.util.HashMap;

public class SufixListSnapshot implements SufixListable{

	@Override
	public HashMap<Integer, String> generateSufixList(int itemLevel) {
		HashMap<Integer, String> suffixList = new HashMap<Integer, String>();
		if (itemLevel >= 1){
			suffixList.put(1, "of Resistance. (20-30)% additional Elemental Resistances during Flask effect.");
		}
		if (itemLevel >= 6){
			suffixList.put(6, "of Iron Skin. (60-100)% increased Armour during Flask effect.");
		}
		if (itemLevel >= 1){
			suffixList.put(1, "of Steadiness. (40-60)% increased Block and Stun Recovery during Flask effect.");
		}
		if (itemLevel >= 8){
			suffixList.put(8, "of Reflexes. (60-100)% increased Evasion Rating during Flask effect.");
		}
		if (itemLevel >= 5){
			suffixList.put(5, "of Adrenaline. (20-30)% increased Movement Speed during Flask effect.");
		}
		if (itemLevel >= 10){
			suffixList.put(10, "of Gluttony. 0.4% of Physical Attack Damage Leeched as Life during Flask effect.");
		}
		if (itemLevel >= 12){
			suffixList.put(12, "of Craving. 0.4% of Physical Attack Damage Leeched as Mana during Flask effect.");
		}
		return suffixList;
	}


}
