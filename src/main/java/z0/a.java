package z0;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f18666a;

    /* renamed from: z0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0314a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f18667a;

        /* renamed from: b  reason: collision with root package name */
        public final g f18668b;

        public C0314a(EditText editText, boolean z10) {
            this.f18667a = editText;
            g gVar = new g(editText, z10);
            this.f18668b = gVar;
            editText.addTextChangedListener(gVar);
            if (z0.b.f18670b == null) {
                synchronized (z0.b.f18669a) {
                    if (z0.b.f18670b == null) {
                        z0.b.f18670b = new z0.b();
                    }
                }
            }
            editText.setEditableFactory(z0.b.f18670b);
        }

        @Override // z0.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        @Override // z0.a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f18667a, inputConnection, editorInfo);
        }

        @Override // z0.a.b
        public void c(boolean z10) {
            g gVar = this.f18668b;
            if (gVar.f18688m != z10) {
                if (gVar.f18687j != null) {
                    androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
                    d.e eVar = gVar.f18687j;
                    Objects.requireNonNull(a10);
                    cb.e.u(eVar, "initCallback cannot be null");
                    a10.f1938a.writeLock().lock();
                    try {
                        a10.f1939b.remove(eVar);
                        a10.f1938a.writeLock().unlock();
                    } catch (Throwable th) {
                        a10.f1938a.writeLock().unlock();
                        throw th;
                    }
                }
                gVar.f18688m = z10;
                if (z10) {
                    g.a(gVar.f18685c, androidx.emoji2.text.d.a().b());
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText, boolean z10) {
        cb.e.u(editText, "editText cannot be null");
        this.f18666a = new C0314a(editText, z10);
    }
}
