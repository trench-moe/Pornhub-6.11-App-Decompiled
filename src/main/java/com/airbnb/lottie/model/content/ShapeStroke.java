package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import b2.l;
import d2.c;
import d2.r;
import h2.d;
import i2.b;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeStroke implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4158a;

    /* renamed from: b  reason: collision with root package name */
    public final h2.b f4159b;

    /* renamed from: c  reason: collision with root package name */
    public final List<h2.b> f4160c;
    public final h2.a d;

    /* renamed from: e  reason: collision with root package name */
    public final d f4161e;

    /* renamed from: f  reason: collision with root package name */
    public final h2.b f4162f;

    /* renamed from: g  reason: collision with root package name */
    public final LineCapType f4163g;

    /* renamed from: h  reason: collision with root package name */
    public final LineJoinType f4164h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4165i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4166j;

    /* loaded from: classes.dex */
    public enum LineCapType {
        /* JADX INFO: Fake field, exist only in values array */
        BUTT,
        /* JADX INFO: Fake field, exist only in values array */
        ROUND,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN;

        public Paint.Cap b() {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum LineJoinType {
        /* JADX INFO: Fake field, exist only in values array */
        MITER,
        /* JADX INFO: Fake field, exist only in values array */
        ROUND,
        /* JADX INFO: Fake field, exist only in values array */
        BEVEL;

        public Paint.Join b() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return null;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }
    }

    public ShapeStroke(String str, h2.b bVar, List<h2.b> list, h2.a aVar, d dVar, h2.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f10, boolean z10) {
        this.f4158a = str;
        this.f4159b = bVar;
        this.f4160c = list;
        this.d = aVar;
        this.f4161e = dVar;
        this.f4162f = bVar2;
        this.f4163g = lineCapType;
        this.f4164h = lineJoinType;
        this.f4165i = f10;
        this.f4166j = z10;
    }

    @Override // i2.b
    public c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new r(lVar, aVar, this);
    }
}
