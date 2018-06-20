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

import java.util.Calendar;
import java.util.Date;

public class EnterNewOpportunity extends AppCompatActivity {

    ImageView opportunitydateimg;
    ImageView opportunitynextactiondateimg;
    ImageView opportunityclosingdateimg;
    EditText opportunitydate;
    EditText opportunitynextactiondate;
    EditText opportunityclosingdate;
    Button saveopportunity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_new_opportunity);


        opportunitydateimg=(ImageView)findViewById(R.id.calendaropportunityID);
        opportunitynextactiondateimg=(ImageView)findViewById(R.id.calendarnextactionID);
        opportunityclosingdateimg=(ImageView)findViewById(R.id.calendarclosingID);
        opportunitydate=(EditText)findViewById(R.id.dateofopportunityID);
        opportunitynextactiondate=(EditText)findViewById(R.id.dateofnextactionID);
        opportunityclosingdate=(EditText)findViewById(R.id.dateofclosingID);
        saveopportunity=(Button)findViewById(R.id.saveopportunityID);

        opportunitydateimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(EnterNewOpportunity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                opportunitydate.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();


            }
        });



        opportunitynextactiondateimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(EnterNewOpportunity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                opportunitynextactiondate.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
//                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();


            }
        });


        opportunityclosingdateimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(EnterNewOpportunity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                opportunityclosingdate.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
//                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();


            }
        });


        saveopportunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Employee_Sales.class);
                startActivity(i);
                finish();
            }
        });







    }
}
