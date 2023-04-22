package com.airbnb.lottie.model.content;

import b2.l;
import d2.c;
import d2.s;
import i2.b;

/* loaded from: classes.dex */
public class ShapeTrimPath implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4169a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f4170b;

    /* renamed from: c  reason: collision with root package name */
    public final h2.b f4171c;
    public final h2.b d;

    /* renamed from: e  reason: collision with root package name */
    public final h2.b f4172e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4173f;

    /* loaded from: classes.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY
    }

    public ShapeTrimPath(String str, Type type, h2.b bVar, h2.b bVar2, h2.b bVar3, boolean z10) {
        this.f4169a = str;
        this.f4170b = type;
        this.f4171c = bVar;
        this.d = bVar2;
        this.f4172e = bVar3;
        this.f4173f = z10;
    }

    @Override // i2.b
    public c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new s(aVar, this);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Trim Path: {start: ");
        m10.append(this.f4171c);
        m10.append(", end: ");
        m10.append(this.d);
        m10.append(", offset: ");
        m10.append(this.f4172e);
        m10.append("}");
        return m10.toString();
    }
}
