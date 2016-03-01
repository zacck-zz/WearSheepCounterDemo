package com.zacck.wearsheepcounterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {


    Button btAddSheep;
    Button btReset;
    TextView tvCount;

    int Counted = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                btAddSheep = (Button)findViewById(R.id.btPlusOne);
                btReset = (Button)findViewById(R.id.btReset);
                tvCount = (TextView)findViewById(R.id.tvCounted);

            }
        });
    }

    public void resetCount(View v)
    {
        Counted = 0;
        tvCount.setText(Integer.toString(Counted));

    }

    public void addCount(View v)
    {
        Counted++ ;
        tvCount.setText(Integer.toString(Counted));
    }
}
