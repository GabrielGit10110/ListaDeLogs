package model.estrutura;

public class LogNode {
	private String log;
	private LogNode next;
	private LogNode previous;

	public LogNode(String log) {
		this.setLog(log);
		this.next = null;
		this.previous = null;
	
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public LogNode getNext() {
		return next;
	}

	public void setNext(LogNode next) {
		this.next = next;
	}

	public LogNode getPrevious() {
		return previous;
	}

	public void setPrevious(LogNode previous) {
		this.previous = previous;
	}
	
	
}
