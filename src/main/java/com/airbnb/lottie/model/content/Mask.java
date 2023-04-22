package com.airbnb.lottie.model.content;

import h2.d;

/* loaded from: classes.dex */
public class Mask {

    /* renamed from: a  reason: collision with root package name */
    public final MaskMode f4132a;

    /* renamed from: b  reason: collision with root package name */
    public final h2.a f4133b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4134c;
    public final boolean d;

    /* loaded from: classes.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, h2.a aVar, d dVar, boolean z10) {
        this.f4132a = maskMode;
        this.f4133b = aVar;
        this.f4134c = dVar;
        this.d = z10;
    }
}
