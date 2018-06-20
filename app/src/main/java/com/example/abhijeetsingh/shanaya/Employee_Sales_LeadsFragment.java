package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Employee_Sales_LeadsFragment extends Fragment {

    FloatingActionButton fab;
    ListView listViewleads;
    ArrayAdapter<String> dataadapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;
        v=inflater.inflate(R.layout.fragment_employee__sales__leads, container, false);
        fab=(FloatingActionButton)v.findViewById(R.id.addnewlead);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),EnterNewLead.class);
                startActivity(i);

            }
        });


        final ArrayList<String> leads=new ArrayList<String>();
        leads.add("First Lead");
        leads.add("Second Lead");
        leads.add("Third Lead");
        leads.add("Fourth Lead");
        leads.add("Fifth Lead");
        leads.add("Sixth Lead");
        leads.add("Seventh Lead");

        dataadapter=new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1,leads);
        listViewleads=(ListView)v.findViewById(R.id.listOfLeadsID);
        listViewleads.setAdapter(dataadapter);




// Inflate the layout for this fragment

        return  v;
    }
}
