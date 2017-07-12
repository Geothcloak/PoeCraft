package com.justin.output;

public class ItemReporter {
		StringBuilder stringBuilder;
	public StringBuilder ChanceToCraft(float correctPrefixChance, float correctSuffixChance, float chanceOfBothCorrect){
		stringBuilder = new StringBuilder();
		stringBuilder.append("Chance to roll correct prefix is : " + correctPrefixChance + "\n");
		stringBuilder.append("Chance to roll correct suffix is : " + correctSuffixChance + "\n");
		stringBuilder.append("Chance to roll both correctly is : " + chanceOfBothCorrect + "\n");
		System.out.println(stringBuilder);
		return stringBuilder;
	}
	public StringBuilder CurrencyUsage(float alterationOrbsNeeded, float augmentationOrbsNeeded, float totalChaosOrbCost){
		stringBuilder = new StringBuilder();
		stringBuilder.append("Need : " + alterationOrbsNeeded + " alteration orbs" + "\n");
		stringBuilder.append("Need : " + augmentationOrbsNeeded + " augmentation orbs" + "\n");
		stringBuilder.append("Need : " + totalChaosOrbCost + " chaos orbs worth of materials" + "\n");
		System.out.println(stringBuilder);
		return stringBuilder;
	}
}
