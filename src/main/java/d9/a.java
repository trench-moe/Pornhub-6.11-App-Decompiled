package d9;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import d9.a.d;
import d9.c;
import h9.b;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0121a<?, O> f8853a;

    /* renamed from: b  reason: collision with root package name */
    public final g<?> f8854b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8855c;

    /* renamed from: d9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0121a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, h9.c cVar, O o10, c.a aVar, c.b bVar) {
            return b(context, looper, cVar, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, h9.c cVar, O o10, e9.c cVar2, e9.i iVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8856a = new c(null);

        /* renamed from: d9.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0122a extends d {
            Account b();
        }

        /* loaded from: classes.dex */
        public interface b extends d {
            GoogleSignInAccount a();
        }

        /* loaded from: classes.dex */
        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(a0.b bVar) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        Set<Scope> a();

        void connect(b.c cVar);

        void disconnect(String str);

        c9.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(h9.h hVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(b.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0121a<C, O> abstractC0121a, g<C> gVar) {
        this.f8855c = str;
        this.f8853a = abstractC0121a;
        this.f8854b = gVar;
    }
}
