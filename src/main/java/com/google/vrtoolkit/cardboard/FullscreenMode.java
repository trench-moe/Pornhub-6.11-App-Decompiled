package com.google.vrtoolkit.cardboard;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

/* loaded from: classes.dex */
class FullscreenMode {
    public static final int NAVIGATION_BAR_TIMEOUT_MS = 2000;
    public Activity activity;

    /* renamed from: com.google.vrtoolkit.cardboard.FullscreenMode$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnSystemUiVisibilityChangeListener {
        public final /* synthetic */ Handler val$handler;

        public AnonymousClass1(Handler handler) {
            this.val$handler = handler;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 2) == 0) {
                this.val$handler.postDelayed(new Runnable() { // from class: com.google.vrtoolkit.cardboard.FullscreenMode.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        FullscreenMode.this.setFullscreenMode();
                    }
                }, 2000L);
            }
        }
    }

    public FullscreenMode(Activity activity) {
        this.activity = activity;
    }

    public void onWindowFocusChanged(boolean z10) {
        if (z10) {
            setFullscreenMode();
        }
    }

    public void setFullscreenMode() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public void startFullscreenMode() {
        this.activity.getWindow().addFlags(128);
    }
}
