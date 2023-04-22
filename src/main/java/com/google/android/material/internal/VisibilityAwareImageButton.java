package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: c  reason: collision with root package name */
    public int f7540c;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7540c = getVisibility();
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f7540c = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7540c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f7540c = i10;
    }
}
