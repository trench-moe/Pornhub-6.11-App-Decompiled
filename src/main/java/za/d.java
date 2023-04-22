package za;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import d0.f;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f21920a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21921b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21922c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final float f21923e;

    /* renamed from: f  reason: collision with root package name */
    public final float f21924f;

    /* renamed from: g  reason: collision with root package name */
    public final float f21925g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21926h;

    /* renamed from: i  reason: collision with root package name */
    public final float f21927i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f21928j;

    /* renamed from: k  reason: collision with root package name */
    public float f21929k;

    /* renamed from: l  reason: collision with root package name */
    public final int f21930l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f21931m = false;
    public Typeface n;

    /* loaded from: classes2.dex */
    public class a extends f.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ af.c f21932a;

        public a(af.c cVar) {
            this.f21932a = cVar;
        }

        @Override // d0.f.c
        public void d(int i10) {
            d.this.f21931m = true;
            this.f21932a.n(i10);
        }

        @Override // d0.f.c
        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.n = Typeface.create(typeface, dVar.f21922c);
            d dVar2 = d.this;
            dVar2.f21931m = true;
            this.f21932a.o(dVar2.n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, m9.a.f13026v0);
        this.f21929k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f21928j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f21922c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f21930l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f21921b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f21920a = c.a(context, obtainStyledAttributes, 6);
        this.f21923e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f21924f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f21925g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, m9.a.f13003d0);
        this.f21926h = obtainStyledAttributes2.hasValue(0);
        this.f21927i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.n == null && (str = this.f21921b) != null) {
            this.n = Typeface.create(str, this.f21922c);
        }
        if (this.n == null) {
            int i10 = this.d;
            if (i10 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, this.f21922c);
        }
    }

    public Typeface b(Context context) {
        Typeface a10;
        if (this.f21931m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                a10 = f.a(context, this.f21930l);
                this.n = a10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                StringBuilder m10 = a1.a.m("Error loading font ");
                m10.append(this.f21921b);
                Log.d("TextAppearance", m10.toString(), e10);
            }
            if (a10 != null) {
                this.n = Typeface.create(a10, this.f21922c);
                a();
                this.f21931m = true;
                return this.n;
            }
        }
        a();
        this.f21931m = true;
        return this.n;
    }

    public void c(Context context, af.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f21930l;
        if (i10 == 0) {
            this.f21931m = true;
        }
        if (this.f21931m) {
            cVar.o(this.n, true);
            return;
        }
        try {
            a aVar = new a(cVar);
            ThreadLocal<TypedValue> threadLocal = f.f8607a;
            if (context.isRestricted()) {
                aVar.a(-4, null);
            } else {
                f.b(context, i10, new TypedValue(), 0, aVar, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f21931m = true;
            cVar.n(1);
        } catch (Exception e10) {
            StringBuilder m10 = a1.a.m("Error loading font ");
            m10.append(this.f21921b);
            Log.d("TextAppearance", m10.toString(), e10);
            this.f21931m = true;
            cVar.n(-3);
        }
    }

    public final boolean d(Context context) {
        int i10 = this.f21930l;
        Typeface typeface = null;
        if (i10 != 0) {
            ThreadLocal<TypedValue> threadLocal = f.f8607a;
            if (!context.isRestricted()) {
                typeface = f.b(context, i10, new TypedValue(), 0, null, null, false, true);
            }
        }
        return typeface != null;
    }

    public void e(Context context, TextPaint textPaint, af.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f21928j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f21925g;
        float f11 = this.f21923e;
        float f12 = this.f21924f;
        ColorStateList colorStateList2 = this.f21920a;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void f(Context context, TextPaint textPaint, af.c cVar) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.n);
        c(context, new e(this, textPaint, cVar));
    }

    public void g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f21922c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f21929k);
        if (this.f21926h) {
            textPaint.setLetterSpacing(this.f21927i);
        }
    }
}
