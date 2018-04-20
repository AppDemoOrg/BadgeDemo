package com.abt.badgedemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.abt.badgeview.BadgeFactory;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout view = (LinearLayout) findViewById(R.id.img_wrapper);

        BadgeFactory.create(this)
                .setTextColor(Color.WHITE)
                .setWidthAndHeight(50,50)
                .setBadgeBackground(Color.RED)
                .setTextSize(22)
                .setBadgeGravity(Gravity.RIGHT|Gravity.TOP)
                .setBadgeCount(1)
                .setShape(com.abt.badgeview.BadgeView.SHAPE_CIRCLE)
                .setSpace(0,0)
                .bind(view);
    }

    @Override
    protected void onPause() {
        super.onPause();

        BadgeFactory.create(this).unbind();
        Logger.d("hello");
    }
}
