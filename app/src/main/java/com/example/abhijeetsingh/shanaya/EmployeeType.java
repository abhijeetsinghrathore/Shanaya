package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class EmployeeType extends AppCompatActivity {

    ExpandableRelativeLayout expandableLayout1,expandableLayout2,expandableLayout3,expandableLayout4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_type);
    }


    public void expandableButton1(View view) {
     expandableLayout1 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout1);
    expandableLayout1.toggle(); // toggle expand and collapse
}

    public void expandableButton2(View view) {
        expandableLayout2 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout2);
        expandableLayout2.toggle(); // toggle expand and collapse
    }

    public void expandableButton3(View view) {
        expandableLayout3 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout3);
        expandableLayout3.toggle(); // toggle expand and collapse
    }

    public void expandableButton4(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout4);
        expandableLayout4.toggle(); // toggle expand and collapse
    }

    public void expandableButton5(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout5);
        expandableLayout4.toggle(); // toggle expand and collapse
    }

    public void expandableButton6(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout6);
        expandableLayout4.toggle(); // toggle expand and collapse
    }
    public void salesEmployee(View v){
        Intent i=new Intent(getApplicationContext(),Employee_Sales.class);
        startActivity(i);


    }

    public void salesEmployeeManager(View v){
        Intent i=new Intent(getApplicationContext(),Employee_Sales_Manager.class);
        startActivity(i);


    }
}