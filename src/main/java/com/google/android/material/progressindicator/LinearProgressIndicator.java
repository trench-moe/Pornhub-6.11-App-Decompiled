package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import ya.b;
import ya.h;
import ya.n;
import ya.o;
import ya.q;
import ya.t;

/* loaded from: classes.dex */
public final class LinearProgressIndicator extends b<LinearProgressIndicatorSpec> {
    public static final /* synthetic */ int C = 0;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018226);
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f18562c;
        setIndeterminateDrawable(new n(context2, linearProgressIndicatorSpec, new o(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f7585g == 0 ? new q(linearProgressIndicatorSpec) : new t(context2, linearProgressIndicatorSpec)));
        Context context3 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.f18562c;
        setProgressDrawable(new h(context3, linearProgressIndicatorSpec2, new o(linearProgressIndicatorSpec2)));
    }

    @Override // ya.b
    public LinearProgressIndicatorSpec b(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // ya.b
    public void c(int i10, boolean z10) {
        S s10 = this.f18562c;
        if (s10 != 0 && ((LinearProgressIndicatorSpec) s10).f7585g == 0 && isIndeterminate()) {
            return;
        }
        super.c(i10, z10);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f18562c).f7585g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f18562c).f7586h;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.f18562c;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s10;
        boolean z11 = true;
        if (((LinearProgressIndicatorSpec) s10).f7586h != 1) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.e.d(this) == 1) {
                if (((LinearProgressIndicatorSpec) this.f18562c).f7586h != 2) {
                }
            }
            if (x.e.d(this) != 0 || ((LinearProgressIndicatorSpec) this.f18562c).f7586h != 3) {
                z11 = false;
            }
        }
        linearProgressIndicatorSpec.f7587i = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        n<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        h<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((LinearProgressIndicatorSpec) this.f18562c).f7585g == i10) {
            return;
        }
        if (d() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f18562c;
        linearProgressIndicatorSpec.f7585g = i10;
        linearProgressIndicatorSpec.a();
        if (i10 == 0) {
            n<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            q qVar = new q((LinearProgressIndicatorSpec) this.f18562c);
            indeterminateDrawable.C = qVar;
            qVar.f18607a = indeterminateDrawable;
        } else {
            n<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            t tVar = new t(getContext(), (LinearProgressIndicatorSpec) this.f18562c);
            indeterminateDrawable2.C = tVar;
            tVar.f18607a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // ya.b
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f18562c).a();
    }

    public void setIndicatorDirection(int i10) {
        S s10 = this.f18562c;
        ((LinearProgressIndicatorSpec) s10).f7586h = i10;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s10;
        boolean z10 = true;
        if (i10 != 1) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.e.d(this) == 1) {
                if (((LinearProgressIndicatorSpec) this.f18562c).f7586h != 2) {
                }
            }
            if (x.e.d(this) == 0 && i10 == 3) {
                linearProgressIndicatorSpec.f7587i = z10;
                invalidate();
            }
            z10 = false;
        }
        linearProgressIndicatorSpec.f7587i = z10;
        invalidate();
    }

    @Override // ya.b
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((LinearProgressIndicatorSpec) this.f18562c).a();
        invalidate();
    }
}
