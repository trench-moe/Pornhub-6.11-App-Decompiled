package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.g;

/* loaded from: classes.dex */
public class a0 implements g.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2947a;

    public a0(RecyclerView recyclerView) {
        this.f2947a = recyclerView;
    }

    public View a(int i10) {
        return this.f2947a.getChildAt(i10);
    }

    public int b() {
        return this.f2947a.getChildCount();
    }

    public void c(int i10) {
        View childAt = this.f2947a.getChildAt(i10);
        if (childAt != null) {
            this.f2947a.p(childAt);
            childAt.clearAnimation();
        }
        this.f2947a.removeViewAt(i10);
    }
}
