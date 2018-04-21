package com.abt.badge;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

import com.abt.badgeview.BadgeFactory;
import com.abt.badgeview.BadgeView;
import com.orhanobut.logger.Logger;

/**
 * Created by hwq on 2018/4/21.
 */
public class MainActivity extends AppCompatActivity {

    private FrameLayout mLayout = null;
    private BadgeView mBadgeView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mLayout = findViewById(R.id.badge_layout);
        mBadgeView = BadgeFactory.create(this)
                .setTextColor(Color.WHITE)
                .setWidthAndHeight(50, 50)
                .setBadgeBackground(Color.RED)
                .setTextSize(22)
                .setBadgeGravity(Gravity.RIGHT | Gravity.TOP)
                .setBadgeCount(1)
                .setShape(com.abt.badgeview.BadgeView.SHAPE_CIRCLE)
                .setSpace(0, 0)
                .bind(mLayout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d("onResume");

        if (null != mBadgeView) {
            mBadgeView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d("onStop");
        BadgeFactory.create(this).unbind();
    }

}
