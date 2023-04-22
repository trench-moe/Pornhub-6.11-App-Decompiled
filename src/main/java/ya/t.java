package ya;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.app.pornhub.R;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class t extends m<ObjectAnimator> {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f18621l = {533, 567, 850, 750};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f18622m = {1267, 1000, 333, 0};
    public static final Property<t, Float> n = new a(Float.class, "animationFraction");
    public ObjectAnimator d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f18623e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator[] f18624f;

    /* renamed from: g  reason: collision with root package name */
    public final c f18625g;

    /* renamed from: h  reason: collision with root package name */
    public int f18626h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18627i;

    /* renamed from: j  reason: collision with root package name */
    public float f18628j;

    /* renamed from: k  reason: collision with root package name */
    public v1.b f18629k;

    /* loaded from: classes2.dex */
    public static class a extends Property<t, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(t tVar) {
            return Float.valueOf(tVar.f18628j);
        }

        @Override // android.util.Property
        public void set(t tVar, Float f10) {
            t tVar2 = tVar;
            float floatValue = f10.floatValue();
            tVar2.f18628j = floatValue;
            int i10 = (int) (floatValue * 1800.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                tVar2.f18608b[i11] = Math.max(0.0f, Math.min(1.0f, tVar2.f18624f[i11].getInterpolation(tVar2.b(i10, t.f18622m[i11], t.f18621l[i11]))));
            }
            if (tVar2.f18627i) {
                Arrays.fill(tVar2.f18609c, l9.e.b(tVar2.f18625g.f18576c[tVar2.f18626h], tVar2.f18607a.f18604z));
                tVar2.f18627i = false;
            }
            tVar2.f18607a.invalidateSelf();
        }
    }

    public t(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f18626h = 0;
        this.f18629k = null;
        this.f18625g = linearProgressIndicatorSpec;
        this.f18624f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // ya.m
    public void a() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // ya.m
    public void c() {
        h();
    }

    @Override // ya.m
    public void d(v1.b bVar) {
        this.f18629k = bVar;
    }

    @Override // ya.m
    public void e() {
        ObjectAnimator objectAnimator = this.f18623e;
        if (objectAnimator != null) {
            if (objectAnimator.isRunning()) {
                return;
            }
            a();
            if (this.f18607a.isVisible()) {
                this.f18623e.setFloatValues(this.f18628j, 1.0f);
                this.f18623e.setDuration((1.0f - this.f18628j) * 1800.0f);
                this.f18623e.start();
            }
        }
    }

    @Override // ya.m
    public void f() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new r(this));
        }
        if (this.f18623e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, n, 1.0f);
            this.f18623e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f18623e.setInterpolator(null);
            this.f18623e.addListener(new s(this));
        }
        h();
        this.d.start();
    }

    @Override // ya.m
    public void g() {
        this.f18629k = null;
    }

    public void h() {
        this.f18626h = 0;
        int b10 = l9.e.b(this.f18625g.f18576c[0], this.f18607a.f18604z);
        int[] iArr = this.f18609c;
        iArr[0] = b10;
        iArr[1] = b10;
    }
}
