package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.h0;
import androidx.navigation.l;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class m {

    /* renamed from: c  reason: collision with root package name */
    public final String f2692c;

    /* renamed from: f  reason: collision with root package name */
    public o f2693f;

    /* renamed from: j  reason: collision with root package name */
    public int f2694j;

    /* renamed from: m  reason: collision with root package name */
    public String f2695m;
    public CharSequence n;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<l> f2696t;

    /* renamed from: u  reason: collision with root package name */
    public p.h<d> f2697u;

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, h> f2698w;

    /* loaded from: classes.dex */
    public static class a implements Comparable<a> {

        /* renamed from: c  reason: collision with root package name */
        public final m f2699c;

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f2700f;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f2701j;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f2702m;
        public final int n;

        public a(m mVar, Bundle bundle, boolean z10, boolean z11, int i10) {
            this.f2699c = mVar;
            this.f2700f = bundle;
            this.f2701j = z10;
            this.f2702m = z11;
            this.n = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(a aVar) {
            boolean z10 = this.f2701j;
            if (!z10 || aVar.f2701j) {
                if (z10 || !aVar.f2701j) {
                    Bundle bundle = this.f2700f;
                    if (bundle == null || aVar.f2700f != null) {
                        if (bundle != null || aVar.f2700f == null) {
                            if (bundle != null) {
                                int size = bundle.size() - aVar.f2700f.size();
                                if (size > 0) {
                                    return 1;
                                }
                                if (size < 0) {
                                    return -1;
                                }
                            }
                            boolean z11 = this.f2702m;
                            if (!z11 || aVar.f2702m) {
                                if (z11 || !aVar.f2702m) {
                                    return this.n - aVar.n;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
    }

    static {
        new HashMap();
    }

    public m(v<? extends m> vVar) {
        this.f2692c = w.b(vVar.getClass());
    }

    public static String h(Context context, int i10) {
        if (i10 <= 16777215) {
            return Integer.toString(i10);
        }
        try {
            return context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i10);
        }
    }

    public Bundle b(Bundle bundle) {
        HashMap<String, h> hashMap;
        if (bundle != null || ((hashMap = this.f2698w) != null && !hashMap.isEmpty())) {
            Bundle bundle2 = new Bundle();
            HashMap<String, h> hashMap2 = this.f2698w;
            if (hashMap2 != null) {
                loop0: while (true) {
                    for (Map.Entry<String, h> entry : hashMap2.entrySet()) {
                        h value = entry.getValue();
                        String key = entry.getKey();
                        if (value.f2665c) {
                            value.f2663a.d(bundle2, key, value.d);
                        }
                    }
                }
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
                HashMap<String, h> hashMap3 = this.f2698w;
                if (hashMap3 != null) {
                    for (Map.Entry<String, h> entry2 : hashMap3.entrySet()) {
                        h value2 = entry2.getValue();
                        String key2 = entry2.getKey();
                        boolean z10 = false;
                        if (value2.f2664b || !bundle2.containsKey(key2) || bundle2.get(key2) != null) {
                            try {
                                value2.f2663a.a(bundle2, key2);
                                z10 = true;
                            } catch (ClassCastException unused) {
                            }
                        }
                        if (!z10) {
                            StringBuilder m10 = a1.a.m("Wrong argument type for '");
                            m10.append(entry2.getKey());
                            m10.append("' in argument bundle. ");
                            m10.append(entry2.getValue().f2663a.b());
                            m10.append(" expected.");
                            throw new IllegalArgumentException(m10.toString());
                        }
                    }
                }
            }
            return bundle2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[LOOP:0: B:3:0x0007->B:16:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001a A[EDGE_INSN: B:17:0x001a->B:10:0x001a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] e() {
        /*
            r7 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r6 = 4
            r1 = r7
        L7:
            androidx.navigation.o r2 = r1.f2693f
            r6 = 7
            if (r2 == 0) goto L14
            int r3 = r2.f2703z
            r6 = 2
            int r4 = r1.f2694j
            if (r3 == r4) goto L18
            r6 = 5
        L14:
            r6 = 4
            r0.addFirst(r1)
        L18:
            if (r2 != 0) goto L42
            r6 = 7
            int r5 = r0.size()
            r1 = r5
            int[] r1 = new int[r1]
            r6 = 2
            r5 = 0
            r2 = r5
            java.util.Iterator r5 = r0.iterator()
            r0 = r5
        L2a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L40
            r6 = 1
            java.lang.Object r3 = r0.next()
            androidx.navigation.m r3 = (androidx.navigation.m) r3
            int r4 = r2 + 1
            int r3 = r3.f2694j
            r6 = 4
            r1[r2] = r3
            r2 = r4
            goto L2a
        L40:
            r6 = 5
            return r1
        L42:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.m.e():int[]");
    }

    public final d g(int i10) {
        p.h<d> hVar = this.f2697u;
        d f10 = hVar == null ? null : hVar.f(i10, null);
        if (f10 != null) {
            return f10;
        }
        o oVar = this.f2693f;
        if (oVar != null) {
            return oVar.g(i10);
        }
        return null;
    }

    public a j(h0 h0Var) {
        Bundle bundle;
        int i10;
        Bundle bundle2;
        Matcher matcher;
        Uri uri;
        ArrayList<l> arrayList = this.f2696t;
        Matcher matcher2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator<l> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            l next = it.next();
            Uri uri2 = (Uri) h0Var.f2145f;
            if (uri2 != null) {
                HashMap<String, h> hashMap = this.f2698w;
                Map emptyMap = hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
                Matcher matcher3 = next.f2683c.matcher(uri2.toString());
                if (matcher3.matches()) {
                    bundle2 = new Bundle();
                    int size = next.f2681a.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            String str = next.f2681a.get(i11);
                            i11++;
                            if (next.b(bundle2, str, Uri.decode(matcher3.group(i11)), (h) emptyMap.get(str))) {
                                break;
                            }
                        } else if (next.f2684e) {
                            Iterator<String> it2 = next.f2682b.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                l.b bVar = next.f2682b.get(next2);
                                String queryParameter = uri2.getQueryParameter(next2);
                                if (queryParameter != null) {
                                    matcher = Pattern.compile(bVar.f2690a).matcher(queryParameter);
                                    if (!matcher.matches()) {
                                        break;
                                    }
                                } else {
                                    matcher = matcher2;
                                }
                                int i12 = 0;
                                while (i12 < bVar.f2691b.size()) {
                                    String decode = matcher != null ? Uri.decode(matcher.group(i12 + 1)) : matcher2;
                                    String str2 = bVar.f2691b.get(i12);
                                    h hVar = (h) emptyMap.get(str2);
                                    if (decode != null) {
                                        uri = uri2;
                                        if (!decode.replaceAll("[{}]", BuildConfig.FLAVOR).equals(str2) && next.b(bundle2, str2, decode, hVar)) {
                                            bundle2 = null;
                                            break;
                                        }
                                    } else {
                                        uri = uri2;
                                    }
                                    i12++;
                                    uri2 = uri;
                                    matcher2 = null;
                                }
                            }
                        }
                    }
                    bundle = bundle2;
                }
                bundle2 = matcher2;
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str3 = (String) h0Var.f2146j;
            boolean z10 = str3 != null && str3.equals(next.f2685f);
            String str4 = (String) h0Var.f2147m;
            if (str4 != null) {
                i10 = (next.f2687h == null || !next.f2686g.matcher(str4).matches()) ? -1 : new l.a(next.f2687h).compareTo(new l.a(str4));
            } else {
                i10 = -1;
            }
            if (bundle != null || z10 || i10 > -1) {
                a aVar2 = new a(this, bundle, next.d, z10, i10);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
            matcher2 = null;
        }
        return aVar;
    }

    public void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, f1.a.f9359w);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        this.f2694j = resourceId;
        this.f2695m = null;
        this.f2695m = h(context, resourceId);
        this.n = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f2695m;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f2694j));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        if (this.n != null) {
            sb2.append(" label=");
            sb2.append(this.n);
        }
        return sb2.toString();
    }
}
