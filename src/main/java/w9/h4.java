package w9;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h4 implements k4 {

    /* renamed from: g  reason: collision with root package name */
    public static final Map f17173g = new p.a();

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f17174h = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f17175a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f17176b;

    /* renamed from: c  reason: collision with root package name */
    public final ContentObserver f17177c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Map f17178e;

    /* renamed from: f  reason: collision with root package name */
    public final List f17179f;

    public h4(ContentResolver contentResolver, Uri uri) {
        g4 g4Var = new g4(this);
        this.f17177c = g4Var;
        this.d = new Object();
        this.f17179f = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f17175a = contentResolver;
        this.f17176b = uri;
        contentResolver.registerContentObserver(uri, false, g4Var);
    }

    public static h4 b(ContentResolver contentResolver, Uri uri) {
        h4 h4Var;
        synchronized (h4.class) {
            Map map = f17173g;
            h4Var = (h4) ((p.g) map).get(uri);
            if (h4Var == null) {
                try {
                    h4 h4Var2 = new h4(contentResolver, uri);
                    try {
                        ((p.g) map).put(uri, h4Var2);
                    } catch (SecurityException unused) {
                    }
                    h4Var = h4Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return h4Var;
    }

    public static synchronized void d() {
        synchronized (h4.class) {
            try {
                for (h4 h4Var : ((p.a) f17173g).values()) {
                    h4Var.f17175a.unregisterContentObserver(h4Var.f17177c);
                }
                ((p.g) f17173g).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w9.k4
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) c().get(str);
    }

    public final Map c() {
        Map map;
        Map map2 = this.f17178e;
        if (map2 == null) {
            synchronized (this.d) {
                map2 = this.f17178e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) com.google.android.gms.internal.measurement.b.a(new d3.d(this, 7));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f17178e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }
}
