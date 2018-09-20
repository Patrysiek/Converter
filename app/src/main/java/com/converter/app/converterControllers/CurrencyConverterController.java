package com.converter.app.converterControllers;

import com.converter.app.unitConverter.UnitConverter;
import com.converter.app.unitConverter.currency.EUR.EURToGBP;
import com.converter.app.unitConverter.currency.EUR.EURToPLN;
import com.converter.app.unitConverter.currency.EUR.EURToUSD;
import com.converter.app.unitConverter.currency.GBP.GBPToEUR;
import com.converter.app.unitConverter.currency.GBP.GBPToPLN;
import com.converter.app.unitConverter.currency.GBP.GBPToUSD;
import com.converter.app.unitConverter.currency.PLN.PLNToEUR;
import com.converter.app.unitConverter.currency.PLN.PLNToGBP;
import com.converter.app.unitConverter.currency.PLN.PLNToUSD;
import com.converter.app.unitConverter.currency.USD.USDToEUR;
import com.converter.app.unitConverter.currency.USD.USDToGBP;
import com.converter.app.unitConverter.currency.USD.USDToPLN;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConverterController implements IDependencyResult{


    private List<UnitConverter> list;
    public CurrencyConverterController() {
        list = new ArrayList<>();
        addDependency();
    }



    private void addDependency() {
        list.add(new PLNToEUR());
        list.add(new PLNToGBP());
        list.add(new PLNToUSD());

        list.add(new USDToEUR());
        list.add(new USDToGBP());
        list.add(new USDToPLN());

        list.add(new EURToGBP());
        list.add(new EURToUSD());
        list.add(new EURToPLN());

        list.add(new GBPToEUR());
        list.add(new GBPToPLN());
        list.add(new GBPToUSD());


    }
    @Override
    public float getResult(String firstUnit, String secondUnit,float value){
       String id = new StringBuilder().append(firstUnit).append(secondUnit).toString();
        for(UnitConverter converter : list){
            if(converter.getId().equals(id))
                return converter.convertedResult(value);
        }

        return value;
    }

}
