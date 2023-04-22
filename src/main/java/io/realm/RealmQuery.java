package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.DescriptorOrdering;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes2.dex */
public class RealmQuery<E> {

    /* renamed from: a  reason: collision with root package name */
    public final a f10812a;

    /* renamed from: b  reason: collision with root package name */
    public final TableQuery f10813b;

    /* renamed from: c  reason: collision with root package name */
    public final x f10814c;
    public Class<E> d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10815e;

    /* renamed from: f  reason: collision with root package name */
    public DescriptorOrdering f10816f = new DescriptorOrdering();

    public RealmQuery(p pVar, Class<E> cls) {
        this.f10812a = pVar;
        this.d = cls;
        boolean z10 = !u.class.isAssignableFrom(cls);
        this.f10815e = z10;
        if (z10) {
            this.f10814c = null;
            this.f10813b = null;
            return;
        }
        x d = pVar.A.d(cls);
        this.f10814c = d;
        this.f10813b = d.f11032c.u();
    }

    public final y<E> a(TableQuery tableQuery, DescriptorOrdering descriptorOrdering, boolean z10) {
        y<E> yVar = new y<>(this.f10812a, OsResults.c(this.f10812a.n, tableQuery, descriptorOrdering), this.d);
        if (z10) {
            yVar.f10974c.e();
            yVar.f10977m.h();
        }
        return yVar;
    }

    public RealmQuery<E> b(String str, String str2) {
        Case r02 = Case.SENSITIVE;
        this.f10812a.e();
        c(str, str2, r02);
        return this;
    }

    public final RealmQuery<E> c(String str, String str2, Case r72) {
        ee.c f10 = this.f10814c.f(str, RealmFieldType.STRING);
        TableQuery tableQuery = this.f10813b;
        long[] d = f10.d();
        f10.b();
        long[] jArr = f10.f9322g;
        tableQuery.c(d, Arrays.copyOf(jArr, jArr.length), str2, r72);
        return this;
    }

    public y<E> d() {
        this.f10812a.e();
        this.f10812a.d();
        return a(this.f10813b, this.f10816f, true);
    }

    public E e() {
        long d;
        io.realm.internal.n nVar;
        this.f10812a.e();
        this.f10812a.d();
        if (this.f10815e) {
            return null;
        }
        if (this.f10816f.a()) {
            d = this.f10813b.d();
        } else {
            io.realm.internal.l lVar = (io.realm.internal.l) d().b(false, null);
            d = lVar != null ? lVar.o().f10983c.y() : -1L;
        }
        if (d < 0) {
            return null;
        }
        a aVar = this.f10812a;
        Class<E> cls = this.d;
        io.realm.internal.n nVar2 = InvalidRow.INSTANCE;
        Table e10 = aVar.i().e(cls);
        io.realm.internal.m mVar = aVar.f10823j.f11011j;
        if (d != -1) {
            io.realm.internal.f fVar = e10.f10928f;
            int i10 = UncheckedRow.n;
            nVar = new UncheckedRow(fVar, e10, e10.nativeGetRowPtr(e10.f10927c, d));
        } else {
            nVar = nVar2;
        }
        z i11 = aVar.i();
        i11.a();
        return (E) mVar.i(cls, aVar, nVar, i11.f11039f.a(cls), false, Collections.emptyList());
    }
}
