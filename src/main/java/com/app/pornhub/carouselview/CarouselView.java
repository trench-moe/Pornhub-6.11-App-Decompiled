package com.app.pornhub.carouselview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import java.util.Timer;
import java.util.TimerTask;
import o2.d;

@RemoteViews.RemoteView
/* loaded from: classes.dex */
public class CarouselView extends FrameLayout {
    public Timer A;
    public c B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public ViewPager.i G;
    public ViewPager.h H;

    /* renamed from: c  reason: collision with root package name */
    public int f4272c;

    /* renamed from: f  reason: collision with root package name */
    public int f4273f;

    /* renamed from: j  reason: collision with root package name */
    public int f4274j;

    /* renamed from: m  reason: collision with root package name */
    public int f4275m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f4276t;

    /* renamed from: u  reason: collision with root package name */
    public CarouselViewPager f4277u;

    /* renamed from: w  reason: collision with root package name */
    public CirclePageIndicator f4278w;
    public d y;

    /* renamed from: z  reason: collision with root package name */
    public o2.c f4279z;

    /* loaded from: classes.dex */
    public class a implements ViewPager.h {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(int i10) {
            CarouselView carouselView = CarouselView.this;
            if (carouselView.F == 1 && i10 == 2) {
                if (carouselView.D) {
                    carouselView.c();
                } else {
                    carouselView.b();
                }
            }
            CarouselView.this.F = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void c(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class b extends y1.a {

        /* renamed from: c  reason: collision with root package name */
        public Context f4281c;

        public b(Context context) {
            this.f4281c = context;
        }

        @Override // y1.a
        public void c(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // y1.a
        public int e() {
            return CarouselView.this.getPageCount();
        }

        @Override // y1.a
        public Object g(ViewGroup viewGroup, int i10) {
            CarouselView carouselView = CarouselView.this;
            if (carouselView.f4279z != null) {
                ImageView imageView = new ImageView(this.f4281c);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                CarouselView.this.f4279z.a(i10, imageView);
                viewGroup.addView(imageView);
                return imageView;
            }
            d dVar = carouselView.y;
            if (dVar != null) {
                View a10 = dVar.a(i10);
                if (a10 != null) {
                    viewGroup.addView(a10);
                    return a10;
                }
                throw new RuntimeException(a1.a.j("View can not be null for position ", i10));
            }
            StringBuilder m10 = a1.a.m("View must set ");
            m10.append(o2.c.class.getSimpleName());
            m10.append(" or ");
            m10.append(d.class.getSimpleName());
            m10.append(".");
            throw new RuntimeException(m10.toString());
        }

        @Override // y1.a
        public boolean h(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes.dex */
    public class c extends TimerTask {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = true;
                int currentItem = (CarouselView.this.f4277u.getCurrentItem() + 1) % CarouselView.this.getPageCount();
                CarouselView carouselView = CarouselView.this;
                CarouselViewPager carouselViewPager = carouselView.f4277u;
                if (currentItem == 0) {
                    if (carouselView.E) {
                        carouselViewPager.A(currentItem, z10);
                    }
                    z10 = false;
                }
                carouselViewPager.A(currentItem, z10);
            }
        }

        public c(a aVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            CarouselView.this.f4277u.post(new a());
        }
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4273f = 3500;
        this.f4274j = 81;
        this.f4276t = 0;
        this.y = null;
        this.f4279z = null;
        this.E = true;
        this.H = new a();
        a(context, attributeSet, 0);
    }

    public CarouselView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4273f = 3500;
        this.f4274j = 81;
        this.f4276t = 0;
        this.y = null;
        this.f4279z = null;
        this.E = true;
        this.H = new a();
        a(context, attributeSet, i10);
    }

    private void setAutoPlay(boolean z10) {
        this.C = z10;
    }

    private void setDisableAutoPlayOnUserInteraction(boolean z10) {
        this.D = z10;
    }

    public final void a(Context context, AttributeSet attributeSet, int i10) {
        if (isInEditMode()) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_carousel, (ViewGroup) this, true);
        this.f4277u = (CarouselViewPager) inflate.findViewById(R.id.containerViewPager);
        this.f4278w = (CirclePageIndicator) inflate.findViewById(R.id.indicator);
        this.f4277u.c(this.H);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.b.C, i10, 0);
        try {
            this.f4275m = obtainStyledAttributes.getDimensionPixelSize(6, getResources().getDimensionPixelSize(R.dimen.default_indicator_margin_vertical));
            this.n = obtainStyledAttributes.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.default_indicator_margin_horizontal));
            setSlideInterval(obtainStyledAttributes.getInt(13, 3500));
            setOrientation(obtainStyledAttributes.getInt(7, 0));
            setIndicatorGravity(obtainStyledAttributes.getInt(4, 81));
            setAutoPlay(obtainStyledAttributes.getBoolean(1, true));
            setDisableAutoPlayOnUserInteraction(obtainStyledAttributes.getBoolean(2, false));
            setAnimateOnBoundary(obtainStyledAttributes.getBoolean(0, true));
            setPageTransformer(obtainStyledAttributes.getInt(11, -1));
            int i11 = obtainStyledAttributes.getInt(8, 0);
            this.f4276t = i11;
            setIndicatorVisibility(i11);
            if (this.f4276t == 0) {
                int color = obtainStyledAttributes.getColor(3, 0);
                if (color != 0) {
                    setFillColor(color);
                }
                int color2 = obtainStyledAttributes.getColor(9, 0);
                if (color2 != 0) {
                    setPageColor(color2);
                }
                float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
                if (dimensionPixelSize != 0.0f) {
                    setRadius(dimensionPixelSize);
                }
                setSnap(obtainStyledAttributes.getBoolean(14, getResources().getBoolean(R.bool.default_circle_indicator_snap)));
                int color3 = obtainStyledAttributes.getColor(15, 0);
                if (color3 != 0) {
                    setStrokeColor(color3);
                }
                float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(16, 0);
                if (dimensionPixelSize2 != 0.0f) {
                    setStrokeWidth(dimensionPixelSize2);
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b() {
        c();
        if (!this.C || this.f4273f <= 0 || this.f4277u.getAdapter() == null || this.f4277u.getAdapter().e() <= 1) {
            return;
        }
        Timer timer = this.A;
        c cVar = this.B;
        int i10 = this.f4273f;
        timer.schedule(cVar, i10, i10);
    }

    public final void c() {
        Timer timer = this.A;
        if (timer != null) {
            timer.cancel();
        }
        c cVar = this.B;
        if (cVar != null) {
            cVar.cancel();
        }
        this.B = new c(null);
        this.A = new Timer();
    }

    public CarouselViewPager getContainerViewPager() {
        return this.f4277u;
    }

    public int getCurrentItem() {
        return this.f4277u.getCurrentItem();
    }

    public int getFillColor() {
        return this.f4278w.getFillColor();
    }

    public Drawable getIndicatorBackground() {
        return this.f4278w.getBackground();
    }

    public int getIndicatorGravity() {
        return this.f4274j;
    }

    public int getIndicatorMarginHorizontal() {
        return this.n;
    }

    public int getIndicatorMarginVertical() {
        return this.f4275m;
    }

    public int getOrientation() {
        return this.f4278w.getOrientation();
    }

    public int getPageColor() {
        return this.f4278w.getPageColor();
    }

    public int getPageCount() {
        return this.f4272c;
    }

    public ViewPager.i getPageTransformer() {
        return this.G;
    }

    public float getRadius() {
        return this.f4278w.getRadius();
    }

    public int getSlideInterval() {
        return this.f4273f;
    }

    public int getStrokeColor() {
        return this.f4278w.getStrokeColor();
    }

    public float getStrokeWidth() {
        return this.f4278w.getStrokeWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public void setAnimateOnBoundary(boolean z10) {
        this.E = z10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    public void setCurrentItem(int i10) {
        this.f4277u.setCurrentItem(i10);
    }

    public void setFillColor(int i10) {
        this.f4278w.setFillColor(i10);
    }

    public void setImageClickListener(o2.b bVar) {
        this.f4277u.setImageClickListener(bVar);
    }

    public void setImageListener(o2.c cVar) {
        this.f4279z = cVar;
    }

    public void setIndicatorGravity(int i10) {
        this.f4274j = i10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = this.f4274j;
        int i11 = this.n;
        int i12 = this.f4275m;
        layoutParams.setMargins(i11, i12, i11, i12);
        this.f4278w.setLayoutParams(layoutParams);
    }

    public void setIndicatorMarginHorizontal(int i10) {
        this.n = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        int i11 = this.n;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
    }

    public void setIndicatorMarginVertical(int i10) {
        this.f4275m = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        int i11 = this.f4275m;
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i11;
    }

    public void setIndicatorVisibility(int i10) {
        this.f4278w.setVisibility(i10);
    }

    public void setOrientation(int i10) {
        this.f4278w.setOrientation(i10);
    }

    public void setPageColor(int i10) {
        this.f4278w.setPageColor(i10);
    }

    public void setPageCount(int i10) {
        this.f4272c = i10;
        this.f4277u.setAdapter(new b(getContext()));
        if (getPageCount() > 1) {
            this.f4278w.setViewPager(this.f4277u);
            this.f4278w.requestLayout();
            this.f4278w.invalidate();
            this.f4277u.setOffscreenPageLimit(getPageCount());
            b();
        }
    }

    public void setPageTransformer(int i10) {
        setPageTransformer(new o2.a(i10));
    }

    public void setPageTransformer(ViewPager.i iVar) {
        this.G = iVar;
        this.f4277u.C(true, iVar);
    }

    public void setRadius(float f10) {
        this.f4278w.setRadius(f10);
    }

    public void setSlideInterval(int i10) {
        this.f4273f = i10;
        if (this.f4277u != null) {
            b();
        }
    }

    public void setSnap(boolean z10) {
        this.f4278w.setSnap(z10);
    }

    public void setStrokeColor(int i10) {
        this.f4278w.setStrokeColor(i10);
    }

    public void setStrokeWidth(float f10) {
        this.f4278w.setStrokeWidth(f10);
        int i10 = (int) f10;
        this.f4278w.setPadding(i10, i10, i10, i10);
    }

    public void setViewListener(d dVar) {
        this.y = dVar;
    }
}
