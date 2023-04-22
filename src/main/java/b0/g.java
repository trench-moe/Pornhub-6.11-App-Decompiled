package b0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;
import n0.f;

/* loaded from: classes.dex */
public class g extends Activity implements androidx.lifecycle.k, f.a {

    /* renamed from: c  reason: collision with root package name */
    public androidx.lifecycle.l f3404c = new androidx.lifecycle.l(this);

    public Lifecycle b() {
        return this.f3404c;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !n0.f.a(decorView, keyEvent)) {
            return n0.f.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !n0.f.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // n0.f.a
    public boolean m(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.l lVar = this.f3404c;
        Lifecycle.State state = Lifecycle.State.CREATED;
        lVar.d("markState");
        lVar.d("setCurrentState");
        lVar.g(state);
        super.onSaveInstanceState(bundle);
    }
}
