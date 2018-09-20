package com.converter.app.fragments;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.converter.app.R;
import com.converter.app.converterControllers.CurrencyConverterController;
import com.converter.app.converterControllers.IDependencyResult;
import com.converter.app.converterControllers.LengthConverterController;
import com.converter.app.converterControllers.MassConverterController;
import com.converter.app.converterControllers.TemperatureConverterController;



public class CalcFragment extends Fragment {

    Spinner fromUnitList;
    Spinner toUnitList;
    EditText enteredValue;
    TextView textResulted;
    TextView showedSubtitle;
    IDependencyResult dependencyResult;
    String subtitle;
    View v;
    public CalcFragment() {
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_calc, container, false);
        initClassVariables();
        listenForInputValue();
        selectingFirstUnit();
        selectingSecondUnit();

        return v;
    }

    private void selectingSecondUnit() {
        toUnitList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                convertAndShow();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }




    private void convertAndShow() {
        if(enteredValue.getText()!=null && enteredValue.getText().length()>0) {
            float result;
            result = dependencyResult.getResult(getFirstUnit(), getSecondUnit(), getValueFromUser());
            textResulted.setText(String.valueOf(result));
        }
        else
            textResulted.setText("0");

    }

    private float getValueFromUser() {
        return Float.valueOf(enteredValue.getText().toString());
    }


    private Spinner initUnitList(int id) {
        Spinner spinner = v.findViewById(id);

        ArrayAdapter<CharSequence> adapter =  chooseArray ();

        adapter.setDropDownViewResource(R.layout.spinner_items);
        spinner.setAdapter(adapter);
        return spinner;
    }

    private ArrayAdapter<CharSequence> chooseArray() {
        ArrayAdapter<CharSequence> adapter;
        switch (subtitle){
            case "MASA":
                 adapter = ArrayAdapter.createFromResource(getContext(),R.array.mass_units_array,R.layout.spinner_items);
                    dependencyResult = new MassConverterController();
                 break;
            case "DŁUGOŚĆ":
                adapter = ArrayAdapter.createFromResource(getContext(),R.array.length_units_array,R.layout.spinner_items);
                dependencyResult = new LengthConverterController();
                break;
            case "WALUTA":
                    adapter = ArrayAdapter.createFromResource(getContext(), R.array.currency_units_array, R.layout.spinner_items);
                    dependencyResult = new CurrencyConverterController();
                break;
            case "TEMPERATURA":
                adapter = ArrayAdapter.createFromResource(getContext(),R.array.temp_units_array,R.layout.spinner_items);
                dependencyResult = new TemperatureConverterController();
                break;
            default:
                adapter = new ArrayAdapter<>(getContext(),0);

        }



        Toast.makeText(getContext(),"Wow ! Małgorzata wybrała opcje "+subtitle+" xD",Toast.LENGTH_SHORT).show();
        return adapter;
    }


    private String getFirstUnit()
    {
        return fromUnitList.getSelectedItem().toString();
    }
    private String getSecondUnit(){
        return toUnitList.getSelectedItem().toString();
    }



    private void initClassVariables() {
        enteredValue = v.findViewById(R.id.entered_value);
        textResulted = v.findViewById(R.id.text_resulted);

        showedSubtitle = v.findViewById(R.id.mass_title);
        showedSubtitle.setText(subtitle);

        fromUnitList = initUnitList(R.id.from_unit_list);
        toUnitList = initUnitList(R.id.to_unit_list);
    }



    private void selectingFirstUnit() {
        fromUnitList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                convertAndShow();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void listenForInputValue() {
        enteredValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                convertAndShow();
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

        });
    }




    ////////////////////GETTERS&&SETTERS/////////////////////////////
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
