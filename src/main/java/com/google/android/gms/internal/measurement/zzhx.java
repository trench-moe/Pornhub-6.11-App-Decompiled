package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzhx extends zzhz {

    /* renamed from: c  reason: collision with root package name */
    public static final zzhx f7068c = new zzhx();

    private zzhx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
