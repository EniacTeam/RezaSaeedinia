package com.saeedinia.mac_dev.rezasaeedinia.slider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.saeedinia.mac_dev.rezasaeedinia.R;

import java.util.ArrayList;

/**
 * Created by Mac_Dev on 12/21/2017.
 */

public class MainSlider extends PagerAdapter {
    Context context ;
    ArrayList<Integer> ImageList ;
    LayoutInflater mLayoutInflater;

    public MainSlider(Context context, ArrayList<Integer> ImageList) {
        this.context = context;
        mLayoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.ImageList = ImageList;
    }

    @Override
    public int getCount() {
        return ImageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.slider_layout, container, false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.img_slider);
        TextView txt1_slider = (TextView) itemView.findViewById(R.id.txt_slider);
        Glide.with(context).load(ImageList.get(position)).into(imageView);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }

}
