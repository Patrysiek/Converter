package com.converter.app.unitConverter.length.ft;

import com.converter.app.unitConverter.UnitConverter;

public class FtToM extends UnitConverter{
    public FtToM(){
        this.id = "ftkm";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.3048f ;
    }
}
