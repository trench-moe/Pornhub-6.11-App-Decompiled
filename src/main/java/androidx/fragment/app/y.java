package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.mh.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i0;
import androidx.fragment.app.p0;
import androidx.lifecycle.Lifecycle;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class y {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ArrayList<androidx.fragment.app.a> F;
    public ArrayList<Boolean> G;
    public ArrayList<Fragment> H;
    public ArrayList<o> I;
    public b0 J;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2284b;
    public ArrayList<androidx.fragment.app.a> d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f2286e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f2288g;

    /* renamed from: q  reason: collision with root package name */
    public v<?> f2297q;

    /* renamed from: r  reason: collision with root package name */
    public af.c f2298r;

    /* renamed from: s  reason: collision with root package name */
    public Fragment f2299s;

    /* renamed from: t  reason: collision with root package name */
    public Fragment f2300t;

    /* renamed from: w  reason: collision with root package name */
    public androidx.core.mh.result.c<Intent> f2303w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.core.mh.result.c<androidx.core.mh.result.f> f2304x;
    public androidx.core.mh.result.c<String[]> y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<m> f2283a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final h0 f2285c = new h0();

    /* renamed from: f  reason: collision with root package name */
    public final w f2287f = new w(this);

    /* renamed from: h  reason: collision with root package name */
    public final androidx.core.mh.f f2289h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f2290i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f2291j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f2292k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public Map<Fragment, HashSet<i0.b>> f2293l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final p0.a f2294m = new d();
    public final x n = new x(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<c0> f2295o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public int f2296p = -1;

    /* renamed from: u  reason: collision with root package name */
    public u f2301u = new e();

    /* renamed from: v  reason: collision with root package name */
    public w0 f2302v = new f(this);

    /* renamed from: z  reason: collision with root package name */
    public ArrayDeque<l> f2305z = new ArrayDeque<>();
    public Runnable K = new g();

    /* loaded from: classes.dex */
    public class a implements androidx.core.mh.result.b<androidx.core.mh.result.a> {
        public a() {
        }

        @Override // androidx.core.mh.result.b
        public void a(androidx.core.mh.result.a aVar) {
            androidx.core.mh.result.a aVar2 = aVar;
            l pollFirst = y.this.f2305z.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f2314c;
            int i10 = pollFirst.f2315f;
            Fragment h10 = y.this.f2285c.h(str);
            if (h10 != null) {
                h10.Q(i10, aVar2.f1859c, aVar2.f1860f);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.core.mh.result.b<Map<String, Boolean>> {
        public b() {
        }

        @Override // androidx.core.mh.result.b
        @SuppressLint({"SyntheticAccessor"})
        public void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l pollFirst = y.this.f2305z.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f2314c;
            int i11 = pollFirst.f2315f;
            Fragment h10 = y.this.f2285c.h(str);
            if (h10 != null) {
                h10.f0(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.core.mh.f {
        public c(boolean z10) {
            super(z10);
        }

        @Override // androidx.core.mh.f
        public void a() {
            y yVar = y.this;
            yVar.C(true);
            if (yVar.f2289h.f1857a) {
                yVar.Y();
            } else {
                yVar.f2288g.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements p0.a {
        public d() {
        }

        public void a(Fragment fragment, i0.b bVar) {
            boolean z10;
            synchronized (bVar) {
                try {
                    z10 = bVar.f10447a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                return;
            }
            y yVar = y.this;
            HashSet<i0.b> hashSet = yVar.f2293l.get(fragment);
            if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
                yVar.f2293l.remove(fragment);
                if (fragment.f2004c < 5) {
                    yVar.i(fragment);
                    yVar.V(fragment, yVar.f2296p);
                }
            }
        }

        public void b(Fragment fragment, i0.b bVar) {
            y yVar = y.this;
            if (yVar.f2293l.get(fragment) == null) {
                yVar.f2293l.put(fragment, new HashSet<>());
            }
            yVar.f2293l.get(fragment).add(bVar);
        }
    }

    /* loaded from: classes.dex */
    public class e extends u {
        public e() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // androidx.fragment.app.u
        public androidx.fragment.app.Fragment a(java.lang.ClassLoader r8, java.lang.String r9) {
            /*
                r7 = this;
                r4 = r7
                androidx.fragment.app.y r8 = androidx.fragment.app.y.this
                java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                androidx.fragment.app.v<?> r8 = r8.f2297q
                r6 = 2
                android.content.Context r0 = r8.f2271f
                java.util.Objects.requireNonNull(r8)
                java.lang.Object r8 = androidx.fragment.app.Fragment.f2001m0
                r6 = 3
                java.lang.String r6 = ": make sure class name exists, is public, and has an empty constructor that is public"
                r8 = r6
                java.lang.String r6 = "Unable to instantiate fragment "
                r1 = r6
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L42 java.lang.IllegalAccessException -> L51 java.lang.InstantiationException -> L5f
                java.lang.Class r6 = androidx.fragment.app.u.c(r0, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L42 java.lang.IllegalAccessException -> L51 java.lang.InstantiationException -> L5f
                r0 = r6
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L42 java.lang.IllegalAccessException -> L51 java.lang.InstantiationException -> L5f
                r6 = 5
                java.lang.reflect.Constructor r6 = r0.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L42 java.lang.IllegalAccessException -> L51 java.lang.InstantiationException -> L5f
                r0 = r6
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L42 java.lang.IllegalAccessException -> L51 java.lang.InstantiationException -> L5f
                r6 = 4
                java.lang.Object r6 = r0.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L42 java.lang.IllegalAccessException -> L51 java.lang.InstantiationException -> L5f
                r0 = r6
                androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L42 java.lang.IllegalAccessException -> L51 java.lang.InstantiationException -> L5f
                return r0
            L33:
                r8 = move-exception
                androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
                r6 = 5
                java.lang.String r2 = ": calling Fragment constructor caused an exception"
                java.lang.String r9 = android.support.v4.media.b.j(r1, r9, r2)
                r0.<init>(r9, r8)
                throw r0
                r6 = 4
            L42:
                r8 = move-exception
                androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
                java.lang.String r2 = ": could not find Fragment constructor"
                r6 = 1
                java.lang.String r9 = android.support.v4.media.b.j(r1, r9, r2)
                r0.<init>(r9, r8)
                r6 = 1
                throw r0
            L51:
                r0 = move-exception
                androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
                r6 = 3
                java.lang.String r8 = android.support.v4.media.b.j(r1, r9, r8)
                r2.<init>(r8, r0)
                r6 = 3
                throw r2
                r6 = 2
            L5f:
                r0 = move-exception
                androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
                java.lang.String r8 = android.support.v4.media.b.j(r1, r9, r8)
                r2.<init>(r8, r0)
                throw r2
                r6 = 1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.e.a(java.lang.ClassLoader, java.lang.String):androidx.fragment.app.Fragment");
        }
    }

    /* loaded from: classes.dex */
    public class f implements w0 {
        public f(y yVar) {
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.C(true);
        }
    }

    /* loaded from: classes.dex */
    public class h implements c0 {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Fragment f2312c;

        public h(y yVar, Fragment fragment) {
            this.f2312c = fragment;
        }

        @Override // androidx.fragment.app.c0
        public void a(y yVar, Fragment fragment) {
            this.f2312c.T(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.core.mh.result.b<androidx.core.mh.result.a> {
        public i() {
        }

        @Override // androidx.core.mh.result.b
        public void a(androidx.core.mh.result.a aVar) {
            androidx.core.mh.result.a aVar2 = aVar;
            l pollFirst = y.this.f2305z.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f2314c;
            int i10 = pollFirst.f2315f;
            Fragment h10 = y.this.f2285c.h(str);
            if (h10 != null) {
                h10.Q(i10, aVar2.f1859c, aVar2.f1860f);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends c.a<androidx.core.mh.result.f, androidx.core.mh.result.a> {
        @Override // c.a
        public Intent a(Context context, androidx.core.mh.result.f fVar) {
            Bundle bundleExtra;
            androidx.core.mh.result.f fVar2 = fVar;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = fVar2.f1874f;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    fVar2 = new androidx.core.mh.result.f(fVar2.f1873c, null, fVar2.f1875j, fVar2.f1876m);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar2);
            if (y.P(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // c.a
        public androidx.core.mh.result.a c(int i10, Intent intent) {
            return new androidx.core.mh.result.a(i10, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void a(y yVar, Fragment fragment, Bundle bundle) {
        }

        public void b(y yVar, Fragment fragment, View view, Bundle bundle) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public String f2314c;

        /* renamed from: f  reason: collision with root package name */
        public int f2315f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcel parcel) {
            this.f2314c = parcel.readString();
            this.f2315f = parcel.readInt();
        }

        public l(String str, int i10) {
            this.f2314c = str;
            this.f2315f = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2314c);
            parcel.writeInt(this.f2315f);
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class n implements m {

        /* renamed from: a  reason: collision with root package name */
        public final String f2316a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2317b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2318c;

        public n(String str, int i10, int i11) {
            this.f2316a = str;
            this.f2317b = i10;
            this.f2318c = i11;
        }

        @Override // androidx.fragment.app.y.m
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = y.this.f2300t;
            if (fragment == null || this.f2317b >= 0 || this.f2316a != null || !fragment.p().Y()) {
                return y.this.Z(arrayList, arrayList2, this.f2316a, this.f2317b, this.f2318c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o implements Fragment.d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f2319a;

        /* renamed from: b  reason: collision with root package name */
        public final androidx.fragment.app.a f2320b;

        /* renamed from: c  reason: collision with root package name */
        public int f2321c;

        public void a() {
            boolean z10 = this.f2321c > 0;
            while (true) {
                for (Fragment fragment : this.f2320b.f2072q.M()) {
                    fragment.E0(null);
                    if (z10 && fragment.N()) {
                        fragment.J0();
                    }
                }
                androidx.fragment.app.a aVar = this.f2320b;
                aVar.f2072q.g(aVar, this.f2319a, !z10, true);
                return;
            }
        }
    }

    public static boolean P(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void A(androidx.fragment.app.y.m r7, boolean r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L34
            r4 = 3
            androidx.fragment.app.v<?> r0 = r6.f2297q
            r3 = 2
            if (r0 != 0) goto L21
            boolean r7 = r6.D
            if (r7 == 0) goto L17
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.String r2 = "FragmentManager has been destroyed"
            r8 = r2
            r7.<init>(r8)
            throw r7
            r5 = 6
        L17:
            r5 = 1
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "FragmentManager has not been attached to a host."
            r7.<init>(r8)
            r4 = 6
            throw r7
        L21:
            r5 = 5
            boolean r2 = r6.T()
            r0 = r2
            if (r0 != 0) goto L2a
            goto L35
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
            r8 = r2
            r7.<init>(r8)
            r5 = 2
            throw r7
        L34:
            r3 = 5
        L35:
            java.util.ArrayList<androidx.fragment.app.y$m> r0 = r6.f2283a
            monitor-enter(r0)
            androidx.fragment.app.v<?> r1 = r6.f2297q     // Catch: java.lang.Throwable -> L59
            r5 = 7
            if (r1 != 0) goto L4d
            if (r8 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return
        L41:
            r5 = 7
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            r3 = 1
            java.lang.String r2 = "Activity has been destroyed"
            r8 = r2
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L59
            throw r7     // Catch: java.lang.Throwable -> L59
            r3 = 5
        L4d:
            r3 = 2
            java.util.ArrayList<androidx.fragment.app.y$m> r8 = r6.f2283a     // Catch: java.lang.Throwable -> L59
            r5 = 7
            r8.add(r7)     // Catch: java.lang.Throwable -> L59
            r6.e0()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return
        L59:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            throw r7
            r4 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.A(androidx.fragment.app.y$m, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void B(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.f2284b
            if (r0 != 0) goto L82
            androidx.fragment.app.v<?> r0 = r4.f2297q
            if (r0 != 0) goto L22
            boolean r5 = r4.D
            if (r5 == 0) goto L17
            r3 = 6
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r3 = 7
            java.lang.String r0 = "FragmentManager has been destroyed"
            r5.<init>(r0)
            throw r5
            r3 = 7
        L17:
            r3 = 6
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r3 = 7
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3 = 1
            r5.<init>(r0)
            throw r5
        L22:
            r3 = 6
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.v<?> r1 = r4.f2297q
            r3 = 1
            android.os.Handler r1 = r1.f2272j
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L79
            if (r5 != 0) goto L49
            r3 = 3
            boolean r2 = r4.T()
            r5 = r2
            if (r5 != 0) goto L3e
            r3 = 4
            goto L49
        L3e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
            r0 = r2
            r5.<init>(r0)
            r3 = 6
            throw r5
        L49:
            java.util.ArrayList<androidx.fragment.app.a> r5 = r4.F
            r3 = 6
            if (r5 != 0) goto L62
            java.util.ArrayList r5 = new java.util.ArrayList
            r3 = 7
            r5.<init>()
            r3 = 6
            r4.F = r5
            r3 = 1
            java.util.ArrayList r5 = new java.util.ArrayList
            r3 = 4
            r5.<init>()
            r3 = 3
            r4.G = r5
            r3 = 2
        L62:
            r3 = 6
            r2 = 1
            r5 = r2
            r4.f2284b = r5
            r3 = 6
            r2 = 0
            r5 = r2
            r2 = 0
            r0 = r2
            r3 = 4
            r4.F(r0, r0)     // Catch: java.lang.Throwable -> L74
            r4.f2284b = r5
            r3 = 4
            return
        L74:
            r0 = move-exception
            r4.f2284b = r5
            r3 = 4
            throw r0
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r5.<init>(r0)
            throw r5
        L82:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r2 = "FragmentManager is already executing transactions"
            r0 = r2
            r5.<init>(r0)
            throw r5
            r3 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.B(boolean):void");
    }

    /* JADX WARN: Finally extract failed */
    public boolean C(boolean z10) {
        boolean z11;
        B(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.F;
            ArrayList<Boolean> arrayList2 = this.G;
            synchronized (this.f2283a) {
                try {
                    if (this.f2283a.isEmpty()) {
                        z11 = false;
                    } else {
                        int size = this.f2283a.size();
                        z11 = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            z11 |= this.f2283a.get(i10).a(arrayList, arrayList2);
                        }
                        this.f2283a.clear();
                        this.f2297q.f2272j.removeCallbacks(this.K);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z11) {
                m0();
                x();
                this.f2285c.d();
                return z12;
            }
            this.f2284b = true;
            try {
                b0(this.F, this.G);
                e();
                z12 = true;
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
    }

    public void D(m mVar, boolean z10) {
        if (!z10 || (this.f2297q != null && !this.D)) {
            B(z10);
            ((androidx.fragment.app.a) mVar).a(this.F, this.G);
            this.f2284b = true;
            try {
                b0(this.F, this.G);
                e();
                m0();
                x();
                this.f2285c.d();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
    }

    public final void E(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        int i12;
        int i13;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z10 = arrayList.get(i10).f2164p;
        ArrayList<Fragment> arrayList4 = this.H;
        if (arrayList4 == null) {
            this.H = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.H.addAll(this.f2285c.l());
        Fragment fragment = this.f2300t;
        int i14 = i10;
        boolean z11 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i11) {
                this.H.clear();
                if (!z10 && this.f2296p >= 1) {
                    for (int i16 = i10; i16 < i11; i16++) {
                        Iterator<i0.a> it = arrayList.get(i16).f2151a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f2166b;
                            if (fragment2 != null && fragment2.I != null) {
                                this.f2285c.p(h(fragment2));
                            }
                        }
                    }
                }
                int i17 = i10;
                while (i17 < i11) {
                    androidx.fragment.app.a aVar = arrayList.get(i17);
                    if (arrayList2.get(i17).booleanValue()) {
                        aVar.k(-1);
                        aVar.p(i17 == i11 + (-1));
                    } else {
                        aVar.k(1);
                        aVar.o();
                    }
                    i17++;
                }
                boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
                for (int i18 = i10; i18 < i11; i18++) {
                    androidx.fragment.app.a aVar2 = arrayList.get(i18);
                    if (booleanValue) {
                        for (int size = aVar2.f2151a.size() - 1; size >= 0; size--) {
                            Fragment fragment3 = aVar2.f2151a.get(size).f2166b;
                            if (fragment3 != null) {
                                h(fragment3).k();
                            }
                        }
                    } else {
                        Iterator<i0.a> it2 = aVar2.f2151a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment4 = it2.next().f2166b;
                            if (fragment4 != null) {
                                h(fragment4).k();
                            }
                        }
                    }
                }
                U(this.f2296p, true);
                HashSet hashSet = new HashSet();
                for (int i19 = i10; i19 < i11; i19++) {
                    Iterator<i0.a> it3 = arrayList.get(i19).f2151a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment5 = it3.next().f2166b;
                        if (fragment5 != null && (viewGroup = fragment5.V) != null) {
                            hashSet.add(SpecialEffectsController.g(viewGroup, N()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                    specialEffectsController.d = booleanValue;
                    specialEffectsController.h();
                    specialEffectsController.c();
                }
                for (int i20 = i10; i20 < i11; i20++) {
                    androidx.fragment.app.a aVar3 = arrayList.get(i20);
                    if (arrayList2.get(i20).booleanValue() && aVar3.f2074s >= 0) {
                        aVar3.f2074s = -1;
                    }
                    Objects.requireNonNull(aVar3);
                }
                return;
            }
            androidx.fragment.app.a aVar4 = arrayList.get(i14);
            int i21 = 3;
            if (arrayList3.get(i14).booleanValue()) {
                int i22 = 1;
                ArrayList<Fragment> arrayList5 = this.H;
                int size2 = aVar4.f2151a.size() - 1;
                while (size2 >= 0) {
                    i0.a aVar5 = aVar4.f2151a.get(size2);
                    int i23 = aVar5.f2165a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar5.f2166b;
                                    break;
                                case 10:
                                    aVar5.f2171h = aVar5.f2170g;
                                    break;
                            }
                            size2--;
                            i22 = 1;
                        }
                        arrayList5.add(aVar5.f2166b);
                        size2--;
                        i22 = 1;
                    }
                    arrayList5.remove(aVar5.f2166b);
                    size2--;
                    i22 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList6 = this.H;
                int i24 = 0;
                while (i24 < aVar4.f2151a.size()) {
                    i0.a aVar6 = aVar4.f2151a.get(i24);
                    int i25 = aVar6.f2165a;
                    if (i25 != i15) {
                        if (i25 != 2) {
                            if (i25 == i21 || i25 == 6) {
                                arrayList6.remove(aVar6.f2166b);
                                Fragment fragment6 = aVar6.f2166b;
                                if (fragment6 == fragment) {
                                    aVar4.f2151a.add(i24, new i0.a(9, fragment6));
                                    i24++;
                                    i12 = 1;
                                    fragment = null;
                                    i24 += i12;
                                    i15 = 1;
                                    i21 = 3;
                                }
                            } else if (i25 != 7) {
                                if (i25 == 8) {
                                    aVar4.f2151a.add(i24, new i0.a(9, fragment));
                                    i24++;
                                    fragment = aVar6.f2166b;
                                }
                            }
                            i12 = 1;
                            i24 += i12;
                            i15 = 1;
                            i21 = 3;
                        } else {
                            Fragment fragment7 = aVar6.f2166b;
                            int i26 = fragment7.N;
                            int size3 = arrayList6.size() - 1;
                            boolean z12 = false;
                            while (size3 >= 0) {
                                Fragment fragment8 = arrayList6.get(size3);
                                if (fragment8.N != i26) {
                                    i13 = i26;
                                } else if (fragment8 == fragment7) {
                                    i13 = i26;
                                    z12 = true;
                                } else {
                                    if (fragment8 == fragment) {
                                        i13 = i26;
                                        aVar4.f2151a.add(i24, new i0.a(9, fragment8));
                                        i24++;
                                        fragment = null;
                                    } else {
                                        i13 = i26;
                                    }
                                    i0.a aVar7 = new i0.a(3, fragment8);
                                    aVar7.f2167c = aVar6.f2167c;
                                    aVar7.f2168e = aVar6.f2168e;
                                    aVar7.d = aVar6.d;
                                    aVar7.f2169f = aVar6.f2169f;
                                    aVar4.f2151a.add(i24, aVar7);
                                    arrayList6.remove(fragment8);
                                    i24++;
                                }
                                size3--;
                                i26 = i13;
                            }
                            if (z12) {
                                aVar4.f2151a.remove(i24);
                                i24--;
                                i12 = 1;
                                i24 += i12;
                                i15 = 1;
                                i21 = 3;
                            } else {
                                i12 = 1;
                                aVar6.f2165a = 1;
                                arrayList6.add(fragment7);
                                i24 += i12;
                                i15 = 1;
                                i21 = 3;
                            }
                        }
                    }
                    i12 = 1;
                    arrayList6.add(aVar6.f2166b);
                    i24 += i12;
                    i15 = 1;
                    i21 = 3;
                }
            }
            z11 = z11 || aVar4.f2156g;
            i14++;
            arrayList3 = arrayList2;
        }
    }

    public final void F(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<o> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            o oVar = this.I.get(i10);
            if (arrayList == null || oVar.f2319a || (indexOf2 = arrayList.indexOf(oVar.f2320b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((oVar.f2321c == 0) || (arrayList != null && oVar.f2320b.r(arrayList, 0, arrayList.size()))) {
                    this.I.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || oVar.f2319a || (indexOf = arrayList.indexOf(oVar.f2320b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        oVar.a();
                    } else {
                        androidx.fragment.app.a aVar = oVar.f2320b;
                        aVar.f2072q.g(aVar, oVar.f2319a, false, false);
                    }
                }
            } else {
                this.I.remove(i10);
                i10--;
                size--;
                androidx.fragment.app.a aVar2 = oVar.f2320b;
                aVar2.f2072q.g(aVar2, oVar.f2319a, false, false);
            }
            i10++;
        }
    }

    public Fragment G(String str) {
        return this.f2285c.g(str);
    }

    public Fragment H(int i10) {
        h0 h0Var = this.f2285c;
        int size = ((ArrayList) h0Var.f2145f).size();
        while (true) {
            size--;
            if (size < 0) {
                for (f0 f0Var : ((HashMap) h0Var.f2146j).values()) {
                    if (f0Var != null) {
                        Fragment fragment = f0Var.f2128c;
                        if (fragment.M == i10) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = (Fragment) ((ArrayList) h0Var.f2145f).get(size);
            if (fragment2 != null && fragment2.M == i10) {
                return fragment2;
            }
        }
    }

    public Fragment I(String str) {
        h0 h0Var = this.f2285c;
        Objects.requireNonNull(h0Var);
        if (str != null) {
            int size = ((ArrayList) h0Var.f2145f).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) ((ArrayList) h0Var.f2145f).get(size);
                if (fragment != null && str.equals(fragment.O)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (f0 f0Var : ((HashMap) h0Var.f2146j).values()) {
                if (f0Var != null) {
                    Fragment fragment2 = f0Var.f2128c;
                    if (str.equals(fragment2.O)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    public final void J() {
        Iterator it = ((HashSet) f()).iterator();
        while (true) {
            while (it.hasNext()) {
                SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
                if (specialEffectsController.f2051e) {
                    specialEffectsController.f2051e = false;
                    specialEffectsController.c();
                }
            }
            return;
        }
    }

    public final ViewGroup K(Fragment fragment) {
        ViewGroup viewGroup = fragment.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.N > 0 && this.f2298r.p()) {
            View m10 = this.f2298r.m(fragment.N);
            if (m10 instanceof ViewGroup) {
                return (ViewGroup) m10;
            }
        }
        return null;
    }

    public u L() {
        Fragment fragment = this.f2299s;
        return fragment != null ? fragment.I.L() : this.f2301u;
    }

    public List<Fragment> M() {
        return this.f2285c.l();
    }

    public w0 N() {
        Fragment fragment = this.f2299s;
        return fragment != null ? fragment.I.N() : this.f2302v;
    }

    public void O(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.P) {
            fragment.P = true;
            fragment.f2002a0 = true ^ fragment.f2002a0;
            i0(fragment);
        }
    }

    public final boolean Q(Fragment fragment) {
        boolean z10;
        boolean z11 = true;
        if (fragment.S) {
            if (!fragment.T) {
            }
            return z11;
        }
        y yVar = fragment.K;
        Iterator it = ((ArrayList) yVar.f2285c.j()).iterator();
        boolean z12 = false;
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z12 = yVar.Q(fragment2);
            }
            if (z12) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            z11 = false;
        }
        return z11;
    }

    public boolean R(Fragment fragment) {
        y yVar;
        if (fragment == null) {
            return true;
        }
        return fragment.T && ((yVar = fragment.I) == null || yVar.R(fragment.L));
    }

    public boolean S(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        y yVar = fragment.I;
        return fragment.equals(yVar.f2300t) && S(yVar.f2299s);
    }

    public boolean T() {
        if (!this.B && !this.C) {
            return false;
        }
        return true;
    }

    public void U(int i10, boolean z10) {
        v<?> vVar;
        if (this.f2297q == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2296p) {
            this.f2296p = i10;
            h0 h0Var = this.f2285c;
            Iterator it = ((ArrayList) h0Var.f2145f).iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    f0 f0Var = (f0) ((HashMap) h0Var.f2146j).get(((Fragment) it.next()).f2018t);
                    if (f0Var != null) {
                        f0Var.k();
                    }
                }
            }
            Iterator it2 = ((HashMap) h0Var.f2146j).values().iterator();
            loop2: while (true) {
                while (true) {
                    boolean z11 = false;
                    if (!it2.hasNext()) {
                        break loop2;
                    }
                    f0 f0Var2 = (f0) it2.next();
                    if (f0Var2 != null) {
                        f0Var2.k();
                        Fragment fragment = f0Var2.f2128c;
                        if (fragment.C && !fragment.M()) {
                            z11 = true;
                        }
                        if (z11) {
                            h0Var.q(f0Var2);
                        }
                    }
                }
            }
            k0();
            if (this.A && (vVar = this.f2297q) != null && this.f2296p == 7) {
                vVar.x();
                this.A = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r1 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V(androidx.fragment.app.Fragment r17, int r18) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.V(androidx.fragment.app.Fragment, int):void");
    }

    public void W() {
        if (this.f2297q == null) {
            return;
        }
        this.B = false;
        this.C = false;
        this.J.f2095h = false;
        while (true) {
            for (Fragment fragment : this.f2285c.l()) {
                if (fragment != null) {
                    fragment.K.W();
                }
            }
            return;
        }
    }

    public void X(f0 f0Var) {
        Fragment fragment = f0Var.f2128c;
        if (fragment.X) {
            if (this.f2284b) {
                this.E = true;
                return;
            }
            fragment.X = false;
            f0Var.k();
        }
    }

    public boolean Y() {
        C(false);
        B(true);
        Fragment fragment = this.f2300t;
        if (fragment == null || !fragment.p().Y()) {
            boolean Z = Z(this.F, this.G, null, -1, 0);
            if (Z) {
                this.f2284b = true;
                try {
                    b0(this.F, this.G);
                } finally {
                    e();
                }
            }
            m0();
            x();
            this.f2285c.d();
            return Z;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
        if ((r15 & 1) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
        if (r0 < 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
        r15 = r10.d.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
        if (r13 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
        if (r13.equals(r15.f2158i) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
        if (r14 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
        if (r14 != r15.f2074s) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Z(java.util.ArrayList<androidx.fragment.app.a> r11, java.util.ArrayList<java.lang.Boolean> r12, java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.Z(java.util.ArrayList, java.util.ArrayList, java.lang.String, int, int):boolean");
    }

    public f0 a(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        f0 h10 = h(fragment);
        fragment.I = this;
        this.f2285c.p(h10);
        if (!fragment.Q) {
            this.f2285c.a(fragment);
            fragment.C = false;
            if (fragment.W == null) {
                fragment.f2002a0 = false;
            }
            if (Q(fragment)) {
                this.A = true;
            }
        }
        return h10;
    }

    public void a0(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.H);
        }
        boolean z10 = !fragment.M();
        if (!fragment.Q || z10) {
            this.f2285c.r(fragment);
            if (Q(fragment)) {
                this.A = true;
            }
            fragment.C = true;
            i0(fragment);
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public void b(v<?> vVar, af.c cVar, Fragment fragment) {
        if (this.f2297q != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2297q = vVar;
        this.f2298r = cVar;
        this.f2299s = fragment;
        if (fragment != null) {
            this.f2295o.add(new h(this, fragment));
        } else if (vVar instanceof c0) {
            this.f2295o.add((c0) vVar);
        }
        if (this.f2299s != null) {
            m0();
        }
        if (vVar instanceof androidx.core.mh.g) {
            androidx.core.mh.g gVar = (androidx.core.mh.g) vVar;
            OnBackPressedDispatcher c10 = gVar.c();
            this.f2288g = c10;
            androidx.lifecycle.k kVar = gVar;
            if (fragment != null) {
                kVar = fragment;
            }
            c10.a(kVar, this.f2289h);
        }
        if (fragment != null) {
            b0 b0Var = fragment.I.J;
            b0 b0Var2 = b0Var.d.get(fragment.f2018t);
            if (b0Var2 == null) {
                b0Var2 = new b0(b0Var.f2093f);
                b0Var.d.put(fragment.f2018t, b0Var2);
            }
            this.J = b0Var2;
        } else if (vVar instanceof androidx.lifecycle.b0) {
            this.J = (b0) new androidx.lifecycle.z(((androidx.lifecycle.b0) vVar).j(), b0.f2090i).a(b0.class);
        } else {
            this.J = new b0(false);
        }
        this.J.f2095h = T();
        this.f2285c.f2147m = this.J;
        v<?> vVar2 = this.f2297q;
        if (vVar2 instanceof androidx.core.mh.result.e) {
            androidx.core.mh.result.d g10 = ((androidx.core.mh.result.e) vVar2).g();
            String l10 = a1.a.l("FragmentManager:", fragment != null ? android.support.v4.media.b.m(new StringBuilder(), fragment.f2018t, ":") : BuildConfig.FLAVOR);
            this.f2303w = g10.b(a1.a.l(l10, "StartActivityForResult"), new c.c(), new i());
            this.f2304x = g10.b(a1.a.l(l10, "StartIntentSenderForResult"), new j(), new a());
            this.y = g10.b(a1.a.l(l10, "RequestPermissions"), new c.b(), new b());
        }
    }

    public final void b0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        F(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f2164p) {
                if (i11 != i10) {
                    E(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2164p) {
                        i11++;
                    }
                }
                E(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            E(arrayList, arrayList2, i11, size);
        }
    }

    public void c(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.Q) {
            fragment.Q = false;
            if (fragment.B) {
                return;
            }
            this.f2285c.a(fragment);
            if (P(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (Q(fragment)) {
                this.A = true;
            }
        }
    }

    public void c0(Parcelable parcelable) {
        f0 f0Var;
        if (parcelable == null) {
            return;
        }
        a0 a0Var = (a0) parcelable;
        if (a0Var.f2075c == null) {
            return;
        }
        ((HashMap) this.f2285c.f2146j).clear();
        Iterator<e0> it = a0Var.f2075c.iterator();
        while (it.hasNext()) {
            e0 next = it.next();
            if (next != null) {
                b0 b0Var = this.J;
                Fragment fragment = b0Var.f2091c.get(next.f2115f);
                if (fragment != null) {
                    if (P(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    f0Var = new f0(this.n, this.f2285c, fragment, next);
                } else {
                    f0Var = new f0(this.n, this.f2285c, this.f2297q.f2271f.getClassLoader(), L(), next);
                }
                Fragment fragment2 = f0Var.f2128c;
                fragment2.I = this;
                if (P(2)) {
                    StringBuilder m10 = a1.a.m("restoreSaveState: active (");
                    m10.append(fragment2.f2018t);
                    m10.append("): ");
                    m10.append(fragment2);
                    Log.v("FragmentManager", m10.toString());
                }
                f0Var.m(this.f2297q.f2271f.getClassLoader());
                this.f2285c.p(f0Var);
                f0Var.f2129e = this.f2296p;
            }
        }
        b0 b0Var2 = this.J;
        Objects.requireNonNull(b0Var2);
        Iterator it2 = new ArrayList(b0Var2.f2091c.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (!this.f2285c.e(fragment3.f2018t)) {
                if (P(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + a0Var.f2075c);
                }
                this.J.c(fragment3);
                fragment3.I = this;
                f0 f0Var2 = new f0(this.n, this.f2285c, fragment3);
                f0Var2.f2129e = 1;
                f0Var2.k();
                fragment3.C = true;
                f0Var2.k();
            }
        }
        h0 h0Var = this.f2285c;
        ArrayList<String> arrayList = a0Var.f2076f;
        ((ArrayList) h0Var.f2145f).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment g10 = h0Var.g(str);
                if (g10 == null) {
                    throw new IllegalStateException(android.support.v4.media.b.j("No instantiated fragment for (", str, ")"));
                }
                if (P(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + g10);
                }
                h0Var.a(g10);
            }
        }
        Fragment fragment4 = null;
        if (a0Var.f2077j != null) {
            this.d = new ArrayList<>(a0Var.f2077j.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = a0Var.f2077j;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i10];
                Objects.requireNonNull(bVar);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = bVar.f2082c;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    i0.a aVar2 = new i0.a();
                    int i13 = i11 + 1;
                    aVar2.f2165a = iArr[i11];
                    if (P(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + bVar.f2082c[i13]);
                    }
                    String str2 = bVar.f2083f.get(i12);
                    if (str2 != null) {
                        aVar2.f2166b = this.f2285c.g(str2);
                    } else {
                        aVar2.f2166b = fragment4;
                    }
                    aVar2.f2170g = Lifecycle.State.values()[bVar.f2084j[i12]];
                    aVar2.f2171h = Lifecycle.State.values()[bVar.f2085m[i12]];
                    int[] iArr2 = bVar.f2082c;
                    int i14 = i13 + 1;
                    int i15 = iArr2[i13];
                    aVar2.f2167c = i15;
                    int i16 = i14 + 1;
                    int i17 = iArr2[i14];
                    aVar2.d = i17;
                    int i18 = i16 + 1;
                    int i19 = iArr2[i16];
                    aVar2.f2168e = i19;
                    int i20 = iArr2[i18];
                    aVar2.f2169f = i20;
                    aVar.f2152b = i15;
                    aVar.f2153c = i17;
                    aVar.d = i19;
                    aVar.f2154e = i20;
                    aVar.b(aVar2);
                    i12++;
                    fragment4 = null;
                    i11 = i18 + 1;
                }
                aVar.f2155f = bVar.n;
                aVar.f2158i = bVar.f2086t;
                aVar.f2074s = bVar.f2087u;
                aVar.f2156g = true;
                aVar.f2159j = bVar.f2088w;
                aVar.f2160k = bVar.y;
                aVar.f2161l = bVar.f2089z;
                aVar.f2162m = bVar.A;
                aVar.n = bVar.B;
                aVar.f2163o = bVar.C;
                aVar.f2164p = bVar.D;
                aVar.k(1);
                if (P(2)) {
                    StringBuilder n10 = a1.a.n("restoreAllState: back stack #", i10, " (index ");
                    n10.append(aVar.f2074s);
                    n10.append("): ");
                    n10.append(aVar);
                    Log.v("FragmentManager", n10.toString());
                    PrintWriter printWriter = new PrintWriter(new v0("FragmentManager"));
                    aVar.n("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i10++;
                fragment4 = null;
            }
        } else {
            this.d = null;
        }
        this.f2290i.set(a0Var.f2078m);
        String str3 = a0Var.n;
        if (str3 != null) {
            Fragment G = G(str3);
            this.f2300t = G;
            t(G);
        }
        ArrayList<String> arrayList2 = a0Var.f2079t;
        if (arrayList2 != null) {
            for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                Bundle bundle = a0Var.f2080u.get(i21);
                bundle.setClassLoader(this.f2297q.f2271f.getClassLoader());
                this.f2291j.put(arrayList2.get(i21), bundle);
            }
        }
        this.f2305z = new ArrayDeque<>(a0Var.f2081w);
    }

    public final void d(Fragment fragment) {
        HashSet<i0.b> hashSet = this.f2293l.get(fragment);
        if (hashSet != null) {
            Iterator<i0.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            i(fragment);
            this.f2293l.remove(fragment);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[LOOP:1: B:4:0x0036->B:24:0x00a2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable d0() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.d0():android.os.Parcelable");
    }

    public final void e() {
        this.f2284b = false;
        this.G.clear();
        this.F.clear();
    }

    public void e0() {
        synchronized (this.f2283a) {
            ArrayList<o> arrayList = this.I;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f2283a.size() == 1;
            if (z10 || z11) {
                this.f2297q.f2272j.removeCallbacks(this.K);
                this.f2297q.f2272j.post(this.K);
                m0();
            }
        }
    }

    public final Set<SpecialEffectsController> f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f2285c.i()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((f0) it.next()).f2128c.V;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.g(viewGroup, N()));
            }
        }
        return hashSet;
    }

    public void f0(Fragment fragment, boolean z10) {
        ViewGroup K = K(fragment);
        if (K != null && (K instanceof FragmentContainerView)) {
            ((FragmentContainerView) K).setDrawDisappearingViewsLast(!z10);
        }
    }

    public void g(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.p(z12);
        } else {
            aVar.o();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f2296p >= 1) {
            p0.p(this.f2297q.f2271f, this.f2298r, arrayList, arrayList2, 0, 1, true, this.f2294m);
        }
        if (z12) {
            U(this.f2296p, true);
        }
        Iterator it = ((ArrayList) this.f2285c.j()).iterator();
        while (true) {
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                if (fragment != null) {
                    View view = fragment.W;
                }
            }
            return;
        }
    }

    public void g0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(G(fragment.f2018t)) && (fragment.J == null || fragment.I == this)) {
            fragment.f2007e0 = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public f0 h(Fragment fragment) {
        f0 k10 = this.f2285c.k(fragment.f2018t);
        if (k10 != null) {
            return k10;
        }
        f0 f0Var = new f0(this.n, this.f2285c, fragment);
        f0Var.m(this.f2297q.f2271f.getClassLoader());
        f0Var.f2129e = this.f2296p;
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r7.I == r6) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h0(androidx.fragment.app.Fragment r7) {
        /*
            r6 = this;
            r3 = r6
            if (r7 == 0) goto L40
            r5 = 3
            java.lang.String r0 = r7.f2018t
            androidx.fragment.app.Fragment r5 = r3.G(r0)
            r0 = r5
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L1c
            androidx.fragment.app.v<?> r0 = r7.J
            r5 = 7
            if (r0 == 0) goto L40
            r5 = 1
            androidx.fragment.app.y r0 = r7.I
            if (r0 != r3) goto L1c
            goto L41
        L1c:
            r5 = 6
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r5 = 3
            r1.<init>()
            java.lang.String r5 = "Fragment "
            r2 = r5
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " is not an active fragment of FragmentManager "
            r5 = 4
            r1.append(r7)
            r1.append(r3)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            r5 = 7
            throw r0
        L40:
            r5 = 7
        L41:
            androidx.fragment.app.Fragment r0 = r3.f2300t
            r3.f2300t = r7
            r5 = 3
            r3.t(r0)
            r5 = 5
            androidx.fragment.app.Fragment r7 = r3.f2300t
            r3.t(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.h0(androidx.fragment.app.Fragment):void");
    }

    public final void i(Fragment fragment) {
        fragment.n0();
        this.n.n(fragment, false);
        fragment.V = null;
        fragment.W = null;
        fragment.f2010g0 = null;
        fragment.f2011h0.l(null);
        fragment.E = false;
    }

    public final void i0(Fragment fragment) {
        ViewGroup K = K(fragment);
        if (K != null) {
            int r10 = fragment.r();
            int B = fragment.B();
            if (fragment.C() + B + fragment.u() + r10 > 0) {
                if (K.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    K.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) K.getTag(R.id.visible_removing_fragment_view_tag)).F0(fragment.A());
            }
        }
    }

    public void j(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.Q) {
            return;
        }
        fragment.Q = true;
        if (fragment.B) {
            if (P(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2285c.r(fragment);
            if (Q(fragment)) {
                this.A = true;
            }
            i0(fragment);
        }
    }

    public void j0(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.P) {
            fragment.P = false;
            fragment.f2002a0 = !fragment.f2002a0;
        }
    }

    public void k(Configuration configuration) {
        while (true) {
            for (Fragment fragment : this.f2285c.l()) {
                if (fragment != null) {
                    fragment.onConfigurationChanged(configuration);
                    fragment.K.k(configuration);
                }
            }
            return;
        }
    }

    public final void k0() {
        Iterator it = ((ArrayList) this.f2285c.i()).iterator();
        while (it.hasNext()) {
            X((f0) it.next());
        }
    }

    public boolean l(MenuItem menuItem) {
        if (this.f2296p < 1) {
            return false;
        }
        for (Fragment fragment : this.f2285c.l()) {
            if (fragment != null) {
                if (!fragment.P ? fragment.K.l(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new v0("FragmentManager"));
        v<?> vVar = this.f2297q;
        if (vVar != null) {
            try {
                vVar.s("  ", null, printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                y("  ", null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw runtimeException;
    }

    public void m() {
        this.B = false;
        this.C = false;
        this.J.f2095h = false;
        w(1);
    }

    public final void m0() {
        synchronized (this.f2283a) {
            try {
                boolean z10 = true;
                if (!this.f2283a.isEmpty()) {
                    this.f2289h.f1857a = true;
                    return;
                }
                androidx.core.mh.f fVar = this.f2289h;
                ArrayList<androidx.fragment.app.a> arrayList = this.d;
                if ((arrayList != null ? arrayList.size() : 0) <= 0 || !S(this.f2299s)) {
                    z10 = false;
                }
                fVar.f1857a = z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n(Menu menu, MenuInflater menuInflater) {
        boolean z10;
        boolean z11;
        if (this.f2296p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z12 = false;
        loop0: while (true) {
            for (Fragment fragment : this.f2285c.l()) {
                if (fragment != null && R(fragment)) {
                    if (fragment.P) {
                        z10 = false;
                    } else {
                        if (fragment.S && fragment.T) {
                            fragment.V(menu, menuInflater);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 = z11 | fragment.K.n(menu, menuInflater);
                    }
                    if (z10) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(fragment);
                        z12 = true;
                    }
                }
            }
            break loop0;
        }
        if (this.f2286e != null) {
            for (int i10 = 0; i10 < this.f2286e.size(); i10++) {
                Fragment fragment2 = this.f2286e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Objects.requireNonNull(fragment2);
                }
            }
        }
        this.f2286e = arrayList;
        return z12;
    }

    public void o() {
        this.D = true;
        C(true);
        z();
        w(-1);
        this.f2297q = null;
        this.f2298r = null;
        this.f2299s = null;
        if (this.f2288g != null) {
            this.f2289h.b();
            this.f2288g = null;
        }
        androidx.core.mh.result.c<Intent> cVar = this.f2303w;
        if (cVar != null) {
            cVar.b();
            this.f2304x.b();
            this.y.b();
        }
    }

    public void p() {
        while (true) {
            for (Fragment fragment : this.f2285c.l()) {
                if (fragment != null) {
                    fragment.p0();
                }
            }
            return;
        }
    }

    public void q(boolean z10) {
        for (Fragment fragment : this.f2285c.l()) {
            if (fragment != null) {
                fragment.K.q(z10);
            }
        }
    }

    public boolean r(MenuItem menuItem) {
        if (this.f2296p < 1) {
            return false;
        }
        for (Fragment fragment : this.f2285c.l()) {
            if (fragment != null) {
                if (!fragment.P ? (fragment.S && fragment.T && fragment.c0(menuItem)) ? true : fragment.K.r(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s(Menu menu) {
        if (this.f2296p < 1) {
            return;
        }
        while (true) {
            for (Fragment fragment : this.f2285c.l()) {
                if (fragment != null && !fragment.P) {
                    fragment.K.s(menu);
                }
            }
            return;
        }
    }

    public final void t(Fragment fragment) {
        if (fragment == null || !fragment.equals(G(fragment.f2018t))) {
            return;
        }
        boolean S = fragment.I.S(fragment);
        Boolean bool = fragment.A;
        if (bool == null || bool.booleanValue() != S) {
            fragment.A = Boolean.valueOf(S);
            fragment.e0(S);
            y yVar = fragment.K;
            yVar.m0();
            yVar.t(yVar.f2300t);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2299s;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2299s)));
            sb2.append("}");
        } else {
            v<?> vVar = this.f2297q;
            if (vVar != null) {
                sb2.append(vVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2297q)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public void u(boolean z10) {
        while (true) {
            for (Fragment fragment : this.f2285c.l()) {
                if (fragment != null) {
                    fragment.K.u(z10);
                }
            }
            return;
        }
    }

    public boolean v(Menu menu) {
        boolean z10 = false;
        if (this.f2296p < 1) {
            return false;
        }
        while (true) {
            for (Fragment fragment : this.f2285c.l()) {
                if (fragment != null && R(fragment) && fragment.q0(menu)) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void w(int i10) {
        try {
            this.f2284b = true;
            loop0: while (true) {
                for (f0 f0Var : ((HashMap) this.f2285c.f2146j).values()) {
                    if (f0Var != null) {
                        f0Var.f2129e = i10;
                    }
                }
            }
            U(i10, false);
            Iterator it = ((HashSet) f()).iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).e();
            }
            this.f2284b = false;
            C(true);
        } catch (Throwable th) {
            this.f2284b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.E) {
            this.E = false;
            k0();
        }
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String l10 = a1.a.l(str, "    ");
        h0 h0Var = this.f2285c;
        Objects.requireNonNull(h0Var);
        String str2 = str + "    ";
        if (!((HashMap) h0Var.f2146j).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (f0 f0Var : ((HashMap) h0Var.f2146j).values()) {
                printWriter.print(str);
                if (f0Var != null) {
                    Fragment fragment = f0Var.f2128c;
                    printWriter.println(fragment);
                    fragment.k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) h0Var.f2145f).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((Fragment) ((ArrayList) h0Var.f2145f).get(i10)).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f2286e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f2286e.get(i11).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = this.d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.n(l10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2290i.get());
        synchronized (this.f2283a) {
            int size4 = this.f2283a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println((m) this.f2283a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2297q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2298r);
        if (this.f2299s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2299s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2296p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public final void z() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
    }
}
