package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r0 f2148c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f2149f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Rect f2150j;

    public i(c cVar, r0 r0Var, View view, Rect rect) {
        this.f2148c = r0Var;
        this.f2149f = view;
        this.f2150j = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2148c.j(this.f2149f, this.f2150j);
    }
}
