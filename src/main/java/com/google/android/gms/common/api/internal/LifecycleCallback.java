package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import e9.e;
import e9.f;
import java.util.Objects;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: c  reason: collision with root package name */
    public final f f6862c;

    public LifecycleCallback(f fVar) {
        this.f6862c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e9.f b(android.app.Activity r9) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.b(android.app.Activity):e9.f");
    }

    @Keep
    private static f getChimeraLifecycleFragmentImpl(e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public Activity a() {
        Activity g10 = this.f6862c.g();
        Objects.requireNonNull(g10, "null reference");
        return g10;
    }

    public void c(int i10, int i11, Intent intent) {
    }

    public void d(Bundle bundle) {
    }

    public void e() {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }
}
