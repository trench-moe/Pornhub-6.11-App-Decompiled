package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.g;
import com.app.pornhub.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.m;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.d0;
import n0.n;
import n0.x;

/* loaded from: classes.dex */
public class a extends m {
    public boolean A;
    public BottomSheetBehavior.c B;

    /* renamed from: j  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f7243j;

    /* renamed from: m  reason: collision with root package name */
    public FrameLayout f7244m;
    public CoordinatorLayout n;

    /* renamed from: t  reason: collision with root package name */
    public FrameLayout f7245t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7246u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7247w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public BottomSheetBehavior.c f7248z;

    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0089a implements n {
        public C0089a() {
        }

        @Override // n0.n
        public d0 a(View view, d0 d0Var) {
            a aVar = a.this;
            BottomSheetBehavior.c cVar = aVar.f7248z;
            if (cVar != null) {
                aVar.f7243j.Q.remove(cVar);
            }
            a aVar2 = a.this;
            aVar2.f7248z = new f(aVar2.f7245t, d0Var, null);
            a aVar3 = a.this;
            aVar3.f7243j.s(aVar3.f7248z);
            return d0Var;
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f7246u && aVar.isShowing()) {
                a aVar2 = a.this;
                if (!aVar2.y) {
                    TypedArray obtainStyledAttributes = aVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    aVar2.f7247w = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    aVar2.y = true;
                }
                if (aVar2.f7247w) {
                    a.this.cancel();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends n0.a {
        public c() {
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            if (!a.this.f7246u) {
                bVar.f13479a.setDismissable(false);
                return;
            }
            bVar.f13479a.addAction(1048576);
            bVar.f13479a.setDismissable(true);
        }

        @Override // n0.a
        public boolean g(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f7246u) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.g(view, i10, bundle);
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d(a aVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends BottomSheetBehavior.c {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void a(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void b(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends BottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f7252a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7253b;

        /* renamed from: c  reason: collision with root package name */
        public final d0 f7254c;

        public f(View view, d0 d0Var, C0089a c0089a) {
            ColorStateList g10;
            this.f7254c = d0Var;
            boolean z10 = true;
            boolean z11 = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0;
            this.f7253b = z11;
            g gVar = BottomSheetBehavior.y(view).f7215i;
            if (gVar != null) {
                g10 = gVar.f3929c.d;
            } else {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                g10 = x.i.g(view);
            }
            if (g10 != null) {
                int defaultColor = g10.getDefaultColor();
                this.f7252a = (defaultColor == 0 || e0.a.d(defaultColor) <= 0.5d) ? false : false;
            } else if (!(view.getBackground() instanceof ColorDrawable)) {
                this.f7252a = z11;
            } else {
                int color = ((ColorDrawable) view.getBackground()).getColor();
                this.f7252a = (color == 0 || e0.a.d(color) <= 0.5d) ? false : false;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void a(View view, float f10) {
            c(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void b(View view, int i10) {
            c(view);
        }

        public final void c(View view) {
            if (view.getTop() < this.f7254c.e()) {
                a.f(view, this.f7252a);
                view.setPadding(view.getPaddingLeft(), this.f7254c.e() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                a.f(view, this.f7253b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968690(0x7f040072, float:1.754604E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132017761(0x7f140261, float:1.967381E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f7246u = r0
            r3.f7247w = r0
            com.google.android.material.bottomsheet.a$e r4 = new com.google.android.material.bottomsheet.a$e
            r4.<init>()
            r3.B = r4
            r3.c(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130969006(0x7f0401ae, float:1.7546682E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.A = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.a.<init>(android.content.Context, int):void");
    }

    public static void f(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z10 ? systemUiVisibility | ConstantsKt.DEFAULT_BUFFER_SIZE : systemUiVisibility & (-8193));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        e();
        super.cancel();
    }

    public final FrameLayout d() {
        if (this.f7244m == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f7244m = frameLayout;
            this.n = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f7244m.findViewById(R.id.design_bottom_sheet);
            this.f7245t = frameLayout2;
            BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.y(frameLayout2);
            this.f7243j = y;
            y.s(this.B);
            this.f7243j.C(this.f7246u);
        }
        return this.f7244m;
    }

    public BottomSheetBehavior<FrameLayout> e() {
        if (this.f7243j == null) {
            d();
        }
        return this.f7243j;
    }

    public final View g(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7244m.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.A) {
            FrameLayout frameLayout = this.f7245t;
            C0089a c0089a = new C0089a();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.i.u(frameLayout, c0089a);
        }
        this.f7245t.removeAllViews();
        if (layoutParams == null) {
            this.f7245t.addView(view);
        } else {
            this.f7245t.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new b());
        x.v(this.f7245t, new c());
        this.f7245t.setOnTouchListener(new d(this));
        return this.f7244m;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.A && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f7244m;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.n;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            if (z10) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // e.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i10 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(IntCompanionObject.MIN_VALUE);
            if (i10 < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7243j;
        if (bottomSheetBehavior != null && bottomSheetBehavior.G == 5) {
            bottomSheetBehavior.E(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f7246u != z10) {
            this.f7246u = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7243j;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f7246u) {
            this.f7246u = true;
        }
        this.f7247w = z10;
        this.y = true;
    }

    @Override // e.m, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(g(i10, null, null));
    }

    @Override // e.m, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(g(0, view, null));
    }

    @Override // e.m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(0, view, layoutParams));
    }
}
