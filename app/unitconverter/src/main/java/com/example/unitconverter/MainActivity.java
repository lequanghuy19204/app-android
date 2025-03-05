package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d("ktqd", "onCreate: MainActivity");

        Button button1 = findViewById(R.id.button1);
        button1.setText("Go");

        editText1 = findViewById(R.id.editText1);
        button1.setOnClickListener(v -> {
            Log.d("ktqd", "onCreate: button1 clicked");

            double km = Double.parseDouble(editText1.getText().toString());

            double miles = km * 0.621371;

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("miles", miles);

            startActivities(new Intent[]{intent});

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ktqd", "onStart: MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ktqd", "onResume: MainActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ktqd", "onPause: MainActivity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ktqd", "onStop: MainActivity");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ktqd", "onRestart: MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ktqd", "onDestroy: MainActivity");

    }
}