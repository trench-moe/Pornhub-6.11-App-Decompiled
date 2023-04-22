package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class v<E> extends af.c {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f2270c;

    /* renamed from: f  reason: collision with root package name */
    public final Context f2271f;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f2272j;

    /* renamed from: m  reason: collision with root package name */
    public final y f2273m;

    public v(o oVar) {
        Handler handler = new Handler();
        this.f2273m = new z();
        this.f2270c = oVar;
        cb.e.u(oVar, "context == null");
        this.f2271f = oVar;
        this.f2272j = handler;
    }

    public abstract void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract E t();

    public abstract LayoutInflater u();

    public abstract boolean v(Fragment fragment);

    public abstract boolean w(String str);

    public abstract void x();
}
