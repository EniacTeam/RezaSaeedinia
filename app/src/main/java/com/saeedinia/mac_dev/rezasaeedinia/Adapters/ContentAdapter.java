package com.saeedinia.mac_dev.rezasaeedinia.Adapters;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ContentAdapter<T> extends RecyclerView.Adapter<ContentAdapter.ContentViewHolder>
{
    private Context ContentContext = null;
    private ArrayList<T> ContentDataList = null;

    public ContentAdapter(Context ContentContext, ArrayList<T> ContentDataList)
    {
        this.ContentDataList = new ArrayList<>();
        this.ContentDataList = ContentDataList;
        this.ContentContext = ContentContext;
    }

    @Override
    public ContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View ContentItemView=null;
       // ContentItemView = LayoutInflater.from(ContentContext).inflate(R.layout.item_layout_container2, parent, false);
        return new ContentViewHolder(ContentItemView);
    }

    @Override
    public void onBindViewHolder(ContentViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return ContentDataList.size();
    }
    //---------------------------------------------------------VIEW HOLDER------------------------------
    class ContentViewHolder extends RecyclerView.ViewHolder
    {
        public ContentViewHolder(View itemView)
        {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {

                }
            });
        }
    }
//---------------------------------------------------------VIEW HOLDER------------------------------
}
