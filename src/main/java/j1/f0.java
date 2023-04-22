package j1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import j1.h;
import j1.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f0 extends h implements ServiceConnection {

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f11177q = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* renamed from: i  reason: collision with root package name */
    public final ComponentName f11178i;

    /* renamed from: j  reason: collision with root package name */
    public final d f11179j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<c> f11180k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11181l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11182m;
    public a n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11183o;

    /* renamed from: p  reason: collision with root package name */
    public b f11184p;

    /* loaded from: classes2.dex */
    public final class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f11185a;

        /* renamed from: b  reason: collision with root package name */
        public final e f11186b;

        /* renamed from: c  reason: collision with root package name */
        public final Messenger f11187c;

        /* renamed from: f  reason: collision with root package name */
        public int f11189f;

        /* renamed from: g  reason: collision with root package name */
        public int f11190g;
        public int d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f11188e = 1;

        /* renamed from: h  reason: collision with root package name */
        public final SparseArray<l.d> f11191h = new SparseArray<>();

        /* renamed from: j1.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0161a implements Runnable {
            public RunnableC0161a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                f0 f0Var = f0.this;
                if (f0Var.n == aVar) {
                    if (f0.f11177q) {
                        Log.d("MediaRouteProviderProxy", f0Var + ": Service connection died");
                    }
                    f0Var.t();
                }
            }
        }

        public a(Messenger messenger) {
            this.f11185a = messenger;
            e eVar = new e(this);
            this.f11186b = eVar;
            this.f11187c = new Messenger(eVar);
        }

        public void a(int i10) {
            int i11 = this.d;
            this.d = i11 + 1;
            b(5, i11, i10, null, null);
        }

        public final boolean b(int i10, int i11, int i12, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = i11;
            obtain.arg2 = i12;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.f11187c;
            try {
                this.f11185a.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e10) {
                if (i10 != 2) {
                    Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
                }
                return false;
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            f0.this.f11179j.post(new RunnableC0161a());
        }

        public void c(j1.g gVar) {
            int i10 = this.d;
            this.d = i10 + 1;
            b(10, i10, 0, gVar != null ? gVar.f11211a : null, null);
        }

        public void d(int i10, int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i11);
            int i12 = this.d;
            this.d = i12 + 1;
            b(7, i12, i10, null, bundle);
        }

        public void e(int i10, int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i11);
            int i12 = this.d;
            this.d = i12 + 1;
            b(6, i12, i10, null, bundle);
        }

        public void f(int i10, int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i11);
            int i12 = this.d;
            this.d = i12 + 1;
            b(8, i12, i10, null, bundle);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(a aVar);

        int b();

        void c();
    }

    /* loaded from: classes2.dex */
    public static final class d extends Handler {
    }

    /* loaded from: classes2.dex */
    public static final class e extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<a> f11194a;

        public e(a aVar) {
            this.f11194a = new WeakReference<>(aVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f11194a.get();
            if (aVar != null) {
                int i10 = message.what;
                int i11 = message.arg1;
                int i12 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                int i13 = 0;
                switch (i10) {
                    case 0:
                        if (i11 == aVar.f11190g) {
                            aVar.f11190g = 0;
                            f0 f0Var = f0.this;
                            if (f0Var.n == aVar) {
                                if (f0.f11177q) {
                                    Log.d("MediaRouteProviderProxy", f0Var + ": Service connection error - Registration failed");
                                }
                                f0Var.z();
                            }
                        }
                        l.d dVar = aVar.f11191h.get(i11);
                        if (dVar != null) {
                            aVar.f11191h.remove(i11);
                            dVar.a(null, null);
                        }
                        i13 = 1;
                        break;
                    case 1:
                        i13 = 1;
                        break;
                    case 2:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle = (Bundle) obj;
                            if (aVar.f11189f == 0 && i11 == aVar.f11190g && i12 >= 1) {
                                aVar.f11190g = 0;
                                aVar.f11189f = i12;
                                f0.this.v(aVar, j.a(bundle));
                                f0 f0Var2 = f0.this;
                                if (f0Var2.n == aVar) {
                                    f0Var2.f11183o = true;
                                    int size = f0Var2.f11180k.size();
                                    while (i13 < size) {
                                        f0Var2.f11180k.get(i13).a(f0Var2.n);
                                        i13++;
                                    }
                                    j1.g gVar = f0Var2.f11219e;
                                    if (gVar != null) {
                                        f0Var2.n.c(gVar);
                                    }
                                }
                                i13 = 1;
                                break;
                            }
                        }
                        break;
                    case 3:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle2 = (Bundle) obj;
                            l.d dVar2 = aVar.f11191h.get(i11);
                            if (dVar2 != null) {
                                aVar.f11191h.remove(i11);
                                dVar2.b(bundle2);
                                i13 = 1;
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (obj == null || (obj instanceof Bundle)) {
                            String string = peekData != null ? peekData.getString("error") : null;
                            Bundle bundle3 = (Bundle) obj;
                            l.d dVar3 = aVar.f11191h.get(i11);
                            if (dVar3 != null) {
                                aVar.f11191h.remove(i11);
                                dVar3.a(string, bundle3);
                                i13 = 1;
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle4 = (Bundle) obj;
                            if (aVar.f11189f != 0) {
                                f0.this.v(aVar, j.a(bundle4));
                                i13 = 1;
                                break;
                            }
                        }
                        break;
                    case 6:
                        if (!(obj instanceof Bundle)) {
                            Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            break;
                        } else {
                            Bundle bundle5 = (Bundle) obj;
                            l.d dVar4 = aVar.f11191h.get(i11);
                            if (bundle5 != null && bundle5.containsKey("routeId")) {
                                aVar.f11191h.remove(i11);
                                dVar4.b(bundle5);
                                break;
                            } else {
                                dVar4.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                break;
                            }
                        }
                    case 7:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle6 = (Bundle) obj;
                            if (aVar.f11189f != 0) {
                                Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                j1.f b10 = bundle7 != null ? j1.f.b(bundle7) : null;
                                ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                ArrayList arrayList = new ArrayList();
                                Iterator it = parcelableArrayList.iterator();
                                while (it.hasNext()) {
                                    Bundle bundle8 = (Bundle) it.next();
                                    arrayList.add(bundle8 == null ? null : new h.b.C0162b(j1.f.b(bundle8.getBundle("mrDescriptor")), bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false)));
                                }
                                f0 f0Var3 = f0.this;
                                if (f0Var3.n == aVar) {
                                    if (f0.f11177q) {
                                        Log.d("MediaRouteProviderProxy", f0Var3 + ": DynamicRouteDescriptors changed, descriptors=" + arrayList);
                                    }
                                    c u2 = f0Var3.u(i12);
                                    if (u2 instanceof f) {
                                        ((f) u2).l(b10, arrayList);
                                    }
                                }
                                i13 = 1;
                                break;
                            }
                        }
                        break;
                    case 8:
                        f0 f0Var4 = f0.this;
                        if (f0Var4.n == aVar) {
                            c u10 = f0Var4.u(i12);
                            b bVar = f0Var4.f11184p;
                            if (bVar != null && (u10 instanceof h.e)) {
                                h.e eVar = (h.e) u10;
                                l.e eVar2 = (l.e) ((h0) ((g0) bVar).f11214f).f11238b;
                                if (eVar2.f11298r == eVar) {
                                    eVar2.k(eVar2.c(), 2);
                                }
                            }
                            f0Var4.w(u10);
                            break;
                        }
                        break;
                }
                if (i13 == 0 && f0.f11177q) {
                    Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class f extends h.b implements c {

        /* renamed from: f  reason: collision with root package name */
        public final String f11195f;

        /* renamed from: g  reason: collision with root package name */
        public String f11196g;

        /* renamed from: h  reason: collision with root package name */
        public String f11197h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f11198i;

        /* renamed from: k  reason: collision with root package name */
        public int f11200k;

        /* renamed from: l  reason: collision with root package name */
        public a f11201l;

        /* renamed from: j  reason: collision with root package name */
        public int f11199j = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f11202m = -1;

        /* loaded from: classes2.dex */
        public class a extends l.d {
            public a() {
            }

            @Override // j1.l.d
            public void a(String str, Bundle bundle) {
                Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
            }

            @Override // j1.l.d
            public void b(Bundle bundle) {
                f.this.f11196g = bundle.getString("groupableTitle");
                f.this.f11197h = bundle.getString("transferableTitle");
            }
        }

        public f(String str) {
            this.f11195f = str;
        }

        @Override // j1.f0.c
        public void a(a aVar) {
            a aVar2 = new a();
            this.f11201l = aVar;
            String str = this.f11195f;
            int i10 = aVar.f11188e;
            aVar.f11188e = i10 + 1;
            int i11 = aVar.d;
            aVar.d = i11 + 1;
            aVar.b(11, i11, i10, null, android.support.v4.media.b.b("memberRouteId", str));
            aVar.f11191h.put(i11, aVar2);
            this.f11202m = i10;
            if (this.f11198i) {
                aVar.a(i10);
                int i12 = this.f11199j;
                if (i12 >= 0) {
                    aVar.d(this.f11202m, i12);
                    this.f11199j = -1;
                }
                int i13 = this.f11200k;
                if (i13 != 0) {
                    aVar.f(this.f11202m, i13);
                    this.f11200k = 0;
                }
            }
        }

        @Override // j1.f0.c
        public int b() {
            return this.f11202m;
        }

        @Override // j1.f0.c
        public void c() {
            a aVar = this.f11201l;
            if (aVar != null) {
                int i10 = this.f11202m;
                int i11 = aVar.d;
                aVar.d = i11 + 1;
                aVar.b(4, i11, i10, null, null);
                this.f11201l = null;
                this.f11202m = 0;
            }
        }

        @Override // j1.h.e
        public void d() {
            f0 f0Var = f0.this;
            f0Var.f11180k.remove(this);
            c();
            f0Var.A();
        }

        @Override // j1.h.e
        public void e() {
            this.f11198i = true;
            a aVar = this.f11201l;
            if (aVar != null) {
                aVar.a(this.f11202m);
            }
        }

        @Override // j1.h.e
        public void f(int i10) {
            a aVar = this.f11201l;
            if (aVar != null) {
                aVar.d(this.f11202m, i10);
                return;
            }
            this.f11199j = i10;
            this.f11200k = 0;
        }

        @Override // j1.h.e
        public void g() {
            h(0);
        }

        @Override // j1.h.e
        public void h(int i10) {
            this.f11198i = false;
            a aVar = this.f11201l;
            if (aVar != null) {
                aVar.e(this.f11202m, i10);
            }
        }

        @Override // j1.h.e
        public void i(int i10) {
            a aVar = this.f11201l;
            if (aVar != null) {
                aVar.f(this.f11202m, i10);
            } else {
                this.f11200k += i10;
            }
        }

        @Override // j1.h.b
        public String j() {
            return this.f11196g;
        }

        @Override // j1.h.b
        public String k() {
            return this.f11197h;
        }

        @Override // j1.h.b
        public void m(String str) {
            a aVar = this.f11201l;
            if (aVar != null) {
                int i10 = this.f11202m;
                Objects.requireNonNull(aVar);
                Bundle bundle = new Bundle();
                bundle.putString("memberRouteId", str);
                int i11 = aVar.d;
                aVar.d = i11 + 1;
                aVar.b(12, i11, i10, null, bundle);
            }
        }

        @Override // j1.h.b
        public void n(String str) {
            a aVar = this.f11201l;
            if (aVar != null) {
                int i10 = this.f11202m;
                Objects.requireNonNull(aVar);
                Bundle bundle = new Bundle();
                bundle.putString("memberRouteId", str);
                int i11 = aVar.d;
                aVar.d = i11 + 1;
                aVar.b(13, i11, i10, null, bundle);
            }
        }

        @Override // j1.h.b
        public void o(List<String> list) {
            a aVar = this.f11201l;
            if (aVar != null) {
                int i10 = this.f11202m;
                Objects.requireNonNull(aVar);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
                int i11 = aVar.d;
                aVar.d = i11 + 1;
                aVar.b(14, i11, i10, null, bundle);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class g extends h.e implements c {

        /* renamed from: a  reason: collision with root package name */
        public final String f11204a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11205b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11206c;
        public int d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f11207e;

        /* renamed from: f  reason: collision with root package name */
        public a f11208f;

        /* renamed from: g  reason: collision with root package name */
        public int f11209g;

        public g(String str, String str2) {
            this.f11204a = str;
            this.f11205b = str2;
        }

        @Override // j1.f0.c
        public void a(a aVar) {
            this.f11208f = aVar;
            String str = this.f11204a;
            String str2 = this.f11205b;
            int i10 = aVar.f11188e;
            aVar.f11188e = i10 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i11 = aVar.d;
            aVar.d = i11 + 1;
            aVar.b(3, i11, i10, null, bundle);
            this.f11209g = i10;
            if (this.f11206c) {
                aVar.a(i10);
                int i12 = this.d;
                if (i12 >= 0) {
                    aVar.d(this.f11209g, i12);
                    this.d = -1;
                }
                int i13 = this.f11207e;
                if (i13 != 0) {
                    aVar.f(this.f11209g, i13);
                    this.f11207e = 0;
                }
            }
        }

        @Override // j1.f0.c
        public int b() {
            return this.f11209g;
        }

        @Override // j1.f0.c
        public void c() {
            a aVar = this.f11208f;
            if (aVar != null) {
                int i10 = this.f11209g;
                int i11 = aVar.d;
                aVar.d = i11 + 1;
                aVar.b(4, i11, i10, null, null);
                this.f11208f = null;
                this.f11209g = 0;
            }
        }

        @Override // j1.h.e
        public void d() {
            f0 f0Var = f0.this;
            f0Var.f11180k.remove(this);
            c();
            f0Var.A();
        }

        @Override // j1.h.e
        public void e() {
            this.f11206c = true;
            a aVar = this.f11208f;
            if (aVar != null) {
                aVar.a(this.f11209g);
            }
        }

        @Override // j1.h.e
        public void f(int i10) {
            a aVar = this.f11208f;
            if (aVar != null) {
                aVar.d(this.f11209g, i10);
                return;
            }
            this.d = i10;
            this.f11207e = 0;
        }

        @Override // j1.h.e
        public void g() {
            h(0);
        }

        @Override // j1.h.e
        public void h(int i10) {
            this.f11206c = false;
            a aVar = this.f11208f;
            if (aVar != null) {
                aVar.e(this.f11209g, i10);
            }
        }

        @Override // j1.h.e
        public void i(int i10) {
            a aVar = this.f11208f;
            if (aVar != null) {
                aVar.f(this.f11209g, i10);
            } else {
                this.f11207e += i10;
            }
        }
    }

    public f0(Context context, ComponentName componentName) {
        super(context, new h.d(componentName));
        this.f11180k = new ArrayList<>();
        this.f11178i = componentName;
        this.f11179j = new d();
    }

    public final void A() {
        if (x()) {
            r();
        } else {
            z();
        }
    }

    @Override // j1.h
    public h.b l(String str) {
        if (str != null) {
            j jVar = this.f11221g;
            if (jVar != null) {
                List<j1.f> list = jVar.f11255a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.get(i10).i().equals(str)) {
                        f fVar = new f(str);
                        this.f11180k.add(fVar);
                        if (this.f11183o) {
                            fVar.a(this.n);
                        }
                        A();
                        return fVar;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // j1.h
    public h.e m(String str) {
        if (str != null) {
            return s(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // j1.h
    public h.e n(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return s(str, str2);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // j1.h
    public void o(j1.g gVar) {
        if (this.f11183o) {
            this.n.c(gVar);
        }
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onServiceConnected(android.content.ComponentName r12, android.os.IBinder r13) {
        /*
            r11 = this;
            boolean r12 = j1.f0.f11177q
            r10 = 3
            java.lang.String r9 = "MediaRouteProviderProxy"
            r0 = r9
            if (r12 == 0) goto L20
            r10 = 4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r10 = 6
            r12.<init>()
            r10 = 1
            r12.append(r11)
            java.lang.String r1 = ": Connected"
            r12.append(r1)
            java.lang.String r9 = r12.toString()
            r12 = r9
            android.util.Log.d(r0, r12)
        L20:
            r10 = 1
            boolean r12 = r11.f11182m
            if (r12 == 0) goto Lb2
            r11.t()
            r10 = 4
            if (r13 == 0) goto L33
            r10 = 1
            android.os.Messenger r12 = new android.os.Messenger
            r10 = 5
            r12.<init>(r13)
            goto L36
        L33:
            r10 = 5
            r9 = 0
            r12 = r9
        L36:
            r9 = 0
            r13 = r9
            r1 = 1
            if (r12 == 0) goto L48
            r10 = 1
            r10 = 1
            android.os.IBinder r9 = r12.getBinder()     // Catch: java.lang.NullPointerException -> L48
            r2 = r9
            if (r2 == 0) goto L48
            r10 = 1
            r2 = 1
            r10 = 4
            goto L4a
        L48:
            r9 = 0
            r2 = r9
        L4a:
            if (r2 == 0) goto L9b
            j1.f0$a r2 = new j1.f0$a
            r2.<init>(r12)
            r10 = 2
            int r5 = r2.d
            int r12 = r5 + 1
            r10 = 3
            r2.d = r12
            r2.f11190g = r5
            r9 = 1
            r4 = r9
            r6 = 4
            r10 = 3
            r7 = 0
            r8 = 0
            r3 = r2
            boolean r12 = r3.b(r4, r5, r6, r7, r8)
            if (r12 != 0) goto L69
            goto L7a
        L69:
            r10 = 4
            android.os.Messenger r12 = r2.f11185a     // Catch: android.os.RemoteException -> L77
            r10 = 3
            android.os.IBinder r12 = r12.getBinder()     // Catch: android.os.RemoteException -> L77
            r12.linkToDeath(r2, r13)     // Catch: android.os.RemoteException -> L77
            r9 = 1
            r13 = r9
            goto L7a
        L77:
            r2.binderDied()
        L7a:
            if (r13 == 0) goto L7f
            r11.n = r2
            goto Lb2
        L7f:
            boolean r12 = j1.f0.f11177q
            r10 = 6
            if (r12 == 0) goto Lb2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r13 = ": Registration failed"
            r10 = 7
            r12.append(r13)
            java.lang.String r9 = r12.toString()
            r12 = r9
            android.util.Log.d(r0, r12)
            goto Lb2
        L9b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r10 = 1
            r12.<init>()
            r10 = 1
            r12.append(r11)
            java.lang.String r9 = ": Service returned invalid messenger binder"
            r13 = r9
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r0, r12)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f0.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (f11177q) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        t();
    }

    public final void r() {
        if (!this.f11182m) {
            boolean z10 = f11177q;
            if (z10) {
                Log.d("MediaRouteProviderProxy", this + ": Binding");
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f11178i);
            int i10 = 1;
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = 4097;
                }
                boolean bindService = this.f11216a.bindService(intent, this, i10);
                this.f11182m = bindService;
                if (!bindService && z10) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed");
                }
            } catch (SecurityException e10) {
                if (f11177q) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed", e10);
                }
            }
        }
    }

    public final h.e s(String str, String str2) {
        j jVar = this.f11221g;
        if (jVar != null) {
            List<j1.f> list = jVar.f11255a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (list.get(i10).i().equals(str)) {
                    g gVar = new g(str, str2);
                    this.f11180k.add(gVar);
                    if (this.f11183o) {
                        gVar.a(this.n);
                    }
                    A();
                    return gVar;
                }
            }
            return null;
        }
        return null;
    }

    public final void t() {
        if (this.n != null) {
            p(null);
            this.f11183o = false;
            int size = this.f11180k.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f11180k.get(i10).c();
            }
            a aVar = this.n;
            aVar.b(2, 0, 0, null, null);
            aVar.f11186b.f11194a.clear();
            aVar.f11185a.getBinder().unlinkToDeath(aVar, 0);
            f0.this.f11179j.post(new e0(aVar));
            this.n = null;
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Service connection ");
        m10.append(this.f11178i.flattenToShortString());
        return m10.toString();
    }

    public final c u(int i10) {
        Iterator<c> it = this.f11180k.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.b() == i10) {
                return next;
            }
        }
        return null;
    }

    public void v(a aVar, j jVar) {
        if (this.n == aVar) {
            if (f11177q) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + jVar);
            }
            p(jVar);
        }
    }

    public void w(c cVar) {
        this.f11180k.remove(cVar);
        cVar.c();
        A();
    }

    public final boolean x() {
        if (!this.f11181l || (this.f11219e == null && this.f11180k.isEmpty())) {
            return false;
        }
        return true;
    }

    public void y() {
        if (this.f11181l) {
            return;
        }
        if (f11177q) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.f11181l = true;
        A();
    }

    public final void z() {
        if (this.f11182m) {
            if (f11177q) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f11182m = false;
            t();
            try {
                this.f11216a.unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }
}
