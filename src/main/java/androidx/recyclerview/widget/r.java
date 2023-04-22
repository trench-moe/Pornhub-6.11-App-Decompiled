package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class r extends RecyclerView.v {

    /* renamed from: k  reason: collision with root package name */
    public PointF f3112k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f3113l;
    public float n;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f3110i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f3111j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f3114m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f3115o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f3116p = 0;

    public r(Context context) {
        this.f3113l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void c(int i10, int i11, RecyclerView.w wVar, RecyclerView.v.a aVar) {
        float f10;
        if (this.f2854b.C.x() == 0) {
            g();
            return;
        }
        int i12 = this.f3115o;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f3115o = i13;
        int i15 = this.f3116p;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f3116p = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a10 = a(this.f2853a);
            if (a10 != null) {
                if (a10.x != 0.0f || a10.y != 0.0f) {
                    float f11 = a10.y;
                    float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                    float f12 = a10.x / sqrt;
                    a10.x = f12;
                    float f13 = a10.y / sqrt;
                    a10.y = f13;
                    this.f3112k = a10;
                    this.f3115o = (int) (f12 * 10000.0f);
                    this.f3116p = (int) (f13 * 10000.0f);
                    aVar.b((int) (this.f3115o * 1.2f), (int) (this.f3116p * 1.2f), (int) (k(10000) * 1.2f), this.f3110i);
                    return;
                }
            }
            aVar.d = this.f2853a;
            g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void d() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void e() {
        this.f3116p = 0;
        this.f3115o = 0;
        this.f3112k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    @Override // androidx.recyclerview.widget.RecyclerView.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.view.View r10, androidx.recyclerview.widget.RecyclerView.w r11, androidx.recyclerview.widget.RecyclerView.v.a r12) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.r.f(android.view.View, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$v$a):void");
    }

    public int h(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public float i(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int j(int i10) {
        return (int) Math.ceil(k(i10) / 0.3356d);
    }

    public int k(int i10) {
        float abs = Math.abs(i10);
        if (!this.f3114m) {
            this.n = i(this.f3113l);
            this.f3114m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public int l() {
        PointF pointF = this.f3112k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
