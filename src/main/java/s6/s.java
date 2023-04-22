package s6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p6.a;
import t6.a;

/* loaded from: classes2.dex */
public class s implements s6.d, t6.a, s6.c {

    /* renamed from: t  reason: collision with root package name */
    public static final i6.b f14890t = new i6.b("proto");

    /* renamed from: c  reason: collision with root package name */
    public final z f14891c;

    /* renamed from: f  reason: collision with root package name */
    public final u6.a f14892f;

    /* renamed from: j  reason: collision with root package name */
    public final u6.a f14893j;

    /* renamed from: m  reason: collision with root package name */
    public final e f14894m;
    public final n6.a<String> n;

    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t2);
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f14895a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14896b;

        public c(String str, String str2, a aVar) {
            this.f14895a = str;
            this.f14896b = str2;
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
    }

    public s(u6.a aVar, u6.a aVar2, e eVar, z zVar, n6.a<String> aVar3) {
        this.f14891c = zVar;
        this.f14892f = aVar;
        this.f14893j = aVar2;
        this.f14894m = eVar;
        this.n = aVar3;
    }

    public static String m(Iterable<j> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T n(Cursor cursor, b<Cursor, T> bVar) {
        try {
            T apply = bVar.apply(cursor);
            cursor.close();
            return apply;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    @Override // s6.d
    public Iterable<l6.q> G() {
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            List list = (List) n(f10.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), q.f14883c);
            f10.setTransactionSuccessful();
            f10.endTransaction();
            return list;
        } catch (Throwable th) {
            f10.endTransaction();
            throw th;
        }
    }

    @Override // s6.d
    public long H(l6.q qVar) {
        Cursor rawQuery = f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{qVar.b(), String.valueOf(v6.a.a(qVar.d()))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // s6.d
    public j R(l6.q qVar, l6.m mVar) {
        cb.e.A("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", qVar.d(), mVar.h(), qVar.b());
        long longValue = ((Long) i(new k(this, mVar, qVar, 0))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new s6.b(longValue, qVar, mVar);
    }

    @Override // s6.d
    public Iterable<j> W(l6.q qVar) {
        return (Iterable) i(new r(this, qVar, 0));
    }

    @Override // s6.c
    public void a() {
        i(new s4.f(this, 5));
    }

    @Override // t6.a
    public <T> T c(a.InterfaceC0268a<T> interfaceC0268a) {
        SQLiteDatabase f10 = f();
        k(new s4.f(f10, 4), k0.c.f11743m);
        try {
            T e10 = interfaceC0268a.e();
            f10.setTransactionSuccessful();
            f10.endTransaction();
            return e10;
        } catch (Throwable th) {
            f10.endTransaction();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14891c.close();
    }

    @Override // s6.c
    public p6.a d() {
        int i10 = p6.a.f13804e;
        a.C0244a c0244a = new a.C0244a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            Objects.requireNonNull(this);
            p6.a aVar = (p6.a) n(f10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new k(this, hashMap, c0244a, 1));
            f10.setTransactionSuccessful();
            f10.endTransaction();
            return aVar;
        } catch (Throwable th) {
            f10.endTransaction();
            throw th;
        }
    }

    @Override // s6.c
    public void e(final long j10, final LogEventDropped.Reason reason, final String str) {
        i(new b() { // from class: s6.n
            @Override // s6.s.b
            public final Object apply(Object obj) {
                String str2 = str;
                LogEventDropped.Reason reason2 = reason;
                long j11 = j10;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (((Boolean) s.n(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())}), k0.c.n)).booleanValue()) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j11));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    public SQLiteDatabase f() {
        z zVar = this.f14891c;
        Objects.requireNonNull(zVar);
        long a10 = this.f14893j.a();
        while (true) {
            try {
                return zVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f14893j.a() >= this.f14894m.a() + a10) {
                    throw new SynchronizationException("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Long h(SQLiteDatabase sQLiteDatabase, l6.q qVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(qVar.b(), String.valueOf(v6.a.a(qVar.d()))));
        if (qVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(qVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) n(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), o.f14870f);
    }

    @Override // s6.d
    public void h0(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder m10 = a1.a.m("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            m10.append(m(iterable));
            i(new q6.b(this, m10.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 1));
        }
    }

    public <T> T i(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            T apply = bVar.apply(f10);
            f10.setTransactionSuccessful();
            f10.endTransaction();
            return apply;
        } catch (Throwable th) {
            f10.endTransaction();
            throw th;
        }
    }

    public final <T> T k(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f14893j.a();
        while (true) {
            try {
                ((s4.f) dVar).c();
                return null;
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f14893j.a() >= this.f14894m.a() + a10) {
                    return (T) ((k0.c) bVar).apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // s6.d
    public int o() {
        long a10 = this.f14892f.a() - this.f14894m.b();
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            Objects.requireNonNull(this);
            String[] strArr = {String.valueOf(a10)};
            n(f10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new g4.f(this, 5));
            Integer valueOf = Integer.valueOf(f10.delete("events", "timestamp_ms < ?", strArr));
            f10.setTransactionSuccessful();
            f10.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            f10.endTransaction();
            throw th;
        }
    }

    @Override // s6.d
    public void p(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder m10 = a1.a.m("DELETE FROM events WHERE _id in ");
            m10.append(m(iterable));
            f().compileStatement(m10.toString()).execute();
        }
    }

    @Override // s6.d
    public void y(final l6.q qVar, final long j10) {
        i(new b() { // from class: s6.m
            @Override // s6.s.b
            public final Object apply(Object obj) {
                long j11 = j10;
                l6.q qVar2 = qVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j11));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{qVar2.b(), String.valueOf(v6.a.a(qVar2.d()))}) < 1) {
                    contentValues.put("backend_name", qVar2.b());
                    contentValues.put("priority", Integer.valueOf(v6.a.a(qVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // s6.d
    public boolean z(l6.q qVar) {
        Boolean bool;
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            Long h10 = h(f10, qVar);
            if (h10 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h10.toString()});
                Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                rawQuery.close();
                bool = valueOf;
            }
            f10.setTransactionSuccessful();
            f10.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            f10.endTransaction();
            throw th;
        }
    }
}
