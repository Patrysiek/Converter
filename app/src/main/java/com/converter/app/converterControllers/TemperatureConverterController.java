package com.converter.app.converterControllers;

import com.converter.app.unitConverter.UnitConverter;
import com.converter.app.unitConverter.temperature.Celsius.CToF;
import com.converter.app.unitConverter.temperature.Celsius.CToK;
import com.converter.app.unitConverter.temperature.Celsius.CToN;
import com.converter.app.unitConverter.temperature.Fahrenheit.FToC;
import com.converter.app.unitConverter.temperature.Fahrenheit.FToK;
import com.converter.app.unitConverter.temperature.Fahrenheit.FToN;
import com.converter.app.unitConverter.temperature.Kelvin.KToC;
import com.converter.app.unitConverter.temperature.Kelvin.KToF;
import com.converter.app.unitConverter.temperature.Kelvin.KToN;
import com.converter.app.unitConverter.temperature.Newton.NToC;
import com.converter.app.unitConverter.temperature.Newton.NToF;
import com.converter.app.unitConverter.temperature.Newton.NToK;

import java.util.ArrayList;
import java.util.List;

public class TemperatureConverterController implements IDependencyResult{


    private List<UnitConverter> list;
    public TemperatureConverterController() {
        list = new ArrayList<>();
        addDependency();
    }



    private void addDependency() {
        list.add(new CToK());
        list.add(new CToF());
        list.add(new CToN());

        list.add(new KToC());
        list.add(new KToN());
        list.add(new KToF());

        list.add(new FToC());
        list.add(new FToN());
        list.add(new FToK());

        list.add(new NToC());
        list.add(new NToK());
        list.add(new NToF());

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
