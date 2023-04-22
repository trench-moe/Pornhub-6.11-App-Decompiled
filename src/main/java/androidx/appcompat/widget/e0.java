package androidx.appcompat.widget;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f980a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.view.menu.e f981b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.appcompat.view.menu.h f982c;
    public a d;

    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public e0(Context context, View view) {
        this.f980a = context;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.f981b = eVar;
        eVar.f645e = new c0(this);
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context, eVar, view, false, R.attr.popupMenuStyle, 0);
        this.f982c = hVar;
        hVar.f696g = 0;
        hVar.f700k = new d0(this);
    }

    public void a(int i10) {
        new j.f(this.f980a).inflate(i10, this.f981b);
    }

    public void b() {
        if (!this.f982c.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
