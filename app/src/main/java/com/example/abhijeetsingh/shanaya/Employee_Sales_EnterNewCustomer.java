package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Employee_Sales_EnterNewCustomer extends AppCompatActivity {

    Button saveCustomer,addimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__sales__enter_new_customer);

        saveCustomer=(Button)findViewById(R.id.saveCustomerID);
        addimage=(Button)findViewById(R.id.addimagebutton);

        saveCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Employee_Sales.class);
                startActivity(i);
            }
        });

        addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder addimagedialogbuilder=new AlertDialog.Builder(new ContextThemeWrapper(Employee_Sales_EnterNewCustomer.this, R.style.myDialog));
                View dialogview=getLayoutInflater().inflate(R.layout.custom_dailog_addimage,null);
                TextView gallery=(TextView)dialogview.findViewById(R.id.importfromgalleryID);
                TextView camera=(TextView)dialogview.findViewById(R.id.opencameraID);
                Button closedialog=(Button)dialogview.findViewById(R.id.closedialogbuttonID);
                addimagedialogbuilder.setView(dialogview);
                final AlertDialog addimagedialog=addimagedialogbuilder.create();
                addimagedialog.setTitle("Select Action");
                addimagedialog.show();
                closedialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addimagedialog.dismiss();

                    }
                });




            }
        });
    }
}
