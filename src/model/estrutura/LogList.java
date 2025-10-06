package model.estrutura;

/**
 * Implements a circular buffer for log management with a fixed maximum
 * capacity.
 * This class provides thread-safe-like behavior by preventing additions during
 * read operations
 * and automatically overwrites the oldest logs when the buffer is full.
 * 
 * <p>
 * The implementation uses a circular doubly linked list to efficiently manage
 * log entries
 * with O(1) time complexity for both add and read operations.
 * </p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class LogList {
	private LogNode last;
	private int MAX_ELEMENTS;
	private int size;
	private boolean isReading;

	/**
	 * Constructs an empty LogList with default maximum capacity of 5 elements.
	 * Initializes the circular buffer in a ready state for log additions.
	 */
	public LogList() {
		this.last = null;
		this.MAX_ELEMENTS = 5;
		this.size = 0;
		this.isReading = false;
	}

	/**
	 * Adds a new log entry to the circular buffer.
	 * If the buffer is full, the oldest log is automatically overwritten.
	 * Addition is prohibited while a read operation is in progress.
	 *
	 * @param log the log message to be added
	 * @throws IllegalArgumentException if called while a read operation is in
	 *                                  progress
	 */
	public void addLogs(String log) throws IllegalArgumentException {
		if (isReading == true) {
			throw new IllegalArgumentException("Nao pode adicionar enquanto esta fazendo a leitura");
		}

		LogNode newLog = new LogNode(log);
		if (this.last == null) {
			newLog.setNext(newLog);
			newLog.setPrevious(newLog);
			this.last = newLog;
			this.size++;
		}

		else {
			if (this.size < this.MAX_ELEMENTS) {
				LogNode firstLog = this.last;
				LogNode nextLog = this.last.getNext();

				newLog.setPrevious(firstLog);
				newLog.setNext(nextLog);

				nextLog.setPrevious(newLog);
				firstLog.setNext(newLog);
				this.last = newLog;
				this.size++;

			} else {
				LogNode first = this.last.getNext();
				LogNode second = first.getNext();

				newLog.setNext(second);
				newLog.setPrevious(this.last);

				first.setNext(null);
				first.setPrevious(null);
				first.setLog(null);

				second.setPrevious(newLog);
				this.last.setNext(newLog);
				this.last = newLog;

			}

		}

	}

	/**
	 * Reads all log entries in reverse chronological order (newest first).
	 * Sets the reading flag to prevent concurrent modifications during read
	 * operations.
	 * Returns a formatted string with all logs separated by newlines.
	 *
	 * @return a formatted string containing all log entries, newest first
	 */
	public String readLogs() {
		this.isReading = true;
		StringBuilder messageLog = new StringBuilder("Logs: \n");
		int contador = 0;

		LogNode currentLog = this.last;

		do {
			messageLog.append(currentLog.getLog());
			contador++;

			if (contador < this.size) {
				messageLog.append("\n");
			}

			currentLog = currentLog.getPrevious();
		} while (currentLog != this.last && contador < this.size);

		return messageLog.toString();
	}

	/**
	 * Returns the most recent log node in the circular buffer.
	 * This represents the newest log entry added to the system.
	 *
	 * @return the most recent LogNode, or null if the buffer is empty
	 */
	public LogNode getLast() {
		return last;
	}

}
