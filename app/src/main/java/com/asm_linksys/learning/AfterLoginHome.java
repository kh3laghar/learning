package com.asm_linksys.learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Md. Asiful Haque on 11/23/2016.
 */

public class AfterLoginHome extends Activity {
    Button addUser, searchUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_home);
        addUser=(Button)findViewById(R.id.AfterLoginHomeAddUser);
        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addUserIntent=new Intent(AfterLoginHome.this,AddUser.class);
                startActivity(addUserIntent);
            }
        });
        searchUser=(Button)findViewById(R.id.AfterLoginHomeSearchUser);
        searchUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchUserIntent=new Intent(AfterLoginHome.this,SearchHome.class);
                startActivity(searchUserIntent);
            }
        });

    }
}
