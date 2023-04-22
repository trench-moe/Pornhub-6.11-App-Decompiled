package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.app.pornhub.R;
import java.util.Objects;
import ya.b;
import ya.d;
import ya.g;
import ya.h;
import ya.n;

/* loaded from: classes.dex */
public final class CircularProgressIndicator extends b<CircularProgressIndicatorSpec> {
    public static final /* synthetic */ int C = 0;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018214);
        Context context2 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f18562c;
        setIndeterminateDrawable(new n(context2, circularProgressIndicatorSpec, new d(circularProgressIndicatorSpec), new g(circularProgressIndicatorSpec)));
        Context context3 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec2 = (CircularProgressIndicatorSpec) this.f18562c;
        setProgressDrawable(new h(context3, circularProgressIndicatorSpec2, new d(circularProgressIndicatorSpec2)));
    }

    @Override // ya.b
    public CircularProgressIndicatorSpec b(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f18562c).f7584i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f18562c).f7583h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f18562c).f7582g;
    }

    public void setIndicatorDirection(int i10) {
        ((CircularProgressIndicatorSpec) this.f18562c).f7584i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s10 = this.f18562c;
        if (((CircularProgressIndicatorSpec) s10).f7583h != i10) {
            ((CircularProgressIndicatorSpec) s10).f7583h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f18562c;
        if (((CircularProgressIndicatorSpec) s10).f7582g != max) {
            ((CircularProgressIndicatorSpec) s10).f7582g = max;
            Objects.requireNonNull((CircularProgressIndicatorSpec) s10);
            invalidate();
        }
    }

    @Override // ya.b
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        Objects.requireNonNull((CircularProgressIndicatorSpec) this.f18562c);
    }
}
