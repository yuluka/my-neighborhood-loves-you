package exceptions;

@SuppressWarnings("serial")
public class IncorrectDayException extends Exception{
	private boolean accepted;

	public IncorrectDayException(boolean accepted) {
		super("The identification number is not valid for today.");
		this.accepted = accepted;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
}
