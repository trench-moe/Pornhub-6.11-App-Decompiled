package io.realm;

import io.realm.exceptions.RealmException;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Table> f11035a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<? extends u>, Table> f11036b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<? extends u>, x> f11037c = new HashMap();
    public final Map<String, x> d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final a f11038e;

    /* renamed from: f  reason: collision with root package name */
    public final io.realm.internal.b f11039f;

    public z(a aVar, io.realm.internal.b bVar) {
        this.f11038e = aVar;
        this.f11039f = bVar;
    }

    public final void a() {
        if (!(this.f11039f != null)) {
            throw new IllegalStateException("Attempt to use column key before set.");
        }
    }

    public abstract x b(String str);

    public final io.realm.internal.c c(String str) {
        a();
        io.realm.internal.b bVar = this.f11039f;
        io.realm.internal.c cVar = bVar.f10942b.get(str);
        if (cVar == null) {
            Iterator<Class<? extends u>> it = bVar.f10943c.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<? extends u> next = it.next();
                if (bVar.f10943c.f(next).equals(str)) {
                    cVar = bVar.a(next);
                    bVar.f10942b.put(str, cVar);
                    break;
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", str));
    }

    public x d(Class<? extends u> cls) {
        x xVar = this.f11037c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        Class<? extends u> a10 = Util.a(cls);
        if (a10.equals(cls)) {
            xVar = this.f11037c.get(a10);
        }
        if (xVar == null) {
            Table e10 = e(cls);
            a aVar = this.f11038e;
            a();
            f fVar = new f(aVar, this, e10, this.f11039f.a(a10));
            this.f11037c.put(a10, fVar);
            xVar = fVar;
        }
        if (a10.equals(cls)) {
            this.f11037c.put(cls, xVar);
        }
        return xVar;
    }

    public Table e(Class<? extends u> cls) {
        Table table = this.f11036b.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends u> a10 = Util.a(cls);
        if (a10.equals(cls)) {
            table = this.f11036b.get(a10);
        }
        if (table == null) {
            table = this.f11038e.n.getTable(Table.l(this.f11038e.f10823j.f11011j.f(a10)));
            this.f11036b.put(a10, table);
        }
        if (a10.equals(cls)) {
            this.f11036b.put(cls, table);
        }
        return table;
    }

    public Table f(String str) {
        String l10 = Table.l(str);
        Table table = this.f11035a.get(l10);
        if (table != null) {
            return table;
        }
        Table table2 = this.f11038e.n.getTable(l10);
        this.f11035a.put(l10, table2);
        return table2;
    }
}
