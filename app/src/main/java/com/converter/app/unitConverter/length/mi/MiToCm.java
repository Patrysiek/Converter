package com.converter.app.unitConverter.length.mi;

import com.converter.app.unitConverter.UnitConverter;

public class MiToCm extends UnitConverter{
    public MiToCm(){
        this.id = "micm";
    }
    @Override
    public float convertedResult(float value) {
        return value*160930f ;
    }
}
