package com.asm_linksys.learning.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.asm_linksys.learning.R;

/**
 * Created by Md. Asiful Haque on 11/23/2016.
 */

public class AfterLoginHome extends AppCompatActivity {
    Button addUser, searchUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_home);
        Toolbar universalToolBar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(universalToolBar);

        addUser = (Button) findViewById(R.id.AfterLoginHomeAddUser);

        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addUserIntent = new Intent(AfterLoginHome.this, AddUser.class);
                startActivity(addUserIntent);
            }
        });
        searchUser = (Button) findViewById(R.id.AfterLoginHomeSearchUser);
        searchUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchUserIntent = new Intent(AfterLoginHome.this, SearchHome.class);
                startActivity(searchUserIntent);
            }
        });


    }


}
