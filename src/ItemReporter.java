
public class ItemReporter {
		StringBuilder stringBuilder = new StringBuilder();
	public StringBuilder ChanceToCraft(float correctPrefixChance, float correctSuffixChance, float chanceOfBothCorrect){
		stringBuilder.append("Chance to roll correct prefix is : " + correctPrefixChance + "\n");
		stringBuilder.append("Chance to roll correct suffix is : " + correctSuffixChance + "\n");
		stringBuilder.append("Chance to roll both correctly is : " + chanceOfBothCorrect + "\n");
		return stringBuilder;
	}
	public StringBuilder CurrencyUsage(float alterationOrbsNeeded, float augmentationOrbsNeeded, float totalChaosOrbCost){
		stringBuilder.append("Need : " + alterationOrbsNeeded + " alteration orbs" + "\n");
		stringBuilder.append("Need : " + augmentationOrbsNeeded + " augmentation orbs" + "\n");
		stringBuilder.append("Need : " + totalChaosOrbCost + " chaos orbs worth of materials" + "\n");
		return stringBuilder;
	}
}
