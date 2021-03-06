package com.docatdoor.docatdoor;

import android.app.Activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class AfterLogin extends Activity
        implements NavigationView.OnNavigationItemSelectedListener {
    android.app.FragmentManager fragmentManager=getFragmentManager();
    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
         }
         public void buttonaction(View v)
         {
             if(v.getId()==R.id.button1)
             {
                 Intent i=new Intent(this,profile_frag.class);
                 startActivity(i);
             }
             if(v.getId()==R.id.button2)
             {
                 Intent i=new Intent(this,finding_doctor.class);
                 startActivity(i);
             }
             if(v.getId()==R.id.button3)
             {
                 Intent i=new Intent(this,notifications.class);
                 startActivity(i);
             }
             if(v.getId()==R.id.button4)
             {
                 Intent i=new Intent(this,LoginActivity.class);
                 startActivity(i);
             }
         }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.after_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_profile)
        {
            Intent i=new Intent(this,profile_frag.class);
            startActivity(i);
        }
        else if (id == R.id.nav_finding_doc)
        {
             Intent i=new Intent(this,finding_doctor.class);
             startActivity(i);
        }
        else if (id == R.id.nav_notifications)
        {
            Intent i=new Intent(this,notifications.class);
            startActivity(i);
        }
        else if (id == R.id.nav_records)
        {
            Intent i=new Intent(this,CurrentLocn.class);
            startActivity(i);
        }
        else if (id == R.id.nav_share)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
