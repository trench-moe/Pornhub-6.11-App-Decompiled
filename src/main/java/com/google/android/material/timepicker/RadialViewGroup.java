package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import cb.g;
import cb.i;
import cb.k;
import com.app.pornhub.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RadialViewGroup extends ConstraintLayout {
    public final Runnable I;
    public int J;
    public g K;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RadialViewGroup.this.x();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.K = gVar;
        i iVar = new i(0.5f);
        k kVar = gVar.f3929c.f3938a;
        Objects.requireNonNull(kVar);
        k.b bVar = new k.b(kVar);
        bVar.f3974e = iVar;
        bVar.f3975f = iVar;
        bVar.f3976g = iVar;
        bVar.f3977h = iVar;
        gVar.f3929c.f3938a = bVar.a();
        gVar.invalidateSelf();
        this.K.r(ColorStateList.valueOf(-1));
        g gVar2 = this.K;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.f13012k0, i10, 0);
        this.J = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.I = new a();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            view.setId(x.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.I);
            handler.post(this.I);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.I);
            handler.post(this.I);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.K.r(ColorStateList.valueOf(i10));
    }

    public void x() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if ("skip".equals(getChildAt(i11).getTag())) {
                i10++;
            }
        }
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.f(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i13 = this.J;
                a.b bVar = aVar.j(id2).f1692e;
                bVar.A = R.id.circle_center;
                bVar.B = i13;
                bVar.C = f10;
                f10 = (360.0f / (childCount - i10)) + f10;
            }
        }
        aVar.c(this, true);
        setConstraintSet(null);
        requestLayout();
    }
}
