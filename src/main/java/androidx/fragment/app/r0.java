package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import n0.x;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class r0 {

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2251c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2252f;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2253j;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2254m;
        public final /* synthetic */ ArrayList n;

        public a(r0 r0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2251c = i10;
            this.f2252f = arrayList;
            this.f2253j = arrayList2;
            this.f2254m = arrayList3;
            this.n = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f2251c; i10++) {
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                x.i.v((View) this.f2252f.get(i10), (String) this.f2253j.get(i10));
                x.i.v((View) this.f2254m.get(i10), (String) this.n.get(i10));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        if (x.i.k(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!h(list, childAt, size) && x.i.k(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                f(arrayList, viewGroup.getChildAt(i10));
            }
        }
    }

    public abstract Object g(Object obj);

    public void i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            String k10 = x.i.k(view);
            if (k10 != null) {
                map.put(k10, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    i(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    public void j(View view, Rect rect) {
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        if (x.g.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object l(Object obj, Object obj2, Object obj3);

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public ArrayList<String> n(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            arrayList2.add(x.i.k(view));
            x.i.v(view, null);
        }
        return arrayList2;
    }

    public abstract void o(Object obj, View view);

    public abstract void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void q(Object obj, View view, ArrayList<View> arrayList);

    public abstract void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void s(Object obj, Rect rect);

    public abstract void t(Object obj, View view);

    public void u(Fragment fragment, Object obj, i0.b bVar, Runnable runnable) {
        runnable.run();
    }

    public void v(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            String k10 = x.i.k(view2);
            arrayList4.add(k10);
            if (k10 != null) {
                x.i.v(view2, null);
                String str = (String) ((p.g) map).getOrDefault(k10, null);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        x.i.v(arrayList2.get(i11), k10);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        n0.q.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void w(Object obj, View view, ArrayList<View> arrayList);

    public abstract void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object y(Object obj);
}
