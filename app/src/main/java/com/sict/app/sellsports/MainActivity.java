package com.sict.app.sellsports;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sict.app.sellsports.fragment.favorite_fragment;
import com.sict.app.sellsports.fragment.home_fragment;
import com.sict.app.sellsports.fragment.order_fragment;
import com.sict.app.sellsports.fragment.search_fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottom = findViewById(R.id.bottom);
        bottom.setOnNavigationItemReselectedListener(navlistener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content, new home_fragment()).commit();

    }
    private  BottomNavigationView.OnNavigationItemReselectedListener navlistener =
            new BottomNavigationView.OnNavigationItemReselectedListener() {
                @Override
                public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                    Fragment fragmentselect = null;
                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            fragmentselect = new home_fragment();
                            break;
                        case R.id.nav_favorite:
                            fragmentselect = new favorite_fragment();
                            break;
                        case R.id.nav_search:
                            fragmentselect = new search_fragment();
                            break;
                        case R.id.nav_order:
                            fragmentselect = new order_fragment();
                    }


                }
            };
}
