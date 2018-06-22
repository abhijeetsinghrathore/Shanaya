package com.example.abhijeetsingh.shanaya;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Employee_Tech_ProjectDetails extends AppCompatActivity {

    ListView tasklist;
    ArrayAdapter<String> adapter;
    ListView teamlist;
    ArrayAdapter<String> adapter2;

    @SuppressLint("ClickableViewAccessibility")
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

        final ArrayList<String> team=new ArrayList<String>();
        team.add("Team Member 1");
        team.add("Team Member 2");
        team.add("Team Member 3");
        team.add("Team Member 4");
        team.add("Team Member 5");

        adapter2=new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,team);
        teamlist=(ListView)findViewById(R.id.teamlistID);
        teamlist.setAdapter(adapter2);

        tasklist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i =new Intent(getBaseContext(),Employee_Tech_TaskDetails.class);
                startActivity(i);
            }
        });




        tasklist=(ListView)findViewById(R.id.tasklistID);
        tasklist.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });

        teamlist.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });





    }
}

