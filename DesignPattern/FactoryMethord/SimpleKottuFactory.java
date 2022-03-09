package FactoryMethord;

public class SimpleKottuFactory {
    public static KottuPackages createKottuPackages( KottuPackageCode kottuPackageCode){
        switch (kottuPackageCode){
            case VEGKOTTU:
                return new KottuVegPackage();
            case NONVEGKOTTU:
                return new KottuNonVegPackage();
                default:
                    return null;
        }
    }
}
