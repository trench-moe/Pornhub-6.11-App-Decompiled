package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.app.pornhub.R;
import m9.a;
import ua.j;
import ya.c;

/* loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends c {

    /* renamed from: g  reason: collision with root package name */
    public int f7582g;

    /* renamed from: h  reason: collision with root package name */
    public int f7583h;

    /* renamed from: i  reason: collision with root package name */
    public int f7584i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018214);
        int i11 = CircularProgressIndicator.C;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = a.G;
        j.a(context, attributeSet, i10, 2132018214);
        j.b(context, attributeSet, iArr, i10, 2132018214, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 2132018214);
        this.f7582g = Math.max(za.c.c(context, obtainStyledAttributes, 2, dimensionPixelSize), this.f18574a * 2);
        this.f7583h = za.c.c(context, obtainStyledAttributes, 1, dimensionPixelSize2);
        this.f7584i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // ya.c
    public void a() {
    }
}
