package t9;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public final class p extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15317b;

    /* renamed from: c  reason: collision with root package name */
    public final View f15318c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final Drawable f15319e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15320f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable f15321g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15322h;

    /* renamed from: i  reason: collision with root package name */
    public final Drawable f15323i;

    /* renamed from: j  reason: collision with root package name */
    public final String f15324j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15325k = false;

    public p(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z10) {
        this.f15317b = imageView;
        this.f15319e = drawable;
        this.f15321g = drawable2;
        this.f15323i = drawable3 != null ? drawable3 : drawable2;
        this.f15320f = context.getString(R.string.cast_play);
        this.f15322h = context.getString(R.string.cast_pause);
        this.f15324j = context.getString(R.string.cast_stop);
        this.f15318c = view;
        this.d = z10;
        imageView.setEnabled(false);
    }

    @Override // y8.a
    public final void b() {
        h();
    }

    @Override // y8.a
    public final void c() {
        g(true);
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        h();
    }

    @Override // y8.a
    public final void e() {
        this.f15317b.setEnabled(false);
        this.f18545a = null;
    }

    public final void f(Drawable drawable, String str) {
        boolean z10 = !drawable.equals(this.f15317b.getDrawable());
        this.f15317b.setImageDrawable(drawable);
        this.f15317b.setContentDescription(str);
        this.f15317b.setVisibility(0);
        this.f15317b.setEnabled(true);
        View view = this.f15318c;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z10 && this.f15325k) {
            this.f15317b.sendAccessibilityEvent(8);
        }
    }

    @TargetApi(21)
    public final void g(boolean z10) {
        this.f15325k = this.f15317b.isAccessibilityFocused();
        View view = this.f15318c;
        int i10 = 0;
        if (view != null) {
            view.setVisibility(0);
            if (this.f15325k) {
                this.f15318c.sendAccessibilityEvent(8);
            }
        }
        ImageView imageView = this.f15317b;
        if (true == this.d) {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        this.f15317b.setEnabled(!z10);
    }

    public final void h() {
        w8.g gVar = this.f18545a;
        if (gVar != null && gVar.j()) {
            if (gVar.o()) {
                if (gVar.l()) {
                    f(this.f15323i, this.f15324j);
                    return;
                } else {
                    f(this.f15321g, this.f15322h);
                    return;
                }
            } else if (gVar.k()) {
                g(false);
                return;
            } else if (gVar.n()) {
                f(this.f15319e, this.f15320f);
                return;
            } else if (gVar.m()) {
                g(true);
                return;
            } else {
                return;
            }
        }
        this.f15317b.setEnabled(false);
    }
}
