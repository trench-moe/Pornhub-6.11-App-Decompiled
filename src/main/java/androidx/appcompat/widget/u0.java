package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.app.pornhub.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.x;

/* loaded from: classes.dex */
public class u0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static u0 A;

    /* renamed from: z  reason: collision with root package name */
    public static u0 f1105z;

    /* renamed from: c  reason: collision with root package name */
    public final View f1106c;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f1107f;

    /* renamed from: j  reason: collision with root package name */
    public final int f1108j;

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f1109m = new a();
    public final Runnable n = new b();

    /* renamed from: t  reason: collision with root package name */
    public int f1110t;

    /* renamed from: u  reason: collision with root package name */
    public int f1111u;

    /* renamed from: w  reason: collision with root package name */
    public v0 f1112w;
    public boolean y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.d(false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.b();
        }
    }

    public u0(View view, CharSequence charSequence) {
        this.f1106c = view;
        this.f1107f = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = n0.z.f13174a;
        this.f1108j = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(u0 u0Var) {
        u0 u0Var2 = f1105z;
        if (u0Var2 != null) {
            u0Var2.f1106c.removeCallbacks(u0Var2.f1109m);
        }
        f1105z = u0Var;
        if (u0Var != null) {
            u0Var.f1106c.postDelayed(u0Var.f1109m, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f1110t = IntCompanionObject.MAX_VALUE;
        this.f1111u = IntCompanionObject.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r7 = this;
            r3 = r7
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.u0.A
            r5 = 3
            r1 = 0
            if (r0 != r3) goto L29
            androidx.appcompat.widget.u0.A = r1
            androidx.appcompat.widget.v0 r0 = r3.f1112w
            r5 = 6
            if (r0 == 0) goto L1f
            r0.a()
            r3.f1112w = r1
            r5 = 4
            r3.a()
            android.view.View r0 = r3.f1106c
            r6 = 3
            r0.removeOnAttachStateChangeListener(r3)
            r5 = 7
            goto L2a
        L1f:
            r5 = 2
            java.lang.String r5 = "TooltipCompatHandler"
            r0 = r5
            java.lang.String r6 = "sActiveHandler.mPopup == null"
            r2 = r6
            android.util.Log.e(r0, r2)
        L29:
            r6 = 1
        L2a:
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.u0.f1105z
            if (r0 != r3) goto L33
            r6 = 1
            c(r1)
            r5 = 6
        L33:
            android.view.View r0 = r3.f1106c
            r6 = 3
            java.lang.Runnable r1 = r3.n
            r5 = 5
            r0.removeCallbacks(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u0.b():void");
    }

    public void d(boolean z10) {
        int height;
        int i10;
        long j10;
        int longPressTimeout;
        long j11;
        View view = this.f1106c;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        if (x.g.b(view)) {
            c(null);
            u0 u0Var = A;
            if (u0Var != null) {
                u0Var.b();
            }
            A = this;
            this.y = z10;
            v0 v0Var = new v0(this.f1106c.getContext());
            this.f1112w = v0Var;
            View view2 = this.f1106c;
            int i11 = this.f1110t;
            int i12 = this.f1111u;
            boolean z11 = this.y;
            CharSequence charSequence = this.f1107f;
            if (v0Var.f1124b.getParent() != null) {
                v0Var.a();
            }
            v0Var.f1125c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = v0Var.d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = v0Var.f1123a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i11 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = v0Var.f1123a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i10 = i12 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = v0Var.f1123a.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(v0Var.f1126e);
                Rect rect = v0Var.f1126e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = v0Var.f1123a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    v0Var.f1126e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(v0Var.f1128g);
                view2.getLocationOnScreen(v0Var.f1127f);
                int[] iArr = v0Var.f1127f;
                int i13 = iArr[0];
                int[] iArr2 = v0Var.f1128g;
                iArr[0] = i13 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i11) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                v0Var.f1124b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = v0Var.f1124b.getMeasuredHeight();
                int[] iArr3 = v0Var.f1127f;
                int i14 = ((iArr3[1] + i10) - dimensionPixelOffset3) - measuredHeight;
                int i15 = iArr3[1] + height + dimensionPixelOffset3;
                if (z11) {
                    if (i14 >= 0) {
                        layoutParams.y = i14;
                    } else {
                        layoutParams.y = i15;
                    }
                } else if (measuredHeight + i15 <= v0Var.f1126e.height()) {
                    layoutParams.y = i15;
                } else {
                    layoutParams.y = i14;
                }
            }
            ((WindowManager) v0Var.f1123a.getSystemService("window")).addView(v0Var.f1124b, v0Var.d);
            this.f1106c.addOnAttachStateChangeListener(this);
            if (this.y) {
                j11 = 2500;
            } else {
                if ((x.d.g(this.f1106c) & 1) == 1) {
                    j10 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j10 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1106c.removeCallbacks(this.n);
            this.f1106c.postDelayed(this.n, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z10;
        if (this.f1112w == null || !this.y) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1106c.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                    b();
                }
            } else if (this.f1106c.isEnabled() && this.f1112w == null) {
                int x10 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x10 - this.f1110t) > this.f1108j || Math.abs(y - this.f1111u) > this.f1108j) {
                    this.f1110t = x10;
                    this.f1111u = y;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    c(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1110t = view.getWidth() / 2;
        this.f1111u = view.getHeight() / 2;
        d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
