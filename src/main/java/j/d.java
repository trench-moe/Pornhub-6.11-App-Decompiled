package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import j.a;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class d extends a implements e.a {

    /* renamed from: j  reason: collision with root package name */
    public Context f11046j;

    /* renamed from: m  reason: collision with root package name */
    public ActionBarContextView f11047m;
    public a.InterfaceC0159a n;

    /* renamed from: t  reason: collision with root package name */
    public WeakReference<View> f11048t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11049u;

    /* renamed from: w  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f11050w;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0159a interfaceC0159a, boolean z10) {
        this.f11046j = context;
        this.f11047m = actionBarContextView;
        this.n = interfaceC0159a;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(actionBarContextView.getContext());
        eVar.f652l = 1;
        this.f11050w = eVar;
        eVar.f645e = this;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.n.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        i();
        androidx.appcompat.widget.c cVar = this.f11047m.f955m;
        if (cVar != null) {
            cVar.q();
        }
    }

    @Override // j.a
    public void c() {
        if (this.f11049u) {
            return;
        }
        this.f11049u = true;
        this.n.b(this);
    }

    @Override // j.a
    public View d() {
        WeakReference<View> weakReference = this.f11048t;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public Menu e() {
        return this.f11050w;
    }

    @Override // j.a
    public MenuInflater f() {
        return new f(this.f11047m.getContext());
    }

    @Override // j.a
    public CharSequence g() {
        return this.f11047m.getSubtitle();
    }

    @Override // j.a
    public CharSequence h() {
        return this.f11047m.getTitle();
    }

    @Override // j.a
    public void i() {
        this.n.d(this, this.f11050w);
    }

    @Override // j.a
    public boolean j() {
        return this.f11047m.I;
    }

    @Override // j.a
    public void k(View view) {
        this.f11047m.setCustomView(view);
        this.f11048t = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.a
    public void l(int i10) {
        this.f11047m.setSubtitle(this.f11046j.getString(i10));
    }

    @Override // j.a
    public void m(CharSequence charSequence) {
        this.f11047m.setSubtitle(charSequence);
    }

    @Override // j.a
    public void n(int i10) {
        this.f11047m.setTitle(this.f11046j.getString(i10));
    }

    @Override // j.a
    public void o(CharSequence charSequence) {
        this.f11047m.setTitle(charSequence);
    }

    @Override // j.a
    public void p(boolean z10) {
        this.f11041f = z10;
        this.f11047m.setTitleOptional(z10);
    }
}
