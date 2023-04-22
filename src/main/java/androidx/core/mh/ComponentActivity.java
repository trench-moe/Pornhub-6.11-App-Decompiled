package androidx.core.mh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.u;
import androidx.savedstate.a;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends b0.g implements b0, androidx.savedstate.c, g, androidx.core.mh.result.e {

    /* renamed from: f  reason: collision with root package name */
    public final b.a f1826f;

    /* renamed from: j  reason: collision with root package name */
    public final l f1827j;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.savedstate.b f1828m;
    public a0 n;

    /* renamed from: t  reason: collision with root package name */
    public final OnBackPressedDispatcher f1829t;

    /* renamed from: u  reason: collision with root package name */
    public int f1830u;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.core.mh.result.d f1831w;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.core.mh.result.d {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public a0 f1837a;
    }

    public ComponentActivity() {
        this.f1826f = new b.a();
        l lVar = new l(this);
        this.f1827j = lVar;
        androidx.savedstate.b bVar = new androidx.savedstate.b(this);
        this.f1828m = bVar;
        this.f1829t = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.f1831w = new b();
        int i10 = Build.VERSION.SDK_INT;
        lVar.a(new i() { // from class: androidx.core.mh.ComponentActivity.3
            @Override // androidx.lifecycle.i
            public void c(k kVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        lVar.a(new i() { // from class: androidx.core.mh.ComponentActivity.4
            @Override // androidx.lifecycle.i
            public void c(k kVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.f1826f.f3381b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.j().a();
                    }
                }
            }
        });
        lVar.a(new i() { // from class: androidx.core.mh.ComponentActivity.5
            @Override // androidx.lifecycle.i
            public void c(k kVar, Lifecycle.Event event) {
                ComponentActivity.this.s();
                l lVar2 = ComponentActivity.this.f1827j;
                lVar2.d("removeObserver");
                lVar2.f2374a.j(this);
            }
        });
        if (i10 <= 23) {
            lVar.a(new ImmLeaksCleaner(this));
        }
        bVar.f3134b.b("android:support:activity-result", new a.b() { // from class: androidx.core.mh.b
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                ComponentActivity componentActivity = ComponentActivity.this;
                Objects.requireNonNull(componentActivity);
                Bundle bundle = new Bundle();
                androidx.core.mh.result.d dVar = componentActivity.f1831w;
                Objects.requireNonNull(dVar);
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(dVar.f1863c.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(dVar.f1863c.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(dVar.f1864e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) dVar.f1867h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", dVar.f1861a);
                return bundle;
            }
        });
        r(new b.b() { // from class: androidx.core.mh.c
            @Override // b.b
            public final void a(Context context) {
                ComponentActivity componentActivity = ComponentActivity.this;
                Bundle a10 = componentActivity.f1828m.f3134b.a("android:support:activity-result");
                if (a10 != null) {
                    androidx.core.mh.result.d dVar = componentActivity.f1831w;
                    Objects.requireNonNull(dVar);
                    ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null) {
                        if (integerArrayList == null) {
                            return;
                        }
                        dVar.f1864e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        dVar.f1861a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        dVar.f1867h.putAll(a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                            String str = stringArrayList.get(i11);
                            if (dVar.f1863c.containsKey(str)) {
                                Integer remove = dVar.f1863c.remove(str);
                                if (!dVar.f1867h.containsKey(str)) {
                                    dVar.f1862b.remove(remove);
                                }
                            }
                            int intValue = integerArrayList.get(i11).intValue();
                            String str2 = stringArrayList.get(i11);
                            dVar.f1862b.put(Integer.valueOf(intValue), str2);
                            dVar.f1863c.put(str2, Integer.valueOf(intValue));
                        }
                    }
                }
            }
        });
    }

    public ComponentActivity(int i10) {
        this();
        this.f1830u = i10;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        t();
        super.addContentView(view, layoutParams);
    }

    @Override // b0.g, androidx.lifecycle.k
    public Lifecycle b() {
        return this.f1827j;
    }

    @Override // androidx.core.mh.g
    public final OnBackPressedDispatcher c() {
        return this.f1829t;
    }

    @Override // androidx.core.mh.result.e
    public final androidx.core.mh.result.d g() {
        return this.f1831w;
    }

    @Override // androidx.lifecycle.b0
    public a0 j() {
        if (getApplication() != null) {
            s();
            return this.n;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.savedstate.c
    public final androidx.savedstate.a l() {
        return this.f1828m.f3134b;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f1831w.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f1829t.b();
    }

    @Override // b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1828m.a(bundle);
        b.a aVar = this.f1826f;
        aVar.f3381b = this;
        for (b.b bVar : aVar.f3380a) {
            bVar.a(this);
        }
        super.onCreate(bundle);
        u.c(this);
        int i10 = this.f1830u;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f1831w.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        a0 a0Var = this.n;
        if (a0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            a0Var = cVar.f1837a;
        }
        if (a0Var == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f1837a = a0Var;
        return cVar2;
    }

    @Override // b0.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        l lVar = this.f1827j;
        if (lVar instanceof l) {
            Lifecycle.State state = Lifecycle.State.CREATED;
            lVar.d("setCurrentState");
            lVar.g(state);
        }
        super.onSaveInstanceState(bundle);
        this.f1828m.b(bundle);
    }

    public final void r(b.b bVar) {
        b.a aVar = this.f1826f;
        if (aVar.f3381b != null) {
            bVar.a(aVar.f3381b);
        }
        aVar.f3380a.add(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (t1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void s() {
        if (this.n == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.n = cVar.f1837a;
            }
            if (this.n == null) {
                this.n = new a0();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        t();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        t();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        t();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public final void t() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }
}
