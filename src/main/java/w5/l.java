package w5;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.bumptech.glide.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class l implements Handler.Callback {

    /* renamed from: z  reason: collision with root package name */
    public static final b f16407z = new a();

    /* renamed from: c  reason: collision with root package name */
    public volatile com.bumptech.glide.g f16408c;

    /* renamed from: m  reason: collision with root package name */
    public final Handler f16411m;
    public final b n;
    public final g y;

    /* renamed from: f  reason: collision with root package name */
    public final Map<FragmentManager, k> f16409f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final Map<y, q> f16410j = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    public final p.a<View, Fragment> f16412t = new p.a<>();

    /* renamed from: u  reason: collision with root package name */
    public final p.a<View, android.app.Fragment> f16413u = new p.a<>();

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f16414w = new Bundle();

    /* loaded from: classes2.dex */
    public class a implements b {
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public l(b bVar, com.bumptech.glide.e eVar) {
        this.n = bVar == null ? f16407z : bVar;
        this.f16411m = new Handler(Looper.getMainLooper(), this);
        this.y = (q5.n.f14386h && q5.n.f14385g) ? eVar.f5650a.containsKey(c.e.class) ? new f() : new r3.c() : new b7.k();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(Collection<Fragment> collection, Map<View, Fragment> map) {
        View view;
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && (view = fragment.W) != null) {
                map.put(view, fragment);
                c(fragment.p().M(), map);
            }
        }
    }

    public static boolean k(Context context) {
        Activity a10 = a(context);
        return a10 == null || !a10.isFinishing();
    }

    @TargetApi(26)
    @Deprecated
    public final void b(FragmentManager fragmentManager, p.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            this.f16414w.putInt("key", i10);
            android.app.Fragment fragment2 = null;
            try {
                fragment2 = fragmentManager.getFragment(this.f16414w, "key");
            } catch (Exception unused) {
            }
            if (fragment2 == null) {
                return;
            }
            if (fragment2.getView() != null) {
                aVar.put(fragment2.getView(), fragment2);
                b(fragment2.getChildFragmentManager(), aVar);
            }
            i10 = i11;
        }
    }

    @Deprecated
    public final com.bumptech.glide.g d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        k i10 = i(fragmentManager, fragment);
        com.bumptech.glide.g gVar = i10.f16404m;
        if (gVar == null) {
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            b bVar = this.n;
            w5.a aVar = i10.f16401c;
            m mVar = i10.f16402f;
            Objects.requireNonNull((a) bVar);
            com.bumptech.glide.g gVar2 = new com.bumptech.glide.g(b10, aVar, mVar, context);
            if (z10) {
                gVar2.m();
            }
            i10.f16404m = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public com.bumptech.glide.g e(Activity activity) {
        if (d6.l.h()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.o) {
            return h((androidx.fragment.app.o) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.y.b(activity);
        return d(activity, activity.getFragmentManager(), null, k(activity));
    }

    public com.bumptech.glide.g f(Context context) {
        if (context != null) {
            if (d6.l.i() && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.o) {
                    return h((androidx.fragment.app.o) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f16408c == null) {
                synchronized (this) {
                    if (this.f16408c == null) {
                        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.n;
                        cb.e eVar = new cb.e();
                        a0.b bVar2 = new a0.b();
                        Context applicationContext = context.getApplicationContext();
                        Objects.requireNonNull((a) bVar);
                        this.f16408c = new com.bumptech.glide.g(b10, eVar, bVar2, applicationContext);
                    }
                }
            }
            return this.f16408c;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public com.bumptech.glide.g g(Fragment fragment) {
        Objects.requireNonNull(fragment.q(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (d6.l.h()) {
            return f(fragment.q().getApplicationContext());
        }
        if (fragment.n() != null) {
            this.y.b(fragment.n());
        }
        return l(fragment.q(), fragment.p(), fragment, fragment.P());
    }

    public com.bumptech.glide.g h(androidx.fragment.app.o oVar) {
        if (d6.l.h()) {
            return f(oVar.getApplicationContext());
        }
        if (oVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.y.b(oVar);
        return l(oVar, oVar.u(), null, k(oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f A[ADDED_TO_REGION] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleMessage(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.l.handleMessage(android.os.Message):boolean");
    }

    public final k i(FragmentManager fragmentManager, android.app.Fragment fragment) {
        k kVar = this.f16409f.get(fragmentManager);
        if (kVar == null) {
            k kVar2 = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (kVar2 == null) {
                kVar2 = new k();
                kVar2.f16405t = fragment;
                if (fragment != null && fragment.getActivity() != null) {
                    kVar2.a(fragment.getActivity());
                }
                this.f16409f.put(fragmentManager, kVar2);
                fragmentManager.beginTransaction().add(kVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f16411m.obtainMessage(1, fragmentManager).sendToTarget();
            }
            kVar = kVar2;
        }
        return kVar;
    }

    public final q j(y yVar, Fragment fragment) {
        q qVar = this.f16410j.get(yVar);
        if (qVar == null) {
            q qVar2 = (q) yVar.I("com.bumptech.glide.manager");
            if (qVar2 == null) {
                qVar2 = new q();
                qVar2.f16439s0 = fragment;
                if (fragment != null) {
                    if (fragment.q() != null) {
                        Fragment fragment2 = fragment;
                        while (true) {
                            Fragment fragment3 = fragment2.L;
                            if (fragment3 == null) {
                                break;
                            }
                            fragment2 = fragment3;
                        }
                        y yVar2 = fragment2.I;
                        if (yVar2 != null) {
                            qVar2.L0(fragment.q(), yVar2);
                        }
                    }
                    this.f16410j.put(yVar, qVar2);
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                    aVar.g(0, qVar2, "com.bumptech.glide.manager", 1);
                    aVar.l();
                    this.f16411m.obtainMessage(2, yVar).sendToTarget();
                }
                this.f16410j.put(yVar, qVar2);
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(yVar);
                aVar2.g(0, qVar2, "com.bumptech.glide.manager", 1);
                aVar2.l();
                this.f16411m.obtainMessage(2, yVar).sendToTarget();
            }
            return qVar2;
        }
        return qVar;
    }

    public final com.bumptech.glide.g l(Context context, y yVar, Fragment fragment, boolean z10) {
        q j10 = j(yVar, fragment);
        com.bumptech.glide.g gVar = j10.f16438r0;
        if (gVar == null) {
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            b bVar = this.n;
            w5.a aVar = j10.f16434n0;
            m mVar = j10.f16435o0;
            Objects.requireNonNull((a) bVar);
            com.bumptech.glide.g gVar2 = new com.bumptech.glide.g(b10, aVar, mVar, context);
            if (z10) {
                gVar2.m();
            }
            j10.f16438r0 = gVar2;
            return gVar2;
        }
        return gVar;
    }
}
