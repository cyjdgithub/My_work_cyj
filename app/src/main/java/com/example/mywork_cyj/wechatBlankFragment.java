package com.example.mywork_cyj;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link wechatBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class wechatBlankFragment extends Fragment {


    public wechatBlankFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wechat_blank, container, false);
    }
}