package e9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g1 extends Fragment implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final WeakHashMap<Activity, WeakReference<g1>> f9192m = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, LifecycleCallback> f9193c = Collections.synchronizedMap(new p.a());

    /* renamed from: f  reason: collision with root package name */
    public int f9194f = 0;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f9195j;

    @Override // e9.f
    public final void d(String str, LifecycleCallback lifecycleCallback) {
        if (this.f9193c.containsKey(str)) {
            throw new IllegalArgumentException(android.support.v4.media.b.n(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        this.f9193c.put(str, lifecycleCallback);
        if (this.f9194f > 0) {
            new u9.d(Looper.getMainLooper()).post(new f1(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f9193c.values()) {
            Objects.requireNonNull(lifecycleCallback);
        }
    }

    @Override // e9.f
    public final <T extends LifecycleCallback> T f(String str, Class<T> cls) {
        return cls.cast(this.f9193c.get(str));
    }

    @Override // e9.f
    public final Activity g() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f9193c.values()) {
            lifecycleCallback.c(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9194f = 1;
        this.f9195j = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f9193c.entrySet()) {
            entry.getValue().d(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9194f = 5;
        for (LifecycleCallback lifecycleCallback : this.f9193c.values()) {
            Objects.requireNonNull(lifecycleCallback);
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f9194f = 3;
        for (LifecycleCallback lifecycleCallback : this.f9193c.values()) {
            lifecycleCallback.e();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f9193c.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().f(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9194f = 2;
        for (LifecycleCallback lifecycleCallback : this.f9193c.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9194f = 4;
        for (LifecycleCallback lifecycleCallback : this.f9193c.values()) {
            lifecycleCallback.h();
        }
    }
}
