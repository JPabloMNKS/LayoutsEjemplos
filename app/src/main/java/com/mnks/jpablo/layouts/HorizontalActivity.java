package com.mnks.jpablo.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HorizontalActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);

        btnGame = findViewById(R.id.btn_game);
        btnGame.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        view.findViewById(R.id.btn_game);
        Toast.makeText(getApplicationContext(),"Me llamo ",Toast.LENGTH_LONG).show();
    }
}
