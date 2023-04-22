package uc;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f15829c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f15830f;

    public d(g gVar, ViewGroup viewGroup) {
        this.f15830f = gVar;
        this.f15829c = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewGroup viewGroup = this.f15829c;
        if (viewGroup != null) {
            viewGroup.addView(this.f15830f.f15841h);
            return;
        }
        g gVar = this.f15830f;
        ((Activity) gVar.f15835a).addContentView(gVar.f15841h, new RelativeLayout.LayoutParams(-1, -1));
    }
}
