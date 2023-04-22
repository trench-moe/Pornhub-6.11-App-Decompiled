package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class i {

    /* renamed from: e  reason: collision with root package name */
    public static i f7674e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f7675a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7676b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f7677c;
    public c d;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            i iVar = i.this;
            c cVar = (c) message.obj;
            synchronized (iVar.f7675a) {
                if (iVar.f7677c != cVar) {
                    if (iVar.d == cVar) {
                    }
                }
                iVar.a(cVar, 2);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void c();

        void d(int i10);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f7679a;

        /* renamed from: b  reason: collision with root package name */
        public int f7680b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f7681c;

        public c(int i10, b bVar) {
            this.f7679a = new WeakReference<>(bVar);
            this.f7680b = i10;
        }
    }

    public static i b() {
        if (f7674e == null) {
            f7674e = new i();
        }
        return f7674e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = cVar.f7679a.get();
        if (bVar != null) {
            this.f7676b.removeCallbacksAndMessages(cVar);
            bVar.d(i10);
            return true;
        }
        return false;
    }

    public final boolean c(b bVar) {
        c cVar = this.f7677c;
        if (cVar != null) {
            return bVar != null && cVar.f7679a.get() == bVar;
        }
        return false;
    }

    public final boolean d(b bVar) {
        c cVar = this.d;
        if (cVar != null) {
            return bVar != null && cVar.f7679a.get() == bVar;
        }
        return false;
    }

    public void e(b bVar) {
        synchronized (this.f7675a) {
            if (c(bVar)) {
                c cVar = this.f7677c;
                if (!cVar.f7681c) {
                    cVar.f7681c = true;
                    this.f7676b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f7675a) {
            if (c(bVar)) {
                c cVar = this.f7677c;
                if (cVar.f7681c) {
                    cVar.f7681c = false;
                    g(cVar);
                }
            }
        }
    }

    public final void g(c cVar) {
        int i10 = cVar.f7680b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f7676b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f7676b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    public final void h() {
        c cVar = this.d;
        if (cVar != null) {
            this.f7677c = cVar;
            this.d = null;
            b bVar = cVar.f7679a.get();
            if (bVar != null) {
                bVar.c();
            } else {
                this.f7677c = null;
            }
        }
    }
}
