package P3;

import java.util.List;

public class CostumConfiguration extends Configuration {

	
	public CostumConfiguration(String appName, List<String> modules) {
		super(appName, modules);
	}

	/*public void changeAppName(String newAppName) {
		this.appName = newAppName;
	} */ //kein Zugriff auf this.appName wegen final Zugriffsmodifikator
	
	/*public void ModifiziereModuleList(List<String> newModules) {
		this.modules = newModules;
	}*/ //geht auch nicht wegen final
	
	/*@Override
	final void describe() {
		System.out.println("configuration info");
	}*/ //geht auch nicht da Methode final ist

}
