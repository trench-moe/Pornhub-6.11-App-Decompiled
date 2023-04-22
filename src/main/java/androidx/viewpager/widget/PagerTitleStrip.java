package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import q0.h;

@ViewPager.d
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {
    public static final int[] E = {16842804, 16842901, 16842904, 16842927};
    public static final int[] F = {16843660};
    public final a A;
    public WeakReference<y1.a> B;
    public int C;
    public int D;

    /* renamed from: c  reason: collision with root package name */
    public ViewPager f3282c;

    /* renamed from: f  reason: collision with root package name */
    public TextView f3283f;

    /* renamed from: j  reason: collision with root package name */
    public TextView f3284j;

    /* renamed from: m  reason: collision with root package name */
    public TextView f3285m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public float f3286t;

    /* renamed from: u  reason: collision with root package name */
    public int f3287u;

    /* renamed from: w  reason: collision with root package name */
    public int f3288w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3289z;

    /* loaded from: classes.dex */
    public class a extends DataSetObserver implements ViewPager.h, ViewPager.g {

        /* renamed from: c  reason: collision with root package name */
        public int f3290c;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void a(int i10, float f10, int i11) {
            if (f10 > 0.5f) {
                i10++;
            }
            PagerTitleStrip.this.c(i10, f10, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(int i10) {
            this.f3290c = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void c(int i10) {
            if (this.f3290c == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.b(pagerTitleStrip.f3282c.getCurrentItem(), PagerTitleStrip.this.f3282c.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f10 = pagerTitleStrip2.f3286t;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pagerTitleStrip2.c(pagerTitleStrip2.f3282c.getCurrentItem(), f10, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.g
        public void d(ViewPager viewPager, y1.a aVar, y1.a aVar2) {
            PagerTitleStrip.this.a(aVar, aVar2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.f3282c.getCurrentItem(), PagerTitleStrip.this.f3282c.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f10 = pagerTitleStrip2.f3286t;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            pagerTitleStrip2.c(pagerTitleStrip2.f3282c.getCurrentItem(), f10, true);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends SingleLineTransformationMethod {

        /* renamed from: c  reason: collision with root package name */
        public Locale f3292c;

        public b(Context context) {
            this.f3292c = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f3292c);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = -1;
        this.f3286t = -1.0f;
        this.A = new a();
        TextView textView = new TextView(context);
        this.f3283f = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f3284j = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f3285m = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E);
        boolean z10 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            h.f(this.f3283f, resourceId);
            h.f(this.f3284j, resourceId);
            h.f(this.f3285m, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f10 = dimensionPixelSize;
            this.f3283f.setTextSize(0, f10);
            this.f3284j.setTextSize(0, f10);
            this.f3285m.setTextSize(0, f10);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f3283f.setTextColor(color);
            this.f3284j.setTextColor(color);
            this.f3285m.setTextColor(color);
        }
        this.f3288w = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.D = this.f3284j.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f3283f.setEllipsize(TextUtils.TruncateAt.END);
        this.f3284j.setEllipsize(TextUtils.TruncateAt.END);
        this.f3285m.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, F);
            z10 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z10) {
            setSingleLineAllCaps(this.f3283f);
            setSingleLineAllCaps(this.f3284j);
            setSingleLineAllCaps(this.f3285m);
        } else {
            this.f3283f.setSingleLine();
            this.f3284j.setSingleLine();
            this.f3285m.setSingleLine();
        }
        this.f3287u = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(y1.a aVar, y1.a aVar2) {
        if (aVar != null) {
            aVar.f18384a.unregisterObserver(this.A);
            this.B = null;
        }
        if (aVar2 != null) {
            aVar2.f18384a.registerObserver(this.A);
            this.B = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f3282c;
        if (viewPager != null) {
            this.n = -1;
            this.f3286t = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public void b(int i10, y1.a aVar) {
        int e10 = aVar != null ? aVar.e() : 0;
        this.y = true;
        CharSequence charSequence = null;
        this.f3283f.setText((i10 < 1 || aVar == null) ? null : aVar.f(i10 - 1));
        this.f3284j.setText((aVar == null || i10 >= e10) ? null : aVar.f(i10));
        int i11 = i10 + 1;
        if (i11 < e10 && aVar != null) {
            charSequence = aVar.f(i11);
        }
        this.f3285m.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), IntCompanionObject.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), IntCompanionObject.MIN_VALUE);
        this.f3283f.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3284j.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3285m.measure(makeMeasureSpec, makeMeasureSpec2);
        this.n = i10;
        if (!this.f3289z) {
            c(i10, this.f3286t, false);
        }
        this.y = false;
    }

    public void c(int i10, float f10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.n) {
            b(i10, this.f3282c.getAdapter());
        } else if (!z10 && f10 == this.f3286t) {
            return;
        }
        this.f3289z = true;
        int measuredWidth = this.f3283f.getMeasuredWidth();
        int measuredWidth2 = this.f3284j.getMeasuredWidth();
        int measuredWidth3 = this.f3285m.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f11 = 0.5f + f10;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f11))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = this.f3283f.getBaseline();
        int baseline2 = this.f3284j.getBaseline();
        int baseline3 = this.f3285m.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = max - baseline;
        int i21 = max - baseline2;
        int i22 = max - baseline3;
        int max2 = Math.max(Math.max(this.f3283f.getMeasuredHeight() + i20, this.f3284j.getMeasuredHeight() + i21), this.f3285m.getMeasuredHeight() + i22);
        int i23 = this.f3288w & 112;
        if (i23 == 16) {
            i11 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i23 != 80) {
            i12 = i20 + paddingTop;
            i13 = i21 + paddingTop;
            i14 = paddingTop + i22;
            TextView textView = this.f3284j;
            textView.layout(i18, i13, i19, textView.getMeasuredHeight() + i13);
            int min = Math.min(paddingLeft, (i18 - this.f3287u) - measuredWidth);
            TextView textView2 = this.f3283f;
            textView2.layout(min, i12, measuredWidth + min, textView2.getMeasuredHeight() + i12);
            int max3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f3287u);
            TextView textView3 = this.f3285m;
            textView3.layout(max3, i14, max3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
            this.f3286t = f10;
            this.f3289z = false;
        } else {
            i11 = (height - paddingBottom) - max2;
        }
        i12 = i20 + i11;
        i13 = i21 + i11;
        i14 = i11 + i22;
        TextView textView4 = this.f3284j;
        textView4.layout(i18, i13, i19, textView4.getMeasuredHeight() + i13);
        int min2 = Math.min(paddingLeft, (i18 - this.f3287u) - measuredWidth);
        TextView textView22 = this.f3283f;
        textView22.layout(min2, i12, measuredWidth + min2, textView22.getMeasuredHeight() + i12);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f3287u);
        TextView textView32 = this.f3285m;
        textView32.layout(max32, i14, max32 + measuredWidth3, textView32.getMeasuredHeight() + i14);
        this.f3286t = f10;
        this.f3289z = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f3287u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        y1.a adapter = viewPager.getAdapter();
        a aVar = this.A;
        viewPager.f3314o0 = aVar;
        viewPager.b(aVar);
        this.f3282c = viewPager;
        WeakReference<y1.a> weakReference = this.B;
        a(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f3282c;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f3282c;
            ViewPager.h hVar = viewPager2.f3314o0;
            viewPager2.f3314o0 = null;
            a aVar = this.A;
            List<ViewPager.g> list = viewPager2.f3315p0;
            if (list != null) {
                list.remove(aVar);
            }
            this.f3282c = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f3282c != null) {
            float f10 = this.f3286t;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            c(this.n, f10, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int max;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i10);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
        this.f3283f.measure(childMeasureSpec2, childMeasureSpec);
        this.f3284j.measure(childMeasureSpec2, childMeasureSpec);
        this.f3285m.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            max = View.MeasureSpec.getSize(i11);
        } else {
            max = Math.max(getMinHeight(), this.f3284j.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i11, this.f3284j.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.y) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i10) {
        this.f3288w = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f10) {
        int i10 = ((int) (f10 * 255.0f)) & KotlinVersion.MAX_COMPONENT_VALUE;
        this.C = i10;
        int i11 = (i10 << 24) | (this.D & 16777215);
        this.f3283f.setTextColor(i11);
        this.f3285m.setTextColor(i11);
    }

    public void setTextColor(int i10) {
        this.D = i10;
        this.f3284j.setTextColor(i10);
        int i11 = (this.C << 24) | (this.D & 16777215);
        this.f3283f.setTextColor(i11);
        this.f3285m.setTextColor(i11);
    }

    public void setTextSpacing(int i10) {
        this.f3287u = i10;
        requestLayout();
    }
}
