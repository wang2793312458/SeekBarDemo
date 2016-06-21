package com.feicui.seekbardemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener{
    private TextView mTv;
    private SeekBar mSb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (TextView) findViewById(R.id.textview1);
        mSb = (SeekBar) findViewById(R.id.seekbar);
        mSb.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mTv.setText("Progress is"+progress+(fromUser ? " Trigger" : " Nontrigger") + " by user.");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        System.out.print("onStart-->"+seekBar.getProgress());
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        System.out.println("onStop-->"+seekBar.getProgress());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
