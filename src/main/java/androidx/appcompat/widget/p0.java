package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d0.f;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1054a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1055b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1056c;

    public p0(Context context, TypedArray typedArray) {
        this.f1054a = context;
        this.f1055b = typedArray;
    }

    public static p0 q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new p0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static p0 r(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new p0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1055b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1055b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList c10;
        return (!this.f1055b.hasValue(i10) || (resourceId = this.f1055b.getResourceId(i10, 0)) == 0 || (c10 = c0.a.c(this.f1054a, resourceId)) == null) ? this.f1055b.getColorStateList(i10) : c10;
    }

    public float d(int i10, float f10) {
        return this.f1055b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1055b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1055b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f1055b.hasValue(i10) || (resourceId = this.f1055b.getResourceId(i10, 0)) == 0) ? this.f1055b.getDrawable(i10) : f.a.a(this.f1054a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        Drawable g10;
        if (!this.f1055b.hasValue(i10) || (resourceId = this.f1055b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        h a10 = h.a();
        Context context = this.f1054a;
        synchronized (a10) {
            try {
                g10 = a10.f1004a.g(context, resourceId, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return g10;
    }

    public Typeface i(int i10, int i11, f.c cVar) {
        int resourceId = this.f1055b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1056c == null) {
            this.f1056c = new TypedValue();
        }
        Context context = this.f1054a;
        TypedValue typedValue = this.f1056c;
        ThreadLocal<TypedValue> threadLocal = d0.f.f8607a;
        if (context.isRestricted()) {
            return null;
        }
        return d0.f.b(context, resourceId, typedValue, i11, cVar, null, true, false);
    }

    public int j(int i10, int i11) {
        return this.f1055b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1055b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1055b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1055b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1055b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1055b.getText(i10);
    }

    public boolean p(int i10) {
        return this.f1055b.hasValue(i10);
    }
}
