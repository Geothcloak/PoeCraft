package com.justin.currencymarket;
public class CurrencyMarketSnapshot implements Valueable{

	@Override
	public float AlterationOrbValue(float amount) {
		return amount / 15;
	}

	@Override
	public float AugmentationOrbValue(float amount) {
		return amount / 20;
	}

	@Override
	public float TransmutationOrbValue(float amount) {
		return amount / 60;
	}

	@Override
	public float FusingOrbValue(float amount) {
		return amount / 3;
	}

	@Override
	public float AlchemyOrbValue(float amount) {
		return amount / 4;
	}

	@Override
	public float ChaosOrbValue(float amount) {
		return amount / 1;
	}

	@Override
	public float ChanceOrbValue(float amount) {
		return amount / 7;
	}

	@Override
	public float RegalOrbValue(float amount) {
		return (float).8 * amount;
	}

	
	
}
