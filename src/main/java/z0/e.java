package z0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e implements KeyListener {

    /* renamed from: c  reason: collision with root package name */
    public final KeyListener f18678c;

    /* renamed from: f  reason: collision with root package name */
    public final a f18679f;

    /* loaded from: classes2.dex */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f18678c = keyListener;
        this.f18679f = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f18678c.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f18678c.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        Objects.requireNonNull(this.f18679f);
        Object obj = androidx.emoji2.text.d.f1936j;
        if (i10 != 67 ? i10 != 112 ? false : androidx.emoji2.text.h.a(editable, keyEvent, true) : androidx.emoji2.text.h.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !this.f18678c.onKeyDown(view, editable, i10, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f18678c.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f18678c.onKeyUp(view, editable, i10, keyEvent);
    }
}
