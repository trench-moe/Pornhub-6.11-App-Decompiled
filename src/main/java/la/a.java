package la;

import ab.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import cb.g;
import cb.k;
import cb.o;
import com.app.pornhub.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import l9.e;
import n0.a0;
import n0.x;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f12753t;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f12754u;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f12755a;

    /* renamed from: b  reason: collision with root package name */
    public k f12756b;

    /* renamed from: c  reason: collision with root package name */
    public int f12757c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f12758e;

    /* renamed from: f  reason: collision with root package name */
    public int f12759f;

    /* renamed from: g  reason: collision with root package name */
    public int f12760g;

    /* renamed from: h  reason: collision with root package name */
    public int f12761h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f12762i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f12763j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f12764k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12765l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f12766m;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12767o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12768p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12769q;

    /* renamed from: r  reason: collision with root package name */
    public LayerDrawable f12770r;

    /* renamed from: s  reason: collision with root package name */
    public int f12771s;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f12753t = true;
        f12754u = i10 <= 22;
    }

    public a(MaterialButton materialButton, k kVar) {
        this.f12755a = materialButton;
        this.f12756b = kVar;
    }

    public o a() {
        LayerDrawable layerDrawable = this.f12770r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f12770r.getNumberOfLayers() > 2 ? (o) this.f12770r.getDrawable(2) : (o) this.f12770r.getDrawable(1);
    }

    public g b() {
        return c(false);
    }

    public final g c(boolean z10) {
        LayerDrawable layerDrawable = this.f12770r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f12753t ? (g) ((LayerDrawable) ((InsetDrawable) this.f12770r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f12770r.getDrawable(!z10 ? 1 : 0);
    }

    public final g d() {
        return c(true);
    }

    public void e(k kVar) {
        this.f12756b = kVar;
        if (f12754u && !this.f12767o) {
            MaterialButton materialButton = this.f12755a;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            int f10 = x.e.f(materialButton);
            int paddingTop = this.f12755a.getPaddingTop();
            int e10 = x.e.e(this.f12755a);
            int paddingBottom = this.f12755a.getPaddingBottom();
            g();
            x.e.k(this.f12755a, f10, paddingTop, e10, paddingBottom);
            return;
        }
        if (b() != null) {
            g b10 = b();
            b10.f3929c.f3938a = kVar;
            b10.invalidateSelf();
        }
        if (d() != null) {
            g d = d();
            d.f3929c.f3938a = kVar;
            d.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void f(int i10, int i11) {
        MaterialButton materialButton = this.f12755a;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int f10 = x.e.f(materialButton);
        int paddingTop = this.f12755a.getPaddingTop();
        int e10 = x.e.e(this.f12755a);
        int paddingBottom = this.f12755a.getPaddingBottom();
        int i12 = this.f12758e;
        int i13 = this.f12759f;
        this.f12759f = i11;
        this.f12758e = i10;
        if (!this.f12767o) {
            g();
        }
        x.e.k(this.f12755a, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void g() {
        InsetDrawable insetDrawable;
        MaterialButton materialButton = this.f12755a;
        g gVar = new g(this.f12756b);
        gVar.o(this.f12755a.getContext());
        gVar.setTintList(this.f12763j);
        PorterDuff.Mode mode = this.f12762i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        gVar.x(this.f12761h, this.f12764k);
        g gVar2 = new g(this.f12756b);
        gVar2.setTint(0);
        gVar2.w(this.f12761h, this.n ? e.e(this.f12755a, R.attr.colorSurface) : 0);
        if (f12753t) {
            g gVar3 = new g(this.f12756b);
            this.f12766m = gVar3;
            gVar3.setTint(-1);
            ?? rippleDrawable = new RippleDrawable(b.c(this.f12765l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f12757c, this.f12758e, this.d, this.f12759f), this.f12766m);
            this.f12770r = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            ab.a aVar = new ab.a(this.f12756b);
            this.f12766m = aVar;
            aVar.setTintList(b.c(this.f12765l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f12766m});
            this.f12770r = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f12757c, this.f12758e, this.d, this.f12759f);
        }
        materialButton.setInternalBackground(insetDrawable);
        g b10 = b();
        if (b10 != null) {
            b10.q(this.f12771s);
        }
    }

    public final void h() {
        g b10 = b();
        g d = d();
        if (b10 != null) {
            b10.x(this.f12761h, this.f12764k);
            if (d != null) {
                d.w(this.f12761h, this.n ? e.e(this.f12755a, R.attr.colorSurface) : 0);
            }
        }
    }
}
