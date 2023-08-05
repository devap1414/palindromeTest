package com.techzenure.services;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalindromeTest {
	private String inputString;
	private boolean result;
	
	public PalindromeTest(String inputString, boolean result) {
		super();
		this.inputString = inputString;
		this.result = result;
	}

	@Parameters
	public static Collection<Object[]> generateData(){
		return Arrays.asList(new Object[][] {
			{"eye", true},
			{"java", false},
			{"malayalam",true},	
			{"techzenure", false}
		});
	}
	
	@Test
	public void testIsPalindrome() {
		Palindrome obj = new Palindrome();
		boolean actual = obj.isPalindrome(inputString);
		assertEquals(result, actual);
	}

}
