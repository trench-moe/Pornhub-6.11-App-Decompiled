package j1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import j1.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11237a;

    /* renamed from: b  reason: collision with root package name */
    public final c f11238b;
    public final PackageManager d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11241f;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<f0> f11240e = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final BroadcastReceiver f11242g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f11243h = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f11239c = new Handler();

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            h0.this.a();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.this.a();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    public h0(Context context, c cVar) {
        this.f11237a = context;
        this.f11238b = cVar;
        this.d = context.getPackageManager();
    }

    public void a() {
        int i10;
        boolean z10;
        if (this.f11241f) {
            List<ServiceInfo> arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                arrayList = (List) this.d.queryIntentServices(new Intent("android.media.MediaRoute2ProviderService"), 0).stream().map(j1.b.f11135c).collect(Collectors.toList());
            }
            int i11 = 0;
            for (ResolveInfo resolveInfo : this.d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    l.e eVar = l.d;
                    if (eVar == null ? false : eVar.f11284b) {
                        if (arrayList != null && !arrayList.isEmpty()) {
                            for (ServiceInfo serviceInfo2 : arrayList) {
                                if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = this.f11240e.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            i12 = -1;
                            break;
                        }
                        f0 f0Var = this.f11240e.get(i12);
                        if (f0Var.f11178i.getPackageName().equals(str) && f0Var.f11178i.getClassName().equals(str2)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 < 0) {
                        f0 f0Var2 = new f0(this.f11237a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        f0Var2.f11184p = new g0(this, f0Var2, 0);
                        f0Var2.y();
                        i10 = i11 + 1;
                        this.f11240e.add(i11, f0Var2);
                        ((l.e) this.f11238b).a(f0Var2);
                    } else if (i12 >= i11) {
                        f0 f0Var3 = this.f11240e.get(i12);
                        f0Var3.y();
                        if (f0Var3.n == null && f0Var3.x()) {
                            f0Var3.z();
                            f0Var3.r();
                        }
                        i10 = i11 + 1;
                        Collections.swap(this.f11240e, i12, i11);
                    }
                    i11 = i10;
                }
            }
            if (i11 < this.f11240e.size()) {
                for (int size2 = this.f11240e.size() - 1; size2 >= i11; size2--) {
                    f0 f0Var4 = this.f11240e.get(size2);
                    l.e eVar2 = (l.e) this.f11238b;
                    l.h d = eVar2.d(f0Var4);
                    if (d != null) {
                        Objects.requireNonNull(f0Var4);
                        l.b();
                        f0Var4.d = null;
                        f0Var4.q(null);
                        eVar2.o(d, null);
                        if (l.f11277c) {
                            Log.d("MediaRouter", "Provider removed: " + d);
                        }
                        eVar2.f11292k.b(514, d);
                        eVar2.f11288g.remove(d);
                    }
                    this.f11240e.remove(f0Var4);
                    f0Var4.f11184p = null;
                    if (f0Var4.f11181l) {
                        if (f0.f11177q) {
                            Log.d("MediaRouteProviderProxy", f0Var4 + ": Stopping");
                        }
                        f0Var4.f11181l = false;
                        f0Var4.A();
                    }
                }
            }
        }
    }
}
