package com.wonderkiln.wkawesomemenu;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.view.View;
import android.view.ViewGroup;

public class WKAwesomeMenuActivity extends Activity implements WKAwesomeMenuOptions {

    private boolean isContentViewSet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wkawesomemenu);
        isContentViewSet = true;
    }

    @Override
    public void setContentView(int layoutResID) {
        if (!isContentViewSet) {
            super.setContentView(layoutResID);
        }
    }

    @Override
    public void setContentView(View view) {
        if (!isContentViewSet) {
            super.setContentView(view);
        }
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        if (!isContentViewSet) {
            super.setContentView(view, params);
        }
    }

    @Override
    public Drawable wkBackgroundImage() {
        return null;
    }

    @Override
    public float wkCornerRadius() {
        return 5f;
    }

    @ColorInt
    @Override
    public int wkShadowColor() {
        return Color.rgb(143, 196, 214);
    }

    @Override
    public float wkShadowOffset() {
        return -10f;
    }

    @Override
    public float wkShadowScale() {
        return 0.94f;
    }

    @Override
    public float wkRootScale() {
        return 0.8f;
    }

    @Override
    public float wkMenuWidth() {
        return 250f;
    }

    @Override
    public float wkMenuParallax() {
        return -40f;
    }

    @Override
    public float wkMenuGripWidth() {
        return 50f;
    }

    protected void openMenu() {
        openMenu(0.2f);
    }

    protected void openMenu(float duration) {

    }

    protected void closeMenu() {
        closeMenu(0.2f);
    }

    protected void closeMenu(float duration) {

    }

}
