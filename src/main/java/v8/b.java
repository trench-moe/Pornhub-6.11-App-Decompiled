package v8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.framework.zzat;
import e9.m;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import t9.b1;
import t9.v0;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: i  reason: collision with root package name */
    public static final a9.b f16060i = new a9.b("CastContext");

    /* renamed from: j  reason: collision with root package name */
    public static final Object f16061j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static b f16062k;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16063a;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f16064b;

    /* renamed from: c  reason: collision with root package name */
    public final g f16065c;
    public final f0 d;

    /* renamed from: e  reason: collision with root package name */
    public final c f16066e;

    /* renamed from: f  reason: collision with root package name */
    public final t9.f f16067f;

    /* renamed from: g  reason: collision with root package name */
    public final List<i> f16068g;

    /* renamed from: h  reason: collision with root package name */
    public b1 f16069h;

    public b(Context context, c cVar, List<i> list, t9.f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16063a = applicationContext;
        this.f16066e = cVar;
        this.f16067f = fVar;
        this.f16068g = list;
        this.f16069h = !TextUtils.isEmpty(cVar.f16070c) ? new b1(applicationContext, cVar, fVar) : null;
        HashMap hashMap = new HashMap();
        b1 b1Var = this.f16069h;
        if (b1Var != null) {
            hashMap.put(b1Var.f16099b, b1Var.f16100c);
        }
        if (list != null) {
            for (i iVar : list) {
                h9.o.i(iVar, "Additional SessionProvider must not be null.");
                String str = iVar.f16099b;
                h9.o.f(str, "Category for SessionProvider must not be null or empty string.");
                h9.o.b(!hashMap.containsKey(str), String.format("SessionProvider for category %s already added", str));
                hashMap.put(str, iVar.f16100c);
            }
        }
        try {
            Context context2 = this.f16063a;
            k0 R = v0.a(context2).R(new n9.b(context2.getApplicationContext()), cVar, fVar, hashMap);
            this.f16064b = R;
            try {
                this.d = new f0(R.e());
                try {
                    t b10 = R.b();
                    Context context3 = this.f16063a;
                    g gVar = new g(b10, context3);
                    this.f16065c = gVar;
                    new a9.x(context3);
                    h9.o.f("PrecacheManager", "The log tag cannot be null or empty.");
                    t9.g gVar2 = fVar.f15209c;
                    if (gVar2 != null) {
                        gVar2.f15215c = gVar;
                    }
                    a9.x xVar = new a9.x(this.f16063a);
                    m.a aVar = new m.a();
                    aVar.f9224a = new y5.c(xVar, new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"});
                    aVar.f9226c = new c9.d[]{u8.z.f15768b};
                    aVar.f9225b = false;
                    aVar.d = 8425;
                    Object b11 = xVar.b(0, aVar.a());
                    sc.c cVar2 = new sc.c(this, 7);
                    ea.u uVar = (ea.u) b11;
                    Objects.requireNonNull(uVar);
                    Executor executor = ea.i.f9274a;
                    uVar.e(executor, cVar2);
                    a9.x xVar2 = new a9.x(this.f16063a);
                    m.a aVar2 = new m.a();
                    aVar2.f9224a = new hf.c(xVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                    aVar2.f9226c = new c9.d[]{u8.z.d};
                    aVar2.f9225b = false;
                    aVar2.d = 8427;
                    Object b12 = xVar2.b(0, aVar2.a());
                    e.p pVar = new e.p(this);
                    ea.u uVar2 = (ea.u) b12;
                    Objects.requireNonNull(uVar2);
                    uVar2.e(executor, pVar);
                } catch (RemoteException e10) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e10);
                }
            } catch (RemoteException e11) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e11);
            }
        } catch (RemoteException e12) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e12);
        }
    }

    public static b c(Context context) {
        h9.o.d("Must be called from the main thread.");
        if (f16062k == null) {
            synchronized (f16061j) {
                if (f16062k == null) {
                    e e10 = e(context.getApplicationContext());
                    c castOptions = e10.getCastOptions(context.getApplicationContext());
                    try {
                        f16062k = new b(context, castOptions, e10.getAdditionalSessionProviders(context.getApplicationContext()), new t9.f(j1.l.d(context), castOptions));
                    } catch (zzat e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
        }
        return f16062k;
    }

    public static b d(Context context) {
        h9.o.d("Must be called from the main thread.");
        try {
            return c(context);
        } catch (RuntimeException e10) {
            a9.b bVar = f16060i;
            Log.e(bVar.f254a, bVar.e("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e10));
            return null;
        }
    }

    public static e e(Context context) {
        try {
            Bundle bundle = m9.c.a(context).a(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f16060i.c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            throw new IllegalStateException("Failed to initialize CastContext.", e10);
        }
    }

    public c a() {
        h9.o.d("Must be called from the main thread.");
        return this.f16066e;
    }

    public g b() {
        h9.o.d("Must be called from the main thread.");
        return this.f16065c;
    }
}
