package com.converter.app.unitConverter.mass.stone;

import com.converter.app.unitConverter.UnitConverter;

public class StoneToKg extends UnitConverter {
    public StoneToKg(){
        this.id="stoneKg";
    }
    @Override
    public float convertedResult(float value) {
        return value*6.3503f;
    }
}
