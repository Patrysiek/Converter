package com.converter.app.unitConverter.mass.funtWaga;

import com.converter.app.unitConverter.UnitConverter;

public class LbToOz extends UnitConverter {
    public LbToOz(){
        this.id="lboz";
    }
    @Override
    public float convertedResult(float value) {
        return value*16f;
    }
}
