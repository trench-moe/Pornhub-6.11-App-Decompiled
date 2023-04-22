package com.airbnb.lottie.model.layer;

import b2.f;
import com.airbnb.lottie.model.content.Mask;
import com.appsflyer.oaid.BuildConfig;
import h2.c;
import h2.h;
import h2.i;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Layer {

    /* renamed from: a  reason: collision with root package name */
    public final List<i2.b> f4189a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4190b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4191c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final LayerType f4192e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4193f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4194g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Mask> f4195h;

    /* renamed from: i  reason: collision with root package name */
    public final i f4196i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4197j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4198k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4199l;

    /* renamed from: m  reason: collision with root package name */
    public final float f4200m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4201o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4202p;

    /* renamed from: q  reason: collision with root package name */
    public final c f4203q;

    /* renamed from: r  reason: collision with root package name */
    public final h f4204r;

    /* renamed from: s  reason: collision with root package name */
    public final h2.b f4205s;

    /* renamed from: t  reason: collision with root package name */
    public final List<n2.a<Float>> f4206t;

    /* renamed from: u  reason: collision with root package name */
    public final MatteType f4207u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f4208v;

    /* loaded from: classes.dex */
    public enum LayerType {
        PRE_COMP,
        /* JADX INFO: Fake field, exist only in values array */
        SOLID,
        IMAGE,
        /* JADX INFO: Fake field, exist only in values array */
        NULL,
        /* JADX INFO: Fake field, exist only in values array */
        SHAPE,
        /* JADX INFO: Fake field, exist only in values array */
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum MatteType {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        ADD,
        INVERT,
        /* JADX INFO: Fake field, exist only in values array */
        LUMA,
        /* JADX INFO: Fake field, exist only in values array */
        LUMA_INVERTED,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    public Layer(List<i2.b> list, f fVar, String str, long j10, LayerType layerType, long j11, String str2, List<Mask> list2, i iVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, c cVar, h hVar, List<n2.a<Float>> list3, MatteType matteType, h2.b bVar, boolean z10) {
        this.f4189a = list;
        this.f4190b = fVar;
        this.f4191c = str;
        this.d = j10;
        this.f4192e = layerType;
        this.f4193f = j11;
        this.f4194g = str2;
        this.f4195h = list2;
        this.f4196i = iVar;
        this.f4197j = i10;
        this.f4198k = i11;
        this.f4199l = i12;
        this.f4200m = f10;
        this.n = f11;
        this.f4201o = i13;
        this.f4202p = i14;
        this.f4203q = cVar;
        this.f4204r = hVar;
        this.f4206t = list3;
        this.f4207u = matteType;
        this.f4205s = bVar;
        this.f4208v = z10;
    }

    public String a(String str) {
        StringBuilder m10 = a1.a.m(str);
        m10.append(this.f4191c);
        m10.append("\n");
        Layer e10 = this.f4190b.e(this.f4193f);
        if (e10 != null) {
            m10.append("\t\tParents: ");
            m10.append(e10.f4191c);
            Layer e11 = this.f4190b.e(e10.f4193f);
            while (e11 != null) {
                m10.append("->");
                m10.append(e11.f4191c);
                e11 = this.f4190b.e(e11.f4193f);
            }
            m10.append(str);
            m10.append("\n");
        }
        if (!this.f4195h.isEmpty()) {
            m10.append(str);
            m10.append("\tMasks: ");
            m10.append(this.f4195h.size());
            m10.append("\n");
        }
        if (this.f4197j != 0 && this.f4198k != 0) {
            m10.append(str);
            m10.append("\tBackground: ");
            m10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f4197j), Integer.valueOf(this.f4198k), Integer.valueOf(this.f4199l)));
        }
        if (!this.f4189a.isEmpty()) {
            m10.append(str);
            m10.append("\tShapes:\n");
            for (i2.b bVar : this.f4189a) {
                m10.append(str);
                m10.append("\t\t");
                m10.append(bVar);
                m10.append("\n");
            }
        }
        return m10.toString();
    }

    public String toString() {
        return a(BuildConfig.FLAVOR);
    }
}
