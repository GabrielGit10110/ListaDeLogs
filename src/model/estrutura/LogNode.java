package model.estrutura;

/**
 * Represents a node in a circular doubly linked list for log storage.
 * Each node contains a log message and maintains references to both the next
 * and previous nodes in the circular buffer structure.
 * 
 * <p>
 * This class is designed specifically for use with the LogList circular buffer
 * implementation to efficiently manage log entries with bidirectional traversal
 * capabilities.
 * </p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class LogNode {
	private String log;
	private LogNode next;
	private LogNode previous;

	/**
	 * Constructs a new LogNode with the specified log message.
	 * The next and previous references are initialized to null,
	 * to be set when the node is added to a LogList.
	 *
	 * @param log the log message to be stored in this node
	 */
	public LogNode(String log) {
		this.setLog(log);
		this.next = null;
		this.previous = null;
	
	}


	/**
	 * Returns the log message stored in this node.
	 *
	 * @return the log message stored in this node
	 */
	public String getLog() {
		return log;
	}

	/**
	 * Sets the log message for this node.
	 *
	 * @param log the new log message to be stored in this node
	 */
	public void setLog(String log) {
		this.log = log;
	}

	/**
	 * Returns the next node in the circular list.
	 * In a properly formed circular list, this should never be null.
	 *
	 * @return the next node in the sequence
	 */
	public LogNode getNext() {
		return next;
	}

	/**
	 * Sets the reference to the next node in the circular list.
	 * This method is used to maintain the circular structure of the LogList.
	 *
	 * @param next the next node in the sequence
	 */
	public void setNext(LogNode next) {
		this.next = next;
	}

	
	/**
	 * Sets the reference to the previous node in the circular list.
	 * This method is used to maintain the circular structure of the LogList.
	 *
	 * @param previous the previous node in the sequence
	 */
	public void setPrevious(LogNode previous) {
		this.previous = previous;
	}

}
