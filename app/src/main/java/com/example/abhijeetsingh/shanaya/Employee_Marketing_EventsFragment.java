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

public class Employee_Marketing_EventsFragment extends Fragment {
    FloatingActionButton fab;
    ListView listViewEvents;
    ArrayAdapter<String> dataadapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;
        v=inflater.inflate(R.layout.fragment_employee__marketing__events, container, false);
        fab=(FloatingActionButton)v.findViewById(R.id.addnewevent);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),Employee_Marketing_NewEvent.class);
                startActivity(i);

            }
        });


        final ArrayList<String> events=new ArrayList<String>();
        events.add("First Event");
        events.add("Second Event");
        events.add("Third Event");
        events.add("Fourth Event");
        events.add("Fifth Event");
        events.add("Sixth Event");


        dataadapter=new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1,events);
        listViewEvents=(ListView)v.findViewById(R.id.listOfEventsID);
        listViewEvents.setAdapter(dataadapter);

        listViewEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getContext(),Employee_Markerting_EventDetails.class);
                startActivity(i);
            }
        });

// Inflate the layout for this fragment

        return  v;
    }
}