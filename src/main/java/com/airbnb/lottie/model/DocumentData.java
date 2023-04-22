package com.airbnb.lottie.model;

import a1.a;

/* loaded from: classes.dex */
public class DocumentData {

    /* renamed from: a  reason: collision with root package name */
    public final String f4117a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4118b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4119c;
    public final Justification d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4120e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4121f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4122g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4123h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4124i;

    /* renamed from: j  reason: collision with root package name */
    public final float f4125j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4126k;

    /* loaded from: classes.dex */
    public enum Justification {
        /* JADX INFO: Fake field, exist only in values array */
        LEFT_ALIGN,
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f10, Justification justification, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10) {
        this.f4117a = str;
        this.f4118b = str2;
        this.f4119c = f10;
        this.d = justification;
        this.f4120e = i10;
        this.f4121f = f11;
        this.f4122g = f12;
        this.f4123h = i11;
        this.f4124i = i12;
        this.f4125j = f13;
        this.f4126k = z10;
    }

    public int hashCode() {
        String str = this.f4118b;
        int ordinal = ((this.d.ordinal() + (((int) (a.b(str, this.f4117a.hashCode() * 31, 31) + this.f4119c)) * 31)) * 31) + this.f4120e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f4121f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f4123h;
    }
}
