package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;

/* loaded from: classes2.dex */
public class CheckedRow extends UncheckedRow {
    public CheckedRow(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.n
    public OsList k(long j10) {
        if (this.f10937f.i(j10) == RealmFieldType.LIST) {
            return new OsList(this, j10);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", this.f10937f.g(j10)));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.n
    public boolean n(long j10) {
        return nativeIsNull(this.f10938j, j10);
    }

    @Override // io.realm.internal.UncheckedRow
    public native boolean nativeGetBoolean(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native byte[] nativeGetByteArray(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetColumnKey(long j10, String str);

    @Override // io.realm.internal.UncheckedRow
    public native int nativeGetColumnType(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native long[] nativeGetDecimal128(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native double nativeGetDouble(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native float nativeGetFloat(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetLong(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native String nativeGetObjectId(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native String nativeGetString(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native long nativeGetTimestamp(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native boolean nativeIsNullLink(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetBoolean(long j10, long j11, boolean z10);

    public native void nativeSetByteArray(long j10, long j11, byte[] bArr);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetDouble(long j10, long j11, double d);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetLong(long j10, long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    public native void nativeSetString(long j10, long j11, String str);

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.n
    public boolean p(long j10) {
        RealmFieldType fromNativeValue = RealmFieldType.fromNativeValue(nativeGetColumnType(this.f10938j, j10));
        if (fromNativeValue == RealmFieldType.OBJECT || fromNativeValue == RealmFieldType.LIST) {
            return nativeIsNullLink(this.f10938j, j10);
        }
        return false;
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.n
    public void q(long j10) {
        if (RealmFieldType.fromNativeValue(nativeGetColumnType(this.f10938j, j10)) == RealmFieldType.BINARY) {
            this.f10937f.c();
            nativeSetByteArray(this.f10938j, j10, null);
            return;
        }
        this.f10937f.c();
        nativeSetNull(this.f10938j, j10);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.n
    public OsList v(long j10, RealmFieldType realmFieldType) {
        if (realmFieldType == this.f10937f.i(j10)) {
            return new OsList(this, j10);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", this.f10937f.g(j10), realmFieldType.name()));
    }
}
