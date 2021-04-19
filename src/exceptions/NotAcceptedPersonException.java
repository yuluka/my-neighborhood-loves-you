package exceptions;

@SuppressWarnings("serial")
public class NotAcceptedPersonException extends Exception{
	private String[] acceptedType;

	public NotAcceptedPersonException(String[] acceptedType) {
		super("The identification type is not valid.");
		this.acceptedType = acceptedType;
	}

	public String[] getAcceptedType() {
		return acceptedType;
	}

	public void setAcceptedType(String[] acceptedType) {
		this.acceptedType = acceptedType;
	}
}
