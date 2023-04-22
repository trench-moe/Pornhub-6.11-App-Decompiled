package io.realm.internal;

import com.appsflyer.oaid.BuildConfig;
import io.realm.Case;

/* loaded from: classes2.dex */
public class TableQuery implements g {

    /* renamed from: m  reason: collision with root package name */
    public static final long f10931m = nativeGetFinalizerPtr();

    /* renamed from: c  reason: collision with root package name */
    public final Table f10932c;

    /* renamed from: f  reason: collision with root package name */
    public final long f10933f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10934j = true;

    public TableQuery(f fVar, Table table, long j10) {
        this.f10932c = table;
        this.f10933f = j10;
        fVar.a(this);
    }

    private native void nativeAlwaysFalse(long j10);

    private native void nativeEndGroup(long j10);

    private native void nativeEqual(long j10, long[] jArr, long[] jArr2, String str, boolean z10);

    private native long nativeFind(long j10);

    private static native long nativeGetFinalizerPtr();

    private native void nativeGroup(long j10);

    private native void nativeNotEqual(long j10, long[] jArr, long[] jArr2, String str, boolean z10);

    private native void nativeOr(long j10);

    private native String nativeValidateQuery(long j10);

    public void a() {
        nativeAlwaysFalse(this.f10933f);
    }

    public TableQuery b() {
        nativeEndGroup(this.f10933f);
        this.f10934j = false;
        return this;
    }

    public TableQuery c(long[] jArr, long[] jArr2, String str, Case r11) {
        nativeEqual(this.f10933f, jArr, jArr2, str, r11.b());
        this.f10934j = false;
        return this;
    }

    public long d() {
        h();
        return nativeFind(this.f10933f);
    }

    public TableQuery e() {
        nativeGroup(this.f10933f);
        this.f10934j = false;
        return this;
    }

    public TableQuery f(long[] jArr, long[] jArr2, String str, Case r11) {
        nativeNotEqual(this.f10933f, jArr, jArr2, str, r11.b());
        this.f10934j = false;
        return this;
    }

    public TableQuery g() {
        nativeOr(this.f10933f);
        this.f10934j = false;
        return this;
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10931m;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10933f;
    }

    public void h() {
        if (this.f10934j) {
            return;
        }
        String nativeValidateQuery = nativeValidateQuery(this.f10933f);
        if (!nativeValidateQuery.equals(BuildConfig.FLAVOR)) {
            throw new UnsupportedOperationException(nativeValidateQuery);
        }
        this.f10934j = true;
    }
}
