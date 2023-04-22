package e9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i1 extends Fragment implements f {

    /* renamed from: q0  reason: collision with root package name */
    public static final WeakHashMap<androidx.fragment.app.o, WeakReference<i1>> f9205q0 = new WeakHashMap<>();

    /* renamed from: n0  reason: collision with root package name */
    public final Map<String, LifecycleCallback> f9206n0 = Collections.synchronizedMap(new p.a());

    /* renamed from: o0  reason: collision with root package name */
    public int f9207o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public Bundle f9208p0;

    @Override // androidx.fragment.app.Fragment
    public final void Q(int i10, int i11, Intent intent) {
        super.Q(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f9206n0.values()) {
            lifecycleCallback.c(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void U(Bundle bundle) {
        super.U(bundle);
        this.f9207o0 = 1;
        this.f9208p0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f9206n0.entrySet()) {
            entry.getValue().d(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void X() {
        this.U = true;
        this.f9207o0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f9206n0.values()) {
            Objects.requireNonNull(lifecycleCallback);
        }
    }

    @Override // e9.f
    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f9206n0.containsKey(str)) {
            throw new IllegalArgumentException(android.support.v4.media.b.n(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        this.f9206n0.put(str, lifecycleCallback);
        if (this.f9207o0 > 0) {
            new u9.d(Looper.getMainLooper()).post(new h1(this, lifecycleCallback, str));
        }
    }

    @Override // e9.f
    public final <T extends LifecycleCallback> T f(String str, Class<T> cls) {
        return cls.cast(this.f9206n0.get(str));
    }

    @Override // e9.f
    public final /* synthetic */ Activity g() {
        return n();
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0() {
        this.U = true;
        this.f9207o0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f9206n0.values()) {
            lifecycleCallback.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f9206n0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().f(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0() {
        this.U = true;
        this.f9207o0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f9206n0.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void j0() {
        this.U = true;
        this.f9207o0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f9206n0.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.k(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f9206n0.values()) {
            Objects.requireNonNull(lifecycleCallback);
        }
    }
}
