package com.example.psp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.psp.constants.Constants;
import com.example.psp.util.Util;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Util.createNotificationChannel(this);
        Util.getAppInstanceId();
        Util.subscribeToFccTopic();

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        imageView.startAnimation(alpha);
        alpha.setAnimationListener((new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                SharedPreferences sharedpreferences = getSharedPreferences(Constants.SPLASH_PREFS, Context.MODE_PRIVATE);
                boolean isOnboardingComplete = sharedpreferences.getBoolean(Constants.IS_BOARDING_COMLETE, false);
                Intent intent;
                Class<?> activityClass;
                if (isOnboardingComplete) {
                    activityClass = MainActivity.class;
                } else {
                    activityClass = OnboardingActivity.class;
                }

                intent = new Intent(SplashActivity.this, activityClass);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }));
    }
}
