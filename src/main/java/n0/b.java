package n0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.mediarouter.app.MediaRouteActionProvider;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13097a;

    /* renamed from: b  reason: collision with root package name */
    public a f13098b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC0217b f13099c;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: n0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0217b {
    }

    public b(Context context) {
        this.f13097a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return this instanceof MediaRouteActionProvider;
    }

    public void h(InterfaceC0217b interfaceC0217b) {
        if (this.f13099c != null) {
            StringBuilder m10 = a1.a.m("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            m10.append(getClass().getSimpleName());
            m10.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", m10.toString());
        }
        this.f13099c = interfaceC0217b;
    }

    public void i(boolean z10) {
        a aVar = this.f13098b;
        if (aVar != null) {
            androidx.appcompat.widget.c cVar = (androidx.appcompat.widget.c) aVar;
            if (z10) {
                i.a aVar2 = cVar.n;
                if (aVar2 != null) {
                    aVar2.e(cVar.f608j);
                }
            } else {
                androidx.appcompat.view.menu.e eVar = cVar.f608j;
                if (eVar != null) {
                    eVar.c(false);
                }
            }
        }
    }
}
