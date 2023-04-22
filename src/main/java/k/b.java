package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import md.h;
import t9.j0;
import ud.j;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11723a;

    /* renamed from: b  reason: collision with root package name */
    public Object f11724b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11725c;

    public /* synthetic */ b(td.c cVar, j jVar) {
        l9.e.l(cVar, "Session input buffer");
        this.f11723a = cVar;
        this.f11725c = jVar == null ? j0.f15266m : jVar;
        this.f11724b = new CharArrayBuffer(128);
    }

    public MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof h0.b) {
            h0.b bVar = (h0.b) menuItem;
            if (((p.g) this.f11724b) == null) {
                this.f11724b = new p.g();
            }
            MenuItem menuItem2 = (MenuItem) ((p.g) this.f11724b).getOrDefault(menuItem, null);
            if (menuItem2 == null) {
                c cVar = new c((Context) this.f11723a, bVar);
                ((p.g) this.f11724b).put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof h0.c) {
            h0.c cVar = (h0.c) subMenu;
            if (((p.g) this.f11725c) == null) {
                this.f11725c = new p.g();
            }
            SubMenu subMenu2 = (SubMenu) ((p.g) this.f11725c).get(cVar);
            if (subMenu2 == null) {
                g gVar = new g((Context) this.f11723a, cVar);
                ((p.g) this.f11725c).put(cVar, gVar);
                return gVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public abstract void e(h hVar);
}
