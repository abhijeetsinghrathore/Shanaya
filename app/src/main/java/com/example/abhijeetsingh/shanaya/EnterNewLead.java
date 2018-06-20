package com.example.abhijeetsingh.shanaya;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;

import java.util.Calendar;
import java.util.Date;

public class EnterNewLead extends AppCompatActivity {
    Button saveLead;
    ImageView mdate;
    EditText dateoflead;
    EditText describethelead;
    EditText companyname;
    EditText customer;
    EditText productname;
    EditText contactname;
    EditText email;
    EditText phone;
    EditText mobile;
    EditText fax;
    EditText address;
    EditText salesperson;
    EditText salesteam;
    EditText tags;
    EditText internalnotes;
    EditText externalinfo;
    RatingBar priority;
    String dateofleadstr;
    String describetheleadstr;
    String companynamestr;
    String customerstr;
    String productnamestr;
    String contactnamestr;
    String emailstr;
    String phonestr;
    String mobilestr;
    String faxstr;
    String addressstr;
    String salespersonstr;
    String salesteamstr;
    String tagsstr;
    String internalnotesstr;
    String externalinfostr;
    String prioritystr;
//    ListView listViewleads;
//    ArrayAdapter<String> dataadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_new_lead);
        saveLead=(Button)findViewById(R.id.saveLeadID);
        mdate=(ImageView)findViewById(R.id.calendarID);
        dateoflead=(EditText) findViewById(R.id.dateofleadID);
        describethelead=(EditText) findViewById(R.id.descriptionID);
        companyname=(EditText) findViewById(R.id.companynameID);
        customer=(EditText) findViewById(R.id.customerID);
        productname=(EditText) findViewById(R.id.productnameID);
        contactname=(EditText) findViewById(R.id.contactnameID);
        email=(EditText) findViewById(R.id.emailID);
        phone=(EditText) findViewById(R.id.phoneID);
        mobile=(EditText) findViewById(R.id.mobileID);
        fax=(EditText) findViewById(R.id.faxID);
        address=(EditText) findViewById(R.id.addressID);
        salesperson=(EditText) findViewById(R.id.salespersonID);
        salesteam=(EditText) findViewById(R.id.salesteamID);
        tags=(EditText) findViewById(R.id.tagsID);
        internalnotes=(EditText) findViewById(R.id.internalnotesID);
        externalinfo=(EditText) findViewById(R.id.externalinfoID);
        priority=(RatingBar)findViewById(R.id.ratingbarID);

//        final ArrayList<String> leads=new ArrayList<String>();
//        leads.add("first lead");
//        dataadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,leads);
//        listViewleads=(ListView)findViewById(R.id.listOfLeadsID);
//        listViewleads.setAdapter(dataadapter);


        saveLead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dateofleadstr=dateoflead.getText().toString();
                describetheleadstr=describethelead.getText().toString();
                companynamestr=companyname.getText().toString();
                customerstr=customer.getText().toString();
                productnamestr=productname.getText().toString();
                contactnamestr=contactname.getText().toString();
                emailstr=email.getText().toString();
                phonestr=phone.getText().toString();
                mobilestr=mobile.getText().toString();
                faxstr=fax.getText().toString();
                addressstr=address.getText().toString();
                salespersonstr=salesperson.getText().toString();
                salesteamstr=salesteam.getText().toString();
                tagsstr=tags.getText().toString();
                internalnotesstr=internalnotes.getText().toString();
                externalinfostr=externalinfo.getText().toString();
                prioritystr=String.valueOf(priority.getRating());
//                leads.add(describetheleadstr);
                Intent i=new Intent(getBaseContext(),Employee_Sales.class);
                startActivity(i);
                finish();




            }
        });



        mdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(EnterNewLead.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                dateoflead.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();


            }
        });



    }
}
