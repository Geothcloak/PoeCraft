
public class CurrencyMarket implements Valueable{

	@Override
	public float AlterationOrbValue(int amount) {
		return 15;
	}

	@Override
	public float AugmentationOrbValue(int amount) {
		return 20;
	}

	@Override
	public float TransmutationOrbValue(int amount) {
		return 60;
	}

	@Override
	public float FusingOrbValue(int amount) {
		return 3;
	}

	@Override
	public float AlchemyOrbValue(int amount) {
		return 4;
	}

	@Override
	public float ChaosOrbValue(int amount) {
		return 1;
	}

	@Override
	public float ChanceOrbValue(int amount) {
		return 7;
	}

	@Override
	public float RegalOrbValue(int amount) {
		return (float) .8;
	}

	
	
}
