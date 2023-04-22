package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import n0.x;
import o0.b;
import za.c;

/* loaded from: classes.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.c {
    public final ClockHandView L;
    public final Rect M;
    public final RectF N;
    public final SparseArray<TextView> O;
    public final n0.a P;
    public final int[] Q;
    public final float[] R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public String[] W;

    /* renamed from: a0  reason: collision with root package name */
    public float f7839a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ColorStateList f7840b0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView clockFaceView = ClockFaceView.this;
                int height = ((ClockFaceView.this.getHeight() / 2) - clockFaceView.L.f7846t) - clockFaceView.S;
                if (height != clockFaceView.J) {
                    clockFaceView.J = height;
                    clockFaceView.x();
                    ClockHandView clockHandView = clockFaceView.L;
                    clockHandView.D = clockFaceView.J;
                    clockHandView.invalidate();
                }
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends n0.a {
        public b() {
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                TextView textView = ClockFaceView.this.O.get(intValue - 1);
                if (Build.VERSION.SDK_INT >= 22) {
                    bVar.f13479a.setTraversalAfter(textView);
                }
            }
            bVar.r(b.c.a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = new Rect();
        this.N = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.O = sparseArray;
        this.R = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.H, i10, 2132018286);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 1);
        this.f7840b0 = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.L = clockHandView;
        this.S = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.Q = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.n.add(this);
        int defaultColor = c0.a.c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.P = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        this.W = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i11 = 0; i11 < Math.max(this.W.length, size); i11++) {
            TextView textView = this.O.get(i11);
            if (i11 >= this.W.length) {
                removeView(textView);
                this.O.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.O.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.W[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                x.v(textView, this.P);
                textView.setTextColor(this.f7840b0);
            }
        }
        this.T = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.U = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.V = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void c(float f10, boolean z10) {
        if (Math.abs(this.f7839a0 - f10) > 0.001f) {
            this.f7839a0 = f10;
            y();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0228b.a(1, this.W.length, false, 1).f13495a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.V / Math.max(Math.max(this.T / displayMetrics.heightPixels, this.U / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void y() {
        RectF rectF = this.L.y;
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            TextView textView = this.O.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.M);
                this.M.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.M);
                this.N.set(this.M);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.N) ? null : new RadialGradient(rectF.centerX() - this.N.left, rectF.centerY() - this.N.top, 0.5f * rectF.width(), this.Q, this.R, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }
}
