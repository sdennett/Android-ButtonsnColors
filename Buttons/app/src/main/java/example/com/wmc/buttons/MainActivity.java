package example.com.wmc.buttons;

/**
* ABOUT THIS EXAMPLE
*   Goal: Become familiar with use of Buttons and how to dynamically
*         update the color of elements within a Android xml Layout.
*         Layouts can be declared in two ways; 1) by declaring UI elements
*         in XML or 2) Instantiate layout elements at runtime. In this demo
*         I do both by first declaring the layout in XML and the updating
*         elements at runtime. This was a fun learning exercise and I hope
*         this might be of help to others.
*
* ABOUT THE AUTHOR
*   Steve Dennett @sadennett
*     I am a freelance software developer with a background in Mobile Devices
*     and Mobile Communications. I am a DevOps person of sorts as I enjoy
*     developing application through the entire stack. I love Linux and
*     have built my very own development environment using a simple to build
*     Linux LAMP server.
*
* SOME HINTS
*   Make sure you check out MainActivity.java and activity_mail.xml (of course)
*   as well as colors.xml and strings.xml. This are the main components in this
*   demonstration.
*
* I HOPE YOU ENJOY THE DEMO!
**/

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
        * Start by changing the ActionBar Title and Color
        **/
        setTitle("Buttons and Colors");
        android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.string.actionBar_OSU_Gray))));
        setPageTitle("Buttons & Colors Demo");
    }

    /**
     * A method to change the Title bar
     */
    private void setPageTitle(String s) {
        TextView mTitle = (TextView) findViewById(R.id.appTitle);
        mTitle.setText(s);
    }
    /**
     *  Handle the button presses below
     *  and instantiates layout elements programmatically
     **/
    public void cubsClicked(View v) {
        android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.string.actionBar_Cubs_Blue))));
        Button clearButton = (Button) findViewById(R.id.buttonClear);
        clearButton.setBackgroundResource(R.color.cubs_red);
        Button bearsButton = (Button) findViewById(R.id.buttonBears);
        bearsButton.setBackgroundResource(R.color.cubs_red);
        Button soxsButton = (Button) findViewById(R.id.buttonSoxs);
        soxsButton.setBackgroundResource(R.color.cubs_red);
        RelativeLayout pageColor = (RelativeLayout) findViewById(R.id.pageLayout);
        pageColor.setBackgroundResource(R.color.cubs_blue);
        FrameLayout frameLayoutTitle = (FrameLayout) findViewById(R.id.frameAppTitle);
        frameLayoutTitle.setBackgroundResource(R.color.cubs_red);
        v.setBackgroundResource(R.color.cubs_red);
        setPageTitle("Cubs Win!");
    }
    public void bearsClicked(View v) {
        android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.string.actionBar_Bears_Dark_Navy))));
        Button clearButton = (Button) findViewById(R.id.buttonClear);
        clearButton.setBackgroundResource(R.color.bears_orange);
        Button cubsButton = (Button) findViewById(R.id.buttonCubs);
        cubsButton.setBackgroundResource(R.color.bears_orange);
        Button soxsButton = (Button) findViewById(R.id.buttonSoxs);
        soxsButton.setBackgroundResource(R.color.bears_orange);
        RelativeLayout pageColor = (RelativeLayout) findViewById(R.id.pageLayout);
        pageColor.setBackgroundResource(R.color.bears_dark_navy);
        FrameLayout frameLayoutTitle = (FrameLayout) findViewById(R.id.frameAppTitle);
        frameLayoutTitle.setBackgroundResource(R.color.bears_orange);
        v.setBackgroundResource(R.color.bears_orange);
        setPageTitle("Bears Win!");
    }
    public void soxsClicked(View v){
        android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.string.actionBar_Whitesox_Black))));
        Button clearButton = (Button) findViewById(R.id.buttonClear);
        clearButton.setBackgroundResource(R.color.whitesox_black);
        Button cubsButton = (Button) findViewById(R.id.buttonCubs);
        cubsButton.setBackgroundResource(R.color.whitesox_black);
        Button bearsButton = (Button) findViewById(R.id.buttonBears);
        bearsButton.setBackgroundResource(R.color.whitesox_black);
        RelativeLayout pageColor = (RelativeLayout) findViewById(R.id.pageLayout);
        pageColor.setBackgroundResource(R.color.whitesox_silver);
        FrameLayout frameLayoutTitle = (FrameLayout) findViewById(R.id.frameAppTitle);
        frameLayoutTitle.setBackgroundResource(R.color.whitesox_black);
        v.setBackgroundResource(R.color.whitesox_black);
        setPageTitle("Soxs Win!");
    }

    public void clearClicked(View view) {
        android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(getString(R.string.actionBar_OSU_Gray))));
        Button clearButton = (Button) findViewById(R.id.buttonClear);
        clearButton.setBackgroundResource(R.color.ohio_state_scarlet);
        Button cubsButton = (Button) findViewById(R.id.buttonCubs);
        cubsButton.setBackgroundResource(R.color.ohio_state_scarlet);
        Button bearsButton = (Button) findViewById(R.id.buttonBears);
        bearsButton.setBackgroundResource(R.color.ohio_state_scarlet);
        Button soxsButton = (Button) findViewById(R.id.buttonSoxs);
        soxsButton.setBackgroundResource(R.color.ohio_state_scarlet);
        RelativeLayout pageColor = (RelativeLayout) findViewById(R.id.pageLayout);
        pageColor.setBackgroundResource(R.color.ohio_state_grey);
        FrameLayout frameLayoutTitle = (FrameLayout) findViewById(R.id.frameAppTitle);
        frameLayoutTitle.setBackgroundResource(R.color.ohio_state_scarlet);
        setPageTitle("Buttons & Colors Demo");
    }

    public void titleClicked(View view) {
        setPageTitle("Title Bar Pressed");
    }
}
