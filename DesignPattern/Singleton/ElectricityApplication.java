package Singleton;

public class ElectricityApplication {
    public static void main(String[] args) {
        ElectricityManager electricityManager1 = ElectricityManager.getElectricityManager();
        System.out.println("Getting electricity using first instance  "+ electricityManager1);

        ElectricityManager electricityManager2 = ElectricityManager.getElectricityManager();
        System.out.println("Getting electricity using second instance "+ electricityManager2);
    }
}
