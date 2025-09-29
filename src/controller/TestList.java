package controller;

import model.estrutura.*;

public class TestList {
	
	public void startTest() {
		try {
			LogList test = new LogList();
			
			test.addLogs("TESTE 1: Can you hear me major Tom?");
			test.addLogs("TESTE 2: I'm an aligator");
			test.addLogs("TESTE 3: They call then the Diamond Dogs");
			test.addLogs("TESTE 4: The man who sold the world");
			test.addLogs("TESTE 5: There's a Starman waiting in the sky");
			test.addLogs("Teste 6: EXCLUINDO O 1°");
			test.addLogs("TESTE 7: EXCLUINDO O 2°");
			
			String list = test.readLogs();
			System.out.println(list);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	
	}
}
