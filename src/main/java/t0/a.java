package t0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0186;
import n0.a0;
import n0.x;
import p.h;
import t0.b;

/* loaded from: classes.dex */
public abstract class a extends n0.a {
    public static final Rect n = new Rect(IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final b.a<o0.b> f15060o = new C0265a();

    /* renamed from: p  reason: collision with root package name */
    public static final b.InterfaceC0266b<h<o0.b>, o0.b> f15061p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f15065h;

    /* renamed from: i  reason: collision with root package name */
    public final View f15066i;

    /* renamed from: j  reason: collision with root package name */
    public c f15067j;
    public final Rect d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f15062e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f15063f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f15064g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f15068k = IntCompanionObject.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f15069l = IntCompanionObject.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f15070m = IntCompanionObject.MIN_VALUE;

    /* renamed from: t0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0265a implements b.a<o0.b> {
        public void a(Object obj, Rect rect) {
            ((o0.b) obj).f13479a.getBoundsInParent(rect);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements b.InterfaceC0266b<h<o0.b>, o0.b> {
    }

    /* loaded from: classes2.dex */
    public class c extends o0.c {
        public c() {
        }

        @Override // o0.c
        public o0.b a(int i10) {
            return new o0.b(AccessibilityNodeInfo.obtain(a.this.s(i10).f13479a));
        }

        @Override // o0.c
        public o0.b b(int i10) {
            int i11 = i10 == 2 ? a.this.f15068k : a.this.f15069l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return new o0.b(AccessibilityNodeInfo.obtain(a.this.s(i11).f13479a));
        }

        @Override // o0.c
        public boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            if (i10 == -1) {
                View view = aVar.f15066i;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                return x.d.j(view, i11, bundle);
            }
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        return i11 != 128 ? aVar.t(i10, i11, bundle) : aVar.j(i10);
                    }
                    if (aVar.f15065h.isEnabled() && aVar.f15065h.isTouchExplorationEnabled() && (i12 = aVar.f15068k) != i10) {
                        if (i12 != Integer.MIN_VALUE) {
                            aVar.j(i12);
                        }
                        aVar.f15068k = i10;
                        aVar.f15066i.invalidate();
                        aVar.y(i10, 32768);
                        return z10;
                    }
                    z10 = false;
                    return z10;
                }
                return aVar.k(i10);
            }
            return aVar.x(i10);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f15066i = view;
        this.f15065h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.d.c(view) == 0) {
            x.d.s(view, 1);
        }
    }

    @Override // n0.a
    public o0.c b(View view) {
        if (this.f15067j == null) {
            this.f15067j = new c();
        }
        return this.f15067j;
    }

    @Override // n0.a
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // n0.a
    public void d(View view, o0.b bVar) {
        this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
        u(bVar);
    }

    public final boolean j(int i10) {
        if (this.f15068k == i10) {
            this.f15068k = IntCompanionObject.MIN_VALUE;
            this.f15066i.invalidate();
            y(i10, 65536);
            return true;
        }
        return false;
    }

    public final boolean k(int i10) {
        if (this.f15069l != i10) {
            return false;
        }
        this.f15069l = IntCompanionObject.MIN_VALUE;
        w(i10, false);
        y(i10, 8);
        return true;
    }

    public final AccessibilityEvent l(int i10, int i11) {
        if (i10 == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            this.f15066i.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i11);
        o0.b s10 = s(i10);
        obtain2.getText().add(s10.j());
        obtain2.setContentDescription(s10.g());
        obtain2.setScrollable(s10.f13479a.isScrollable());
        obtain2.setPassword(s10.f13479a.isPassword());
        obtain2.setEnabled(s10.k());
        obtain2.setChecked(s10.f13479a.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(s10.e());
        obtain2.setSource(this.f15066i, i10);
        obtain2.setPackageName(this.f15066i.getContext().getPackageName());
        return obtain2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cc, code lost:
        r1.f13479a.setVisibleToUser(true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o0.b m(int r11) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.m(int):o0.b");
    }

    public final boolean n(MotionEvent motionEvent) {
        int i10;
        if (this.f15065h.isEnabled() && this.f15065h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i10 = this.f15070m) != Integer.MIN_VALUE) {
                    if (i10 != Integer.MIN_VALUE) {
                        this.f15070m = IntCompanionObject.MIN_VALUE;
                        y(IntCompanionObject.MIN_VALUE, 128);
                        y(i10, 256);
                    }
                    return true;
                }
                return false;
            }
            int o10 = o(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f15070m;
            if (i11 != o10) {
                this.f15070m = o10;
                y(o10, 128);
                y(i11, 256);
            }
            if (o10 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public abstract int o(float f10, float f11);

    public abstract void p(List<Integer> list);

    public final void q(int i10) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f15065h.isEnabled() || (parent = this.f15066i.getParent()) == null) {
            return;
        }
        AccessibilityEvent l10 = l(i10, InterfaceC0186.f43);
        l10.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(this.f15066i, l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.r(int, android.graphics.Rect):boolean");
    }

    public o0.b s(int i10) {
        if (i10 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f15066i);
            o0.b bVar = new o0.b(obtain);
            View view = this.f15066i;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            p(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                bVar.f13479a.addChild(this.f15066i, ((Integer) arrayList.get(i11)).intValue());
            }
            return bVar;
        }
        return m(i10);
    }

    public abstract boolean t(int i10, int i11, Bundle bundle);

    public void u(o0.b bVar) {
    }

    public abstract void v(int i10, o0.b bVar);

    public void w(int i10, boolean z10) {
    }

    public final boolean x(int i10) {
        int i11;
        if ((this.f15066i.isFocused() || this.f15066i.requestFocus()) && (i11 = this.f15069l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                k(i11);
            }
            if (i10 == Integer.MIN_VALUE) {
                return false;
            }
            this.f15069l = i10;
            w(i10, true);
            y(i10, 8);
            return true;
        }
        return false;
    }

    public final boolean y(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f15065h.isEnabled() || (parent = this.f15066i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f15066i, l(i10, i11));
    }
}
