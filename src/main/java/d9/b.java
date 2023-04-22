package d9;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d9.a;
import d9.a.d;
import e9.d0;
import e9.i0;
import e9.m;
import e9.q;
import e9.v0;
import h9.c;
import h9.o;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public abstract class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8857a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8858b;

    /* renamed from: c  reason: collision with root package name */
    public final d9.a<O> f8859c;
    public final O d;

    /* renamed from: e  reason: collision with root package name */
    public final e9.a<O> f8860e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f8861f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8862g;
    @NotOnlyInitialized

    /* renamed from: h  reason: collision with root package name */
    public final c f8863h;

    /* renamed from: i  reason: collision with root package name */
    public final x.c f8864i;

    /* renamed from: j  reason: collision with root package name */
    public final e9.d f8865j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f8866c = new a(new x.c(), null, Looper.getMainLooper());

        /* renamed from: a  reason: collision with root package name */
        public final x.c f8867a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f8868b;

        public a(x.c cVar, Account account, Looper looper) {
            this.f8867a = cVar;
            this.f8868b = looper;
        }
    }

    public b(Context context, Activity activity, d9.a<O> aVar, O o10, a aVar2) {
        o.i(context, "Null context is not permitted.");
        o.i(aVar, "Api must not be null.");
        o.i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f8857a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f8858b = str;
        this.f8859c = aVar;
        this.d = o10;
        this.f8861f = aVar2.f8868b;
        e9.a<O> aVar3 = new e9.a<>(aVar, o10, str);
        this.f8860e = aVar3;
        this.f8863h = new d0(this);
        e9.d h10 = e9.d.h(this.f8857a);
        this.f8865j = h10;
        this.f8862g = h10.f9175w.getAndIncrement();
        this.f8864i = aVar2.f8867a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            e9.f b10 = LifecycleCallback.b(activity);
            q qVar = (q) b10.f("ConnectionlessLifecycleHelper", q.class);
            if (qVar == null) {
                Object obj = c9.e.f3872c;
                qVar = new q(b10, h10, c9.e.d);
            }
            qVar.f9243t.add(aVar3);
            h10.a(qVar);
        }
        Handler handler = h10.D;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public b(Context context, d9.a<O> aVar, O o10, a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }

    public c.a a() {
        Set<Scope> emptySet;
        GoogleSignInAccount a10;
        c.a aVar = new c.a();
        O o10 = this.d;
        if (!(o10 instanceof a.d.b) || (a10 = ((a.d.b) o10).a()) == null) {
            O o11 = this.d;
            r3 = o11 instanceof a.d.InterfaceC0122a ? ((a.d.InterfaceC0122a) o11).b() : null;
        } else {
            String str = a10.f6776m;
            if (str != null) {
                r3 = new Account(str, "com.google");
            }
        }
        aVar.f10289a = r3;
        O o12 = this.d;
        if (o12 instanceof a.d.b) {
            GoogleSignInAccount a11 = ((a.d.b) o12).a();
            emptySet = a11 == null ? Collections.emptySet() : a11.p0();
        } else {
            emptySet = Collections.emptySet();
        }
        if (aVar.f10290b == null) {
            aVar.f10290b = new p.c<>(0);
        }
        aVar.f10290b.addAll(emptySet);
        aVar.d = this.f8857a.getClass().getName();
        aVar.f10291c = this.f8857a.getPackageName();
        return aVar;
    }

    public final <TResult, A extends a.b> ea.g<TResult> b(int i10, m<A, TResult> mVar) {
        ea.h hVar = new ea.h();
        e9.d dVar = this.f8865j;
        x.c cVar = this.f8864i;
        Objects.requireNonNull(dVar);
        dVar.g(hVar, mVar.f9223c, this);
        v0 v0Var = new v0(i10, mVar, hVar, cVar);
        Handler handler = dVar.D;
        handler.sendMessage(handler.obtainMessage(4, new i0(v0Var, dVar.y.get(), this)));
        return hVar.f9273a;
    }
}
