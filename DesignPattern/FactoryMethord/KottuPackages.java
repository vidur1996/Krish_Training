package FactoryMethord;

import java.util.ArrayList;
import java.util.List;

public abstract class KottuPackages {

    protected List<Kottu> kottu = new ArrayList<>();

    public KottuPackages(){
        createKottuPackage();
    }

    protected abstract void createKottuPackage();

    public String toString(){
        return" package of Kottu : "+kottu;
    }

}
