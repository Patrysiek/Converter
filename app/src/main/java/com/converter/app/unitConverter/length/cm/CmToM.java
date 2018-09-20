package com.converter.app.unitConverter.length.cm;

import com.converter.app.unitConverter.UnitConverter;

public class CmToM extends UnitConverter{
    public CmToM(){
        this.id = "cmm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.01f ;
    }
}
