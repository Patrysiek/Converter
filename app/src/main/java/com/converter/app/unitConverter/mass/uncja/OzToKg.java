package com.converter.app.unitConverter.mass.uncja;

import com.converter.app.unitConverter.UnitConverter;

public class OzToKg extends UnitConverter {
    public OzToKg(){
        this.id="ozKg";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0283f;
    }
}
