package FactoryMethord;

public class KottuVegPackage extends KottuPackages {
    @Override
    protected void createKottuPackage() {
        kottu.add(new VegKottu());
        kottu.add(new MuttonKottu());
    }
}
