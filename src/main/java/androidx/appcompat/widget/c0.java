package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.e0;

/* loaded from: classes.dex */
public class c0 implements e.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e0 f973c;

    public c0(e0 e0Var) {
        this.f973c = e0Var;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        e0.a aVar = this.f973c.d;
        if (aVar != null) {
            return aVar.onMenuItemClick(menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
    }
}
