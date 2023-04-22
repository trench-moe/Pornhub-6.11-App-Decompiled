package io.realm;

import java.util.Locale;

/* loaded from: classes2.dex */
public interface k {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10972a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10973b;

        public a(int i10, int i11) {
            this.f10972a = i10;
            this.f10973b = i11;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", Integer.valueOf(this.f10972a), Integer.valueOf(this.f10973b));
        }
    }

    a[] a();

    a[] b();

    a[] c();
}
