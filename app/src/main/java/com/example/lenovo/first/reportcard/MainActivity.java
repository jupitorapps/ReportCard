package com.example.lenovo.first.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReportCard firstCard = new ReportCard("Pradeep Behera", 12345, 50, 50,50,50,50);

        TextView textView = (TextView) findViewById(R.id.reportCardView);
        textView.setText(firstCard.showResult());
    }
}
