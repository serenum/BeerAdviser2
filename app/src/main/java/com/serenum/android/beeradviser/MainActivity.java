package com.serenum.android.beeradviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getAdvice(View view) {
        TextView advice = (TextView) findViewById(R.id.advice_textview);
        Spinner beerColor = (Spinner) findViewById(R.id.beer_color);
        List<String> brands = expert.getBrands(String.valueOf(beerColor.getSelectedItem()));
        StringBuilder listOfBrands = new StringBuilder();
        for(String brand: brands){
            listOfBrands.append(brand).append('\n');
        }
        advice.setText(listOfBrands);

//        String typeOfbeer = String.valueOf(beerColor.getSelectedItem());
//        advice.setText(typeOfbeer);
//        if((String.valueOf(beerColor.getSelectedItem())).equals("Dark"))
//            advice.setText("Great choice, I love a dark beer!");
//            else
//            advice.setText("FUUU!!!");
    }
}
