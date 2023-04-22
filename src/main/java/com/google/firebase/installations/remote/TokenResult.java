package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.b;

@AutoValue
/* loaded from: classes.dex */
public abstract class TokenResult {

    /* loaded from: classes.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract TokenResult a();

        public abstract a b(long j10);
    }

    public static a a() {
        b.C0105b c0105b = new b.C0105b();
        c0105b.b(0L);
        return c0105b;
    }

    public abstract ResponseCode b();

    public abstract String c();

    public abstract long d();
}
