package com.converter.app.unitConverter.mass.uncja;

import com.converter.app.unitConverter.UnitConverter;

public class OzToStone extends UnitConverter {
    public OzToStone(){
        this.id="ozstone";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0045f;
    }
}