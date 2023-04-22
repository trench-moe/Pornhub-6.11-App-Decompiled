package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Date;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes2.dex */
public class UncheckedRow implements g, n {

    /* renamed from: m  reason: collision with root package name */
    public static final long f10935m = nativeGetFinalizerPtr();
    public static final /* synthetic */ int n = 0;

    /* renamed from: c  reason: collision with root package name */
    public final f f10936c;

    /* renamed from: f  reason: collision with root package name */
    public final Table f10937f;

    /* renamed from: j  reason: collision with root package name */
    public final long f10938j;

    public UncheckedRow(UncheckedRow uncheckedRow) {
        this.f10936c = uncheckedRow.f10936c;
        this.f10937f = uncheckedRow.f10937f;
        this.f10938j = uncheckedRow.f10938j;
    }

    public UncheckedRow(f fVar, Table table, long j10) {
        this.f10936c = fVar;
        this.f10937f = table;
        this.f10938j = j10;
        fVar.a(this);
    }

    private static native long nativeGetFinalizerPtr();

    @Override // io.realm.internal.n
    public Decimal128 b(long j10) {
        long[] nativeGetDecimal128 = nativeGetDecimal128(this.f10938j, j10);
        if (nativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeGetDecimal128[1], nativeGetDecimal128[0]);
        }
        return null;
    }

    @Override // io.realm.internal.n
    public void c(long j10, String str) {
        this.f10937f.c();
        if (str == null) {
            nativeSetNull(this.f10938j, j10);
        } else {
            nativeSetString(this.f10938j, j10, str);
        }
    }

    @Override // io.realm.internal.n
    public Table d() {
        return this.f10937f;
    }

    @Override // io.realm.internal.n
    public void e(long j10, boolean z10) {
        this.f10937f.c();
        nativeSetBoolean(this.f10938j, j10, z10);
    }

    @Override // io.realm.internal.n
    public boolean f() {
        long j10 = this.f10938j;
        return j10 != 0 && nativeIsValid(j10);
    }

    @Override // io.realm.internal.n
    public ObjectId g(long j10) {
        return new ObjectId(nativeGetObjectId(this.f10938j, j10));
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10935m;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10938j;
    }

    @Override // io.realm.internal.n
    public String[] h() {
        return nativeGetColumnNames(this.f10938j);
    }

    @Override // io.realm.internal.n
    public boolean i(long j10) {
        return nativeGetBoolean(this.f10938j, j10);
    }

    @Override // io.realm.internal.n
    public long j(long j10) {
        return nativeGetLong(this.f10938j, j10);
    }

    public OsList k(long j10) {
        return new OsList(this, j10);
    }

    @Override // io.realm.internal.n
    public void l(long j10, long j11) {
        this.f10937f.c();
        nativeSetLong(this.f10938j, j10, j11);
    }

    @Override // io.realm.internal.n
    public Date m(long j10) {
        return new Date(nativeGetTimestamp(this.f10938j, j10));
    }

    public boolean n(long j10) {
        return nativeIsNull(this.f10938j, j10);
    }

    public native boolean nativeGetBoolean(long j10, long j11);

    public native byte[] nativeGetByteArray(long j10, long j11);

    public native long nativeGetColumnKey(long j10, String str);

    public native String[] nativeGetColumnNames(long j10);

    public native int nativeGetColumnType(long j10, long j11);

    public native long[] nativeGetDecimal128(long j10, long j11);

    public native double nativeGetDouble(long j10, long j11);

    public native float nativeGetFloat(long j10, long j11);

    public native long nativeGetLong(long j10, long j11);

    public native String nativeGetObjectId(long j10, long j11);

    public native long nativeGetObjectKey(long j10);

    public native String nativeGetString(long j10, long j11);

    public native long nativeGetTimestamp(long j10, long j11);

    public native boolean nativeIsNull(long j10, long j11);

    public native boolean nativeIsNullLink(long j10, long j11);

    public native boolean nativeIsValid(long j10);

    public native void nativeSetBoolean(long j10, long j11, boolean z10);

    public native void nativeSetDouble(long j10, long j11, double d);

    public native void nativeSetLong(long j10, long j11, long j12);

    public native void nativeSetNull(long j10, long j11);

    public native void nativeSetString(long j10, long j11, String str);

    @Override // io.realm.internal.n
    public long o(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f10938j, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public boolean p(long j10) {
        return nativeIsNullLink(this.f10938j, j10);
    }

    public void q(long j10) {
        this.f10937f.c();
        nativeSetNull(this.f10938j, j10);
    }

    @Override // io.realm.internal.n
    public byte[] r(long j10) {
        return nativeGetByteArray(this.f10938j, j10);
    }

    @Override // io.realm.internal.n
    public double s(long j10) {
        return nativeGetDouble(this.f10938j, j10);
    }

    @Override // io.realm.internal.n
    public float t(long j10) {
        return nativeGetFloat(this.f10938j, j10);
    }

    @Override // io.realm.internal.n
    public String u(long j10) {
        return nativeGetString(this.f10938j, j10);
    }

    public OsList v(long j10, RealmFieldType realmFieldType) {
        return new OsList(this, j10);
    }

    @Override // io.realm.internal.n
    public RealmFieldType w(long j10) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f10938j, j10));
    }

    @Override // io.realm.internal.n
    public void x(long j10, double d) {
        this.f10937f.c();
        nativeSetDouble(this.f10938j, j10, d);
    }

    @Override // io.realm.internal.n
    public long y() {
        return nativeGetObjectKey(this.f10938j);
    }
}
