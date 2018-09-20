package com.converter.app.unitConverter.mass.uncja;

import com.converter.app.unitConverter.UnitConverter;

public class OzToLb extends UnitConverter {
    public OzToLb(){
        this.id="ozlb";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.0625f;
    }
}