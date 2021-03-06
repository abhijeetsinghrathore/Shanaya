package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Employee_Tech_ProjectManager_ProjectsFragment extends Fragment {
    FloatingActionButton fab;
    ListView listViewProjects;
    ArrayAdapter<String> dataadapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;
        v=inflater.inflate(R.layout.fragment_employee__tech__project_manager__projects, container, false);
        fab=(FloatingActionButton)v.findViewById(R.id.addnewproject);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),Employee_Tech_ProjectManager_NewProject.class);
                startActivity(i);

            }
        });


        final ArrayList<String> projects=new ArrayList<String>();
        projects.add("First project");
        projects.add("Second project");
        projects.add("Third projects");
        projects.add("Fourth project");
        projects.add("Fifth project");
        projects.add("Sixth project");
        projects.add("Seventh project");

        dataadapter=new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1,projects);
        listViewProjects=(ListView)v.findViewById(R.id.listOfProjectsID);
        listViewProjects.setAdapter(dataadapter);


        listViewProjects.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i =new Intent(getContext(),Employee_Tech_ProjectManager_ProjectDetails.class);
                startActivity(i);
            }
        });




// Inflate the layout for this fragment

        return  v;
    }
}
