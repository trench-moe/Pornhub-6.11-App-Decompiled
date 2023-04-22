package a6;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class e<Z> extends h<ImageView, Z> {

    /* renamed from: j  reason: collision with root package name */
    public Animatable f194j;

    public e(ImageView imageView) {
        super(imageView);
    }

    public abstract void b(Z z10);

    @Override // a6.g
    public void d(Z z10, b6.b<? super Z> bVar) {
        l(z10);
    }

    @Override // a6.g
    public void f(Drawable drawable) {
        l(null);
        ((ImageView) this.f195c).setImageDrawable(drawable);
    }

    @Override // w5.i
    public void g() {
        Animatable animatable = this.f194j;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // a6.g
    public void i(Drawable drawable) {
        l(null);
        ((ImageView) this.f195c).setImageDrawable(drawable);
    }

    @Override // a6.g
    public void k(Drawable drawable) {
        this.f196f.a();
        Animatable animatable = this.f194j;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        ((ImageView) this.f195c).setImageDrawable(drawable);
    }

    public final void l(Z z10) {
        b(z10);
        if (!(z10 instanceof Animatable)) {
            this.f194j = null;
            return;
        }
        Animatable animatable = (Animatable) z10;
        this.f194j = animatable;
        animatable.start();
    }

    @Override // w5.i
    public void m() {
        Animatable animatable = this.f194j;
        if (animatable != null) {
            animatable.start();
        }
    }
}
