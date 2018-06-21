package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Employee_Tech_ProjectDetails extends AppCompatActivity {

    ListView tasklist;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech__project_details);

        final ArrayList<String> tasks=new ArrayList<String>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");

        adapter=new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,tasks);
        tasklist=(ListView)findViewById(R.id.tasklistID);
        tasklist.setAdapter(adapter);

        tasklist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i =new Intent(getBaseContext(),Employee_Tech_TaskDetails.class);
                startActivity(i);
            }
        });


    }
}
