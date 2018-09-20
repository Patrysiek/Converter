package com.converter.app.unitConverter.mass.kilogram;

import com.converter.app.unitConverter.UnitConverter;

public class KgToLb extends UnitConverter {
    public KgToLb(){
        this.id="Kglb";
    }
    @Override
    public float convertedResult(float value) {
        return value*2.2046f;
    }
}
