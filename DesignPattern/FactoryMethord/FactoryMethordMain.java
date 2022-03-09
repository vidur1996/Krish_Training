package FactoryMethord;

public class FactoryMethordMain {
    public static void main(String[] args) {
        KottuPackages kottuPackages1 = SimpleKottuFactory.createKottuPackages(KottuPackageCode.NONVEGKOTTU);
                System.out.println(kottuPackages1);
                System.out.println("vegetarian is a person who won't eat anything that can have children");


        KottuPackages kottuPackages2 = SimpleKottuFactory.createKottuPackages(KottuPackageCode.VEGKOTTU);
        System.out.println(kottuPackages2);
        System.out.println("I am not vegetarian but I eat animals who are");
    }
}
