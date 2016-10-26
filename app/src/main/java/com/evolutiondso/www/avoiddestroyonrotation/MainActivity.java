package com.evolutiondso.www.avoiddestroyonrotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void didTapButton(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView) ;
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        imageView.startAnimation(myAnim);

        BounceInterpolator interpolator = new BounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        imageView.startAnimation(myAnim);

    }

}
