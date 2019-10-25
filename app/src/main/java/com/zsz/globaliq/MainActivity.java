package com.zsz.globaliq;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_tools, R.id.nav_contact, R.id.nav_share, R.id.nav_about)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void BNM(View view) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }

    public void BLM(View view) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }


    public void ba (View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.a:
                intent = new Intent(MainActivity.this, Main2Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a2:
                intent = new Intent(MainActivity.this, Main3Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a3:
                intent = new Intent(MainActivity.this, Main4Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a4:
                intent = new Intent(MainActivity.this, Main5Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a5:
                intent = new Intent(MainActivity.this, Main6Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a6:
                intent = new Intent(MainActivity.this, Main7Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a7:
                intent = new Intent(MainActivity.this, Main8Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a8:
                intent = new Intent(MainActivity.this, Main9Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a9:
                intent = new Intent(MainActivity.this, Main10Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a10:
                intent = new Intent(MainActivity.this, Main11Activity.class) ;
                startActivity(intent);
                break;
            case R.id.a11:
                intent = new Intent(MainActivity.this, Main12Activity.class) ;
                startActivity(intent);
                break;

        }
    }
}
