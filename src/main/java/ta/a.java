package ta;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.f;
import ga.g;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15382a;

    /* renamed from: b  reason: collision with root package name */
    public final ExtendedFloatingActionButton f15383b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f15384c = new ArrayList<>();
    public final u1.f d;

    /* renamed from: e  reason: collision with root package name */
    public g f15385e;

    /* renamed from: f  reason: collision with root package name */
    public g f15386f;

    /* renamed from: ta.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0270a extends Property<ExtendedFloatingActionButton, Float> {
        public C0270a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            return Float.valueOf(ga.a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.U.getColorForState(extendedFloatingActionButton2.getDrawableState(), a.this.f15383b.U.getDefaultColor()))));
        }

        @Override // android.util.Property
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            Float f11 = f10;
            int colorForState = extendedFloatingActionButton2.U.getColorForState(extendedFloatingActionButton2.getDrawableState(), a.this.f15383b.U.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (ga.a.a(0.0f, Color.alpha(colorForState) / 255.0f, f11.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f11.floatValue() == 1.0f) {
                extendedFloatingActionButton2.l(extendedFloatingActionButton2.U);
            } else {
                extendedFloatingActionButton2.l(valueOf);
            }
        }
    }

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, u1.f fVar) {
        this.f15383b = extendedFloatingActionButton;
        this.f15382a = extendedFloatingActionButton.getContext();
        this.d = fVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void a() {
        this.d.f15477c = null;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public void e() {
        this.d.f15477c = null;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet f() {
        return h(i());
    }

    public AnimatorSet h(g gVar) {
        ArrayList arrayList = new ArrayList();
        if (gVar.g("opacity")) {
            arrayList.add(gVar.d("opacity", this.f15383b, View.ALPHA));
        }
        if (gVar.g("scale")) {
            arrayList.add(gVar.d("scale", this.f15383b, View.SCALE_Y));
            arrayList.add(gVar.d("scale", this.f15383b, View.SCALE_X));
        }
        if (gVar.g("width")) {
            arrayList.add(gVar.d("width", this.f15383b, ExtendedFloatingActionButton.V));
        }
        if (gVar.g("height")) {
            arrayList.add(gVar.d("height", this.f15383b, ExtendedFloatingActionButton.W));
        }
        if (gVar.g("paddingStart")) {
            arrayList.add(gVar.d("paddingStart", this.f15383b, ExtendedFloatingActionButton.f7433a0));
        }
        if (gVar.g("paddingEnd")) {
            arrayList.add(gVar.d("paddingEnd", this.f15383b, ExtendedFloatingActionButton.f7434b0));
        }
        if (gVar.g("labelOpacity")) {
            arrayList.add(gVar.d("labelOpacity", this.f15383b, new C0270a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        a0.b.S(animatorSet, arrayList);
        return animatorSet;
    }

    public final g i() {
        g gVar = this.f15386f;
        if (gVar != null) {
            return gVar;
        }
        if (this.f15385e == null) {
            this.f15385e = g.b(this.f15382a, b());
        }
        g gVar2 = this.f15385e;
        Objects.requireNonNull(gVar2);
        return gVar2;
    }
}
