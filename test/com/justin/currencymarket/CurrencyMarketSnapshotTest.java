package com.justin.currencymarket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrencyMarketSnapshotTest {

	CurrencyMarketSnapshot currencyMarketSnapshot;
	
	@Before
	public void init(){
		currencyMarketSnapshot = new CurrencyMarketSnapshot();
	}
	
	@Test
	public void canGetCurrencyCost(){
		Assert.assertEquals(0.0666, currencyMarketSnapshot.AlterationOrbValue(1), .001);
		Assert.assertEquals(0.05, currencyMarketSnapshot.AugmentationOrbValue(1), .001);
		Assert.assertEquals(0.016, currencyMarketSnapshot.TransmutationOrbValue(1), .001);
		Assert.assertEquals(0.333, currencyMarketSnapshot.FusingOrbValue(1), .001);
		Assert.assertEquals(0.25, currencyMarketSnapshot.AlchemyOrbValue(1), .001);
		Assert.assertEquals(1, currencyMarketSnapshot.ChaosOrbValue(1), .001);
		Assert.assertEquals(0.142, currencyMarketSnapshot.ChanceOrbValue(1), .001);
		Assert.assertEquals(0.8, currencyMarketSnapshot.RegalOrbValue(1), .001);

		
	}
}
