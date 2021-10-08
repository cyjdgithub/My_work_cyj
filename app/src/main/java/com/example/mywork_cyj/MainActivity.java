package com.example.mywork_cyj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment wechatBlankFragment=new wechatBlankFragment();
    private Fragment contectBlankFragment=new contectBlankFragment();
    private Fragment messageBlankFragment=new messageBlankFragment();
    private Fragment qqBlankFragment=new qqBlankFragment();
    private FragmentManager fragmentManager;
    private LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        linearLayout1=findViewById(R.id.linearlayout1);
        linearLayout2=findViewById(R.id.linearlayout2);
        linearLayout3=findViewById(R.id.linearlayout3);
        linearLayout4=findViewById(R.id.linearlayout4);
        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);

        initfragment();

    }
    private void initfragment(){
        fragmentManager=getFragmentManager();
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.add(R.id.id_content,wechatBlankFragment);
        transaction.add(R.id.id_content,contectBlankFragment);
        transaction.add(R.id.id_content,qqBlankFragment);
        transaction.add(R.id.id_content,messageBlankFragment);
        transaction.commit();
    }
    private void hidefragment(FragmentTransaction transaction){

        transaction.hide(wechatBlankFragment);
        transaction.hide(contectBlankFragment);
        transaction.hide(qqBlankFragment);
        transaction.hide(messageBlankFragment);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.linearlayout1:
                showfragment(0);
                break;
            case R.id.linearlayout2:
                showfragment(1);
                break;
            case R.id.linearlayout3:
                showfragment(2);
                break;
            case R.id.linearlayout4:
                showfragment(3);
                break;
            default:
                break;
        }
    }

    private void showfragment(int i) {
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        hidefragment(transaction);
        switch (i){
            case 0:
                transaction.show(wechatBlankFragment);
                break;
            case 1:
                transaction.show(qqBlankFragment);
                break;
            case 2:
                transaction.show(messageBlankFragment);
                break;
            case 3:
                transaction.show(contectBlankFragment);
                break;
            default:
                break;
        }
        transaction.commit();
    }
}