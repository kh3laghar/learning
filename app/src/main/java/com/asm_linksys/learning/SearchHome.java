package com.asm_linksys.learning;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Md. Asiful Haque on 11/23/2016.
 */

public class SearchHome extends Activity {
    Button searchUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_donor);
    }
}
