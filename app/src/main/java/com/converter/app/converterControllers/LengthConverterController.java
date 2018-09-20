package com.converter.app.converterControllers;

import com.converter.app.unitConverter.UnitConverter;
import com.converter.app.unitConverter.length.cm.CmToFt;
import com.converter.app.unitConverter.length.cm.CmToIn;
import com.converter.app.unitConverter.length.cm.CmToKm;
import com.converter.app.unitConverter.length.cm.CmToM;
import com.converter.app.unitConverter.length.cm.CmToMi;
import com.converter.app.unitConverter.length.cm.CmToYd;
import com.converter.app.unitConverter.length.ft.FtToCm;
import com.converter.app.unitConverter.length.ft.FtToIn;
import com.converter.app.unitConverter.length.ft.FtToKm;
import com.converter.app.unitConverter.length.ft.FtToM;
import com.converter.app.unitConverter.length.ft.FtToMi;
import com.converter.app.unitConverter.length.ft.FtToYd;
import com.converter.app.unitConverter.length.in.InToCm;
import com.converter.app.unitConverter.length.in.InToFt;
import com.converter.app.unitConverter.length.in.InToKm;
import com.converter.app.unitConverter.length.in.InToM;
import com.converter.app.unitConverter.length.in.InToMi;
import com.converter.app.unitConverter.length.in.InToYd;
import com.converter.app.unitConverter.length.km.KmToCm;
import com.converter.app.unitConverter.length.km.KmToFt;
import com.converter.app.unitConverter.length.km.KmToIn;
import com.converter.app.unitConverter.length.km.KmToM;
import com.converter.app.unitConverter.length.km.KmToMi;
import com.converter.app.unitConverter.length.km.KmToYd;
import com.converter.app.unitConverter.length.m.MToCm;
import com.converter.app.unitConverter.length.m.MToFt;
import com.converter.app.unitConverter.length.m.MToIn;
import com.converter.app.unitConverter.length.m.MToKm;
import com.converter.app.unitConverter.length.m.MToMi;
import com.converter.app.unitConverter.length.m.MToYd;
import com.converter.app.unitConverter.length.mi.MiToCm;
import com.converter.app.unitConverter.length.mi.MiToFt;
import com.converter.app.unitConverter.length.mi.MiToIn;
import com.converter.app.unitConverter.length.mi.MiToKm;
import com.converter.app.unitConverter.length.mi.MiToM;
import com.converter.app.unitConverter.length.mi.MiToYd;
import com.converter.app.unitConverter.length.yd.YdToCm;
import com.converter.app.unitConverter.length.yd.YdToFt;
import com.converter.app.unitConverter.length.yd.YdToIn;
import com.converter.app.unitConverter.length.yd.YdToKm;
import com.converter.app.unitConverter.length.yd.YdToM;
import com.converter.app.unitConverter.length.yd.YdToMi;

import java.util.ArrayList;
import java.util.List;

public class LengthConverterController implements IDependencyResult{


    private List<UnitConverter> list;
    public LengthConverterController() {
        list = new ArrayList<>();
        addLengthDependency();
    }

    private void addLengthDependency() {
        list.add(new CmToM());
        list.add(new CmToMi());
        list.add(new CmToFt());
        list.add(new CmToIn());
        list.add(new CmToKm());
        list.add(new CmToYd());

        list.add(new MToCm());
        list.add(new MToMi());
        list.add(new MToFt());
        list.add(new MToIn());
        list.add(new MToKm());
        list.add(new MToYd());

        list.add(new KmToM());
        list.add(new KmToMi());
        list.add(new KmToFt());
        list.add(new KmToIn());
        list.add(new KmToCm());
        list.add(new KmToYd());

        list.add(new FtToCm());
        list.add(new FtToMi());
        list.add(new FtToM());
        list.add(new FtToIn());
        list.add(new FtToKm());
        list.add(new FtToYd());

        list.add(new YdToCm());
        list.add(new YdToMi());
        list.add(new YdToM());
        list.add(new YdToFt());
        list.add(new YdToKm());
        list.add(new YdToIn());

        list.add(new MiToCm());
        list.add(new MiToM());
        list.add(new MiToFt());
        list.add(new MiToIn());
        list.add(new MiToKm());
        list.add(new MiToYd());

        list.add(new InToCm());
        list.add(new InToM());
        list.add(new InToFt());
        list.add(new InToMi());
        list.add(new InToKm());
        list.add(new InToYd());

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
