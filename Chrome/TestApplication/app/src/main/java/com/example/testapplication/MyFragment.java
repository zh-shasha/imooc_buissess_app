package com.example.testapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment implements View.OnClickListener {

    private Button play;

    private Button next;

    private Button stop;


    public static synchronized MyFragment newInstance(){
        return new MyFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater,container,savedInstanceState);
        View view = inflater.inflate(R.layout.fragment,container,false);
        play = (Button)view.findViewById(R.id.play);
        stop = (Button)view.findViewById(R.id.stop);
        next = (Button)view.findViewById(R.id.next);
        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.play:
                Toast.makeText(getContext(), "play", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stop:
                Toast.makeText(getContext(), "stop", Toast.LENGTH_SHORT).show();
                break;
            case R.id.next:
                Toast.makeText(getContext(), "next", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
