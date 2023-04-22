package com.google.vrtoolkit.cardboard;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public class ImplementationSelector {
    public static CardboardViewApi createCardboardViewApi(Context context, GLSurfaceView gLSurfaceView) {
        return new CardboardViewNativeImpl(context, gLSurfaceView);
    }
}
