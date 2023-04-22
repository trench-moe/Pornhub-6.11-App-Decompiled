package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;
import t9.k0;

/* loaded from: classes.dex */
public interface c extends b.a {

    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f7325b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f7326a = new e(null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f10, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f7326a;
            float g10 = k0.g(eVar3.f7329a, eVar4.f7329a, f10);
            float g11 = k0.g(eVar3.f7330b, eVar4.f7330b, f10);
            float g12 = k0.g(eVar3.f7331c, eVar4.f7331c, f10);
            eVar5.f7329a = g10;
            eVar5.f7330b = g11;
            eVar5.f7331c = g12;
            return this.f7326a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0091c extends Property<c, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, e> f7327a = new C0091c("circularReveal");

        public C0091c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, Integer> f7328a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f7329a;

        /* renamed from: b  reason: collision with root package name */
        public float f7330b;

        /* renamed from: c  reason: collision with root package name */
        public float f7331c;

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f7329a = f10;
            this.f7330b = f11;
            this.f7331c = f12;
        }

        public e(a aVar) {
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
