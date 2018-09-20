package com.converter.app.unitConverter.mass.kilogram;

import com.converter.app.unitConverter.UnitConverter;

public class KgToStone extends UnitConverter {
    public KgToStone(){
        this.id="Kgstone";
    }
    @Override
    public float convertedResult(float value) {
        return value*0.1575f;
    }
}