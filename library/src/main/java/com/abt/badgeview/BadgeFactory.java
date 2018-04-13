package com.abt.badgeview;

import android.content.Context;
import android.view.Gravity;

public class BadgeFactory {
    public static com.abt.badgeview.BadgeView createDot(Context context){
        return  new com.abt.badgeview.BadgeView(context).setWidthAndHeight(10,10).setTextSize(0).setBadgeGravity(Gravity.RIGHT| Gravity.TOP).setShape(com.abt.badgeview.BadgeView.SHAPE_CIRCLE);
    }
    public static com.abt.badgeview.BadgeView createCircle(Context context){
        return  new com.abt.badgeview.BadgeView(context).setWidthAndHeight(20,20).setTextSize(12).setBadgeGravity(Gravity.RIGHT| Gravity.TOP).setShape(com.abt.badgeview.BadgeView.SHAPE_CIRCLE);
    }
    public static com.abt.badgeview.BadgeView createRectangle(Context context){
        return  new com.abt.badgeview.BadgeView(context).setWidthAndHeight(25,20).setTextSize(12).setBadgeGravity(Gravity.RIGHT| Gravity.TOP).setShape(com.abt.badgeview.BadgeView.SHAPE_RECTANGLE);
    }
    public static com.abt.badgeview.BadgeView createOval(Context context){
        return  new com.abt.badgeview.BadgeView(context).setWidthAndHeight(25,20).setTextSize(12).setBadgeGravity(Gravity.RIGHT| Gravity.TOP).setShape(com.abt.badgeview.BadgeView.SHAPE_OVAL);
    }
    public static com.abt.badgeview.BadgeView createSquare(Context context){
        return  new com.abt.badgeview.BadgeView(context).setWidthAndHeight(20,20).setTextSize(12).setBadgeGravity(Gravity.RIGHT| Gravity.TOP).setShape(com.abt.badgeview.BadgeView.SHAPE_SQUARE);
    }
    public static com.abt.badgeview.BadgeView createRoundRect(Context context){
        return  new com.abt.badgeview.BadgeView(context).setWidthAndHeight(25,20).setTextSize(12).setBadgeGravity(Gravity.RIGHT| Gravity.TOP).setShape(com.abt.badgeview.BadgeView.SHAPTE_ROUND_RECTANGLE);
    }
    public static com.abt.badgeview.BadgeView create(Context context){
        return  new com.abt.badgeview.BadgeView(context);
    }

}
