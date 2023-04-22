package com.google.firebase;

import a0.a;
import android.content.Context;
import android.os.Build;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import l6.s;
import lc.c;
import qb.b;
import qb.f;
import qb.l;
import s6.o;
import s6.p;
import sc.d;
import sc.g;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements f {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // qb.f
    public List<b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        b.C0250b a10 = b.a(g.class);
        a10.a(new l(d.class, 2, 0));
        a10.d(a.f117c);
        arrayList.add(a10.b());
        int i10 = com.google.firebase.heartbeatinfo.a.f8043b;
        b.C0250b a11 = b.a(HeartBeatInfo.class);
        a11.a(new l(Context.class, 1, 0));
        a11.a(new l(lc.d.class, 2, 0));
        a11.d(c.f12774f);
        arrayList.add(a11.b());
        arrayList.add(sc.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(sc.f.a("fire-core", "20.0.0"));
        arrayList.add(sc.f.a("device-name", a(Build.PRODUCT)));
        arrayList.add(sc.f.a("device-model", a(Build.DEVICE)));
        arrayList.add(sc.f.a("device-brand", a(Build.BRAND)));
        arrayList.add(sc.f.b("android-target-sdk", o.f14873t));
        arrayList.add(sc.f.b("android-min-sdk", s.y));
        arrayList.add(sc.f.b("android-platform", k0.c.E));
        arrayList.add(sc.f.b("android-installer", p.f14880w));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(sc.f.a("kotlin", str));
        }
        return arrayList;
    }
}
