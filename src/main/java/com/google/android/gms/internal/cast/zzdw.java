package com.google.android.gms.internal.cast;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzdw<E> extends zzdq<E> implements Set<E> {

    /* renamed from: f  reason: collision with root package name */
    public transient zzdu<E> f6926f;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (obj != this) {
            if (obj != this) {
                if (obj instanceof Set) {
                    Set set = (Set) obj;
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                            return true;
                        }
                        z10 = false;
                    }
                }
                z10 = false;
            }
            return z10;
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return a0.b.j0(this);
    }
}
