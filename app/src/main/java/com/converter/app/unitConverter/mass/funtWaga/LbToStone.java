package com.converter.app.unitConverter.mass.funtWaga;

import com.converter.app.unitConverter.UnitConverter;

public class LbToStone extends UnitConverter {
    public LbToStone(){
        this.id="lbstone";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0714f;
    }
}
