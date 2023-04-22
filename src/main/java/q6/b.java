package q6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import i8.j;
import java.util.List;
import java.util.Objects;
import k8.m;
import l6.h;
import l6.l;
import l6.m;
import l6.q;
import s6.s;
import t6.a;
import w7.o;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.InterfaceC0268a, s.b, m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14406c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14407f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14408j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f14409m;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f14406c = i10;
        this.f14407f = obj;
        this.f14408j = obj2;
        this.f14409m = obj3;
    }

    public /* synthetic */ b(s sVar, List list, q qVar) {
        this.f14406c = 2;
        this.f14407f = sVar;
        this.f14409m = list;
        this.f14408j = qVar;
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        switch (this.f14406c) {
            case 1:
                s sVar = (s) this.f14407f;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                i6.b bVar = s.f14890t;
                Objects.requireNonNull(sVar);
                sQLiteDatabase.compileStatement((String) this.f14408j).execute();
                Cursor rawQuery = sQLiteDatabase.rawQuery((String) this.f14409m, null);
                while (rawQuery.moveToNext()) {
                    try {
                        sVar.e(rawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            default:
                s sVar2 = (s) this.f14407f;
                List list = (List) this.f14409m;
                q qVar = (q) this.f14408j;
                Cursor cursor = (Cursor) obj;
                i6.b bVar2 = s.f14890t;
                Objects.requireNonNull(sVar2);
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    boolean z10 = cursor.getInt(7) != 0;
                    m.a a10 = l6.m.a();
                    a10.f(cursor.getString(1));
                    a10.e(cursor.getLong(2));
                    a10.g(cursor.getLong(3));
                    if (z10) {
                        String string = cursor.getString(4);
                        a10.d(new l(string == null ? s.f14890t : new i6.b(string), cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        a10.d(new l(string2 == null ? s.f14890t : new i6.b(string2), (byte[]) s.n(sVar2.f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), k0.c.f11744t)));
                    }
                    if (!cursor.isNull(6)) {
                        ((h.b) a10).f12285b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new s6.b(j10, qVar, a10.b()));
                }
                return null;
        }
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        c cVar = (c) this.f14407f;
        q qVar = (q) this.f14408j;
        cVar.d.R(qVar, (l6.m) this.f14409m);
        cVar.f14411a.b(qVar, 1);
        return null;
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f14406c) {
            case 3:
                ((c0) obj).i((c0.a) this.f14407f, (o) this.f14408j, (j) this.f14409m);
                return;
            default:
                ((c0) obj).C((c0.a) this.f14407f, (w7.c) this.f14408j, (w7.d) this.f14409m);
                return;
        }
    }
}
