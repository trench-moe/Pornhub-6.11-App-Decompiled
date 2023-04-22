package com.mixpanel.android.viewcrawler;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f8353a = new b();

    /* loaded from: classes.dex */
    public interface a {
        void a(View view);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f8354a = new int[256];

        /* renamed from: b  reason: collision with root package name */
        public int f8355b = 0;
    }

    /* renamed from: com.mixpanel.android.viewcrawler.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0112c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8356a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8357b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8358c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final String f8359e;

        /* renamed from: f  reason: collision with root package name */
        public final String f8360f;

        public C0112c(int i10, String str, int i11, int i12, String str2, String str3) {
            this.f8356a = i10;
            this.f8357b = str;
            this.f8358c = i11;
            this.d = i12;
            this.f8359e = str2;
            this.f8360f = str3;
        }

        public String toString() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f8356a == 1) {
                    jSONObject.put("prefix", "shortest");
                }
                String str = this.f8357b;
                if (str != null) {
                    jSONObject.put("view_class", str);
                }
                int i10 = this.f8358c;
                if (i10 > -1) {
                    jSONObject.put("index", i10);
                }
                int i11 = this.d;
                if (i11 > -1) {
                    jSONObject.put("id", i11);
                }
                String str2 = this.f8359e;
                if (str2 != null) {
                    jSONObject.put("contentDescription", str2);
                }
                String str3 = this.f8360f;
                if (str3 != null) {
                    jSONObject.put("tag", str3);
                }
                return jSONObject.toString();
            } catch (JSONException e10) {
                throw new RuntimeException("Can't serialize PathElement to String", e10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r1 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View a(com.mixpanel.android.viewcrawler.c.C0112c r12, android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.viewcrawler.c.a(com.mixpanel.android.viewcrawler.c$c, android.view.View, int):android.view.View");
    }

    public final void b(View view, List<C0112c> list, a aVar) {
        if (list.isEmpty()) {
            aVar.a(view);
        } else if (view instanceof ViewGroup) {
            b bVar = this.f8353a;
            if (bVar.f8354a.length == bVar.f8355b) {
                cb.e.h0("MixpanelAPI.PathFinder", "Path is too deep, will not match");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            C0112c c0112c = list.get(0);
            List<C0112c> subList = list.subList(1, list.size());
            int childCount = viewGroup.getChildCount();
            b bVar2 = this.f8353a;
            int i10 = bVar2.f8355b;
            bVar2.f8355b = i10 + 1;
            bVar2.f8354a[i10] = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View a10 = a(c0112c, viewGroup.getChildAt(i11), i10);
                if (a10 != null) {
                    b(a10, subList, aVar);
                }
                int i12 = c0112c.f8358c;
                if (i12 >= 0 && this.f8353a.f8354a[i10] > i12) {
                    break;
                }
            }
            b bVar3 = this.f8353a;
            int i13 = bVar3.f8355b - 1;
            bVar3.f8355b = i13;
            if (i13 < 0) {
                throw new ArrayIndexOutOfBoundsException(bVar3.f8355b);
            }
        }
    }

    public void c(View view, List<C0112c> list, a aVar) {
        if (list.isEmpty()) {
            return;
        }
        b bVar = this.f8353a;
        if (bVar.f8354a.length == bVar.f8355b) {
            cb.e.j0("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
            return;
        }
        List<C0112c> subList = list.subList(1, list.size());
        b bVar2 = this.f8353a;
        int i10 = bVar2.f8355b;
        bVar2.f8355b = i10 + 1;
        bVar2.f8354a[i10] = 0;
        View a10 = a(list.get(0), view, i10);
        b bVar3 = this.f8353a;
        int i11 = bVar3.f8355b - 1;
        bVar3.f8355b = i11;
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(bVar3.f8355b);
        }
        if (a10 != null) {
            b(a10, subList, aVar);
        }
    }
}
