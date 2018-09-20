package com.converter.app.unitConverter.mass.kilogram;

import com.converter.app.unitConverter.UnitConverter;

public class KgToOz extends UnitConverter {
    public KgToOz(){
        this.id="Kgoz";
    }
    @Override
    public float convertedResult(float value) {
        return value*35.2736f;
    }
}
