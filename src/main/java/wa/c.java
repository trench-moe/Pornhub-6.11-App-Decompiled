package wa;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public final class c extends androidx.appcompat.view.menu.e {
    public final int A;

    /* renamed from: z  reason: collision with root package name */
    public final Class<?> f17408z;

    public c(Context context, Class<?> cls, int i10) {
        super(context);
        this.f17408z = cls;
        this.A = i10;
    }

    @Override // androidx.appcompat.view.menu.e
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.A) {
            A();
            MenuItem a10 = super.a(i10, i11, i12, charSequence);
            ((androidx.appcompat.view.menu.g) a10).k(true);
            z();
            return a10;
        }
        String simpleName = this.f17408z.getSimpleName();
        StringBuilder p10 = a1.a.p("Maximum number of items supported by ", simpleName, " is ");
        p10.append(this.A);
        p10.append(". Limit can be checked with ");
        p10.append(simpleName);
        p10.append("#getMaxItemCount()");
        throw new IllegalArgumentException(p10.toString());
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f17408z.getSimpleName() + " does not support submenus");
    }
}
