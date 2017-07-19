package com.justin.currencymarket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.itemmods.PrefixListSnapshot;
import com.justin.itemmods.PrefixListable;
import com.justin.itemmods.SuffixListSnapshot;
import com.justin.itemmods.SuffixListable;
import com.justin.items.Flask;

public class CalcCraftCostTest {
	CalcCraftCost calcCraftCost;
	CurrencyMarketSnapshot currencyMarketSnapshot = new CurrencyMarketSnapshot();
	Valueable valueable = currencyMarketSnapshot;
	Flask flask;
	
	private PrefixListSnapshot prefixListSnapshot = new PrefixListSnapshot();
	private PrefixListable prefixListable = prefixListSnapshot;
	
	private SuffixListSnapshot suffixListSnapshot = new SuffixListSnapshot();
	private SuffixListable suffixListable = suffixListSnapshot;
	
	@Before
	public void init(){
		flask = new Flask("q", 20, prefixListable, suffixListable);
		calcCraftCost = new CalcCraftCost(valueable);
		
	}
	
	@Test
	public void CanQuickSilver(){
		//flaskItemControler.CreateQuickSilver();
		Assert.assertEquals(2.2916665, calcCraftCost.QuicksilverFlask(flask), .001);
	
	}
}
