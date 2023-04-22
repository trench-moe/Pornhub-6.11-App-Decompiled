package uc;

import android.view.View;

/* loaded from: classes2.dex */
public class c implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f15828c;

    public c(g gVar) {
        this.f15828c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Runnable runnable = this.f15828c.f15843j;
        if (runnable != null) {
            runnable.run();
        }
    }
}
