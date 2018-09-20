package com.converter.app.unitConverter.mass.funtWaga;

import com.converter.app.unitConverter.UnitConverter;

public class LbToKg extends UnitConverter {
    public LbToKg(){
        this.id="lbKg";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.4536f;
    }
}
