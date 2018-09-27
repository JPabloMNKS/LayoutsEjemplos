package com.mnks.jpablo.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnVertical,btnHorizontal,btnTable,btnRelative;
    Button btnAbsolute,btnFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVertical = findViewById(R.id.btn_vertical);
        btnHorizontal = findViewById(R.id.btn_horizontal);
        btnTable = findViewById(R.id.btn_table);
        btnRelative = findViewById(R.id.btn_relative);
        btnAbsolute = findViewById(R.id.btn_absolute);
        btnFrame = findViewById(R.id.btn_frame);

        btnVertical.setOnClickListener(this);
        btnHorizontal.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnAbsolute.setOnClickListener(this);
        btnFrame.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_vertical:
                    Intent i1 = new Intent(getApplicationContext(),VerticalActivity.class);
                    Toast.makeText(getApplicationContext(),"Vertical Linear Layout",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                    break;

                case R.id.btn_horizontal:
                    Intent i2 = new Intent(getApplicationContext(),HorizontalActivity.class);
                    Toast.makeText(getApplicationContext(),"Horizontal Linear Layout",Toast.LENGTH_LONG).show();
                    startActivity(i2);
                    break;

                case R.id.btn_table:
                    Intent i3 = new Intent(getApplicationContext(),TableActivity.class);
                    Toast.makeText(getApplicationContext(),"Table Layout",Toast.LENGTH_LONG).show();
                    startActivity(i3);
                    break;

                case R.id.btn_relative:
                    Intent i4 = new Intent(getApplicationContext(),RelativeActivity.class);
                    Toast.makeText(getApplicationContext(),"Relative Layout",Toast.LENGTH_LONG).show();
                    startActivity(i4);
                    break;

                case R.id.btn_absolute:
                    Intent i5 = new Intent(getApplicationContext(),AbsoluteActivity.class);
                    Toast.makeText(getApplicationContext(),"Absolute Layout", Toast.LENGTH_LONG).show();
                    startActivity(i5);
                    break;

                case R.id.btn_frame:
                    Intent i6 = new Intent(getApplicationContext(), FrameLayout.class);
                    Toast.makeText(getApplicationContext(),"Frame Layout",Toast.LENGTH_LONG).show();
                    startActivity(i6);
                    break;

            }
    }
}
