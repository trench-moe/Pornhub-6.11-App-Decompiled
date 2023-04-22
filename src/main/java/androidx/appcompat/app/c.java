package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import j.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: c  reason: collision with root package name */
    public static final p.c<WeakReference<c>> f498c = new p.c<>(0);

    /* renamed from: f  reason: collision with root package name */
    public static final Object f499f = new Object();

    public static void s(c cVar) {
        synchronized (f499f) {
            Iterator<WeakReference<c>> it = f498c.iterator();
            while (true) {
                while (it.hasNext()) {
                    c cVar2 = it.next().get();
                    if (cVar2 != cVar && cVar2 != null) {
                        break;
                    }
                    it.remove();
                }
            }
        }
    }

    public abstract j.a A(a.InterfaceC0159a interfaceC0159a);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i10);

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract ActionBar h();

    public abstract void i();

    public abstract void j();

    public abstract void k(Configuration configuration);

    public abstract void l(Bundle bundle);

    public abstract void m();

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int i10);

    public abstract void u(int i10);

    public abstract void v(View view);

    public abstract void w(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void x(Toolbar toolbar);

    public void y(int i10) {
    }

    public abstract void z(CharSequence charSequence);
}
