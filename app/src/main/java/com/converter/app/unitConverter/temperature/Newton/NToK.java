package com.converter.app.unitConverter.temperature.Newton;

import com.converter.app.unitConverter.UnitConverter;

public class NToK extends UnitConverter{

    public NToK(){this.id ="oNK"; }
    @Override
    public float convertedResult(float value) {

        return value/0.33f+235.15f;
    }
}
