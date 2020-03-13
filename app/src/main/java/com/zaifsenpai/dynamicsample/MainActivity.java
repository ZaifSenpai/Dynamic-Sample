package com.zaifsenpai.dynamicsample;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    int ViewsCount = 5;
    TextView[] textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        GenerateView();
        SetText();
    }

    private void GenerateView() {
        textViews = new TextView[ViewsCount];
        TextView textView;

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        for (int i = 0; i < ViewsCount; i++) {
            textView = new TextView(this);
            textView.setId(i);
            textView.setPadding(10, 10, 10, 0);
            textView.setTextSize(18f);
            layout.addView(textView);
            textViews[i] = textView;
        }
    }

    private void SetText() {
        TextView textView;
        for (int i = 0; i < ViewsCount; i++) {
            textView = findViewById(i);
            textView.setText("I am textview #" + (i + 1));
        }
        // OR
//        for (int i = 0; i < ViewsCount; i++) {
//            textView = textViews[i];
//            textView.setText("I am textview #" + (i + 1));
//        }
    }
}
