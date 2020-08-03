package com.codeblooded.android.customviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.codeblooded.android.customlib.MathsCal;
import com.codeblooded.android.customviews.views.CustomViews;

public class MainActivity extends AppCompatActivity {
    private CustomViews customViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, ""+MathsCal.add(5,6), Toast.LENGTH_SHORT).show();
    }
}
