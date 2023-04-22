package s6;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.FirebaseCommonRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import l6.i;
import l6.q;
import s6.s;
import sc.f;
import t7.g;
import yb.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements s.b, c7.l, g.a, f.a, a.InterfaceC0311a, i6.d {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ p f14875f = new p(2);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ p f14876j = new p(5);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ p f14877m = new p(6);
    public static final /* synthetic */ p n = new p(7);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ p f14878t = new p(8);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ p f14879u = new p(9);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ p f14880w = new p(10);
    public static final /* synthetic */ p y = new p(11);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ p f14881z = new p(12);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14882c;

    public /* synthetic */ p(int i10) {
        this.f14882c = i10;
    }

    @Override // sc.f.a
    public String a(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : BuildConfig.FLAVOR;
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        switch (this.f14882c) {
            case 0:
                i6.b bVar = s.f14890t;
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    i6.b bVar2 = s.f14890t;
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        q.a a10 = l6.q.a();
                        a10.b(rawQuery.getString(1));
                        a10.c(v6.a.b(rawQuery.getInt(2)));
                        String string = rawQuery.getString(3);
                        i.b bVar3 = (i.b) a10;
                        bVar3.f12293b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(bVar3.a());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 1:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                return bc.a.f3637b.h((xb.a0) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // t7.g.a
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        g.a aVar = i7.d.f10551u;
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @Override // yb.a.InterfaceC0311a
    public Object c(JsonReader jsonReader) {
        gc.a aVar = yb.a.f18630a;
        jsonReader.beginObject();
        String str = null;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            if (nextName.equals("filename")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null filename");
            } else if (nextName.equals("contents")) {
                bArr = Base64.decode(jsonReader.nextString(), 2);
                Objects.requireNonNull(bArr, "Null contents");
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " filename" : BuildConfig.FLAVOR;
        if (bArr == null) {
            str2 = a1.a.l(str2, " contents");
        }
        if (str2.isEmpty()) {
            return new xb.f(str, bArr, null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str2));
    }

    public c7.h[] d() {
        switch (this.f14882c) {
            case 6:
                return new c7.h[]{new f7.a()};
            case 7:
            default:
                return new c7.h[]{new m7.a()};
            case 8:
                return new c7.h[]{new k7.c()};
        }
    }

    @Override // c7.l
    public c7.h[] f(Uri uri, Map map) {
        switch (this.f14882c) {
            case 6:
                return d();
            case 7:
            default:
                return d();
            case 8:
                return d();
        }
    }
}
