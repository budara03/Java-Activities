package OrderProcessor;

public class InsufficientQuantityException extends Exception{
	 
		public InsufficientQuantityException(String message) {
			super(message);
		}
	}
