package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import i0.b;

/* loaded from: classes.dex */
public class g implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2132b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f2133c;

    public g(c cVar, View view, ViewGroup viewGroup, c.b bVar) {
        this.f2131a = view;
        this.f2132b = viewGroup;
        this.f2133c = bVar;
    }

    @Override // i0.b.a
    public void a() {
        this.f2131a.clearAnimation();
        this.f2132b.endViewTransition(this.f2131a);
        this.f2133c.a();
    }
}
