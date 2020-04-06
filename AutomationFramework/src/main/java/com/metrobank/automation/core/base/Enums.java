package main.java.com.metrobank.automation.core.base;

public class Enums {
	public enum LogType {
		info,
		warning,
		pass,
		fail,
		error,
		fatal,
		skip
	}
	
	public enum AlertType {
		accept,
		dismiss
	}
	
	public enum BrowserType {
		chrome,
		ie,
		firefox
	}
}
