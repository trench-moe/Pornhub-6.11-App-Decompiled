package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f7361a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f7362b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f7363c;
    public final ColorStateList d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7364e;

    /* renamed from: f  reason: collision with root package name */
    public final cb.k f7365f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, cb.k kVar, Rect rect) {
        cb.e.s(rect.left);
        cb.e.s(rect.top);
        cb.e.s(rect.right);
        cb.e.s(rect.bottom);
        this.f7361a = rect;
        this.f7362b = colorStateList2;
        this.f7363c = colorStateList;
        this.d = colorStateList3;
        this.f7364e = i10;
        this.f7365f = kVar;
    }

    public static b a(Context context, int i10) {
        cb.e.r(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, m9.a.X);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = za.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = za.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = za.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        cb.k a13 = cb.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, a13, rect);
    }

    public void b(TextView textView) {
        cb.g gVar = new cb.g();
        cb.g gVar2 = new cb.g();
        gVar.setShapeAppearanceModel(this.f7365f);
        gVar2.setShapeAppearanceModel(this.f7365f);
        gVar.r(this.f7363c);
        gVar.x(this.f7364e, this.d);
        textView.setTextColor(this.f7362b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f7362b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7361a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.d.q(textView, insetDrawable);
    }
}
