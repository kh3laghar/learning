package com.asm_linksys.learning.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.asm_linksys.learning.R;

/**
 * Created by Md. Asiful Haque on 11/9/2016.
 */

public class Register extends Activity {
    Spinner bloodGroupArray, districtArray;
    Button registerButton;
    ArrayAdapter<CharSequence> bloodGroupAddapter, districtGroupAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bloodGroupArray = (Spinner) findViewById(R.id.bloodGroupSpinner);
        bloodGroupAddapter = ArrayAdapter.createFromResource(this, R.array.BloogGroup, android.R.layout.simple_spinner_item);
        bloodGroupAddapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        bloodGroupArray.setAdapter(districtGroupAdapter);

        districtArray = (Spinner) findViewById(R.id.selectDistrictSpinner);
        districtGroupAdapter = ArrayAdapter.createFromResource(this, R.array.DistrictSelection, android.R.layout.simple_spinner_item);
        districtGroupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        districtArray.setAdapter(districtGroupAdapter);

    }
}
