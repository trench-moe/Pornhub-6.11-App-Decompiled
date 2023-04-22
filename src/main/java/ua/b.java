package ua;

import android.content.Context;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public class b extends androidx.appcompat.view.menu.e {
    public b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i10, i11, i12, charSequence);
        d dVar = new d(this.f642a, this, gVar);
        gVar.f679o = dVar;
        dVar.setHeaderTitle(gVar.f670e);
        return dVar;
    }
}
