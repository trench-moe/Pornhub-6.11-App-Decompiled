package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Date;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes2.dex */
public interface n {
    Decimal128 b(long j10);

    void c(long j10, String str);

    Table d();

    void e(long j10, boolean z10);

    boolean f();

    ObjectId g(long j10);

    String[] h();

    boolean i(long j10);

    long j(long j10);

    OsList k(long j10);

    void l(long j10, long j11);

    Date m(long j10);

    boolean n(long j10);

    long o(String str);

    boolean p(long j10);

    void q(long j10);

    byte[] r(long j10);

    double s(long j10);

    float t(long j10);

    String u(long j10);

    OsList v(long j10, RealmFieldType realmFieldType);

    RealmFieldType w(long j10);

    void x(long j10, double d);

    long y();
}
