package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Employee_Tech extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout employeeTechDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        employeeTechDrawer = (DrawerLayout) findViewById(R.id.employee_tech_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, employeeTechDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        employeeTechDrawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        employeeTechDrawer = (DrawerLayout) findViewById(R.id.employee_tech_drawer_layout);
        if (employeeTechDrawer.isDrawerOpen(GravityCompat.START)) {
            employeeTechDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.employee__tech, menu);
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


        Fragment employeetechfrag = null; // create a Fragment Object
        int itemId = item.getItemId(); // get selected menu item's id
// check selected menu item's id and replace a Fragment Accordingly
        if (itemId == R.id.firsttechemployee) {
            employeetechfrag = new Employee_FirstFragment();
        } else if (itemId == R.id.secondtechemployee) {
            employeetechfrag = new Employee_SecondFragment();
        } else if (itemId == R.id.thirdtechemployee) {
            employeetechfrag= new Employee_ThirdFragment();
        }
        else if (itemId == R.id.fourthtechemployee) {
            employeetechfrag = new Employee_FourthFragment();
        }
        else if (itemId == R.id.fifthtechemployee) {
            employeetechfrag = new Employee_FifthFragment();
        }
        else if (itemId == R.id.projectstechemployee) {
            employeetechfrag = new Employee_Tech_ProjectsFragment();
        }


        else if(itemId==R.id.comm1) {
            Intent i= new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(android.content.Intent.EXTRA_TEXT,"The link is www..");
            startActivity(Intent.createChooser(i,"Share Via"));

        }
        else if(itemId==R.id.comm2){
            Intent intent = new Intent(android.content.Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:ieshagupta09@gmail.com"));
//                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ieshagupta09@gmail.com"});
//                    intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
//                    intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.");
            startActivity(Intent.createChooser(intent, "Send Email"));
        }
        else if(itemId==R.id.comm4){
            Intent i=new Intent(getBaseContext(),MainActivity.class);
            startActivity(i);
            finish();
        }
// display a toast message with menu item's title
        Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_SHORT).show();
        if (employeetechfrag != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.content_employee_techID, employeetechfrag); // replace a Fragment with Frame Layout
            transaction.commit(); // commit the changes
            employeeTechDrawer.closeDrawers(); // close the all open Drawer Views
            return true;
        }







        employeeTechDrawer = (DrawerLayout) findViewById(R.id.employee_tech_drawer_layout);
        employeeTechDrawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
