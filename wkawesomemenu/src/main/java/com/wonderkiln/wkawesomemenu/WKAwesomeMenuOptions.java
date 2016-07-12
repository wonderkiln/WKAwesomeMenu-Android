package com.wonderkiln.wkawesomemenu;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;

public class WKAwesomeMenuOptions {

    public Drawable backgroundImage;
    public float cornerRadius;
    @ColorInt public int shadowColor;
    public float shadowOffset;
    public float shadowScale;
    public float rootScale;
    public float menuWidth;
    public float menuParallax;
    public float menuGripWidth;

    public WKAwesomeMenuOptions() {
        this.cornerRadius = 5f;
        this.shadowColor = Color.rgb(143, 196, 214);
        this.shadowOffset = -10f;
        this.shadowScale = 0.94f;
        this.rootScale = 0.8f;
        this.menuWidth = 250f;
        this.menuParallax = -40f;
        this.menuGripWidth = 50f;
    }

    public static WKAwesomeMenuOptions defaultOptions() {
        return new WKAwesomeMenuOptions();
    }

}
