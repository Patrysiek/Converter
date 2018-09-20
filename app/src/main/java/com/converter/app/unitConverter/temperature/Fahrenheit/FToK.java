package com.converter.app.unitConverter.temperature.Fahrenheit;

import com.converter.app.unitConverter.UnitConverter;

public class FToK extends UnitConverter{

    public FToK(){this.id ="oFK"; }
    @Override
    public float convertedResult(float value) {
        return (float)((value+459.67)*(5/9));
    }
}
