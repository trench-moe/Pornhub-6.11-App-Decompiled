package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import cb.g;
import cb.k;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.x;
import o0.b;
import u1.t;
import ua.j;
import ua.n;

/* loaded from: classes.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ int f7590r0 = 0;
    public final List<ib.a> A;
    public final List<L> B;
    public final List<T> C;
    public boolean D;
    public ValueAnimator E;
    public ValueAnimator F;
    public final int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public MotionEvent S;
    public com.google.android.material.slider.c T;
    public boolean U;
    public float V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList<Float> f7591a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f7592b0;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f7593c;

    /* renamed from: c0  reason: collision with root package name */
    public int f7594c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f7595d0;

    /* renamed from: e0  reason: collision with root package name */
    public float[] f7596e0;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f7597f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7598f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f7599g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7600h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f7601i0;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f7602j;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f7603j0;

    /* renamed from: k0  reason: collision with root package name */
    public ColorStateList f7604k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f7605l0;

    /* renamed from: m  reason: collision with root package name */
    public final Paint f7606m;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f7607m0;
    public final Paint n;

    /* renamed from: n0  reason: collision with root package name */
    public ColorStateList f7608n0;

    /* renamed from: o0  reason: collision with root package name */
    public final cb.g f7609o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f7610p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f7611q0;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f7612t;

    /* renamed from: u  reason: collision with root package name */
    public final e f7613u;

    /* renamed from: w  reason: collision with root package name */
    public final AccessibilityManager f7614w;
    public BaseSlider<S, L, T>.d y;

    /* renamed from: z  reason: collision with root package name */
    public final g f7615z;

    /* loaded from: classes.dex */
    public class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AttributeSet f7616a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f7617b;

        public a(AttributeSet attributeSet, int i10) {
            this.f7616a = attributeSet;
            this.f7617b = i10;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (ib.a aVar : BaseSlider.this.A) {
                aVar.f10688d0 = 1.2f;
                aVar.f10686b0 = floatValue;
                aVar.f10687c0 = floatValue;
                aVar.f10689e0 = ga.a.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                aVar.invalidateSelf();
            }
            BaseSlider baseSlider = BaseSlider.this;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.k(baseSlider);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (ib.a aVar : BaseSlider.this.A) {
                ((t) n.d(BaseSlider.this)).a(aVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public int f7621c = -1;

        public d(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f7613u.y(this.f7621c, 4);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends t0.a {

        /* renamed from: q  reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f7623q;

        /* renamed from: r  reason: collision with root package name */
        public Rect f7624r;

        public e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f7624r = new Rect();
            this.f7623q = baseSlider;
        }

        @Override // t0.a
        public int o(float f10, float f11) {
            for (int i10 = 0; i10 < this.f7623q.getValues().size(); i10++) {
                this.f7623q.v(i10, this.f7624r);
                if (this.f7624r.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // t0.a
        public void p(List<Integer> list) {
            for (int i10 = 0; i10 < this.f7623q.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }

        @Override // t0.a
        public boolean t(int i10, int i11, Bundle bundle) {
            if (this.f7623q.isEnabled()) {
                if (i11 != 4096 && i11 != 8192) {
                    if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                        float f10 = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                        BaseSlider<?, ?, ?> baseSlider = this.f7623q;
                        int i12 = BaseSlider.f7590r0;
                        if (baseSlider.t(i10, f10)) {
                            this.f7623q.w();
                            this.f7623q.postInvalidate();
                            q(i10);
                            return true;
                        }
                    }
                    return false;
                }
                BaseSlider<?, ?, ?> baseSlider2 = this.f7623q;
                int i13 = BaseSlider.f7590r0;
                float b10 = baseSlider2.b(20);
                if (i11 == 8192) {
                    b10 = -b10;
                }
                if (this.f7623q.k()) {
                    b10 = -b10;
                }
                if (this.f7623q.t(i10, t3.a.e(this.f7623q.getValues().get(i10).floatValue() + b10, this.f7623q.getValueFrom(), this.f7623q.getValueTo()))) {
                    this.f7623q.w();
                    this.f7623q.postInvalidate();
                    q(i10);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // t0.a
        public void v(int i10, o0.b bVar) {
            bVar.a(b.a.f13491o);
            List<Float> values = this.f7623q.getValues();
            float floatValue = values.get(i10).floatValue();
            float valueFrom = this.f7623q.getValueFrom();
            float valueTo = this.f7623q.getValueTo();
            if (this.f7623q.isEnabled()) {
                if (floatValue > valueFrom) {
                    bVar.f13479a.addAction(ConstantsKt.DEFAULT_BUFFER_SIZE);
                }
                if (floatValue < valueTo) {
                    bVar.f13479a.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);
                }
            }
            bVar.f13479a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
            bVar.f13479a.setClassName(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f7623q.getContentDescription() != null) {
                sb2.append(this.f7623q.getContentDescription());
                sb2.append(",");
            }
            if (values.size() > 1) {
                sb2.append(i10 == this.f7623q.getValues().size() + (-1) ? this.f7623q.getContext().getString(R.string.material_slider_range_end) : i10 == 0 ? this.f7623q.getContext().getString(R.string.material_slider_range_start) : BuildConfig.FLAVOR);
                sb2.append(this.f7623q.g(floatValue));
            }
            bVar.f13479a.setContentDescription(sb2.toString());
            this.f7623q.v(i10, this.f7624r);
            bVar.f13479a.setBoundsInParent(this.f7624r);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public float f7625c;

        /* renamed from: f  reason: collision with root package name */
        public float f7626f;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<Float> f7627j;

        /* renamed from: m  reason: collision with root package name */
        public float f7628m;
        public boolean n;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, a aVar) {
            super(parcel);
            this.f7625c = parcel.readFloat();
            this.f7626f = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f7627j = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f7628m = parcel.readFloat();
            this.n = parcel.createBooleanArray()[0];
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f7625c);
            parcel.writeFloat(this.f7626f);
            parcel.writeList(this.f7627j);
            parcel.writeFloat(this.f7628m);
            parcel.writeBooleanArray(new boolean[]{this.n});
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018264), attributeSet, i10);
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = false;
        this.U = false;
        this.f7591a0 = new ArrayList<>();
        this.f7592b0 = -1;
        this.f7594c0 = -1;
        this.f7595d0 = 0.0f;
        this.f7598f0 = true;
        this.f7600h0 = false;
        cb.g gVar = new cb.g();
        this.f7609o0 = gVar;
        this.f7611q0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f7593c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f7597f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f7602j = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f7606m = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.n = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f7612t = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.J = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.H = dimensionPixelOffset;
        this.M = dimensionPixelOffset;
        this.I = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.N = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_top);
        this.Q = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.f7615z = new a(attributeSet, i10);
        int[] iArr = m9.a.f13019q0;
        j.a(context2, attributeSet, i10, 2132018264);
        j.b(context2, attributeSet, iArr, i10, 2132018264, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, 2132018264);
        this.V = obtainStyledAttributes.getFloat(3, 0.0f);
        this.W = obtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.V));
        this.f7595d0 = obtainStyledAttributes.getFloat(2, 0.0f);
        boolean hasValue = obtainStyledAttributes.hasValue(18);
        int i11 = hasValue ? 18 : 20;
        int i12 = hasValue ? 18 : 19;
        ColorStateList a10 = za.c.a(context2, obtainStyledAttributes, i11);
        setTrackInactiveTintList(a10 == null ? c0.a.c(context2, R.color.material_slider_inactive_track_color) : a10);
        ColorStateList a11 = za.c.a(context2, obtainStyledAttributes, i12);
        setTrackActiveTintList(a11 == null ? c0.a.c(context2, R.color.material_slider_active_track_color) : a11);
        gVar.r(za.c.a(context2, obtainStyledAttributes, 9));
        if (obtainStyledAttributes.hasValue(12)) {
            setThumbStrokeColor(za.c.a(context2, obtainStyledAttributes, 12));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(13, 0.0f));
        ColorStateList a12 = za.c.a(context2, obtainStyledAttributes, 5);
        setHaloTintList(a12 == null ? c0.a.c(context2, R.color.material_slider_halo_color) : a12);
        this.f7598f0 = obtainStyledAttributes.getBoolean(17, true);
        boolean hasValue2 = obtainStyledAttributes.hasValue(14);
        int i13 = hasValue2 ? 14 : 16;
        int i14 = hasValue2 ? 14 : 15;
        ColorStateList a13 = za.c.a(context2, obtainStyledAttributes, i13);
        setTickInactiveTintList(a13 == null ? c0.a.c(context2, R.color.material_slider_inactive_tick_marks_color) : a13);
        ColorStateList a14 = za.c.a(context2, obtainStyledAttributes, i14);
        setTickActiveTintList(a14 == null ? c0.a.c(context2, R.color.material_slider_active_tick_marks_color) : a14);
        setThumbRadius(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(10, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(21, 0));
        this.K = obtainStyledAttributes.getInt(7, 0);
        if (!obtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        gVar.v(2);
        this.G = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f7613u = eVar;
        x.v(this, eVar);
        this.f7614w = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f7591a0.size() == 1) {
            floatValue2 = this.V;
        }
        float o10 = o(floatValue2);
        float o11 = o(floatValue);
        return k() ? new float[]{o11, o10} : new float[]{o10, o11};
    }

    private float getValueOfTouchPosition() {
        double d10;
        float f10;
        int i10;
        float f11 = this.f7610p0;
        float f12 = this.f7595d0;
        if (f12 > 0.0f) {
            d10 = Math.round(f11 * i10) / ((int) ((this.W - this.V) / f12));
        } else {
            d10 = f11;
        }
        if (k()) {
            d10 = 1.0d - d10;
        }
        float f13 = this.W;
        return (float) ((d10 * (f13 - f10)) + this.V);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.f7610p0;
        if (k()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.W;
        float f12 = this.V;
        return a0.a.b(f11, f12, f10, f12);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f7591a0.size() == arrayList.size() && this.f7591a0.equals(arrayList)) {
            return;
        }
        this.f7591a0 = arrayList;
        this.f7601i0 = true;
        this.f7594c0 = 0;
        w();
        if (this.A.size() > this.f7591a0.size()) {
            List<ib.a> subList = this.A.subList(this.f7591a0.size(), this.A.size());
            loop0: while (true) {
                for (ib.a aVar : subList) {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    if (x.g.b(this)) {
                        e(aVar);
                    }
                }
            }
            subList.clear();
        }
        while (this.A.size() < this.f7591a0.size()) {
            a aVar2 = (a) this.f7615z;
            TypedArray d10 = j.d(BaseSlider.this.getContext(), aVar2.f7616a, m9.a.f13019q0, aVar2.f7617b, 2132018264, new int[0]);
            Context context = BaseSlider.this.getContext();
            int resourceId = d10.getResourceId(8, 2132018298);
            ib.a aVar3 = new ib.a(context, null, 0, resourceId);
            TypedArray d11 = j.d(aVar3.Q, null, m9.a.f13031z0, 0, resourceId, new int[0]);
            aVar3.Z = aVar3.Q.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            k kVar = aVar3.f3929c.f3938a;
            Objects.requireNonNull(kVar);
            k.b bVar = new k.b(kVar);
            bVar.f3980k = aVar3.E();
            aVar3.f3929c.f3938a = bVar.a();
            aVar3.invalidateSelf();
            CharSequence text = d11.getText(6);
            if (!TextUtils.equals(aVar3.P, text)) {
                aVar3.P = text;
                aVar3.S.d = true;
                aVar3.invalidateSelf();
            }
            za.d e10 = za.c.e(aVar3.Q, d11, 0);
            if (e10 != null && d11.hasValue(1)) {
                e10.f21928j = za.c.a(aVar3.Q, d11, 1);
            }
            aVar3.S.b(e10, aVar3.Q);
            aVar3.r(ColorStateList.valueOf(d11.getColor(7, e0.a.f(e0.a.j(za.b.c(aVar3.Q, R.attr.colorOnBackground, ib.a.class.getCanonicalName()), 153), e0.a.j(za.b.c(aVar3.Q, 16842801, ib.a.class.getCanonicalName()), 229)))));
            aVar3.y(ColorStateList.valueOf(za.b.c(aVar3.Q, R.attr.colorSurface, ib.a.class.getCanonicalName())));
            aVar3.V = d11.getDimensionPixelSize(2, 0);
            aVar3.W = d11.getDimensionPixelSize(4, 0);
            aVar3.X = d11.getDimensionPixelSize(5, 0);
            aVar3.Y = d11.getDimensionPixelSize(3, 0);
            d11.recycle();
            d10.recycle();
            this.A.add(aVar3);
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            if (x.g.b(this)) {
                a(aVar3);
            }
        }
        int i10 = this.A.size() == 1 ? 0 : 1;
        for (ib.a aVar4 : this.A) {
            aVar4.z(i10);
        }
        for (L l10 : this.B) {
            Iterator<Float> it = this.f7591a0.iterator();
            while (it.hasNext()) {
                l10.a(this, it.next().floatValue(), false);
            }
        }
        postInvalidate();
    }

    public final void a(ib.a aVar) {
        ViewGroup c10 = n.c(this);
        Objects.requireNonNull(aVar);
        if (c10 == null) {
            return;
        }
        int[] iArr = new int[2];
        c10.getLocationOnScreen(iArr);
        aVar.f10685a0 = iArr[0];
        c10.getWindowVisibleDisplayFrame(aVar.U);
        c10.addOnLayoutChangeListener(aVar.T);
    }

    public final float b(int i10) {
        float f10;
        float f11;
        float f12 = this.f7595d0;
        if (f12 == 0.0f) {
            f12 = 1.0f;
        }
        return (this.W - this.V) / f12 <= i10 ? f12 : Math.round(f10 / f11) * f12;
    }

    public final int c() {
        return this.N + (this.K == 1 ? this.A.get(0).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator d(boolean z10) {
        float f10 = z10 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z10 ? this.F : this.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(z10 ? 83L : 117L);
        ofFloat.setInterpolator(z10 ? ga.a.f9889e : ga.a.f9888c);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f7613u.n(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f7593c.setColor(h(this.f7608n0));
        this.f7597f.setColor(h(this.f7607m0));
        this.n.setColor(h(this.f7605l0));
        this.f7612t.setColor(h(this.f7604k0));
        loop0: while (true) {
            for (ib.a aVar : this.A) {
                if (aVar.isStateful()) {
                    aVar.setState(getDrawableState());
                }
            }
        }
        if (this.f7609o0.isStateful()) {
            this.f7609o0.setState(getDrawableState());
        }
        this.f7606m.setColor(h(this.f7603j0));
        this.f7606m.setAlpha(63);
    }

    public final void e(ib.a aVar) {
        ua.k d10 = n.d(this);
        if (d10 != null) {
            ((t) d10).a(aVar);
            ViewGroup c10 = n.c(this);
            Objects.requireNonNull(aVar);
            if (c10 == null) {
                return;
            }
            c10.removeOnLayoutChangeListener(aVar.T);
        }
    }

    public final void f() {
        if (this.D) {
            this.D = false;
            ValueAnimator d10 = d(false);
            this.F = d10;
            this.E = null;
            d10.addListener(new c());
            this.F.start();
        }
    }

    public final String g(float f10) {
        com.google.android.material.slider.c cVar = this.T;
        if (cVar != null) {
            return cVar.a(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f7613u.f15068k;
    }

    public int getActiveThumbIndex() {
        return this.f7592b0;
    }

    public int getFocusedThumbIndex() {
        return this.f7594c0;
    }

    public int getHaloRadius() {
        return this.P;
    }

    public ColorStateList getHaloTintList() {
        return this.f7603j0;
    }

    public int getLabelBehavior() {
        return this.K;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f7595d0;
    }

    public float getThumbElevation() {
        return this.f7609o0.f3929c.f3950o;
    }

    public int getThumbRadius() {
        return this.O;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f7609o0.f3929c.f3941e;
    }

    public float getThumbStrokeWidth() {
        return this.f7609o0.f3929c.f3948l;
    }

    public ColorStateList getThumbTintList() {
        return this.f7609o0.f3929c.d;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f7604k0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f7605l0;
    }

    public ColorStateList getTickTintList() {
        if (this.f7605l0.equals(this.f7604k0)) {
            return this.f7604k0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f7607m0;
    }

    public int getTrackHeight() {
        return this.L;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f7608n0;
    }

    public int getTrackSidePadding() {
        return this.M;
    }

    public ColorStateList getTrackTintList() {
        if (this.f7608n0.equals(this.f7607m0)) {
            return this.f7607m0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f7599g0;
    }

    public float getValueFrom() {
        return this.V;
    }

    public float getValueTo() {
        return this.W;
    }

    public List<Float> getValues() {
        return new ArrayList(this.f7591a0);
    }

    public final int h(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i() {
        ViewParent parent = getParent();
        while (true) {
            boolean z10 = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (!viewGroup.canScrollVertically(1)) {
                if (viewGroup.canScrollVertically(-1)) {
                }
                if (!z10 && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
                parent = parent.getParent();
            }
            z10 = true;
            if (!z10) {
            }
            parent = parent.getParent();
        }
    }

    public final boolean j(float f10) {
        double doubleValue = new BigDecimal(Float.toString(f10)).divide(new BigDecimal(Float.toString(this.f7595d0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean k() {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return x.e.d(this) == 1;
    }

    public final void l() {
        if (this.f7595d0 <= 0.0f) {
            return;
        }
        x();
        int min = Math.min((int) (((this.W - this.V) / this.f7595d0) + 1.0f), (this.f7599g0 / (this.L * 2)) + 1);
        float[] fArr = this.f7596e0;
        if (fArr == null || fArr.length != min * 2) {
            this.f7596e0 = new float[min * 2];
        }
        float f10 = this.f7599g0 / (min - 1);
        for (int i10 = 0; i10 < min * 2; i10 += 2) {
            float[] fArr2 = this.f7596e0;
            fArr2[i10] = ((i10 / 2) * f10) + this.M;
            fArr2[i10 + 1] = c();
        }
    }

    public final boolean m(int i10) {
        int i11 = this.f7594c0;
        long j10 = i11 + i10;
        long size = this.f7591a0.size() - 1;
        if (j10 < 0) {
            j10 = 0;
        } else if (j10 > size) {
            j10 = size;
        }
        int i12 = (int) j10;
        this.f7594c0 = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.f7592b0 != -1) {
            this.f7592b0 = i12;
        }
        w();
        postInvalidate();
        return true;
    }

    public final boolean n(int i10) {
        if (k()) {
            i10 = i10 == Integer.MIN_VALUE ? IntCompanionObject.MAX_VALUE : -i10;
        }
        return m(i10);
    }

    public final float o(float f10) {
        float f11 = this.V;
        float f12 = (f10 - f11) / (this.W - f11);
        return k() ? 1.0f - f12 : f12;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (ib.a aVar : this.A) {
            a(aVar);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.y;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.D = false;
        for (ib.a aVar : this.A) {
            e(aVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f7601i0) {
            x();
            l();
        }
        super.onDraw(canvas);
        int c10 = c();
        int i10 = this.f7599g0;
        float[] activeRange = getActiveRange();
        int i11 = this.M;
        float f10 = i10;
        float f11 = (activeRange[1] * f10) + i11;
        float f12 = i11 + i10;
        if (f11 < f12) {
            float f13 = c10;
            canvas.drawLine(f11, f13, f12, f13, this.f7593c);
        }
        float f14 = this.M;
        float f15 = (activeRange[0] * f10) + f14;
        if (f15 > f14) {
            float f16 = c10;
            canvas.drawLine(f14, f16, f15, f16, this.f7593c);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.V) {
            int i12 = this.f7599g0;
            float[] activeRange2 = getActiveRange();
            float f17 = this.M;
            float f18 = i12;
            float f19 = c10;
            canvas.drawLine((activeRange2[0] * f18) + f17, f19, (activeRange2[1] * f18) + f17, f19, this.f7597f);
        }
        if (this.f7598f0 && this.f7595d0 > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int round = Math.round(activeRange3[0] * ((this.f7596e0.length / 2) - 1));
            int round2 = Math.round(activeRange3[1] * ((this.f7596e0.length / 2) - 1));
            int i13 = round * 2;
            canvas.drawPoints(this.f7596e0, 0, i13, this.n);
            int i14 = round2 * 2;
            canvas.drawPoints(this.f7596e0, i13, i14 - i13, this.f7612t);
            float[] fArr = this.f7596e0;
            canvas.drawPoints(fArr, i14, fArr.length - i14, this.n);
        }
        if ((this.U || isFocused()) && isEnabled()) {
            int i15 = this.f7599g0;
            if (s()) {
                int o10 = (int) ((o(this.f7591a0.get(this.f7594c0).floatValue()) * i15) + this.M);
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = this.P;
                    canvas.clipRect(o10 - i16, c10 - i16, o10 + i16, i16 + c10, Region.Op.UNION);
                }
                canvas.drawCircle(o10, c10, this.P, this.f7606m);
            }
            if (this.f7592b0 != -1 && this.K != 2) {
                if (!this.D) {
                    this.D = true;
                    ValueAnimator d10 = d(true);
                    this.E = d10;
                    this.F = null;
                    d10.start();
                }
                Iterator<ib.a> it = this.A.iterator();
                for (int i17 = 0; i17 < this.f7591a0.size() && it.hasNext(); i17++) {
                    if (i17 != this.f7594c0) {
                        r(it.next(), this.f7591a0.get(i17).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.A.size()), Integer.valueOf(this.f7591a0.size())));
                }
                r(it.next(), this.f7591a0.get(this.f7594c0).floatValue());
            }
        }
        int i18 = this.f7599g0;
        if (!isEnabled()) {
            Iterator<Float> it2 = this.f7591a0.iterator();
            while (it2.hasNext()) {
                canvas.drawCircle((o(it2.next().floatValue()) * i18) + this.M, c10, this.O, this.f7602j);
            }
        }
        Iterator<Float> it3 = this.f7591a0.iterator();
        while (it3.hasNext()) {
            canvas.save();
            int o11 = this.M + ((int) (o(it3.next().floatValue()) * i18));
            int i19 = this.O;
            canvas.translate(o11 - i19, c10 - i19);
            this.f7609o0.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10) {
            this.f7592b0 = -1;
            f();
            this.f7613u.k(this.f7594c0);
            return;
        }
        if (i10 == 1) {
            m(IntCompanionObject.MAX_VALUE);
        } else if (i10 == 2) {
            m(IntCompanionObject.MIN_VALUE);
        } else if (i10 == 17) {
            n(IntCompanionObject.MAX_VALUE);
        } else if (i10 == 66) {
            n(IntCompanionObject.MIN_VALUE);
        }
        this.f7613u.x(this.f7594c0);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        float f10;
        if (isEnabled()) {
            if (this.f7591a0.size() == 1) {
                this.f7592b0 = 0;
            }
            Float f11 = null;
            Boolean valueOf = null;
            if (this.f7592b0 == -1) {
                if (i10 != 61) {
                    if (i10 != 66) {
                        if (i10 != 81) {
                            if (i10 == 69) {
                                m(-1);
                                valueOf = Boolean.TRUE;
                            } else if (i10 != 70) {
                                switch (i10) {
                                    case 21:
                                        n(-1);
                                        valueOf = Boolean.TRUE;
                                        break;
                                    case 22:
                                        n(1);
                                        valueOf = Boolean.TRUE;
                                        break;
                                }
                            }
                        }
                        m(1);
                        valueOf = Boolean.TRUE;
                    }
                    this.f7592b0 = this.f7594c0;
                    postInvalidate();
                    valueOf = Boolean.TRUE;
                } else {
                    valueOf = keyEvent.hasNoModifiers() ? Boolean.valueOf(m(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(m(-1)) : Boolean.FALSE;
                }
                return valueOf != null ? valueOf.booleanValue() : super.onKeyDown(i10, keyEvent);
            }
            boolean isLongPress = this.f7600h0 | keyEvent.isLongPress();
            this.f7600h0 = isLongPress;
            if (isLongPress) {
                f10 = b(20);
            } else {
                f10 = this.f7595d0;
                if (f10 == 0.0f) {
                    f10 = 1.0f;
                }
            }
            if (i10 == 21) {
                if (!k()) {
                    f10 = -f10;
                }
                f11 = Float.valueOf(f10);
            } else if (i10 == 22) {
                if (k()) {
                    f10 = -f10;
                }
                f11 = Float.valueOf(f10);
            } else if (i10 == 69) {
                f11 = Float.valueOf(-f10);
            } else if (i10 == 70 || i10 == 81) {
                f11 = Float.valueOf(f10);
            }
            if (f11 != null) {
                if (t(this.f7592b0, f11.floatValue() + this.f7591a0.get(this.f7592b0).floatValue())) {
                    w();
                    postInvalidate();
                }
                return true;
            }
            if (i10 != 23) {
                if (i10 == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        return m(1);
                    }
                    if (keyEvent.isShiftPressed()) {
                        return m(-1);
                    }
                    return false;
                } else if (i10 != 66) {
                    return super.onKeyDown(i10, keyEvent);
                }
            }
            this.f7592b0 = -1;
            f();
            postInvalidate();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.f7600h0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.J + (this.K == 1 ? this.A.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.V = fVar.f7625c;
        this.W = fVar.f7626f;
        setValuesInternal(fVar.f7627j);
        this.f7595d0 = fVar.f7628m;
        if (fVar.n) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f7625c = this.V;
        fVar.f7626f = this.W;
        fVar.f7627j = new ArrayList<>(this.f7591a0);
        fVar.f7628m = this.f7595d0;
        fVar.n = hasFocus();
        return fVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f7599g0 = Math.max(i10 - (this.M * 2), 0);
        l();
        w();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            float x10 = motionEvent.getX();
            float f10 = (x10 - this.M) / this.f7599g0;
            this.f7610p0 = f10;
            float max = Math.max(0.0f, f10);
            this.f7610p0 = max;
            this.f7610p0 = Math.min(1.0f, max);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.R = x10;
                if (!i()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (q()) {
                        requestFocus();
                        this.U = true;
                        u();
                        w();
                        invalidate();
                        p();
                    }
                }
            } else if (actionMasked == 1) {
                this.U = false;
                MotionEvent motionEvent2 = this.S;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.S.getX() - motionEvent.getX()) <= this.G && Math.abs(this.S.getY() - motionEvent.getY()) <= this.G && q()) {
                    p();
                }
                if (this.f7592b0 != -1) {
                    u();
                    this.f7592b0 = -1;
                    for (T t2 : this.C) {
                        t2.b(this);
                    }
                }
                f();
                invalidate();
            } else if (actionMasked == 2) {
                if (!this.U) {
                    if (i() && Math.abs(x10 - this.R) < this.G) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    p();
                }
                if (q()) {
                    this.U = true;
                    u();
                    w();
                    invalidate();
                }
            }
            setPressed(this.U);
            this.S = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    public final void p() {
        for (T t2 : this.C) {
            t2.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
        if ((r8 - r3) < 0.0f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.q():boolean");
    }

    public final void r(ib.a aVar, float f10) {
        String g10 = g(f10);
        if (!TextUtils.equals(aVar.P, g10)) {
            aVar.P = g10;
            aVar.S.d = true;
            aVar.invalidateSelf();
        }
        int o10 = (this.M + ((int) (o(f10) * this.f7599g0))) - (aVar.getIntrinsicWidth() / 2);
        int c10 = c() - (this.Q + this.O);
        aVar.setBounds(o10, c10 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + o10, c10);
        Rect rect = new Rect(aVar.getBounds());
        ua.a.c(n.c(this), this, rect);
        aVar.setBounds(rect);
        t tVar = (t) n.d(this);
        switch (tVar.f15509a) {
            case 0:
                tVar.f15510b.add(aVar);
                return;
            default:
                tVar.f15510b.add(aVar);
                return;
        }
    }

    public final boolean s() {
        return !(getBackground() instanceof RippleDrawable);
    }

    public void setActiveThumbIndex(int i10) {
        this.f7592b0 = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f7591a0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f7594c0 = i10;
        this.f7613u.x(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.P) {
            return;
        }
        this.P = i10;
        Drawable background = getBackground();
        if (s() || !(background instanceof RippleDrawable)) {
            postInvalidate();
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) background;
        int i11 = this.P;
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i11);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i11));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e10);
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7603j0)) {
            return;
        }
        this.f7603j0 = colorStateList;
        Drawable background = getBackground();
        if (!s() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f7606m.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        this.f7606m.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.K != i10) {
            this.K = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(com.google.android.material.slider.c cVar) {
        this.T = cVar;
    }

    public void setSeparationUnit(int i10) {
        this.f7611q0 = i10;
        this.f7601i0 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.V), Float.valueOf(this.W)));
        }
        if (this.f7595d0 != f10) {
            this.f7595d0 = f10;
            this.f7601i0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        cb.g gVar = this.f7609o0;
        g.b bVar = gVar.f3929c;
        if (bVar.f3950o != f10) {
            bVar.f3950o = f10;
            gVar.C();
        }
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(int i10) {
        if (i10 == this.O) {
            return;
        }
        this.O = i10;
        this.M = this.H + Math.max(i10 - this.I, 0);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.g.c(this)) {
            this.f7599g0 = Math.max(getWidth() - (this.M * 2), 0);
            l();
        }
        cb.g gVar = this.f7609o0;
        k.b bVar = new k.b();
        float f10 = this.O;
        b7.k n = m9.a.n(0);
        bVar.f3971a = n;
        k.b.b(n);
        bVar.f3972b = n;
        k.b.b(n);
        bVar.f3973c = n;
        k.b.b(n);
        bVar.d = n;
        k.b.b(n);
        bVar.f(f10);
        bVar.g(f10);
        bVar.e(f10);
        bVar.d(f10);
        gVar.f3929c.f3938a = bVar.a();
        gVar.invalidateSelf();
        cb.g gVar2 = this.f7609o0;
        int i11 = this.O;
        gVar2.setBounds(0, 0, i11 * 2, i11 * 2);
        postInvalidate();
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f7609o0.y(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(c0.a.c(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        cb.g gVar = this.f7609o0;
        gVar.f3929c.f3948l = f10;
        gVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7609o0.f3929c.d)) {
            return;
        }
        this.f7609o0.r(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7604k0)) {
            return;
        }
        this.f7604k0 = colorStateList;
        this.f7612t.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7605l0)) {
            return;
        }
        this.f7605l0 = colorStateList;
        this.n.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.f7598f0 != z10) {
            this.f7598f0 = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7607m0)) {
            return;
        }
        this.f7607m0 = colorStateList;
        this.f7597f.setColor(h(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i10) {
        if (this.L != i10) {
            this.L = i10;
            this.f7593c.setStrokeWidth(i10);
            this.f7597f.setStrokeWidth(this.L);
            this.n.setStrokeWidth(this.L / 2.0f);
            this.f7612t.setStrokeWidth(this.L / 2.0f);
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7608n0)) {
            return;
        }
        this.f7608n0 = colorStateList;
        this.f7593c.setColor(h(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.V = f10;
        this.f7601i0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.W = f10;
        this.f7601i0 = true;
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final boolean t(int i10, float f10) {
        this.f7594c0 = i10;
        if (Math.abs(f10 - this.f7591a0.get(i10).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f7611q0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f11 = this.V;
                minSeparation = a0.a.b(f11, this.W, (minSeparation - this.M) / this.f7599g0, f11);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        this.f7591a0.set(i10, Float.valueOf(t3.a.e(f10, i12 < 0 ? this.V : minSeparation + this.f7591a0.get(i12).floatValue(), i11 >= this.f7591a0.size() ? this.W : this.f7591a0.get(i11).floatValue() - minSeparation)));
        for (L l10 : this.B) {
            l10.a(this, this.f7591a0.get(i10).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f7614w;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.d dVar = this.y;
            if (dVar == null) {
                this.y = new d(null);
            } else {
                removeCallbacks(dVar);
            }
            BaseSlider<S, L, T>.d dVar2 = this.y;
            dVar2.f7621c = i10;
            postDelayed(dVar2, 200L);
        }
        return true;
    }

    public final boolean u() {
        return t(this.f7592b0, getValueOfTouchPosition());
    }

    public void v(int i10, Rect rect) {
        int o10 = this.M + ((int) (o(getValues().get(i10).floatValue()) * this.f7599g0));
        int c10 = c();
        int i11 = this.O;
        rect.set(o10 - i11, c10 - i11, o10 + i11, c10 + i11);
    }

    public final void w() {
        if (!s() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int o10 = (int) ((o(this.f7591a0.get(this.f7594c0).floatValue()) * this.f7599g0) + this.M);
                int c10 = c();
                int i10 = this.P;
                background.setHotspotBounds(o10 - i10, c10 - i10, o10 + i10, c10 + i10);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void x() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.x():void");
    }
}
