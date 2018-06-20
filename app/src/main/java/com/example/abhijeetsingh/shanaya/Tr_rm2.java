package com.example.abhijeetsingh.shanaya;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tr_rm2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tr_rm2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tr_rm2 extends Fragment {
    public Tr_rm2(){
        //empty constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tr_rm2, container, false);
        return view;
    }
}
