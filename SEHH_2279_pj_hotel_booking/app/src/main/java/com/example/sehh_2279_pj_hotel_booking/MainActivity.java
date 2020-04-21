package com.example.sehh_2279_pj_hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sehh_2279_pj_hotel_booking.Home_Page;
import com.example.sehh_2279_pj_hotel_booking.R;

public class MainActivity extends AppCompatActivity {

    private Button login_key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_key = findViewById(R.id.login_button);
        login_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isLoginPass()){
                    Intent i = new Intent(MainActivity.this, Home_Page.class);
                    startActivity(i);
                }else{
                    TextView warning_text = findViewById(R.id.tip_text);
                    warning_text.setText("Incorrect username/password |UserID:user, PW:123|");
                    warning_text.setTextColor(Color.RED);

                }
            }
        });
    }

    private boolean isLoginPass() {

        String user_name = ( ((EditText) findViewById(R.id.user_name)).getText().toString());
        String password = ( ((EditText) findViewById(R.id.password)).getText().toString());

        if (user_name.equals("user") && password.equals("123")){
            return true;
        }else return false;

    }


}
