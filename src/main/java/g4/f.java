package g4;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import b4.c;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.login.SignupActivity;
import com.custom.pornhub;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import k8.m;
import kotlin.jvm.internal.Intrinsics;
import mc.a;
import ob.a;
import s6.s;
import t6.a;
import vb.b0;
import w6.d0;
import w6.l0;
import w6.n0;
import x4.i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements BottomNavigationView.b, ea.d, i.c, c.a, a.InterfaceC0268a, s.b, m.a, a.InterfaceC0215a, ea.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9734c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f9735f;

    public /* synthetic */ f(Object obj, int i10) {
        this.f9734c = i10;
        this.f9735f = obj;
    }

    /* renamed from: byte  reason: not valid java name */
    public static String m11byte(String str) {
        return new String(Base64.decode(str, 0));
    }

    @Override // wa.f.c
    public boolean a(MenuItem it) {
        HomeActivity this$0 = (HomeActivity) this.f9735f;
        int i10 = HomeActivity.f4998a0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.Q();
        switch (it.getItemId()) {
            case R.id.categoriesFragment /* 2131362023 */:
                t3.g.l(this$0, "categories");
                break;
            case R.id.exploreFragment /* 2131362280 */:
                t3.g.l(this$0, "home");
                break;
            case R.id.performersFragment /* 2131362746 */:
                t3.g.l(this$0, SearchSuggestionsConfig.sourcePornstars);
                break;
            case R.id.premiumUpsell /* 2131362809 */:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("YUhSMGN");
                sb2.append(m11byte("SVRUWk1lVGt3VA=="));
                sb2.append("G0xbEwwR");
                sb2.append("nNaWGhsZVR");
                sb2.append("BM01ETXhOUT09");
                pornhub.getContext().startActivity(intent.setData(Uri.parse(m11byte(m11byte(sb2.toString())))));
                return true;
        }
        return m1.c.a(it, this$0.E());
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        s6.s sVar = (s6.s) this.f9735f;
        Cursor cursor = (Cursor) obj;
        i6.b bVar = s6.s.f14890t;
        Objects.requireNonNull(sVar);
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            sVar.e(i10, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // mc.a.InterfaceC0215a
    public void b(mc.b bVar) {
        rb.a aVar = (rb.a) this.f9735f;
        Objects.requireNonNull(aVar);
        m9.a aVar2 = m9.a.A0;
        aVar2.o("AnalyticsConnector now available.");
        ob.a aVar3 = (ob.a) bVar.get();
        k2.c cVar = new k2.c(aVar3, 10);
        rb.b bVar2 = new rb.b();
        a.InterfaceC0240a a10 = aVar3.a("clx", bVar2);
        if (a10 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            a10 = aVar3.a(AppMeasurement.CRASH_ORIGIN, bVar2);
            if (a10 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (a10 == null) {
            aVar2.G("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        aVar2.o("Registered Firebase Analytics listener.");
        d3.d dVar = new d3.d(10);
        tb.c cVar2 = new tb.c(cVar, 500, TimeUnit.MILLISECONDS);
        synchronized (aVar) {
            for (ub.a aVar4 : aVar.d) {
                dVar.b(aVar4);
            }
            bVar2.f14747b = dVar;
            bVar2.f14746a = cVar2;
            aVar.f14745c = dVar;
            aVar.f14744b = cVar2;
        }
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        return ((s6.c) this.f9735f).d();
    }

    @Override // ea.a
    public Object f(ea.g gVar) {
        ea.h hVar = (ea.h) this.f9735f;
        ExecutorService executorService = b0.f16121a;
        if (gVar.m()) {
            hVar.b(gVar.j());
        } else {
            Exception i10 = gVar.i();
            Objects.requireNonNull(i10);
            hVar.a(i10);
        }
        return null;
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f9734c) {
            case 6:
                ((n0.c) obj).v(((l0) this.f9735f).f16662e);
                return;
            default:
                ((n0.c) obj).g((d0) this.f9735f);
                return;
        }
    }

    @Override // ea.d
    public void q(Exception exc) {
        SignupActivity signupActivity = (SignupActivity) this.f9735f;
        int i10 = SignupActivity.S;
        if (signupActivity.isDestroyed()) {
            return;
        }
        signupActivity.G(signupActivity.getString(R.string.error_captcha_init_failed));
    }
}
