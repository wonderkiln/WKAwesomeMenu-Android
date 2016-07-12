package com.example.wkawesomemenu;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.wonderkiln.wkawesomemenu.WKAwesomeMenuActivity;

public class MainActivity extends WKAwesomeMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /*
     * Override return value of any of the following methods to change appearance and behaviour of
     * the menu.
     */

    @Override
    public Drawable wkBackgroundImage() {
        return super.wkBackgroundImage();
    }

    @Override
    public float wkCornerRadius() {
        return super.wkCornerRadius();
    }

    @Override
    public int wkShadowColor() {
        return super.wkShadowColor();
    }

    @Override
    public float wkShadowOffset() {
        return super.wkShadowOffset();
    }

    @Override
    public float wkShadowScale() {
        return super.wkShadowScale();
    }

    @Override
    public float wkRootScale() {
        return super.wkRootScale();
    }

    @Override
    public float wkMenuWidth() {
        return super.wkMenuWidth();
    }

    @Override
    public float wkMenuParallax() {
        return super.wkMenuParallax();
    }

    @Override
    public float wkMenuGripWidth() {
        return super.wkMenuGripWidth();
    }

    /* ------- */

}
