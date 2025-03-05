package com.example.unitconverter;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d("ktqd", "onCreate: SecondActivity");

        double mile = getIntent().getDoubleExtra("miles", 0);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Miles: " + mile);

        Button button2 = findViewById(R.id.button2);
        button2.setText("Back");

        button2.setOnClickListener(v -> {
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ktqd", "onStart: SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ktqd", "onResume: SecondActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ktqd", "onPause: SecondActivity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ktqd", "onStop: SecondActivity");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ktqd", "onRestart: SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ktqd", "onDestroy: SecondActivity");

    }
}