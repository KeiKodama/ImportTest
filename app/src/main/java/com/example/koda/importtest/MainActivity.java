package com.example.koda.importtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.xwalk.core.XWalkView;


public class MainActivity extends ActionBarActivity {

    private static final int MATCH_PARENT = ViewGroup.LayoutParams.MATCH_PARENT;
    private XWalkView mXWalkView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mXWalkView = new XWalkView(getApplicationContext(), this);
        LinearLayout layout = (LinearLayout) findViewById(R.id.main_layout);
        layout.addView(mXWalkView, new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT));

        mXWalkView.load("http://183.182.163.220/videochat/index.html", null);
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
