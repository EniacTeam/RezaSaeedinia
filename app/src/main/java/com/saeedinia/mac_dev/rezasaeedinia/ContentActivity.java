package com.saeedinia.mac_dev.rezasaeedinia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.saeedinia.mac_dev.rezasaeedinia.R;

public class ContentActivity extends AppCompatActivity
{
    private RecyclerView RecyclerViewContent=null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }
    private void InitViews()
    {
        RecyclerViewContent=(RecyclerView)findViewById(R.id.recyclerview_content);
    }
}
