package com.converter.app.unitConverter.mass.stone;

import com.converter.app.unitConverter.UnitConverter;

public class StoneToOz extends UnitConverter {
    public StoneToOz(){
        this.id="stoneoz";
    }
    @Override
    public float convertedResult(float value) {
        return value*224f;
    }
}
