package ab;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import cb.g;
import cb.k;
import cb.o;
import f0.d;

/* loaded from: classes.dex */
public class a extends Drawable implements o, d {

    /* renamed from: c  reason: collision with root package name */
    public b f337c;

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public g f338a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f339b;

        public b(b bVar) {
            this.f338a = (g) bVar.f338a.f3929c.newDrawable();
            this.f339b = bVar.f339b;
        }

        public b(g gVar) {
            this.f338a = gVar;
            this.f339b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(new b(this), null);
        }
    }

    public a(b bVar, C0008a c0008a) {
        this.f337c = bVar;
    }

    public a(k kVar) {
        this.f337c = new b(new g(kVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f337c;
        if (bVar.f339b) {
            bVar.f338a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f337c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f337c.f338a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f337c = new b(this.f337c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f337c.f338a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f337c.f338a.setState(iArr)) {
            onStateChange = true;
        }
        boolean d = ab.b.d(iArr);
        b bVar = this.f337c;
        if (bVar.f339b != d) {
            bVar.f339b = d;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f337c.f338a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f337c.f338a.setColorFilter(colorFilter);
    }

    @Override // cb.o
    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f337c.f338a;
        gVar.f3929c.f3938a = kVar;
        gVar.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f337c.f338a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f337c.f338a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f337c.f338a.setTintMode(mode);
    }
}
