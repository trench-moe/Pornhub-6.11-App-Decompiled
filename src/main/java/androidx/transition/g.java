package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3277b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3278c;
    public final /* synthetic */ Visibility d;

    public g(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.d = visibility;
        this.f3276a = viewGroup;
        this.f3277b = view;
        this.f3278c = view2;
    }

    @Override // androidx.transition.c, androidx.transition.Transition.d
    public void b(Transition transition) {
        this.f3276a.getOverlay().remove(this.f3277b);
    }

    @Override // androidx.transition.Transition.d
    public void c(Transition transition) {
        this.f3278c.setTag(R.id.save_overlay_view, null);
        this.f3276a.getOverlay().remove(this.f3277b);
        transition.A(this);
    }

    @Override // androidx.transition.c, androidx.transition.Transition.d
    public void e(Transition transition) {
        if (this.f3277b.getParent() == null) {
            this.f3276a.getOverlay().add(this.f3277b);
        } else {
            this.d.cancel();
        }
    }
}
