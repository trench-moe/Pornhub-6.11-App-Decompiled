package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.z;
import java.util.UUID;

/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.k, b0, androidx.savedstate.c {

    /* renamed from: c  reason: collision with root package name */
    public final Context f2666c;

    /* renamed from: f  reason: collision with root package name */
    public final m f2667f;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f2668j;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.l f2669m;
    public final androidx.savedstate.b n;

    /* renamed from: t  reason: collision with root package name */
    public final UUID f2670t;

    /* renamed from: u  reason: collision with root package name */
    public Lifecycle.State f2671u;

    /* renamed from: w  reason: collision with root package name */
    public Lifecycle.State f2672w;
    public k y;

    /* renamed from: z  reason: collision with root package name */
    public z.b f2673z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2674a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f2674a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2674a[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2674a[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2674a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2674a[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2674a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2674a[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public i(Context context, m mVar, Bundle bundle, androidx.lifecycle.k kVar, k kVar2) {
        this(context, mVar, bundle, kVar, kVar2, UUID.randomUUID(), null);
    }

    public i(Context context, m mVar, Bundle bundle, androidx.lifecycle.k kVar, k kVar2, UUID uuid, Bundle bundle2) {
        this.f2669m = new androidx.lifecycle.l(this);
        androidx.savedstate.b bVar = new androidx.savedstate.b(this);
        this.n = bVar;
        this.f2671u = Lifecycle.State.CREATED;
        this.f2672w = Lifecycle.State.RESUMED;
        this.f2666c = context;
        this.f2670t = uuid;
        this.f2667f = mVar;
        this.f2668j = bundle;
        this.y = kVar2;
        bVar.a(bundle2);
        if (kVar != null) {
            this.f2671u = ((androidx.lifecycle.l) kVar.b()).f2375b;
        }
    }

    public z.b a() {
        if (this.f2673z == null) {
            this.f2673z = new androidx.lifecycle.w((Application) this.f2666c.getApplicationContext(), this, this.f2668j);
        }
        return this.f2673z;
    }

    @Override // androidx.lifecycle.k
    public Lifecycle b() {
        return this.f2669m;
    }

    public void d() {
        if (this.f2671u.ordinal() < this.f2672w.ordinal()) {
            this.f2669m.i(this.f2671u);
        } else {
            this.f2669m.i(this.f2672w);
        }
    }

    @Override // androidx.lifecycle.b0
    public a0 j() {
        k kVar = this.y;
        if (kVar != null) {
            UUID uuid = this.f2670t;
            a0 a0Var = kVar.f2679c.get(uuid);
            if (a0Var == null) {
                a0Var = new a0();
                kVar.f2679c.put(uuid, a0Var);
            }
            return a0Var;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @Override // androidx.savedstate.c
    public androidx.savedstate.a l() {
        return this.n.f3134b;
    }
}
