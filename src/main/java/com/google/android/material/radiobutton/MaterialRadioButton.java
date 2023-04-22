package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.app.pornhub.R;
import hb.a;
import l9.e;
import ua.j;
import za.c;

/* loaded from: classes.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: u  reason: collision with root package name */
    public static final int[][] f7588u = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7589t;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, 2132018220), attributeSet, i10);
        Context context2 = getContext();
        TypedArray d = j.d(context2, attributeSet, m9.a.f13000b0, i10, 2132018220, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(c.a(context2, d, 0));
        }
        this.f7589t = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.n == null) {
            int e10 = e.e(this, R.attr.colorControlActivated);
            int e11 = e.e(this, R.attr.colorOnSurface);
            int e12 = e.e(this, R.attr.colorSurface);
            int[][] iArr = f7588u;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = e.i(e12, e10, 1.0f);
            iArr2[1] = e.i(e12, e11, 0.54f);
            iArr2[2] = e.i(e12, e11, 0.38f);
            iArr2[3] = e.i(e12, e11, 0.38f);
            this.n = new ColorStateList(iArr, iArr2);
        }
        return this.n;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7589t && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7589t = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
