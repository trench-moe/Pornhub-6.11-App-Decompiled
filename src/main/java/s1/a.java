package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes2.dex */
public class a extends ImageView {

    /* renamed from: c  reason: collision with root package name */
    public Animation.AnimationListener f14776c;

    /* renamed from: f  reason: collision with root package name */
    public int f14777f;

    public a(Context context) {
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(x.c.f17614f);
        this.f14777f = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.i.s(this, f10 * 4.0f);
        shapeDrawable.getPaint().setColor(this.f14777f);
        x.d.q(this, shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f14776c;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f14776c;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f14777f = i10;
        }
    }
}
