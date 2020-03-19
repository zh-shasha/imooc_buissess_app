package com.example.testapplication;


import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1Fragment extends Fragment {
    private TextView tv;
    private int index;
    public F1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_f1, container, false);

//出发事件，监听事件中

        tv=(TextView)view.findViewById(R.id.tv1);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (index==4){
                Toast.makeText(getActivity(),"message=4",Toast.LENGTH_SHORT).show();
            }else if (index==3){
                Toast.makeText(getActivity(),"message=3",Toast.LENGTH_SHORT).show();
            }
            }
        });
            return view;
    }
    public void getMessage(int message){
//        if (message==2){
//            Toast.makeText(getActivity(),"可以点击",Toast.LENGTH_SHORT).show();
//        }
        index=message;
    }



}
