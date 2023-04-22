package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import b2.l;
import d2.c;
import d2.n;
import h2.j;
import i2.b;

/* loaded from: classes.dex */
public class PolystarShape implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4147a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f4148b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.b f4149c;
    public final j<PointF, PointF> d;

    /* renamed from: e  reason: collision with root package name */
    public final h2.b f4150e;

    /* renamed from: f  reason: collision with root package name */
    public final h2.b f4151f;

    /* renamed from: g  reason: collision with root package name */
    public final h2.b f4152g;

    /* renamed from: h  reason: collision with root package name */
    public final h2.b f4153h;

    /* renamed from: i  reason: collision with root package name */
    public final h2.b f4154i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4155j;

    /* loaded from: classes.dex */
    public enum Type {
        STAR(1),
        /* JADX INFO: Fake field, exist only in values array */
        POLYGON(2);
        
        private final int value;

        Type(int i10) {
            this.value = i10;
        }

        public static Type b(int i10) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i10) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, h2.b bVar, j<PointF, PointF> jVar, h2.b bVar2, h2.b bVar3, h2.b bVar4, h2.b bVar5, h2.b bVar6, boolean z10) {
        this.f4147a = str;
        this.f4148b = type;
        this.f4149c = bVar;
        this.d = jVar;
        this.f4150e = bVar2;
        this.f4151f = bVar3;
        this.f4152g = bVar4;
        this.f4153h = bVar5;
        this.f4154i = bVar6;
        this.f4155j = z10;
    }

    @Override // i2.b
    public c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new n(lVar, aVar, this);
    }
}
