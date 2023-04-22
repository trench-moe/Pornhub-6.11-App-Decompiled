package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f7366a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7367b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7368c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final b f7369e;

    /* renamed from: f  reason: collision with root package name */
    public final b f7370f;

    /* renamed from: g  reason: collision with root package name */
    public final b f7371g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f7372h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(za.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), m9.a.W);
        this.f7366a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f7371g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f7367b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f7368c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = za.c.a(context, obtainStyledAttributes, 6);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f7369e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f7370f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f7372h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
