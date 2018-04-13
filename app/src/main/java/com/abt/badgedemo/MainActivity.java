package com.abt.badgedemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView view = (ImageView) findViewById(R.id.iv_setting);

        com.abt.badgeview.BadgeFactory.create(this)
                .setTextColor(Color.BLUE)
                .setWidthAndHeight(25,25)
                .setBadgeBackground(Color.RED)
                .setTextSize(10)
                .setBadgeGravity(Gravity.RIGHT|Gravity.TOP)
                .setBadgeCount(20)
                .setShape(com.abt.badgeview.BadgeView.SHAPE_CIRCLE)
                .setSpace(10,10)
                .bind(view);
    }
}
