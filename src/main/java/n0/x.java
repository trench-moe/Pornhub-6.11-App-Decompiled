package n0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n0.a;
import n0.c;
import n0.d0;
import n0.x;
import o0.b;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes2.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, a0> f13156a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f13157b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f13158c;
    public static ThreadLocal<Rect> d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f13159e;

    /* renamed from: f  reason: collision with root package name */
    public static final n0.p f13160f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f13161g;

    /* loaded from: classes2.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f13162c = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f13162c.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.getVisibility() == 0;
                    if (booleanValue != z10) {
                        x.m(key, z10 ? 16 : 32);
                        this.f13162c.put(key, Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f13163a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f13164b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13165c;
        public final int d;

        public b(int i10, Class<T> cls, int i11) {
            this.f13163a = i10;
            this.f13164b = cls;
            this.d = 0;
            this.f13165c = i11;
        }

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f13163a = i10;
            this.f13164b = cls;
            this.d = i11;
            this.f13165c = i12;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t2);

        public T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f13165c) {
                return b(view);
            }
            T t2 = (T) view.getTag(this.f13163a);
            if (this.f13164b.isInstance(t2)) {
                return t2;
            }
            return null;
        }

        public void e(View view, T t2) {
            if (Build.VERSION.SDK_INT >= this.f13165c) {
                c(view, t2);
            } else if (f(d(view), t2)) {
                n0.a g10 = x.g(view);
                if (g10 == null) {
                    g10 = new n0.a();
                }
                x.v(view, g10);
                view.setTag(this.f13163a, t2);
                x.m(view, this.d);
            }
        }

        public abstract boolean f(T t2, T t8);
    }

    /* loaded from: classes2.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes2.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* loaded from: classes2.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes2.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes2.dex */
    public static class i {

        /* loaded from: classes2.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public d0 f13166a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f13167b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ n0.n f13168c;

            public a(View view, n0.n nVar) {
                this.f13167b = view;
                this.f13168c = nVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                d0 k10 = d0.k(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    i.a(windowInsets, this.f13167b);
                    if (k10.equals(this.f13166a)) {
                        return this.f13168c.a(view, k10).i();
                    }
                }
                this.f13166a = k10;
                d0 a10 = this.f13168c.a(view, k10);
                if (i10 >= 30) {
                    return a10.i();
                }
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                h.c(view);
                return a10.i();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static d0 b(View view, d0 d0Var, Rect rect) {
            WindowInsets i10 = d0Var.i();
            if (i10 != null) {
                return d0.k(view.computeSystemWindowInsets(i10, rect), view);
            }
            rect.setEmpty();
            return d0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static d0 j(View view) {
            if (d0.a.d && view.isAttachedToWindow()) {
                try {
                    Object obj = d0.a.f13114a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) d0.a.f13115b.get(obj);
                        Rect rect2 = (Rect) d0.a.f13116c.get(obj);
                        if (rect == null || rect2 == null) {
                            return null;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        d0.e dVar = i10 >= 30 ? new d0.d() : i10 >= 29 ? new d0.c() : new d0.b();
                        dVar.c(e0.b.a(rect.left, rect.top, rect.right, rect.bottom));
                        dVar.d(e0.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        d0 b10 = dVar.b();
                        b10.f13113a.n(b10);
                        b10.f13113a.d(view.getRootView());
                        return b10;
                    }
                    return null;
                } catch (IllegalAccessException e10) {
                    StringBuilder m10 = a1.a.m("Failed to get insets from AttachInfo. ");
                    m10.append(e10.getMessage());
                    Log.w("WindowInsetsCompat", m10.toString(), e10);
                    return null;
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, n0.n nVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, nVar);
            }
            if (nVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, nVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes2.dex */
    public static class j {
        public static d0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            d0 k10 = d0.k(rootWindowInsets, null);
            k10.f13113a.n(k10);
            k10.f13113a.d(view.getRootView());
            return k10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* loaded from: classes2.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* loaded from: classes2.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes2.dex */
    public static class m {
        public static void a(View view, final r rVar) {
            p.g gVar = (p.g) view.getTag(R.id.tag_unhandled_key_listeners);
            if (gVar == null) {
                gVar = new p.g();
                view.setTag(R.id.tag_unhandled_key_listeners, gVar);
            }
            Objects.requireNonNull(rVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: n0.y
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return x.r.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(rVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            p.g gVar = (p.g) view.getTag(R.id.tag_unhandled_key_listeners);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.getOrDefault(rVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* loaded from: classes2.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes2.dex */
    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static n0.c b(View view, n0.c cVar) {
            ContentInfo b10 = cVar.f13100a.b();
            ContentInfo performReceiveContent = view.performReceiveContent(b10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == b10 ? cVar : new n0.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, n0.o oVar) {
            if (oVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(oVar));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final n0.o f13169a;

        public q(n0.o oVar) {
            this.f13169a = oVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            n0.c cVar = new n0.c(new c.d(contentInfo));
            n0.c a10 = this.f13169a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            return a10 == cVar ? contentInfo : a10.f13100a.b();
        }
    }

    /* loaded from: classes2.dex */
    public interface r {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes2.dex */
    public static class s {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f13170a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f13171b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f13172c = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f13170a;
            if (weakHashMap != null) {
                if (!weakHashMap.containsKey(view)) {
                    return null;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a10 != null) {
                            return a10;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f13156a = null;
        f13158c = false;
        f13159e = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f13160f = new n0.p() { // from class: n0.s
            @Override // n0.p
            public final c a(c cVar) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                return cVar;
            }
        };
        f13161g = new a();
    }

    public static void a(View view, b.a aVar) {
        n0.a g10 = g(view);
        if (g10 == null) {
            g10 = new n0.a();
        }
        v(view, g10);
        s(aVar.a(), view);
        j(view).add(aVar);
        m(view, 0);
    }

    public static a0 b(View view) {
        if (f13156a == null) {
            f13156a = new WeakHashMap<>();
        }
        a0 a0Var = f13156a.get(view);
        if (a0Var == null) {
            a0Var = new a0(view);
            f13156a.put(view, a0Var);
        }
        return a0Var;
    }

    public static void c(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                y((View) parent);
            }
        }
    }

    public static void d(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                y((View) parent);
            }
        }
    }

    public static d0 e(View view, d0 d0Var) {
        WindowInsets i10 = d0Var.i();
        if (i10 != null) {
            WindowInsets a10 = h.a(view, i10);
            if (!a10.equals(i10)) {
                return d0.k(a10, view);
            }
        }
        return d0Var;
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f13170a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f13170a == null) {
                        sVar.f13170a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f13170a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f13170a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f13171b == null) {
                    sVar.f13171b = new SparseArray<>();
                }
                sVar.f13171b.put(keyCode, new WeakReference<>(a10));
            }
        }
        return a10 != null;
    }

    public static n0.a g(View view) {
        View.AccessibilityDelegate h10 = h(view);
        if (h10 == null) {
            return null;
        }
        return h10 instanceof a.C0216a ? ((a.C0216a) h10).f13092a : new n0.a(h10);
    }

    public static View.AccessibilityDelegate h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f13158c) {
            return null;
        }
        if (f13157b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f13157b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f13158c = true;
                return null;
            }
        }
        try {
            Object obj = f13157b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f13158c = true;
            return null;
        }
    }

    public static CharSequence i(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = m.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static List<b.a> j(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static Rect k() {
        if (d == null) {
            d = new ThreadLocal<>();
        }
        Rect rect = d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] l(View view) {
        return Build.VERSION.SDK_INT >= 31 ? p.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void m(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = i(view) != null && view.getVisibility() == 0;
            int i11 = 32;
            if (g.a(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                g.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(i(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        ViewParent viewParent = parent;
                        if (!(viewParent instanceof View)) {
                            break;
                        } else if (d.c((View) viewParent) == 4) {
                            d.s(view, 2);
                            break;
                        } else {
                            parent = viewParent.getParent();
                        }
                    }
                    view.sendAccessibilityEventUnchecked(obtain);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(i(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void n(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect k10 = k();
        boolean z10 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            k10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !k10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        c(view, i10);
        if (z10 && k10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(k10);
        }
    }

    public static void o(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect k10 = k();
        boolean z10 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            k10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !k10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        d(view, i10);
        if (z10 && k10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(k10);
        }
    }

    public static d0 p(View view, d0 d0Var) {
        WindowInsets i10 = d0Var.i();
        if (i10 != null) {
            WindowInsets b10 = h.b(view, i10);
            if (!b10.equals(i10)) {
                return d0.k(b10, view);
            }
        }
        return d0Var;
    }

    public static n0.c q(View view, n0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        n0.o oVar = (n0.o) view.getTag(R.id.tag_on_receive_content_listener);
        if (oVar == null) {
            return (view instanceof n0.p ? (n0.p) view : f13160f).a(cVar);
        }
        n0.c a10 = oVar.a(view, cVar);
        if (a10 == null) {
            return null;
        }
        return (view instanceof n0.p ? (n0.p) view : f13160f).a(a10);
    }

    public static void r(View view, int i10) {
        s(i10, view);
        m(view, 0);
    }

    public static void s(int i10, View view) {
        List<b.a> j10 = j(view);
        for (int i11 = 0; i11 < j10.size(); i11++) {
            if (j10.get(i11).a() == i10) {
                j10.remove(i11);
                return;
            }
        }
    }

    public static void t(View view, b.a aVar, CharSequence charSequence, o0.d dVar) {
        if (dVar != null) {
            a(view, new b.a(null, aVar.f13493b, null, dVar, aVar.f13494c));
            return;
        }
        s(aVar.a(), view);
        m(view, 0);
    }

    public static void u(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static void v(View view, n0.a aVar) {
        if (aVar == null && (h(view) instanceof a.C0216a)) {
            aVar = new n0.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f13091b);
    }

    public static void w(View view, CharSequence charSequence) {
        new u(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f13161g;
            aVar.f13162c.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        } else {
            a aVar2 = f13161g;
            aVar2.f13162c.remove(view);
            view.removeOnAttachStateChangeListener(aVar2);
            d.o(view.getViewTreeObserver(), aVar2);
        }
    }

    public static void x(View view, n0.r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(view, (PointerIcon) (rVar != null ? rVar.f13154a : null));
        }
    }

    public static void y(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
