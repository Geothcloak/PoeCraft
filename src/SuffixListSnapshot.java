import java.util.HashMap;

public class SuffixListSnapshot implements SuffixListable{

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
		if (itemLevel >= 9){
			suffixList.put(9, "of Fending. Adds Knockback to Melee Attacks during Flask effect.");
		}
		if (itemLevel >= 18){
			suffixList.put(18, "of Warding. Immune to Curses during Flask effect. Removes Curses on use.");
		}
		if (itemLevel >= 16){
			suffixList.put(16, "of Curing. Immune to Poison during Flask Effect. Removes Poison on use.");
		}
		if (itemLevel >= 8){
			suffixList.put(8, "of Staunching. Immunity to Bleeding during Flask effect. Removes Bleeding on use.");
		}
		if (itemLevel >= 4){
			suffixList.put(4, "of Heat. Immunity to Freeze and Chill during Flask effect. Removes Freeze and Chill on use.");
		}
		if (itemLevel >= 6){
			suffixList.put(6, "of Dousing. Immunity to Ignite during Flask effect. Removes Burning on use.");
		}
		if (itemLevel >= 10){
			suffixList.put(10, "of Grounding. Immunity to Shock during Flask effect. Removes Shock on use.");
		}
		
		return suffixList;
	}


}
