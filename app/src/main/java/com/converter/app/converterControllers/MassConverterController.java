package com.converter.app.converterControllers;

import com.converter.app.unitConverter.UnitConverter;
import com.converter.app.unitConverter.mass.funtWaga.LbToKg;
import com.converter.app.unitConverter.mass.funtWaga.LbToOz;
import com.converter.app.unitConverter.mass.funtWaga.LbToStone;
import com.converter.app.unitConverter.mass.kilogram.KgToLb;
import com.converter.app.unitConverter.mass.kilogram.KgToOz;
import com.converter.app.unitConverter.mass.kilogram.KgToStone;
import com.converter.app.unitConverter.mass.stone.StoneToKg;
import com.converter.app.unitConverter.mass.stone.StoneToLb;
import com.converter.app.unitConverter.mass.stone.StoneToOz;
import com.converter.app.unitConverter.mass.uncja.OzToKg;
import com.converter.app.unitConverter.mass.uncja.OzToLb;
import com.converter.app.unitConverter.mass.uncja.OzToStone;

import java.util.ArrayList;
import java.util.List;

public class MassConverterController implements IDependencyResult{


    private List<UnitConverter> list;
    public MassConverterController() {
        list = new ArrayList<>();
        addMassDependency();
    }



    private void addMassDependency() {
        list.add(new KgToLb());
        list.add(new KgToOz());
        list.add(new KgToStone());

        list.add(new LbToKg());
        list.add(new LbToOz());
        list.add(new LbToStone());

        list.add(new StoneToKg());
        list.add(new StoneToLb());
        list.add(new StoneToOz());

        list.add(new OzToKg());
        list.add(new OzToLb());
        list.add(new OzToStone());
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
