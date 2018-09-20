package com.converter.app.unitConverter.length.yd;

import com.converter.app.unitConverter.UnitConverter;

public class YdToCm extends UnitConverter{
    public YdToCm(){
        this.id = "ydcm";
    }
    @Override
    public float convertedResult(float value) {
        return value*91.44f ;
    }
}
