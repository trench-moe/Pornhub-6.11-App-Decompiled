package com.app.pornhub.view.quickseek;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j1.p;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import n0.e;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/app/pornhub/view/quickseek/QuickSeekFrameLayout;", "Landroid/widget/FrameLayout;", BuildConfig.FLAVOR, "n", "Z", "isDoubleTapEnabled", "()Z", "setDoubleTapEnabled", "(Z)V", "Lc5/a;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "controller", "Lc5/a;", "getController", "()Lc5/a;", "setController", "(Lc5/a;)V", BuildConfig.FLAVOR, "doubleTapDelay", "J", "getDoubleTapDelay", "()J", "setDoubleTapDelay", "(J)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", BuildConfig.FLAVOR, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class QuickSeekFrameLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public final e f5451c;

    /* renamed from: f  reason: collision with root package name */
    public final a f5452f;

    /* renamed from: j  reason: collision with root package name */
    public c5.a f5453j;

    /* renamed from: m  reason: collision with root package name */
    public int f5454m;
    public boolean n;

    /* loaded from: classes.dex */
    public static final class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: u  reason: collision with root package name */
        public static final /* synthetic */ int f5455u = 0;

        /* renamed from: c  reason: collision with root package name */
        public final View f5456c;

        /* renamed from: f  reason: collision with root package name */
        public final Handler f5457f;

        /* renamed from: j  reason: collision with root package name */
        public final Runnable f5458j;

        /* renamed from: m  reason: collision with root package name */
        public c5.a f5459m;
        public boolean n;

        /* renamed from: t  reason: collision with root package name */
        public long f5460t;

        public a(View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.f5456c = rootView;
            this.f5457f = new Handler();
            this.f5458j = new p(this, 3);
            this.f5460t = 650L;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (!this.n) {
                this.n = true;
                this.n = true;
                this.f5457f.removeCallbacks(this.f5458j);
                this.f5457f.postDelayed(this.f5458j, this.f5460t);
                c5.a aVar = this.f5459m;
                if (aVar != null) {
                    aVar.e(e10.getX(), e10.getY());
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (e10.getActionMasked() == 1 && this.n) {
                c5.a aVar = this.f5459m;
                if (aVar != null) {
                    aVar.b(e10.getX(), e10.getY());
                }
                return true;
            }
            return super.onDoubleTapEvent(e10);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.n) {
                c5.a aVar = this.f5459m;
                if (aVar != null) {
                    aVar.d(e10.getX(), e10.getY());
                }
                return true;
            }
            return super.onDown(e10);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.n) {
                return true;
            }
            return this.f5456c.performClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.n) {
                c5.a aVar = this.f5459m;
                if (aVar != null) {
                    aVar.b(e10.getX(), e10.getY());
                }
                return true;
            }
            return super.onSingleTapUp(e10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickSeekFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickSeekFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        new LinkedHashMap();
        this.f5454m = -1;
        a aVar = new a(this);
        this.f5452f = aVar;
        this.f5451c = new e(context, aVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cb.e.f3923j, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…uickSeekFrameLayout, 0,0)");
            this.f5454m = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
        }
        this.n = true;
    }

    private final c5.a getController() {
        return this.f5452f.f5459m;
    }

    private final void setController(c5.a aVar) {
        this.f5452f.f5459m = aVar;
        this.f5453j = aVar;
    }

    public final long getDoubleTapDelay() {
        return this.f5452f.f5460t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5454m != -1) {
            try {
                ViewParent parent = getParent();
                if (parent == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                View findViewById = ((View) parent).findViewById(this.f5454m);
                if (findViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                if (findViewById instanceof c5.a) {
                    c5.a controller = (c5.a) findViewById;
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    setController(controller);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                kf.a.f12078a.c(Intrinsics.stringPlus("controllerRef is either invalid or not DoubleTapListener: ", e10.getMessage()), new Object[0]);
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.n) {
            ((e.b) this.f5451c.f13139a).f13140a.onTouchEvent(ev);
            return true;
        }
        return super.onTouchEvent(ev);
    }

    public final void setDoubleTapDelay(long j10) {
        this.f5452f.f5460t = j10;
    }

    public final void setDoubleTapEnabled(boolean z10) {
        this.n = z10;
    }
}
