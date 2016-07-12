package com.wonderkiln.wkawesomemenu;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;

interface WKAwesomeMenuOptions {

    Drawable wkBackgroundImage();
    float wkCornerRadius();
    @ColorInt int wkShadowColor();
    float wkShadowOffset();
    float wkShadowScale();
    float wkRootScale();
    float wkMenuWidth();
    float wkMenuParallax();
    float wkMenuGripWidth();

}
