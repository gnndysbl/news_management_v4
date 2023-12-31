package by.study.news.dao.connection;

public class ConnectionPoolException extends Exception{

	private static final long serialVersionUID = 1L;

	public ConnectionPoolException (String message, Exception e) {
		super(message, e);
	}

	public ConnectionPoolException() {
		super();
	}

	public ConnectionPoolException(String message) {
		super(message);
	}

	public ConnectionPoolException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectionPoolException(Throwable cause) {
		super(cause);
	}
}