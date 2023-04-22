package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.i;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: c  reason: collision with root package name */
    public e f664c;

    /* renamed from: f  reason: collision with root package name */
    public androidx.appcompat.app.b f665f;

    /* renamed from: j  reason: collision with root package name */
    public c f666j;

    public f(e eVar) {
        this.f664c = eVar;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void d(e eVar, boolean z10) {
        androidx.appcompat.app.b bVar;
        if ((z10 || eVar == this.f664c) && (bVar = this.f665f) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean e(e eVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f664c.q(((c.a) this.f666j.b()).getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        c cVar = this.f666j;
        e eVar = this.f664c;
        i.a aVar = cVar.n;
        if (aVar != null) {
            aVar.d(eVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 != 82) {
            if (i10 == 4) {
            }
            return this.f664c.performShortcut(i10, keyEvent, 0);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            Window window2 = this.f665f.getWindow();
            if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
                return true;
            }
        } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f665f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
            this.f664c.c(true);
            dialogInterface.dismiss();
            return true;
        }
        return this.f664c.performShortcut(i10, keyEvent, 0);
    }
}
