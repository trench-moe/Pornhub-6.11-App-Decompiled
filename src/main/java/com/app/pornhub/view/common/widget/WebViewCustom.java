package com.app.pornhub.view.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class WebViewCustom extends WebView {
    public WebViewCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
    }

    public WebViewCustom(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
