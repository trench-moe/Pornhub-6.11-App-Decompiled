package e;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import j.a;
import java.lang.ref.WeakReference;
import n0.f;

/* loaded from: classes.dex */
public class m extends Dialog implements h {

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.app.c f8935c;

    /* renamed from: f  reason: collision with root package name */
    public final f.a f8936f;

    /* loaded from: classes.dex */
    public class a implements f.a {
        public a() {
        }

        @Override // n0.f.a
        public boolean m(KeyEvent keyEvent) {
            return m.this.b(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968967(0x7f040187, float:1.7546603E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            e.m$a r2 = new e.m$a
            r2.<init>()
            r4.f8936f = r2
            androidx.appcompat.app.c r2 = r4.a()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r2.y(r6)
            r5 = 0
            r2.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m.<init>(android.content.Context, int):void");
    }

    public androidx.appcompat.app.c a() {
        if (this.f8935c == null) {
            p.c<WeakReference<androidx.appcompat.app.c>> cVar = androidx.appcompat.app.c.f498c;
            this.f8935c = new androidx.appcompat.app.d(getContext(), getWindow(), this, this);
        }
        return this.f8935c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean c(int i10) {
        return a().t(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return n0.f.b(this.f8936f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().e(i10);
    }

    @Override // e.h
    public void h(j.a aVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().j();
    }

    @Override // e.h
    public void n(j.a aVar) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().r();
    }

    @Override // e.h
    public j.a p(a.InterfaceC0159a interfaceC0159a) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().u(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().v(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().z(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().z(charSequence);
    }
}
