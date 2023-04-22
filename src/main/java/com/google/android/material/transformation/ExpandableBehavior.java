package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f7856a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f7857c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7858f;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ sa.a f7859j;

        public a(View view, int i10, sa.a aVar) {
            this.f7857c = view;
            this.f7858f = i10;
            this.f7859j = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f7857c.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f7856a == this.f7858f) {
                sa.a aVar = this.f7859j;
                expandableBehavior.t((View) aVar, this.f7857c, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f7856a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7856a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        sa.a aVar = (sa.a) view2;
        if (s(aVar.a())) {
            this.f7856a = aVar.a() ? 1 : 2;
            return t((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        sa.a aVar;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (!x.g.c(view)) {
            List<View> i11 = coordinatorLayout.i(view);
            int size = i11.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = i11.get(i12);
                if (b(coordinatorLayout, view, view2)) {
                    aVar = (sa.a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null && s(aVar.a())) {
                int i13 = aVar.a() ? 1 : 2;
                this.f7856a = i13;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
            }
        }
        return false;
    }

    public final boolean s(boolean z10) {
        boolean z11 = false;
        if (z10) {
            int i10 = this.f7856a;
            return i10 == 0 || i10 == 2;
        }
        if (this.f7856a == 1) {
            z11 = true;
        }
        return z11;
    }

    public abstract boolean t(View view, View view2, boolean z10, boolean z11);
}
