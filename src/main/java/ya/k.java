package ya;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public abstract class k extends Drawable implements Animatable {
    public static final Property<k, Float> A = new a(Float.class, "growFraction");

    /* renamed from: c  reason: collision with root package name */
    public final Context f18597c;

    /* renamed from: f  reason: collision with root package name */
    public final c f18598f;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f18600m;
    public ValueAnimator n;

    /* renamed from: t  reason: collision with root package name */
    public List<v1.b> f18601t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18602u;

    /* renamed from: w  reason: collision with root package name */
    public float f18603w;
    public final Paint y = new Paint();

    /* renamed from: j  reason: collision with root package name */
    public ya.a f18599j = new ya.a();

    /* renamed from: z  reason: collision with root package name */
    public int f18604z = KotlinVersion.MAX_COMPONENT_VALUE;

    /* loaded from: classes2.dex */
    public static class a extends Property<k, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(k kVar) {
            return Float.valueOf(kVar.c());
        }

        @Override // android.util.Property
        public void set(k kVar, Float f10) {
            k kVar2 = kVar;
            float floatValue = f10.floatValue();
            if (kVar2.f18603w != floatValue) {
                kVar2.f18603w = floatValue;
                kVar2.invalidateSelf();
            }
        }
    }

    public k(Context context, c cVar) {
        this.f18597c = context;
        this.f18598f = cVar;
        invalidateSelf();
    }

    public final void b(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f18602u;
        this.f18602u = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f18602u = z10;
    }

    public float c() {
        c cVar = this.f18598f;
        boolean z10 = false;
        if (!(cVar.f18577e != 0)) {
            if (cVar.f18578f != 0) {
                z10 = true;
            }
            if (!z10) {
                return 1.0f;
            }
        }
        return this.f18603w;
    }

    public boolean d() {
        return h(false, false, false);
    }

    public boolean e() {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public boolean f() {
        ValueAnimator valueAnimator = this.f18600m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public void g(v1.b bVar) {
        if (this.f18601t == null) {
            this.f18601t = new ArrayList();
        }
        if (!this.f18601t.contains(bVar)) {
            this.f18601t.add(bVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18604z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h(boolean z10, boolean z11, boolean z12) {
        return i(z10, z11, z12 && this.f18599j.a(this.f18597c.getContentResolver()) > 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i(boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.k.i(boolean, boolean, boolean):boolean");
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (!f() && !e()) {
            return false;
        }
        return true;
    }

    public boolean j(v1.b bVar) {
        List<v1.b> list = this.f18601t;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f18601t.remove(bVar);
        if (this.f18601t.isEmpty()) {
            this.f18601t = null;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18604z = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.y.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return h(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        i(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        i(false, true, false);
    }
}
