package com.asm_linksys.learning.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.asm_linksys.learning.R;

/**
 * Created by Md. Asiful Haque on 11/9/2016.
 */

public class LoginHome extends AppCompatActivity {
    Button forgetPassword, login, registerToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_test);
        login = (Button) findViewById(R.id.LoginHomeLoginButton);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent loginHomeIntent = new Intent(LoginHome.this, AfterLoginHome.class);
                startActivity(loginHomeIntent);
            }
        });
        forgetPassword = (Button) findViewById(R.id.LoginHomeForgetPasswordButton);
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgetPasswordIntent = new Intent(LoginHome.this, ForgetPassword.class);
                startActivity(forgetPasswordIntent);
            }
        });

    }
}
