package view;

import controller.TestList;

/**
 * Main entry point for the Log Management System application.
 * This class serves as the view layer in the MVC architecture,
 * providing the user interface to launch and execute the log system test suite.
 * 
 * <p>
 * This application demonstrates a circular buffer implementation for log
 * management
 * with automatic overwrite of oldest entries when capacity is reached.
 * </p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class LogList {

	/**
	 * Main method that serves as the entry point for the Log Management System.
	 * Creates a TestList instance and executes the comprehensive test suite
	 * that demonstrates the circular buffer functionality of the log system.
	 * 
	 * <p>
	 * <b>Application Output:</b>
	 * </p>
	 * The test will display log messages in reverse chronological order (newest
	 * first),
	 * showing how the circular buffer automatically manages log retention by
	 * overwriting
	 * oldest entries when the maximum capacity is exceeded.
	 * 
	 * <p>
	 * <b>Expected Output Example:</b>
	 * </p>
	 * 
	 * <pre>
	 * Logs: 
	 * TESTE 7: EXCLUINDO O 2°
	 * Teste 6: EXCLUINDO O 1°
	 * TESTE 5: There's a Starman waiting in the sky
	 * TESTE 4: The man who sold the world
	 * TESTE 3: They call then the Diamond Dogs
	 * </pre>
	 *
	 * @param args command-line arguments (not used in this application)
	 */
	public static void main(String[] args) {
		TestList test = new TestList();

		test.startTest();
	}

}
