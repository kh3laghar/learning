package com.asm_linksys.learning.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.asm_linksys.learning.R;

/**
 * Created by Md. Asiful Haque on 11/23/2016.
 */

public class SearchHome extends Activity implements AdapterView.OnItemSelectedListener {
    Button searchUser;
    Spinner spinnerDistrictSelection;
    Spinner spinnerBloodGroupSelection;
    ArrayAdapter<CharSequence> adapterBloodGroup;
    ArrayAdapter<CharSequence> adapterDistrict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_home);
        /**
         * Spinner Code for newbe like me
         */
        spinnerDistrictSelection = (Spinner) findViewById(R.id.selectDistrictSpinner);
        adapterDistrict = ArrayAdapter.createFromResource(this, R.array.DistrictSelection, android.R.layout.simple_spinner_item);
        adapterDistrict.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerDistrictSelection.setAdapter(adapterDistrict);
        spinnerDistrictSelection.setOnItemSelectedListener(this);

        /**
         * Second Spinner
         */
        spinnerBloodGroupSelection = (Spinner) findViewById(R.id.selectBloogGroupSpinner);
        adapterBloodGroup = ArrayAdapter.createFromResource(this, R.array.BloogGroup, android.R.layout.simple_spinner_item);
        adapterBloodGroup.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerBloodGroupSelection.setAdapter(adapterBloodGroup);
        spinnerBloodGroupSelection.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "Selected", Toast.LENGTH_LONG).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
