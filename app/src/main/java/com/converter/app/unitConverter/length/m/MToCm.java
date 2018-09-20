package com.converter.app.unitConverter.length.m;

import com.converter.app.unitConverter.UnitConverter;

public class MToCm extends UnitConverter{
    public MToCm(){
        this.id = "mcm";
    }
    @Override
    public float convertedResult(float value) {
        return value*100f ;
    }
}
