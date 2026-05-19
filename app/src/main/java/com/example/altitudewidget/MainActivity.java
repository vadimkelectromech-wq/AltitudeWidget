package com.example.altitudewidget;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  TextView tv = new TextView(this);
  tv.setText("Altitude Widget");
  tv.setTextSize(48);
  setContentView(tv);
 }
}