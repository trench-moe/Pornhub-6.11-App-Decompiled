package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.app.pornhub.R;
import l9.e;
import ra.a;
import ua.j;
import ua.n;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: p0  reason: collision with root package name */
    public static final int[][] f7682p0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: l0  reason: collision with root package name */
    public final a f7683l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f7684m0;

    /* renamed from: n0  reason: collision with root package name */
    public ColorStateList f7685n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f7686o0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018221), attributeSet, i10);
        Context context2 = getContext();
        this.f7683l0 = new a(context2);
        int[] iArr = m9.a.f13021s0;
        j.a(context2, attributeSet, i10, 2132018221);
        j.b(context2, attributeSet, iArr, i10, 2132018221, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, 2132018221);
        this.f7686o0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f7684m0 == null) {
            int e10 = e.e(this, R.attr.colorSurface);
            int e11 = e.e(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f7683l0.f14739a) {
                dimension += n.e(this);
            }
            int a10 = this.f7683l0.a(e10, dimension);
            int[][] iArr = f7682p0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = e.i(e10, e11, 1.0f);
            iArr2[1] = a10;
            iArr2[2] = e.i(e10, e11, 0.38f);
            iArr2[3] = a10;
            this.f7684m0 = new ColorStateList(iArr, iArr2);
        }
        return this.f7684m0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f7685n0 == null) {
            int[][] iArr = f7682p0;
            int[] iArr2 = new int[iArr.length];
            int e10 = e.e(this, R.attr.colorSurface);
            int e11 = e.e(this, R.attr.colorControlActivated);
            int e12 = e.e(this, R.attr.colorOnSurface);
            iArr2[0] = e.i(e10, e11, 0.54f);
            iArr2[1] = e.i(e10, e12, 0.32f);
            iArr2[2] = e.i(e10, e11, 0.12f);
            iArr2[3] = e.i(e10, e12, 0.12f);
            this.f7685n0 = new ColorStateList(iArr, iArr2);
        }
        return this.f7685n0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7686o0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f7686o0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f7686o0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }
}
