package com.asm_linksys.learning.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.asm_linksys.learning.R;

//import android.support.v7.widget.Toolbar;

/**
 * Created by Md. Asiful Haque on 11/23/2016.
 */

public class AfterLoginHome extends AppCompatActivity {
    //Index to identify nav index
    private static int navItemIndex = 0;
    Button searchUser;
    /**
     * Variable for Component tree
     */
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private View navHeader;
    private ImageView imageViewBig, imageViewProfile;
    private TextView textViewName, textViewUrl;
    private Toolbar toolbar;
    private FloatingActionButton addUser;
    // flag to load home fragment when user presses back key
    private boolean shouldLoadHomeFragOnBackPress = true;
    //Tags to attach the fragment
    private Handler mHandler;
    // toolbar titles respected to selected nav menu item
    private String[] activityTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_home);

        /**
         * Initiate Toolbar
         */
      /*  toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Toolbar Line Code ended*/
        mHandler = new Handler();


        /**
         * Drawer Initiate
         */
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        /**
         * Navigation View setup
         */
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navHeader = navigationView.getHeaderView(0);
        textViewName = (TextView) navHeader.findViewById(R.id.name);
        textViewUrl = (TextView) navHeader.findViewById(R.id.website);
        imageViewBig = (ImageView) navHeader.findViewById(R.id.img_header_bg);
        imageViewProfile = (ImageView) navHeader.findViewById(R.id.img_profile);
        /**
         * Floating Button
         */
        addUser = (FloatingActionButton) findViewById(R.id.fab);


        //Load Toolbar tiles from string resource
        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);
        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
