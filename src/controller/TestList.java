package controller;

import model.estrutura.*;

/**
 * Test class for demonstrating the LogList circular buffer functionality.
 * This test showcases the automatic overwrite behavior when the log buffer
 * reaches its maximum capacity and the chronological order of log retrieval.
 * 
 * <p>
 * The test uses David Bowie song references to create memorable log messages
 * that demonstrate the FIFO (First-In-First-Out) overwrite behavior of the
 * circular buffer implementation.
 * </p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class TestList {

	/**
	 * Executes a comprehensive test of the LogList circular buffer system.
	 * This test demonstrates:
	 * <ul>
	 * <li>Initial log population up to maximum capacity</li>
	 * <li>Automatic overwrite of oldest logs when exceeding capacity</li>
	 * <li>Reverse chronological order of log retrieval</li>
	 * <li>Exception handling for log operations</li>
	 * </ul>
	 * 
	 * <p>
	 * <b>Test Scenario:</b>
	 * </p>
	 * <ol>
	 * <li>Add 5 logs (fills buffer to capacity)</li>
	 * <li>Add 2 more logs (overwrites oldest entries)</li>
	 * <li>Read all logs in reverse chronological order</li>
	 * </ol>
	 * 
	 * <p>
	 * <b>Expected Behavior:</b>
	 * </p>
	 * The circular buffer has a maximum capacity of 5 logs. When test logs 6 and 7
	 * are added, they overwrite test logs 1 and 2 respectively. The final output
	 * should show logs 7, 6, 5, 4, 3 in that order (newest first).
	 */
	public void startTest() {
		try {
			LogList test = new LogList();

			// Fill the buffer to capacity (5 logs)
			test.addLogs("TESTE 1: Can you hear me major Tom?");
			test.addLogs("TESTE 2: I'm an aligator");
			test.addLogs("TESTE 3: They call then the Diamond Dogs");
			test.addLogs("TESTE 4: The man who sold the world");
			test.addLogs("TESTE 5: There's a Starman waiting in the sky");
			test.addLogs("Teste 6: EXCLUINDO O 1°");
			test.addLogs("TESTE 7: EXCLUINDO O 2°");

			// These will overwrite the oldest logs (TESTE 1 and TESTE 2)
			test.addLogs("Teste 6: EXCLUINDO O 1");
			test.addLogs("TESTE 7: EXCLUINDO O 2");

			// Read and display all logs (newest first)
			String list = test.readLogs();
			System.out.println(list);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
