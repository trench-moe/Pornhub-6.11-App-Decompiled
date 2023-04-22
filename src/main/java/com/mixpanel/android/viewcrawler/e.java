package com.mixpanel.android.viewcrawler;

import android.annotation.TargetApi;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mixpanel.android.viewcrawler.a;
import com.mixpanel.android.viewcrawler.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(16)
/* loaded from: classes.dex */
public abstract class e implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<c.C0112c> f8397a;

    /* renamed from: b  reason: collision with root package name */
    public final com.mixpanel.android.viewcrawler.c f8398b = new com.mixpanel.android.viewcrawler.c();

    /* loaded from: classes.dex */
    public static class b extends AbstractC0114e {

        /* renamed from: f  reason: collision with root package name */
        public final int f8399f;

        /* renamed from: g  reason: collision with root package name */
        public final WeakHashMap<View, a> f8400g;

        /* loaded from: classes.dex */
        public class a extends View.AccessibilityDelegate {

            /* renamed from: a  reason: collision with root package name */
            public View.AccessibilityDelegate f8401a;

            public a(View.AccessibilityDelegate accessibilityDelegate) {
                this.f8401a = accessibilityDelegate;
            }

            public void a(a aVar) {
                View.AccessibilityDelegate accessibilityDelegate = this.f8401a;
                if (accessibilityDelegate == aVar) {
                    this.f8401a = aVar.f8401a;
                } else if (accessibilityDelegate instanceof a) {
                    ((a) accessibilityDelegate).a(aVar);
                }
            }

            public boolean b(String str) {
                if (b.this.d.equals(str)) {
                    return true;
                }
                View.AccessibilityDelegate accessibilityDelegate = this.f8401a;
                if (accessibilityDelegate instanceof a) {
                    return ((a) accessibilityDelegate).b(str);
                }
                return false;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i10) {
                b bVar = b.this;
                if (i10 == bVar.f8399f) {
                    bVar.d(view);
                }
                View.AccessibilityDelegate accessibilityDelegate = this.f8401a;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.sendAccessibilityEvent(view, i10);
                }
            }
        }

        public b(List<c.C0112c> list, int i10, String str, i iVar) {
            super(list, str, iVar, false);
            this.f8399f = i10;
            this.f8400g = new WeakHashMap<>();
        }

        @Override // com.mixpanel.android.viewcrawler.c.a
        public void a(View view) {
            View.AccessibilityDelegate e10 = e(view);
            if ((e10 instanceof a) && ((a) e10).b(this.d)) {
                return;
            }
            a aVar = new a(e10);
            view.setAccessibilityDelegate(aVar);
            this.f8400g.put(view, aVar);
        }

        @Override // com.mixpanel.android.viewcrawler.e
        public void b() {
            for (Map.Entry<View, a> entry : this.f8400g.entrySet()) {
                View key = entry.getKey();
                a value = entry.getValue();
                View.AccessibilityDelegate e10 = e(key);
                if (e10 == value) {
                    key.setAccessibilityDelegate(value.f8401a);
                } else if (e10 instanceof a) {
                    a aVar = (a) e10;
                    View.AccessibilityDelegate accessibilityDelegate = aVar.f8401a;
                    if (accessibilityDelegate == value) {
                        aVar.f8401a = value.f8401a;
                    } else if (accessibilityDelegate instanceof a) {
                        ((a) accessibilityDelegate).a(value);
                    }
                }
            }
            this.f8400g.clear();
        }

        public final View.AccessibilityDelegate e(View view) {
            try {
                return (View.AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException unused) {
                return null;
            } catch (InvocationTargetException e10) {
                cb.e.k0("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends AbstractC0114e {

        /* renamed from: f  reason: collision with root package name */
        public final Map<TextView, TextWatcher> f8403f;

        /* loaded from: classes.dex */
        public class a implements TextWatcher {

            /* renamed from: c  reason: collision with root package name */
            public final View f8404c;

            public a(View view) {
                this.f8404c = view;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                c.this.d(this.f8404c);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }

        public c(List<c.C0112c> list, String str, i iVar) {
            super(list, str, iVar, true);
            this.f8403f = new HashMap();
        }

        @Override // com.mixpanel.android.viewcrawler.c.a
        public void a(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                a aVar = new a(textView);
                TextWatcher textWatcher = this.f8403f.get(textView);
                if (textWatcher != null) {
                    textView.removeTextChangedListener(textWatcher);
                }
                textView.addTextChangedListener(aVar);
                this.f8403f.put(textView, aVar);
            }
        }

        @Override // com.mixpanel.android.viewcrawler.e
        public void b() {
            for (Map.Entry<TextView, TextWatcher> entry : this.f8403f.entrySet()) {
                entry.getKey().removeTextChangedListener(entry.getValue());
            }
            this.f8403f.clear();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public d(a aVar) {
        }

        public final boolean a(TreeMap<View, List<View>> treeMap, View view, List<View> list) {
            if (list.contains(view)) {
                return false;
            }
            if (treeMap.containsKey(view)) {
                List<View> remove = treeMap.remove(view);
                list.add(view);
                int size = remove.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!a(treeMap, remove.get(i10), list)) {
                        return false;
                    }
                }
                list.remove(view);
            }
            return true;
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0114e extends e {

        /* renamed from: c  reason: collision with root package name */
        public final i f8406c;
        public final String d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f8407e;

        public AbstractC0114e(List<c.C0112c> list, String str, i iVar, boolean z10) {
            super(list);
            this.f8406c = iVar;
            this.d = str;
            this.f8407e = z10;
        }

        public void d(View view) {
            i iVar = this.f8406c;
            String str = this.d;
            boolean z10 = this.f8407e;
            com.mixpanel.android.viewcrawler.a aVar = (com.mixpanel.android.viewcrawler.a) iVar;
            Objects.requireNonNull(aVar);
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("$text", com.mixpanel.android.viewcrawler.a.a(view));
                jSONObject.put("$from_binding", true);
                jSONObject.put("time", currentTimeMillis / 1000);
            } catch (JSONException e10) {
                cb.e.D("MixpanelAPI.DynamicEventTracker", "Can't format properties from view due to JSON issue", e10);
            }
            if (!z10) {
                com.mixpanel.android.mpmetrics.k kVar = aVar.f8341a;
                if (kVar.l()) {
                    return;
                }
                kVar.q(str, jSONObject, false);
                return;
            }
            a.c cVar = new a.c(view, str);
            a.d dVar = new a.d(str, jSONObject, currentTimeMillis);
            synchronized (aVar.d) {
                boolean isEmpty = aVar.d.isEmpty();
                aVar.d.put(cVar, dVar);
                if (isEmpty) {
                    aVar.f8342b.postDelayed(aVar.f8343c, 1000L);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f8408a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8409b;

        public f(String str, String str2) {
            this.f8408a = str;
            this.f8409b = str2;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f8410a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8411b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8412c;

        public g(int i10, int i11, int i12) {
            this.f8410a = i10;
            this.f8411b = i11;
            this.f8412c = i12;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends e {

        /* renamed from: i  reason: collision with root package name */
        public static final Set<Integer> f8413i = new HashSet(Arrays.asList(0, 1, 5, 7));

        /* renamed from: j  reason: collision with root package name */
        public static final Set<Integer> f8414j = new HashSet(Arrays.asList(2, 3, 4, 6, 8));

        /* renamed from: c  reason: collision with root package name */
        public final WeakHashMap<View, int[]> f8415c;
        public final List<g> d;

        /* renamed from: e  reason: collision with root package name */
        public final String f8416e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8417f;

        /* renamed from: g  reason: collision with root package name */
        public final j f8418g;

        /* renamed from: h  reason: collision with root package name */
        public final d f8419h;

        public h(List<c.C0112c> list, List<g> list2, String str, j jVar) {
            super(list);
            this.f8415c = new WeakHashMap<>();
            this.d = list2;
            this.f8416e = str;
            this.f8417f = true;
            this.f8418g = jVar;
            this.f8419h = new d(null);
        }

        @Override // com.mixpanel.android.viewcrawler.c.a
        public void a(View view) {
            boolean z10;
            ViewGroup viewGroup = (ViewGroup) view;
            SparseArray sparseArray = new SparseArray();
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                int id2 = childAt.getId();
                if (id2 > 0) {
                    sparseArray.put(id2, childAt);
                }
            }
            int size = this.d.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.d.get(i11);
                View view2 = (View) sparseArray.get(gVar.f8410a);
                if (view2 != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view2.getLayoutParams();
                    int[] iArr = (int[]) layoutParams.getRules().clone();
                    if (iArr[gVar.f8411b] != gVar.f8412c) {
                        if (!this.f8415c.containsKey(view2)) {
                            this.f8415c.put(view2, iArr);
                        }
                        layoutParams.addRule(gVar.f8411b, gVar.f8412c);
                        Set<Integer> set = f8413i;
                        if (!((HashSet) set).contains(Integer.valueOf(gVar.f8411b))) {
                            set = f8414j;
                            if (!((HashSet) set).contains(Integer.valueOf(gVar.f8411b))) {
                                set = null;
                            }
                        }
                        if (set != null) {
                            TreeMap<View, List<View>> treeMap = new TreeMap<>(new com.mixpanel.android.viewcrawler.f(this));
                            int size2 = sparseArray.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                View view3 = (View) sparseArray.valueAt(i12);
                                int[] rules = ((RelativeLayout.LayoutParams) view3.getLayoutParams()).getRules();
                                ArrayList arrayList = new ArrayList();
                                for (Integer num : set) {
                                    int i13 = rules[num.intValue()];
                                    if (i13 > 0 && i13 != view3.getId()) {
                                        arrayList.add(sparseArray.get(i13));
                                    }
                                }
                                treeMap.put(view3, arrayList);
                            }
                            d dVar = this.f8419h;
                            Objects.requireNonNull(dVar);
                            ArrayList arrayList2 = new ArrayList();
                            while (true) {
                                if (treeMap.isEmpty()) {
                                    z10 = true;
                                    break;
                                } else if (!dVar.a(treeMap, treeMap.firstKey(), arrayList2)) {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (!z10) {
                                b();
                                j jVar = this.f8418g;
                                f fVar = new f("circular_dependency", this.f8416e);
                                com.mixpanel.android.viewcrawler.d dVar2 = (com.mixpanel.android.viewcrawler.d) jVar;
                                Message obtainMessage = dVar2.f8367h.obtainMessage();
                                obtainMessage.what = 12;
                                obtainMessage.obj = fVar;
                                dVar2.f8367h.sendMessage(obtainMessage);
                                return;
                            }
                        }
                        view2.setLayoutParams(layoutParams);
                    } else {
                        continue;
                    }
                }
            }
        }

        @Override // com.mixpanel.android.viewcrawler.e
        public void b() {
            Iterator<Map.Entry<View, int[]>> it = this.f8415c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f8417f = false;
                    return;
                }
                Map.Entry<View, int[]> next = it.next();
                View key = next.getKey();
                int[] value = next.getValue();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) key.getLayoutParams();
                for (int i10 = 0; i10 < value.length; i10++) {
                    layoutParams.addRule(i10, value[i10]);
                }
                key.setLayoutParams(layoutParams);
            }
        }

        @Override // com.mixpanel.android.viewcrawler.e
        public void c(View view) {
            if (this.f8417f) {
                this.f8398b.c(view, this.f8397a, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
    }

    /* loaded from: classes.dex */
    public interface j {
    }

    /* loaded from: classes.dex */
    public static class k extends e {

        /* renamed from: c  reason: collision with root package name */
        public final fd.a f8420c;
        public final fd.a d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap<View, Object> f8421e;

        /* renamed from: f  reason: collision with root package name */
        public final Object[] f8422f;

        public k(List<c.C0112c> list, fd.a aVar, fd.a aVar2) {
            super(list);
            this.f8420c = aVar;
            this.d = aVar2;
            this.f8422f = new Object[1];
            this.f8421e = new WeakHashMap<>();
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
        @Override // com.mixpanel.android.viewcrawler.c.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.view.View r12) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.viewcrawler.e.k.a(android.view.View):void");
        }

        @Override // com.mixpanel.android.viewcrawler.e
        public void b() {
            while (true) {
                for (Map.Entry<View, Object> entry : this.f8421e.entrySet()) {
                    View key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        Object[] objArr = this.f8422f;
                        objArr[0] = value;
                        this.f8420c.a(key, objArr);
                    }
                }
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class l extends AbstractC0114e {

        /* renamed from: f  reason: collision with root package name */
        public boolean f8423f;

        public l(List<c.C0112c> list, String str, i iVar) {
            super(list, str, iVar, false);
            this.f8423f = false;
        }

        @Override // com.mixpanel.android.viewcrawler.c.a
        public void a(View view) {
            if (view != null && !this.f8423f) {
                d(view);
            }
            this.f8423f = view != null;
        }

        @Override // com.mixpanel.android.viewcrawler.e
        public void b() {
        }
    }

    public e(List<c.C0112c> list) {
        this.f8397a = list;
    }

    public abstract void b();

    public void c(View view) {
        this.f8398b.c(view, this.f8397a, this);
    }
}
