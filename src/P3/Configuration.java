package P3;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
	
	final String appName;
	final List<String> modules;


	public Configuration(String appName, List<String> modules) {
		this.appName = appName;
		this.modules = new ArrayList<>();
	}

	final void describe() {
		System.out.println("configuration info");
	}
}
