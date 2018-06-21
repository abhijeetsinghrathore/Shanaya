package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Employee_Tech_ProjectManager_NewProject extends AppCompatActivity {
    Button saveProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech__project_manager__new_project);
        saveProject=(Button)findViewById(R.id.saveProjectID);

        saveProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getBaseContext(),Employee_Tech_ProjectManager.class);
                startActivity(i);
                finish();
            }
        });
    }
}
