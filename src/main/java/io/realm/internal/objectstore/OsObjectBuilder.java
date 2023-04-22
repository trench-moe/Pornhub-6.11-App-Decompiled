package io.realm.internal.objectstore;

import io.realm.ImportFlag;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.f;
import java.io.Closeable;
import java.util.Set;

/* loaded from: classes2.dex */
public class OsObjectBuilder implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final Table f10967c;

    /* renamed from: f  reason: collision with root package name */
    public final long f10968f;

    /* renamed from: j  reason: collision with root package name */
    public final long f10969j;

    /* renamed from: m  reason: collision with root package name */
    public final long f10970m;
    public final f n;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f10971t;

    public OsObjectBuilder(Table table, Set<ImportFlag> set) {
        OsSharedRealm osSharedRealm = table.f10929j;
        this.f10968f = osSharedRealm.getNativePtr();
        this.f10967c = table;
        table.h();
        this.f10970m = table.f10927c;
        this.f10969j = nativeCreateBuilder();
        this.n = osSharedRealm.context;
        this.f10971t = set.contains(ImportFlag.CHECK_SAME_VALUES_BEFORE_SET);
    }

    private static native void nativeAddBoolean(long j10, long j11, boolean z10);

    private static native void nativeAddDouble(long j10, long j11, double d);

    private static native void nativeAddInteger(long j10, long j11, long j12);

    private static native void nativeAddNull(long j10, long j11);

    private static native void nativeAddString(long j10, long j11, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j10, long j11, long j12, boolean z10, boolean z11);

    private static native void nativeDestroyBuilder(long j10);

    public void a(long j10, Boolean bool) {
        if (bool == null) {
            nativeAddNull(this.f10969j, j10);
        } else {
            nativeAddBoolean(this.f10969j, j10, bool.booleanValue());
        }
    }

    public void c(long j10, Double d) {
        if (d == null) {
            nativeAddNull(this.f10969j, j10);
        } else {
            nativeAddDouble(this.f10969j, j10, d.doubleValue());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroyBuilder(this.f10969j);
    }

    public void d(long j10, Integer num) {
        if (num == null) {
            nativeAddNull(this.f10969j, j10);
        } else {
            nativeAddInteger(this.f10969j, j10, num.intValue());
        }
    }

    public void e(long j10, Long l10) {
        if (l10 == null) {
            nativeAddNull(this.f10969j, j10);
        } else {
            nativeAddInteger(this.f10969j, j10, l10.longValue());
        }
    }

    public void f(long j10, Short sh) {
        if (sh == null) {
            nativeAddNull(this.f10969j, j10);
        } else {
            nativeAddInteger(this.f10969j, j10, sh.shortValue());
        }
    }

    public void h(long j10, String str) {
        if (str == null) {
            nativeAddNull(this.f10969j, j10);
        } else {
            nativeAddString(this.f10969j, j10, str);
        }
    }

    public UncheckedRow i() {
        try {
            return new UncheckedRow(this.n, this.f10967c, nativeCreateOrUpdateTopLevelObject(this.f10968f, this.f10970m, this.f10969j, false, false));
        } finally {
            close();
        }
    }

    public void k() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.f10968f, this.f10970m, this.f10969j, true, this.f10971t);
        } finally {
            close();
        }
    }
}
