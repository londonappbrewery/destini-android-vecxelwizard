package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mTopButton;
    Button mBottomButton;
    String mCurrentStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mCurrentStory = "T1";



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  if T3_* showing, then load T6_End, else T3_*
                if(mCurrentStory == "T3") {
                    loadT6();
                } else {
                    loadT3();
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if T3_* showing, then load T5_End, else if T2_* showing, load T4_End,
                //  else load T2_*
                if(mCurrentStory == "T3") {
                    loadT5();
                } else {
                    if(mCurrentStory == "T2") {
                        loadT4();
                    } else {
                        loadT2();
                    }
                }
            }
        });

    }
    public void loadT2() {
        // use T2_* to continue
        mCurrentStory = "T2";
        mStory.setText(R.string.T2_Story);
        mTopButton.setText(R.string.T2_Ans1);
        mBottomButton.setText(R.string.T2_Ans2);
    }

    public void loadT3() {
        // use T3_* to continue
        mCurrentStory = "T3";
        mStory.setText(R.string.T3_Story);
        mTopButton.setText(R.string.T3_Ans1);
        mBottomButton.setText(R.string.T3_Ans2);

    }
    public void loadT4() {
        // use T4_* to continue
        mStory.setText(R.string.T4_End);
        mTopButton.setVisibility(View.GONE);
        mBottomButton.setVisibility(View.GONE);

    }
    public void loadT5() {
        // use T5_* to continue
        mStory.setText(R.string.T5_End);
        mTopButton.setVisibility(View.GONE);
        mBottomButton.setVisibility(View.GONE);


    }
    public void loadT6() {
        // use T6_* to continue
        mStory.setText(R.string.T6_End);
        mTopButton.setVisibility(View.GONE);
        mBottomButton.setVisibility(View.GONE);

    }

}
