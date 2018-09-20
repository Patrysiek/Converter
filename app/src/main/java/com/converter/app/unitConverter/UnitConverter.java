package com.converter.app.unitConverter;

public abstract class UnitConverter {
    protected String id;
    public UnitConverter(){
    }
    public abstract float convertedResult(float value);
    public  String getId(){return id; }


}
