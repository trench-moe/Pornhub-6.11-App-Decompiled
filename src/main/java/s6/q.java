package s6;

import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.drm.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import l6.i;
import l6.q;
import s6.s;
import t7.g;
import xb.b0;
import yb.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements s.b, k8.e, c7.l, g.a, a.InterfaceC0311a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ q f14883c = new q();

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ q f14884f = new q();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ q f14885j = new q();

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ q f14886m = new q();
    public static final /* synthetic */ q n = new q();

    public c7.h[] a() {
        return new c7.h[]{new j7.e(0)};
    }

    @Override // k8.e
    public void accept(Object obj) {
        ((c.a) obj).c();
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        i6.b bVar = s.f14890t;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            q.a a10 = l6.q.a();
            a10.b(cursor.getString(1));
            a10.c(v6.a.b(cursor.getInt(2)));
            String string = cursor.getString(3);
            i.b bVar2 = (i.b) a10;
            bVar2.f12293b = string == null ? null : Base64.decode(string, 0);
            arrayList.add(bVar2.a());
        }
        return arrayList;
    }

    @Override // t7.g.a
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        g.a aVar = t7.g.f15149f;
        return false;
    }

    @Override // yb.a.InterfaceC0311a
    public Object c(JsonReader jsonReader) {
        gc.a aVar = yb.a.f18630a;
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        b0 b0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b0Var = yb.a.c(jsonReader, l6.s.f12318z);
                    break;
                case 1:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 2:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " name" : BuildConfig.FLAVOR;
        if (num == null) {
            str2 = a1.a.l(str2, " importance");
        }
        if (b0Var == null) {
            str2 = a1.a.l(str2, " frames");
        }
        if (str2.isEmpty()) {
            return new xb.q(str, num.intValue(), b0Var, null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str2));
    }

    @Override // c7.l
    public c7.h[] f(Uri uri, Map map) {
        return a();
    }
}
