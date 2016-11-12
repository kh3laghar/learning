package com.asm_linksys.learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Md. Asiful Haque on 11/9/2016.
 */

public class LoginHome extends Activity {
    Button forgetPassword, login, registerToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_test);
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
