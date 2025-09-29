package model.estrutura;

public class LogList {
	private LogNode last;
	private int MAX_ELEMENTS;
	private int size;
	private boolean isReading;
	
	public LogList() {
		this.last = null;
		this.MAX_ELEMENTS = 5;
		this.size = 0;
		this.isReading = false;
	}

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
	
	public LogNode getLast() {
		return last;
	}
	
	
}
