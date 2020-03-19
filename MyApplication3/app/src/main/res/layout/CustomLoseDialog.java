package com.example.myapplication;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class CustomLoseDialog extends DialogFragment implements View.OnClickListener {
    private Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE); //无标题

        // getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        View view = inflater.inflate(R.layout.lose_custome_dialog,container);
        btn = view.findViewById(R.id.btn);
        btn.setOnClickListener(this);
        return view;
    }




//    @Override
//    public void onStart() {
//        super.onStart();
//        int dialogHeight = (int) (mContext.getResources().getDisplayMetrics().heightPixels * 0.8);
//        getDialog().getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,dialogHeight);
//        getDialog().setCanceledOnTouchOutside(true); //点击边际可消失
//        //6秒后让dialog消失
//        if (mHandler != null){
//            mHandler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    dismiss();
//                    mediaPlayer.stop();
//                    mediaPlayer.release();
//                }
//            },6000);
//        }
//    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                dismiss();
                break;
        }
    }


    public void show(FragmentManager fragmentManager, String lose) {
    }
}

