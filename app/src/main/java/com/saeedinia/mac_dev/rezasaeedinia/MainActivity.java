package com.saeedinia.mac_dev.rezasaeedinia;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.saeedinia.mac_dev.rezasaeedinia.slider.DepthPageTransformer;
import com.saeedinia.mac_dev.rezasaeedinia.slider.MainSlider;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity
{
    private static int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupSlider();
    }

    private void setupSlider()
    {

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(R.drawable.bg_h);
        lst.add(R.drawable.img_view);
        lst.add(R.drawable.bg_h);
        lst.add(R.drawable.img_view);
        lst.add(R.drawable.bg_h);


        final ViewPager viewpager = (ViewPager) findViewById(R.id.view_pager1);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.Sliderindicator);
        MainSlider mPager = new MainSlider(this, lst);
        viewpager.setPageTransformer(true, new DepthPageTransformer());
        viewpager.setAdapter(mPager);
        indicator.setViewPager(viewpager);

        final int count = viewpager.getAdapter().getCount();
        final Handler handler = new Handler();
        final Runnable Update = new Runnable()
        {
            @Override
            public void run()
            {
                if (currentPage == viewpager.getAdapter().getCount())
                {
                    currentPage = 0;
                }
                viewpager.setCurrentItem(currentPage++, true);

            }
        };

        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                handler.post(Update);
            }
        }, 5000, 5000);

    }

    @Override
    protected void attachBaseContext(Context newBase)
    {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
