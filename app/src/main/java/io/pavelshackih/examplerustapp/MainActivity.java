package io.pavelshackih.examplerustapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.loadLibrary("rust");
        RustApi rustApi = new RustApi();
        TextView textView = findViewById(R.id.text_view);
        textView.setText(rustApi.hello());
    }
}
