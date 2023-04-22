package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends ViewPager2.g {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayoutManager f3363a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager2.i f3364b;

    public b(LinearLayoutManager linearLayoutManager) {
        this.f3363a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void a(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void b(int i10, float f10, int i11) {
        if (this.f3364b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f3363a.x(); i12++) {
            View w10 = this.f3363a.w(i12);
            if (w10 == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f3363a.x())));
            }
            this.f3364b.a(w10, (this.f3363a.P(w10) - i10) + f11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void c(int i10) {
    }
}
