package com.airbnb.lottie.model.content;

import b2.l;
import com.airbnb.lottie.model.content.ShapeStroke;
import d2.i;
import h2.c;
import h2.d;
import h2.e;
import i2.b;
import java.util.List;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4177a;

    /* renamed from: b  reason: collision with root package name */
    public final GradientType f4178b;

    /* renamed from: c  reason: collision with root package name */
    public final c f4179c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final e f4180e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4181f;

    /* renamed from: g  reason: collision with root package name */
    public final h2.b f4182g;

    /* renamed from: h  reason: collision with root package name */
    public final ShapeStroke.LineCapType f4183h;

    /* renamed from: i  reason: collision with root package name */
    public final ShapeStroke.LineJoinType f4184i;

    /* renamed from: j  reason: collision with root package name */
    public final float f4185j;

    /* renamed from: k  reason: collision with root package name */
    public final List<h2.b> f4186k;

    /* renamed from: l  reason: collision with root package name */
    public final h2.b f4187l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f4188m;

    public a(String str, GradientType gradientType, c cVar, d dVar, e eVar, e eVar2, h2.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f10, List<h2.b> list, h2.b bVar2, boolean z10) {
        this.f4177a = str;
        this.f4178b = gradientType;
        this.f4179c = cVar;
        this.d = dVar;
        this.f4180e = eVar;
        this.f4181f = eVar2;
        this.f4182g = bVar;
        this.f4183h = lineCapType;
        this.f4184i = lineJoinType;
        this.f4185j = f10;
        this.f4186k = list;
        this.f4187l = bVar2;
        this.f4188m = z10;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new i(lVar, aVar, this);
    }
}
