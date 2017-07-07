
public class CurrencyMarket implements Valueable{

	@Override
	public float AlterationOrbValue(float amount) {
		return 15 * amount;
	}

	@Override
	public float AugmentationOrbValue(float amount) {
		return 20 * amount;
	}

	@Override
	public float TransmutationOrbValue(float amount) {
		return 60 * amount;
	}

	@Override
	public float FusingOrbValue(float amount) {
		return 3 * amount;
	}

	@Override
	public float AlchemyOrbValue(float amount) {
		return 4 * amount;
	}

	@Override
	public float ChaosOrbValue(float amount) {
		return 1 * amount;
	}

	@Override
	public float ChanceOrbValue(float amount) {
		return 7 * amount;
	}

	@Override
	public float RegalOrbValue(float amount) {
		return (float).8 * amount;
	}

	
	
}
