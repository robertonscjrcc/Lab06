package exceptions;

public class EmptyParameterException extends Exception {

	public EmptyParameterException(){
		super();
	}
	
	public EmptyParameterException(String string) {
		super(string);
	}

}
