package com.asm_linksys.learning.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.asm_linksys.learning.R;

/**
 * Created by Md. Asiful Haque on 11/10/2016.
 */

public class ForgetPassword extends AppCompatActivity {
    EditText forgetUserName;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        forgetUserName = (EditText) findViewById(R.id.forgetPasswordUserName);
        submitButton = (Button) findViewById(R.id.ForgetPasswordSubmitButton);
    }
}
