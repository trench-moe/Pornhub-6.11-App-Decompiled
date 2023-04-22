package c7;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l7.c0;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3801c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: f  reason: collision with root package name */
    public static final Constructor<? extends h> f3802f;

    static {
        Constructor<? extends h> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f3802f = constructor;
    }

    public final void a(int i10, List<h> list) {
        switch (i10) {
            case 0:
                list.add(new l7.a());
                return;
            case 1:
                list.add(new l7.c());
                return;
            case 2:
                list.add(new l7.e(0));
                return;
            case 3:
                list.add(new d7.a(0));
                return;
            case 4:
                Constructor<? extends h> constructor = f3802f;
                if (constructor == null) {
                    list.add(new e7.b(0));
                    return;
                }
                try {
                    list.add(constructor.newInstance(0));
                    return;
                } catch (Exception e10) {
                    throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                }
            case 5:
                list.add(new f7.a());
                return;
            case 6:
                list.add(new h7.d(0));
                return;
            case 7:
                list.add(new i7.d(0));
                return;
            case 8:
                list.add(new j7.e(0));
                list.add(new j7.g(0));
                return;
            case 9:
                list.add(new k7.c());
                return;
            case 10:
                list.add(new l7.w());
                return;
            case 11:
                list.add(new c0(1, 0, 112800));
                return;
            case 12:
                list.add(new m7.a());
                return;
            case 13:
                return;
            case 14:
                list.add(new g7.a());
                return;
            default:
                return;
        }
    }

    @Override // c7.l
    public synchronized h[] f(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        try {
            arrayList = new ArrayList(14);
            int P = cb.e.P(map);
            if (P != -1) {
                a(P, arrayList);
            }
            int Q = cb.e.Q(uri);
            if (Q != -1 && Q != P) {
                a(Q, arrayList);
            }
            for (int i10 : f3801c) {
                if (i10 != P && i10 != Q) {
                    a(i10, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }
}
