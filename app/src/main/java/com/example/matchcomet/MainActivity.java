package com.example.matchcomet;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

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
        GroupComets g3 = new GroupComets("New Years Dance", "David", "January 1, 2020", "Celebrate the new year with a dance off with your favorite professors and peers\nLocation: Plinth");
        GroupComets g4 = new GroupComets("Smash Ultimate Tourny", "David", "January 24, 2020", "So you think your the best at Smash? Come and find out if you have what it takes to get the epic victory royale\nLocation: Blackstone Launchpad");
        GroupComets g1 = new GroupComets("Taco Truck Tuesday", "David", "November 17, 2019", "Torchy's is coming on campus to provide good food and music along with a prize drawing at the end of the event\nLocation: Food Truck Park");
        GroupComets g5 = new GroupComets("UTD Mixer", "David", "March 30, 2020", "Hoping to find some friends or love in this cold weather? We got you covered with this extravagent mixer!\nLocation: AC Auditorium");
        GroupComets g2 = new GroupComets("Drinks With Deans", "David", "December 25, 2019", "Share a beer (non-alcoholic of course) with your favorite dean and share some stories about all the fun you have had at UTD\nLocation: Dean's Office");
        TotalGroups.addGroup(g1);
        TotalGroups.addGroup(g2);
        TotalGroups.addGroup(g3);
        TotalGroups.addGroup(g4);
        TotalGroups.addGroup(g5);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
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
}
