package io.realm.internal;

import io.realm.k;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class OsCollectionChangeSet implements io.realm.k, g {

    /* renamed from: j  reason: collision with root package name */
    public static long f10870j = nativeGetFinalizerPtr();

    /* renamed from: c  reason: collision with root package name */
    public final long f10871c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10872f;

    public OsCollectionChangeSet(long j10, boolean z10) {
        this.f10871c = j10;
        this.f10872f = z10;
        f.f10955b.a(this);
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetRanges(long j10, int i10);

    @Override // io.realm.k
    public k.a[] a() {
        return g(nativeGetRanges(this.f10871c, 1));
    }

    @Override // io.realm.k
    public k.a[] b() {
        return g(nativeGetRanges(this.f10871c, 2));
    }

    @Override // io.realm.k
    public k.a[] c() {
        return g(nativeGetRanges(this.f10871c, 0));
    }

    public Throwable d() {
        return null;
    }

    public boolean e() {
        return this.f10871c == 0;
    }

    public boolean f() {
        return this.f10872f;
    }

    public final k.a[] g(int[] iArr) {
        if (iArr == null) {
            return new k.a[0];
        }
        int length = iArr.length / 2;
        k.a[] aVarArr = new k.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            aVarArr[i10] = new k.a(iArr[i11], iArr[i11 + 1]);
        }
        return aVarArr;
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10870j;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10871c;
    }

    public String toString() {
        if (this.f10871c == 0) {
            return "Change set is empty.";
        }
        StringBuilder m10 = a1.a.m("Deletion Ranges: ");
        m10.append(Arrays.toString(c()));
        m10.append("\nInsertion Ranges: ");
        m10.append(Arrays.toString(a()));
        m10.append("\nChange Ranges: ");
        m10.append(Arrays.toString(b()));
        return m10.toString();
    }
}
