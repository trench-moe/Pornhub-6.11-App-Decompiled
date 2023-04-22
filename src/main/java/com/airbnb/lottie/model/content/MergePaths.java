package com.airbnb.lottie.model.content;

import b2.l;
import d2.c;
import i2.b;

/* loaded from: classes.dex */
public class MergePaths implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4139a;

    /* renamed from: b  reason: collision with root package name */
    public final MergePathsMode f4140b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4141c;

    /* loaded from: classes.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z10) {
        this.f4139a = str;
        this.f4140b = mergePathsMode;
        this.f4141c = z10;
    }

    @Override // i2.b
    public c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        if (lVar.C) {
            return new d2.l(this);
        }
        m2.c.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("MergePaths{mode=");
        m10.append(this.f4140b);
        m10.append('}');
        return m10.toString();
    }
}
