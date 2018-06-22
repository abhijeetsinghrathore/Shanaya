package com.example.abhijeetsingh.shanaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class Employee_Tech_ProjectManager_NewProject_SelectTeam extends AppCompatActivity {

    SearchView sv;
    ListView listofemployees;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech__project_manager__new_project__select_team);


        sv=(SearchView)findViewById(R.id.searchviewID);

        final ArrayList<String> listemployees=new ArrayList<String>();
        for(int i=0;i<50;i++)
        listemployees.add(i+"employee");


        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listemployees);
        listofemployees=(ListView)findViewById(R.id.ListOfEmployeesID);
        listofemployees.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(listemployees.contains(query)){
                    adapter.getFilter().filter(query);

            }
            else{
                    Toast.makeText(getApplicationContext(), "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });



    }
}
