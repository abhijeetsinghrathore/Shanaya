package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Employee_Sales_EnterNewCustomer extends AppCompatActivity {

    Button saveCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__sales__enter_new_customer);

        saveCustomer=(Button)findViewById(R.id.saveCustomerID);

        saveCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Employee_Sales.class);
                startActivity(i);
            }
        });
    }
}
