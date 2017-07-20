package com.justin.output;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemReporterTest {
	
	ItemReporter itemReporter;
	
	@Before
	public void init(){
		itemReporter = new ItemReporter();
	}
	
	@Test
	public void canReportChanceToCraft(){
		Assert.assertEquals("Chance to roll correct prefix is : 0.01\n" +
				"Chance to roll correct suffix is : 0.02\n" +
				"Chance to roll both correctly is : 0.01\n", itemReporter.ChanceToCraft(.01f, .02f, .01f).toString());
	}
	
	@Test
	public void canReportCurrencyUsage(){
		Assert.assertEquals("Need : 1.0 alteration orbs\n"+
				"Need : 2.0 augmentation orbs\n" +
				"Need : 4.0 chaos orbs worth of materials\n", itemReporter.CurrencyUsage(1f, 2f, 4f).toString());
	}
}
