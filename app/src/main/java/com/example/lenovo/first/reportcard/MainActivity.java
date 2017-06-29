package com.example.lenovo.first.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReportCard firstCard = new ReportCard("Pradeep Behera", 12345, 80, 75,86,81,79);

        TextView textView = (TextView) findViewById(R.id.reportCardView);
        textView.setText(firstCard.showResult());
    }
}
