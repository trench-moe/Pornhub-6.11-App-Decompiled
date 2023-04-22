package com.mixpanel.android.viewcrawler;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.k;
import com.mixpanel.android.viewcrawler.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements e.i {

    /* renamed from: a  reason: collision with root package name */
    public final k f8341a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f8342b;
    public final Map<c, d> d = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f8343c = new b(null);

    /* loaded from: classes.dex */
    public final class b implements Runnable {
        public b(C0111a c0111a) {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (a.this.d) {
                Iterator<Map.Entry<c, d>> it = a.this.d.entrySet().iterator();
                while (it.hasNext()) {
                    d value = it.next().getValue();
                    if (currentTimeMillis - value.f8346a > 1000) {
                        a.this.f8341a.p(value.f8347b, value.f8348c);
                        it.remove();
                    }
                }
                if (!a.this.d.isEmpty()) {
                    a.this.f8342b.postDelayed(this, 500L);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8345a;

        public c(View view, String str) {
            this.f8345a = view.hashCode() ^ str.hashCode();
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && this.f8345a == obj.hashCode();
        }

        public int hashCode() {
            return this.f8345a;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f8346a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8347b;

        /* renamed from: c  reason: collision with root package name */
        public final JSONObject f8348c;

        public d(String str, JSONObject jSONObject, long j10) {
            this.f8347b = str;
            this.f8348c = jSONObject;
            this.f8346a = j10;
        }
    }

    public a(k kVar, Handler handler) {
        this.f8341a = kVar;
        this.f8342b = handler;
    }

    public static String a(View view) {
        String str = null;
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text != null) {
                return text.toString();
            }
        } else if (view instanceof ViewGroup) {
            StringBuilder sb2 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean z10 = false;
            for (int i10 = 0; i10 < childCount && sb2.length() < 128; i10++) {
                String a10 = a(viewGroup.getChildAt(i10));
                if (a10 != null && a10.length() > 0) {
                    if (z10) {
                        sb2.append(", ");
                    }
                    sb2.append(a10);
                    z10 = true;
                }
            }
            if (sb2.length() > 128) {
                return sb2.substring(0, 128);
            }
            if (z10) {
                str = sb2.toString();
            }
        }
        return str;
    }
}
