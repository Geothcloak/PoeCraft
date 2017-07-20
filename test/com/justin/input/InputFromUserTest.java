package com.justin.input;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.items.Flask;

public class InputFromUserTest {
	private InputFromUser inputFromUser;
	
	@Before
	public void init(){
		inputFromUser = new InputFromUser();
	}
	
	@Test
	public void canInputLevel(){
		//why cant i put both asserts in one?
		Assert.assertEquals(10, inputFromUser.QuickSilverItemLevel());
	}
	@Test
	public void canInputName(){
		Assert.assertEquals("q", inputFromUser.NameOfItem());

	}
}
