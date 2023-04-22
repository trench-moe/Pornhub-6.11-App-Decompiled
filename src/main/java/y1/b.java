package y1;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import n0.d0;
import n0.n;
import n0.x;

/* loaded from: classes2.dex */
public class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f18386a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPager f18387b;

    public b(ViewPager viewPager) {
        this.f18387b = viewPager;
    }

    @Override // n0.n
    public d0 a(View view, d0 d0Var) {
        d0 p10 = x.p(view, d0Var);
        if (p10.g()) {
            return p10;
        }
        Rect rect = this.f18386a;
        rect.left = p10.c();
        rect.top = p10.e();
        rect.right = p10.d();
        rect.bottom = p10.b();
        int childCount = this.f18387b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            d0 e10 = x.e(this.f18387b.getChildAt(i10), p10);
            rect.left = Math.min(e10.c(), rect.left);
            rect.top = Math.min(e10.e(), rect.top);
            rect.right = Math.min(e10.d(), rect.right);
            rect.bottom = Math.min(e10.b(), rect.bottom);
        }
        return p10.h(rect.left, rect.top, rect.right, rect.bottom);
    }
}
