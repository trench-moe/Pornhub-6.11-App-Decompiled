package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.p0;
import com.app.pornhub.R;
import ja.c;
import ua.j;
import ua.n;
import wa.d;
import wa.f;

/* loaded from: classes.dex */
public class BottomNavigationView extends f {

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends f.b {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends f.c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018029);
        p0 e10 = j.e(getContext(), attributeSet, m9.a.B, i10, 2132018029, new int[0]);
        setItemHorizontalTranslationEnabled(e10.a(1, true));
        if (e10.p(0)) {
            setMinimumHeight(e10.f(0, 0));
        }
        e10.f1055b.recycle();
        n.a(this, new c(this));
    }

    @Override // wa.f
    public d a(Context context) {
        return new ja.b(context);
    }

    @Override // wa.f
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        ja.b bVar = (ja.b) getMenuView();
        if (bVar.f11653b0 != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
