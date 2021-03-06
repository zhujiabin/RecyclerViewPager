package com.example.candyhh.testdemo;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.candyhh.testdemo.adapter.RecyclerViewAdapter;
import com.example.candyhh.testdemo.snap_helper.LeftSnapHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jack on 17/1/20
 */

public class LeftActivity extends BaseActivity {

    private static final String TAG = "LeftActivity";

    @BindView(R.id.al_recyclerview)
    RecyclerView alRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        mAdapter = new RecyclerViewAdapter(this, getData());
        alRecyclerview.setAdapter(mAdapter);
        alRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        LeftSnapHelper mLeftSnapHelper = new LeftSnapHelper();
        mLeftSnapHelper.attachToRecyclerView(alRecyclerview);
    }
}
