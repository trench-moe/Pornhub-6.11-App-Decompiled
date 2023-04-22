package cb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final c f3959m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public b7.k f3960a;

    /* renamed from: b  reason: collision with root package name */
    public b7.k f3961b;

    /* renamed from: c  reason: collision with root package name */
    public b7.k f3962c;
    public b7.k d;

    /* renamed from: e  reason: collision with root package name */
    public c f3963e;

    /* renamed from: f  reason: collision with root package name */
    public c f3964f;

    /* renamed from: g  reason: collision with root package name */
    public c f3965g;

    /* renamed from: h  reason: collision with root package name */
    public c f3966h;

    /* renamed from: i  reason: collision with root package name */
    public e f3967i;

    /* renamed from: j  reason: collision with root package name */
    public e f3968j;

    /* renamed from: k  reason: collision with root package name */
    public e f3969k;

    /* renamed from: l  reason: collision with root package name */
    public e f3970l;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public b7.k f3971a;

        /* renamed from: b  reason: collision with root package name */
        public b7.k f3972b;

        /* renamed from: c  reason: collision with root package name */
        public b7.k f3973c;
        public b7.k d;

        /* renamed from: e  reason: collision with root package name */
        public c f3974e;

        /* renamed from: f  reason: collision with root package name */
        public c f3975f;

        /* renamed from: g  reason: collision with root package name */
        public c f3976g;

        /* renamed from: h  reason: collision with root package name */
        public c f3977h;

        /* renamed from: i  reason: collision with root package name */
        public e f3978i;

        /* renamed from: j  reason: collision with root package name */
        public e f3979j;

        /* renamed from: k  reason: collision with root package name */
        public e f3980k;

        /* renamed from: l  reason: collision with root package name */
        public e f3981l;

        public b() {
            this.f3971a = new j();
            this.f3972b = new j();
            this.f3973c = new j();
            this.d = new j();
            this.f3974e = new cb.a(0.0f);
            this.f3975f = new cb.a(0.0f);
            this.f3976g = new cb.a(0.0f);
            this.f3977h = new cb.a(0.0f);
            this.f3978i = new e();
            this.f3979j = new e();
            this.f3980k = new e();
            this.f3981l = new e();
        }

        public b(k kVar) {
            this.f3971a = new j();
            this.f3972b = new j();
            this.f3973c = new j();
            this.d = new j();
            this.f3974e = new cb.a(0.0f);
            this.f3975f = new cb.a(0.0f);
            this.f3976g = new cb.a(0.0f);
            this.f3977h = new cb.a(0.0f);
            this.f3978i = new e();
            this.f3979j = new e();
            this.f3980k = new e();
            this.f3981l = new e();
            this.f3971a = kVar.f3960a;
            this.f3972b = kVar.f3961b;
            this.f3973c = kVar.f3962c;
            this.d = kVar.d;
            this.f3974e = kVar.f3963e;
            this.f3975f = kVar.f3964f;
            this.f3976g = kVar.f3965g;
            this.f3977h = kVar.f3966h;
            this.f3978i = kVar.f3967i;
            this.f3979j = kVar.f3968j;
            this.f3980k = kVar.f3969k;
            this.f3981l = kVar.f3970l;
        }

        public static float b(b7.k kVar) {
            if (kVar instanceof j) {
                Objects.requireNonNull((j) kVar);
                return -1.0f;
            }
            if (kVar instanceof d) {
                Objects.requireNonNull((d) kVar);
            }
            return -1.0f;
        }

        public k a() {
            return new k(this, null);
        }

        public b c(float f10) {
            f(f10);
            g(f10);
            e(f10);
            d(f10);
            return this;
        }

        public b d(float f10) {
            this.f3977h = new cb.a(f10);
            return this;
        }

        public b e(float f10) {
            this.f3976g = new cb.a(f10);
            return this;
        }

        public b f(float f10) {
            this.f3974e = new cb.a(f10);
            return this;
        }

        public b g(float f10) {
            this.f3975f = new cb.a(f10);
            return this;
        }
    }

    public k() {
        this.f3960a = new j();
        this.f3961b = new j();
        this.f3962c = new j();
        this.d = new j();
        this.f3963e = new cb.a(0.0f);
        this.f3964f = new cb.a(0.0f);
        this.f3965g = new cb.a(0.0f);
        this.f3966h = new cb.a(0.0f);
        this.f3967i = new e();
        this.f3968j = new e();
        this.f3969k = new e();
        this.f3970l = new e();
    }

    public k(b bVar, a aVar) {
        this.f3960a = bVar.f3971a;
        this.f3961b = bVar.f3972b;
        this.f3962c = bVar.f3973c;
        this.d = bVar.d;
        this.f3963e = bVar.f3974e;
        this.f3964f = bVar.f3975f;
        this.f3965g = bVar.f3976g;
        this.f3966h = bVar.f3977h;
        this.f3967i = bVar.f3978i;
        this.f3968j = bVar.f3979j;
        this.f3969k = bVar.f3980k;
        this.f3970l = bVar.f3981l;
    }

    public static b a(Context context, int i10, int i11) {
        return b(context, i10, i11, new cb.a(0));
    }

    public static b b(Context context, int i10, int i11, c cVar) {
        ContextThemeWrapper contextThemeWrapper = context;
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(contextThemeWrapper, i10);
            i10 = i11;
            contextThemeWrapper = contextThemeWrapper2;
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(i10, m9.a.f13017o0);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c e10 = e(obtainStyledAttributes, 5, cVar);
            c e11 = e(obtainStyledAttributes, 8, e10);
            c e12 = e(obtainStyledAttributes, 9, e10);
            c e13 = e(obtainStyledAttributes, 7, e10);
            c e14 = e(obtainStyledAttributes, 6, e10);
            b bVar = new b();
            b7.k n = m9.a.n(i13);
            bVar.f3971a = n;
            b.b(n);
            bVar.f3974e = e11;
            b7.k n10 = m9.a.n(i14);
            bVar.f3972b = n10;
            b.b(n10);
            bVar.f3975f = e12;
            b7.k n11 = m9.a.n(i15);
            bVar.f3973c = n11;
            b.b(n11);
            bVar.f3976g = e13;
            b7.k n12 = m9.a.n(i16);
            bVar.d = n12;
            b.b(n12);
            bVar.f3977h = e14;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b c(Context context, AttributeSet attributeSet, int i10, int i11) {
        return d(context, attributeSet, i10, i11, new cb.a(0));
    }

    public static b d(Context context, AttributeSet attributeSet, int i10, int i11, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.f13002c0, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, cVar);
    }

    public static c e(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new cb.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean f(RectF rectF) {
        boolean z10 = this.f3970l.getClass().equals(e.class) && this.f3968j.getClass().equals(e.class) && this.f3967i.getClass().equals(e.class) && this.f3969k.getClass().equals(e.class);
        float a10 = this.f3963e.a(rectF);
        return z10 && ((this.f3964f.a(rectF) > a10 ? 1 : (this.f3964f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f3966h.a(rectF) > a10 ? 1 : (this.f3966h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f3965g.a(rectF) > a10 ? 1 : (this.f3965g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f3961b instanceof j) && (this.f3960a instanceof j) && (this.f3962c instanceof j) && (this.d instanceof j));
    }

    public k g(float f10) {
        b bVar = new b(this);
        bVar.f(f10);
        bVar.g(f10);
        bVar.e(f10);
        bVar.d(f10);
        return bVar.a();
    }
}
