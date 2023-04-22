package hf;

import a9.i;
import a9.m;
import a9.o;
import a9.w;
import a9.y;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import e9.l;
import ea.h;
import java.util.HashMap;
import java.util.Map;
import t9.v;
import w9.a0;
import w9.c4;
import w9.d4;
import w9.j4;
import w9.m4;

/* loaded from: classes2.dex */
public final class c implements o, l, a0, j4 {

    /* renamed from: c  reason: collision with root package name */
    public final Object f10436c;

    /* renamed from: f  reason: collision with root package name */
    public final Object f10437f;

    public /* synthetic */ c(m mVar, o oVar) {
        this.f10437f = mVar;
        this.f10436c = oVar;
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f10436c = obj;
        this.f10437f = obj2;
    }

    @Override // a9.o
    public void a(long j10) {
        o oVar = (o) this.f10436c;
        if (oVar != null) {
            oVar.a(j10);
        }
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        w wVar = new w((h) obj2);
        i iVar = (i) ((y) obj).getService();
        Parcel a12 = iVar.a1();
        v.d(a12, wVar);
        a12.writeStringArray((String[]) this.f10437f);
        iVar.d1(7, a12);
    }

    @Override // a9.o
    public void b(long j10, int i10, Object obj) {
        ((m) this.f10437f).f285g = null;
        o oVar = (o) this.f10436c;
        if (oVar != null) {
            oVar.b(j10, i10, obj);
        }
    }

    @Override // w9.a0
    public h2.h f(w9.o oVar) {
        h2.h a10 = ((h2.h) this.f10436c).a();
        String str = (String) this.f10437f;
        a10.e(str, oVar);
        ((Map) a10.d).put(str, Boolean.TRUE);
        return a10;
    }

    @Override // w9.j4, w9.x4
    public Object zza() {
        String str;
        String str2 = (String) this.f10437f;
        ContentResolver contentResolver = ((m4) this.f10436c).f17240a.getContentResolver();
        Uri uri = d4.f17102a;
        synchronized (d4.class) {
            if (d4.f17105e == null) {
                d4.d.set(false);
                d4.f17105e = new HashMap();
                d4.f17110j = new Object();
                contentResolver.registerContentObserver(d4.f17102a, true, new c4());
            } else if (d4.d.getAndSet(false)) {
                d4.f17105e.clear();
                d4.f17106f.clear();
                d4.f17107g.clear();
                d4.f17108h.clear();
                d4.f17109i.clear();
                d4.f17110j = new Object();
            }
            Object obj = d4.f17110j;
            str = null;
            if (d4.f17105e.containsKey(str2)) {
                String str3 = (String) d4.f17105e.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = d4.f17111k.length;
                Cursor query = contentResolver.query(d4.f17102a, null, null, new String[]{str2}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            d4.a(obj, str2, string);
                            if (string != null) {
                                str = string;
                            }
                        } else {
                            d4.a(obj, str2, null);
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return str;
    }
}
