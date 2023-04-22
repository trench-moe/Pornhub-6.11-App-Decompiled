package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f7687c;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f7688f;

    /* renamed from: j  reason: collision with root package name */
    public final int f7689j;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.f13023t0);
        this.f7687c = obtainStyledAttributes.getText(2);
        this.f7688f = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : f.a.a(context, resourceId);
        this.f7689j = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
