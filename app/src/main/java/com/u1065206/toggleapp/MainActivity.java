package com.u1065206.toggleapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    //建立各屬性
    private ImageView img_bolb_on , img_bolb_off;
    private ConstraintLayout constraintlayout;
    private ToggleButton togglebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得各屬性的值，設定背景顏色，隱藏關燈圖片
        img_bolb_on=findViewById(R.id.img_bolb_on);
        img_bolb_off=findViewById(R.id.img_bolb_off);
        constraintlayout=findViewById(R.id.layout);
        togglebutton=findViewById(R.id.toggleButton);
        togglebutton.setOnCheckedChangeListener(this);
        constraintlayout.setBackgroundColor(Color.parseColor("#FFFF33"));
        img_bolb_off.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        //當按鈕按下後檢查checked狀態變為勾，設定背景為黑色，顯示關燈圖，隱藏開燈圖_反之亦然
        if(isChecked) {
            constraintlayout.setBackgroundColor(Color.parseColor("#000000"));
            img_bolb_off.setVisibility(View.VISIBLE);
            img_bolb_on.setVisibility(View.INVISIBLE);
        }else{
            constraintlayout.setBackgroundColor(Color.parseColor("#FFFF33"));
            img_bolb_off.setVisibility(View.INVISIBLE);
            img_bolb_on.setVisibility(View.VISIBLE);
        }
    }
}
