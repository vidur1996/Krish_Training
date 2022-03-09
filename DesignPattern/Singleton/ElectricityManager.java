package Singleton;

public class ElectricityManager {

	public static volatile ElectricityManager electricityManager;

	private  ElectricityManager(){
		if (electricityManager!= null){
			throw new RuntimeException("Please use  getElectricityManager method");
		}
	}

	public static  ElectricityManager getElectricityManager(){
		if (electricityManager ==null){
			synchronized (ElectricityManager.class){
				if(electricityManager == null){
					electricityManager = new ElectricityManager();
				}
			}
		}
		return electricityManager;
	}
}
