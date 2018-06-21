package com.example.abhijeetsingh.shanaya;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Calendar;
import java.util.Date;

public class Employee_Tech_ProjectManager_NewTask extends AppCompatActivity{

    EditText tasksummary;
    EditText project;
    EditText assignedto;
    EditText reviewer;
    EditText startdate;
    EditText deadline;
    EditText description;
    ImageView startdateimage;
    ImageView deadlineimage;
    Button savetask;
    String tasksummarystr;
    String projectstr;
    String assignedtostr;
    String reviewerstr;
    String startdatestr;
    String deadlinestr;
    String descriptionstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech__project_manager__new_task);

        tasksummary=(EditText)findViewById(R.id.tasksummaryID);
        project=(EditText)findViewById(R.id.projectID);
        assignedto=(EditText)findViewById(R.id.assignedtoID);
        reviewer=(EditText)findViewById(R.id.reviewerID);
        startdate=(EditText)findViewById(R.id.startdateID);
        deadline=(EditText)findViewById(R.id.deadlineID);
        description=(EditText)findViewById(R.id.descriptionID);
        startdateimage=(ImageView)findViewById(R.id.startdatecalendarID);
        deadlineimage=(ImageView)findViewById(R.id.deadlinecalendarID);
        savetask=(Button)findViewById(R.id.savetaskID);

        tasksummarystr=tasksummary.getText().toString();
        projectstr=project.getText().toString();
        assignedtostr=assignedto.getText().toString();
        reviewerstr=reviewer.getText().toString();
        startdatestr=startdate.getText().toString();
        deadlinestr=deadline.getText().toString();
        descriptionstr=description.getText().toString();


        savetask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Employee_Tech_ProjectManager_ProjectDetails.class);
                startActivity(i);
                finish();
            }
        });

        startdateimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Employee_Tech_ProjectManager_NewTask.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                startdate.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();
            }
        });

        deadlineimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Employee_Tech_ProjectManager_NewTask.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                deadline.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
                datePickerDialog.getDatePicker().setMinDate(new Date().getTime());
                datePickerDialog.show();
            }
        });

    }
}