package model;

public class Person {
	private String idType;
	private int idNumber;
	
	public Person(String idType, int idNumber) {
		this.idType = idType;
		this.idNumber = idNumber;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
}
