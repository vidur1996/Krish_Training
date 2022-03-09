package FactoryMethord;

public class KottuNonVegPackage extends KottuPackages {
    @Override
    protected void createKottuPackage() {
        kottu.add(new ChickenKottu());
        kottu.add(new MuttonKottu());
    }
}
