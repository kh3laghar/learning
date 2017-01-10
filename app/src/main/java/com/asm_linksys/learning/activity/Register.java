package com.asm_linksys.learning.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.asm_linksys.learning.R;

/**
 * Created by Md. Asiful Haque on 11/9/2016.
 */

public class Register extends AppCompatActivity {
    private Spinner bloodGroupArraySpinner, districtArraySpinner;
    private Button registerButton;
    private
    ArrayAdapter<CharSequence> bloodGroupAddapter, districtGroupAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /*

        Blood Group Array Spinner Configuration
         */
        bloodGroupArraySpinner = (Spinner) findViewById(R.id.bloodGroupSpinnerRegisterHome);
        bloodGroupAddapter = ArrayAdapter.createFromResource(this, R.array.BloogGroupArray, android.R.layout.simple_spinner_item);
        bloodGroupAddapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        bloodGroupArraySpinner.setAdapter(bloodGroupAddapter);
        bloodGroupArraySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "Selected Blood Group", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /*
            District Selection Spinner Configuration

         */
        districtArraySpinner = (Spinner) findViewById(R.id.districtSpinnerRegisterHome);
        districtGroupAdapter = ArrayAdapter.createFromResource(this, R.array.DistrictSelection, android.R.layout.simple_spinner_item);
        districtGroupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        districtArraySpinner.setAdapter(districtGroupAdapter);
        districtArraySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + "Selected District", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        registerButton = (Button) findViewById(R.id.registerButtonRegisterHome);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register.this, "Register", Toast.LENGTH_LONG).show();
            }
        });
    }


}
