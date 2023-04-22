package androidx.mediarouter.app;

import android.view.View;
import androidx.mediarouter.app.l;
import j1.l;

/* loaded from: classes.dex */
public class m implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.i f2566c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l.d.c f2567f;

    public m(l.d.c cVar, l.i iVar) {
        this.f2567f = cVar;
        this.f2566c = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        l lVar = l.this;
        l.i iVar = this.f2566c;
        lVar.A = iVar;
        iVar.m();
        this.f2567f.f2562v.setVisibility(4);
        this.f2567f.f2563w.setVisibility(0);
    }
}
