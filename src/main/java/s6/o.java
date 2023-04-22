package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.JsonReader;
import com.appsflyer.oaid.BuildConfig;
import java.util.Map;
import s6.s;
import sc.f;
import yb.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements s.b, c7.l, jb.f, f.a, a.InterfaceC0311a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ o f14870f = new o(1);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ o f14871j = new o(2);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ o f14872m = new o(6);
    public static final /* synthetic */ o n = new o(7);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ o f14873t = new o(11);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14874c;

    public /* synthetic */ o(int i10) {
        this.f14874c = i10;
    }

    @Override // sc.f.a
    public String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.FLAVOR;
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        switch (this.f14874c) {
            case 0:
                Cursor cursor = (Cursor) obj;
                i6.b bVar = s.f14890t;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            default:
                Cursor cursor2 = (Cursor) obj;
                i6.b bVar2 = s.f14890t;
                if (cursor2.moveToNext()) {
                    return Long.valueOf(cursor2.getLong(0));
                }
                return null;
        }
    }

    @Override // jb.f
    /* renamed from: apply  reason: collision with other method in class */
    public boolean mo1631apply(Object obj) {
        return !(obj instanceof c8.b);
    }

    public c7.h[] b() {
        switch (this.f14874c) {
            case 4:
                return new c7.h[]{new d7.a()};
            case 5:
                return new c7.h[]{new h7.d(0)};
            case 6:
                return new c7.h[]{new j7.g(0)};
            default:
                return new c7.h[]{new l7.a()};
        }
    }

    @Override // yb.a.InterfaceC0311a
    public Object c(JsonReader jsonReader) {
        switch (this.f14874c) {
            case 12:
                return yb.a.b(jsonReader);
            default:
                return yb.a.a(jsonReader);
        }
    }

    @Override // c7.l
    public c7.h[] f(Uri uri, Map map) {
        switch (this.f14874c) {
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return b();
            default:
                return b();
        }
    }
}
