package com.example.testapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class f2Fragment extends Fragment {
    private F1Fragment f1Fragment;
    private f2Fragment f2Fragment;
//    public void setMyListener(MyListener listener){
//        this.listener=listener;
//    }
    public f2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_f2, container, false);
        Button btn=(Button)view.findViewById(R.id.btn);
        f1Fragment=new F1Fragment();
        f2Fragment=new f2Fragment();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity=(MainActivity)getActivity();
//                    (mainActivity).addFragment(R.id.contains1,f1Fragment);
//            if (listener !=null){
//                listener.sendMessage(2);
//            }
                if (getActivity() instanceof MainActivity){
                    ((MainActivity) getActivity()).ShowTest();
                }


            }
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public interface MyListener {
        void sendMessage(int message);
    }
    private MyListener listener;
        public void setMyListener(MyListener listener){
        this.listener=listener;
    }
}
