package com.learn2android.buttontest;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button button = (Button) findViewById(R.id.push);
    Button resetButton = (Button) findViewById(R.id.reset);
    TextView textView = (TextView) findViewById(R.id.merica);

    public void onPushButtonClicked (View view) {
        if(textView.getVisibility() == (View.INVISIBLE)) {
            textView.setVisibility(View.VISIBLE);
            button.setText("AGAIN!");
        }
        else if (textView.getVisibility() == (View.GONE)) {
            textView.setVisibility(View.VISIBLE);
        }

        switch(textView.getCurrentTextColor()) {
            case Color.RED: textView.setTextColor(Color.WHITE);
                break;
            case Color.WHITE: textView.setTextColor(Color.BLUE);
                resetButton.setVisibility(View.VISIBLE);
                break;
            case Color.BLUE: textView.setTextColor(Color.RED);
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
