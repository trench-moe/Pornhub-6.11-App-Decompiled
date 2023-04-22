package com.google.android.gms.common.internal;

import android.content.Context;
import android.support.v4.media.b;
import android.util.AttributeSet;
import android.widget.Button;

/* loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    public static final int a(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return i13;
                }
                throw new IllegalStateException(b.e(33, "Unknown color scheme: ", i10));
            }
            return i12;
        }
        return i11;
    }
}
