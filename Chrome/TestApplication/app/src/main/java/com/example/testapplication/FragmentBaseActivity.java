package com.example.testapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public abstract class FragmentBaseActivity extends AppCompatActivity {

    private MyFragment myFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        showFragment();
    }


    private void showFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(myFragment == null){
            myFragment = MyFragment.newInstance();
            fragmentTransaction.add(R.id.fragment,myFragment).commit();
        }else{
            fragmentTransaction.show(myFragment).commit();
        }
    }
}