package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.IncorrectDayException;
import exceptions.NotAcceptedPersonException;

public class Minimarket {
	private final static String CC = "CC";
	private final static String CE = "CE";
	private final static String P = "Passport";
	private final static String[] types = {CC,CE,P};
	
	private int enterTries;
	private int quantityAdmitted;
	private List<Person> admittedPersons;
	
	public Minimarket() {
		enterTries = 0;
		quantityAdmitted = 0;
		admittedPersons = new ArrayList<Person>();
		
	}

	public int getEnterTries() {
		return enterTries;
	}

	public void setEnterTries(int enterTries) {
		this.enterTries = enterTries;
	}

	public int getQuantityAdmitted() {
		return quantityAdmitted;
	}

	public void setQuantityAdmitted(int quantityAdmitted) {
		this.quantityAdmitted = quantityAdmitted;
	}

	public List<Person> getAdmittedPersons() {
		return admittedPersons;
	}
	
	public void enterOrNot(String t, int n, boolean d) throws NotAcceptedPersonException, IncorrectDayException{
		enterTries += 1;
		boolean accepted = false;
		
		if(t.equalsIgnoreCase(CC) || t.equalsIgnoreCase(CE) || t.equalsIgnoreCase(P)) {
			String nStr = n + "";
			
			nStr = nStr.substring(0, nStr.length()-1);
			
			n = Integer.parseInt(nStr);
			
			if(d) {
				if(n%2 == 0) {
					addPerson(t,n);
					accepted = true;
					
				}
				
				else {
					throw new IncorrectDayException(accepted);
				}
			}
			
			else{
				if(n%2 !=0) {
					addPerson(t, n);
					accepted = true;
					
				}
				
				else {
					throw new IncorrectDayException(accepted);
				}
			}

		}
		
		else{
			throw new NotAcceptedPersonException(types);
		}
	}
	
	public void addPerson(String idType, int idNumber) {
		admittedPersons.add(new Person(idType,idNumber));
		
		quantityAdmitted += 1;
	}
}
