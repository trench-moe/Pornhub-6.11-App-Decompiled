package androidx.navigation;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a  reason: collision with root package name */
    public final int f2639a;

    public a(int i10) {
        this.f2639a = i10;
    }

    @Override // androidx.navigation.n
    public int a() {
        return this.f2639a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.f2639a == ((a) obj).f2639a;
    }

    @Override // androidx.navigation.n
    public Bundle getArguments() {
        return new Bundle();
    }

    public int hashCode() {
        return 31 + this.f2639a;
    }

    public String toString() {
        return android.support.v4.media.a.j(a1.a.m("ActionOnlyNavDirections(actionId="), this.f2639a, ")");
    }
}
