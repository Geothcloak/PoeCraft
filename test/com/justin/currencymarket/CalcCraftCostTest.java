package com.justin.currencymarket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.items.Flask;
import com.justin.output.ItemReporter;

public class CalcCraftCostTest {
	CalcCraftCost calcCraftCost;
	Valueable valueable;
	ItemReporter itemReporter = new ItemReporter();
	Flask flask;
	
	@Before
	public void init(){
		calcCraftCost = new CalcCraftCost(valueable);
		
	}
	
	@Test
	public void CanQuickSilver(){
		//flaskItemControler.CreateQuickSilver();
		Assert.assertEquals(1, calcCraftCost.QuicksilverFlask(flask), .001);
	
	}
}
