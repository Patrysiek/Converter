package com.converter.app.unitConverter.mass.stone;

import com.converter.app.unitConverter.UnitConverter;

public class StoneToLb extends UnitConverter {
    public StoneToLb(){
        this.id="stonelb";
    }
    @Override
    public float convertedResult(float value) {
        return value*14f;
    }
}
