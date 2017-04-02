package com.serenum.android.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serenum on 02.04.2017.
 */

public class BeerExpert {
    public List<String> getBrands(String beerColor){
        List<String> brands = new ArrayList<>();
        if(beerColor.equals("Light")) {
            brands.add("Jiguliovskoe");
            brands.add("Efes");
            brands.add("Baltika 3");
        } else if(beerColor.equals("Amber")){
            brands.add("BeerVaria");
            brands.add("Corona");
            brands.add("Baltika 7");
        } else if(beerColor.equals("Brown")){
            brands.add("Kozel brown");
            brands.add("Koshitce");
            brands.add("Baltika 9");
        } else {
            brands.add("I don't have recommendation of dark beer.");
        }
        return brands;
    }
}
