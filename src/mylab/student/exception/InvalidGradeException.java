package mylab.student.exception;

public class InvalidGradeException extends Exception {
	private int currentGrade;
	
	public InvalidGradeException(String message, int currentGrade) {
		super(message);
		this.currentGrade = currentGrade;
	}
	
	public int getCurrentGrade() {
		return currentGrade;
	}
}
