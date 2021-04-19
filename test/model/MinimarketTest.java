package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.IncorrectDayException;
import exceptions.NotAcceptedPersonException;

class MinimarketTest {

	private void setupScenary1() {
		
	}
	
	@Test
	public void testEnterOrNot() throws NotAcceptedPersonException, IncorrectDayException {
		setupScenary1();
		
		String t = "CC";
		int n = 1193211367;
		boolean d = true;
		
		int quantityAdmittedPersonsExpected = 1;
		
		Minimarket m = new Minimarket();
		
		m.enterOrNot(t, n, d);
		
		assertEquals(quantityAdmittedPersonsExpected, m.getQuantityAdmitted());
		
	}
	
	private void setupScenary2() {
		
	}
	
	@Test
	public void testEnterOrNot2() throws NotAcceptedPersonException, IncorrectDayException {
		setupScenary2();
		
		String t = "CE";
		int n = 55156563;
		boolean d = true;
		
		int quantityAdmittedPersonsExpected = 1;
		
		Minimarket m = new Minimarket();
		
		m.enterOrNot(t, n, d);
		
		assertEquals(quantityAdmittedPersonsExpected, m.getQuantityAdmitted());
		
	}
	
	private void setupScenary3() {
		
	}
	
	@Test
	public void testEnterOrNot3() throws NotAcceptedPersonException, IncorrectDayException {
		setupScenary3();
		
		String t = "TI";
		int n = 123456789;
		boolean d = true;
		
		int quantityAdmittedPersonsExpected = 0;
		
		Minimarket m = new Minimarket();
		
		m.enterOrNot(t, n, d);
		
		assertEquals(quantityAdmittedPersonsExpected, m.getQuantityAdmitted());
		
	}
	
	private void setupScenary4() {
		
	}
	
	@Test
	public void testEnterOrNot4() throws NotAcceptedPersonException, IncorrectDayException {
		setupScenary4();
		
		String t = "CE";
		int n = 9543681;
		boolean d = false;
		
		int quantityAdmittedPersonsExpected = 0;
		
		Minimarket m = new Minimarket();
		
		m.enterOrNot(t, n, d);
		
		assertEquals(quantityAdmittedPersonsExpected, m.getQuantityAdmitted());
		
	}

}
