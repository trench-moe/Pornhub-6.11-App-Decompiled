package ma;

import ab.b;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import cb.d;
import cb.g;
import cb.j;
import cb.k;
import com.app.pornhub.R;
import com.google.android.material.card.MaterialCardView;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final double f13035t = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f13036a;

    /* renamed from: c  reason: collision with root package name */
    public final g f13038c;
    public final g d;

    /* renamed from: e  reason: collision with root package name */
    public int f13039e;

    /* renamed from: f  reason: collision with root package name */
    public int f13040f;

    /* renamed from: g  reason: collision with root package name */
    public int f13041g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f13042h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f13043i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f13044j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f13045k;

    /* renamed from: l  reason: collision with root package name */
    public k f13046l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f13047m;
    public Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public LayerDrawable f13048o;

    /* renamed from: p  reason: collision with root package name */
    public g f13049p;

    /* renamed from: q  reason: collision with root package name */
    public g f13050q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f13052s;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f13037b = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public boolean f13051r = false;

    /* renamed from: ma.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0213a extends InsetDrawable {
        public C0213a(a aVar, Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f13036a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f13038c = gVar;
        gVar.o(materialCardView.getContext());
        gVar.u(-12303292);
        k kVar = gVar.f3929c.f3938a;
        Objects.requireNonNull(kVar);
        k.b bVar = new k.b(kVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, m9.a.D, i10, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            bVar.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new g();
        h(bVar.a());
        obtainStyledAttributes.recycle();
    }

    public final float a() {
        float b10 = b(this.f13046l.f3960a, this.f13038c.m());
        b7.k kVar = this.f13046l.f3961b;
        g gVar = this.f13038c;
        float max = Math.max(b10, b(kVar, gVar.f3929c.f3938a.f3964f.a(gVar.i())));
        b7.k kVar2 = this.f13046l.f3962c;
        g gVar2 = this.f13038c;
        float b11 = b(kVar2, gVar2.f3929c.f3938a.f3965g.a(gVar2.i()));
        b7.k kVar3 = this.f13046l.d;
        g gVar3 = this.f13038c;
        return Math.max(max, Math.max(b11, b(kVar3, gVar3.f3929c.f3938a.f3966h.a(gVar3.i()))));
    }

    public final float b(b7.k kVar, float f10) {
        if (kVar instanceof j) {
            return (float) ((1.0d - f13035t) * f10);
        }
        if (kVar instanceof d) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        return this.f13036a.getMaxCardElevation() + (j() ? a() : 0.0f);
    }

    public final float d() {
        return (this.f13036a.getMaxCardElevation() * 1.5f) + (j() ? a() : 0.0f);
    }

    public final Drawable e() {
        if (this.n == null) {
            int[] iArr = b.f340a;
            this.f13050q = new g(this.f13046l);
            this.n = new RippleDrawable(this.f13044j, null, this.f13050q);
        }
        if (this.f13048o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, this.f13043i});
            this.f13048o = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f13048o;
    }

    public final Drawable f(Drawable drawable) {
        int i10;
        int i11;
        if (this.f13036a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil(d());
            i10 = (int) Math.ceil(c());
            i11 = ceil;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new C0213a(this, drawable, i10, i11, i10, i11);
    }

    public void g(Drawable drawable) {
        this.f13043i = drawable;
        if (drawable != null) {
            Drawable mutate = f0.a.h(drawable).mutate();
            this.f13043i = mutate;
            mutate.setTintList(this.f13045k);
            boolean isChecked = this.f13036a.isChecked();
            Drawable drawable2 = this.f13043i;
            if (drawable2 != null) {
                drawable2.setAlpha(isChecked ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            }
        }
        LayerDrawable layerDrawable = this.f13048o;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f13043i);
        }
    }

    public void h(k kVar) {
        this.f13046l = kVar;
        g gVar = this.f13038c;
        gVar.f3929c.f3938a = kVar;
        gVar.invalidateSelf();
        g gVar2 = this.f13038c;
        gVar2.M = !gVar2.p();
        g gVar3 = this.d;
        if (gVar3 != null) {
            gVar3.f3929c.f3938a = kVar;
            gVar3.invalidateSelf();
        }
        g gVar4 = this.f13050q;
        if (gVar4 != null) {
            gVar4.f3929c.f3938a = kVar;
            gVar4.invalidateSelf();
        }
        g gVar5 = this.f13049p;
        if (gVar5 != null) {
            gVar5.f3929c.f3938a = kVar;
            gVar5.invalidateSelf();
        }
    }

    public final boolean i() {
        return this.f13036a.getPreventCornerOverlap() && !this.f13038c.p();
    }

    public final boolean j() {
        return this.f13036a.getPreventCornerOverlap() && this.f13038c.p() && this.f13036a.getUseCompatPadding();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k() {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.a.k():void");
    }

    public void l() {
        if (!this.f13051r) {
            this.f13036a.setBackgroundInternal(f(this.f13038c));
        }
        this.f13036a.setForeground(f(this.f13042h));
    }

    public final void m() {
        int[] iArr = b.f340a;
        Drawable drawable = this.n;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f13044j);
            return;
        }
        g gVar = this.f13049p;
        if (gVar != null) {
            gVar.r(this.f13044j);
        }
    }

    public void n() {
        this.d.x(this.f13041g, this.f13047m);
    }
}
