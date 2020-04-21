package com.example.sehh_2279_pj_hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Home_Page extends AppCompatActivity implements View.OnClickListener {

    ImageView news;
    ImageView booking;
    ImageView view_booking;
    ImageView help;
    ImageView setting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initializeSelection();

    }

    private void initializeSelection() {
        //Initialize the selection
        news = (ImageView) findViewById(R.id.news);
        booking = (ImageView) findViewById(R.id.booking);
        view_booking = (ImageView) findViewById(R.id.view_booking);
        help = (ImageView) findViewById(R.id.help);
        setting = (ImageView) findViewById(R.id.setting);

        //
        news.setOnClickListener(this);
        booking.setOnClickListener(this);
        view_booking.setOnClickListener(this);
        help.setOnClickListener(this);
        setting.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        ImageView imageView = (ImageView) v;
        int id = v.getId();

        //Go to the selected page (activity)
        switch(id) {
            case R.id.news:
                Toast.makeText(this, "Go to news", Toast.LENGTH_LONG).show();
                break;
            case R.id.booking:
                Toast.makeText(this, "Go to booking", Toast.LENGTH_LONG).show();
                break;
            case R.id.view_booking:
                Toast.makeText(this, "Go to view booking", Toast.LENGTH_LONG).show();
                break;
            case R.id.help:
                Toast.makeText(this, "Go to help", Toast.LENGTH_LONG).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "Go to setting", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
