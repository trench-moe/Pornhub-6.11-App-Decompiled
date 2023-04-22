package u1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes2.dex */
public class t implements ua.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15509a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewOverlay f15510b;

    public t(View view, int i10) {
        this.f15509a = i10;
        if (i10 != 1) {
            this.f15510b = view.getOverlay();
        } else {
            this.f15510b = view.getOverlay();
        }
    }

    public void a(Drawable drawable) {
        switch (this.f15509a) {
            case 0:
                this.f15510b.remove(drawable);
                return;
            default:
                this.f15510b.remove(drawable);
                return;
        }
    }
}
