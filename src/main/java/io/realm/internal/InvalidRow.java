package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Date;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes2.dex */
public enum InvalidRow implements n {
    INSTANCE;

    @Override // io.realm.internal.n
    public Decimal128 b(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public void c(long j10, String str) {
        throw z();
    }

    @Override // io.realm.internal.n
    public Table d() {
        throw z();
    }

    @Override // io.realm.internal.n
    public void e(long j10, boolean z10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public boolean f() {
        return false;
    }

    @Override // io.realm.internal.n
    public ObjectId g(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public String[] h() {
        throw z();
    }

    @Override // io.realm.internal.n
    public boolean i(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public long j(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public OsList k(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public void l(long j10, long j11) {
        throw z();
    }

    @Override // io.realm.internal.n
    public Date m(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public boolean n(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public long o(String str) {
        throw z();
    }

    @Override // io.realm.internal.n
    public boolean p(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public void q(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public byte[] r(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public double s(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public float t(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public String u(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public OsList v(long j10, RealmFieldType realmFieldType) {
        throw z();
    }

    @Override // io.realm.internal.n
    public RealmFieldType w(long j10) {
        throw z();
    }

    @Override // io.realm.internal.n
    public void x(long j10, double d) {
        throw z();
    }

    @Override // io.realm.internal.n
    public long y() {
        throw z();
    }

    public final RuntimeException z() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }
}
