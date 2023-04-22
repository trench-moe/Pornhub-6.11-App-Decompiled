package f8;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import y7.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f9501a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9502b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9503c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9504e;

    /* renamed from: f  reason: collision with root package name */
    public final f f9505f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f9506g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9507h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9508i;

    /* renamed from: j  reason: collision with root package name */
    public final d f9509j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<String, Integer> f9510k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap<String, Integer> f9511l;

    /* renamed from: m  reason: collision with root package name */
    public List<d> f9512m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        this.f9501a = str;
        this.f9502b = str2;
        this.f9508i = str4;
        this.f9505f = fVar;
        this.f9506g = strArr;
        this.f9503c = str2 != null;
        this.d = j10;
        this.f9504e = j11;
        Objects.requireNonNull(str3);
        this.f9507h = str3;
        this.f9509j = dVar;
        this.f9510k = new HashMap<>();
        this.f9511l = new HashMap<>();
    }

    public static d b(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, BuildConfig.FLAVOR, null, null);
    }

    public static SpannableStringBuilder f(String str, Map<String, a.b> map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.f18527a = new SpannableStringBuilder();
            map.put(str, bVar);
        }
        CharSequence charSequence = map.get(str).f18527a;
        Objects.requireNonNull(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    public void a(d dVar) {
        if (this.f9512m == null) {
            this.f9512m = new ArrayList();
        }
        this.f9512m.add(dVar);
    }

    public d c(int i10) {
        List<d> list = this.f9512m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int d() {
        List<d> list = this.f9512m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void e(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = DvdsConfig.DEFAULT_ORDER_PARAM.equals(this.f9501a);
        boolean equals2 = "div".equals(this.f9501a);
        if (z10 || equals || (equals2 && this.f9508i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f9504e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f9512m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f9512m.size(); i10++) {
            this.f9512m.get(i10).e(treeSet, z10 || equals);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r11.f9504e == (-9223372036854775807L)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(long r12) {
        /*
            r11 = this;
            long r0 = r11.d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            long r4 = r11.f9504e
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L39
            r9 = 2
        L12:
            r9 = 1
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 > 0) goto L1e
            long r4 = r11.f9504e
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r10 = 1
            if (r6 == 0) goto L39
        L1e:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2b
            r9 = 4
            long r2 = r11.f9504e
            r9 = 1
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 < 0) goto L39
            r10 = 5
        L2b:
            r8 = 1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r8 = 6
            if (r2 > 0) goto L3c
            long r0 = r11.f9504e
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r10 = 4
            if (r2 >= 0) goto L3c
            r9 = 2
        L39:
            r7 = 1
            r12 = r7
            goto L3f
        L3c:
            r9 = 2
            r7 = 0
            r12 = r7
        L3f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.d.g(long):boolean");
    }

    public final void h(long j10, String str, List<Pair<String, String>> list) {
        if (!BuildConfig.FLAVOR.equals(this.f9507h)) {
            str = this.f9507h;
        }
        if (g(j10) && "div".equals(this.f9501a) && this.f9508i != null) {
            list.add(new Pair<>(str, this.f9508i));
            return;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            c(i10).h(j10, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0270 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r18, java.util.Map<java.lang.String, f8.f> r20, java.util.Map<java.lang.String, f8.e> r21, java.lang.String r22, java.util.Map<java.lang.String, y7.a.b> r23) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.d.i(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    public final void j(long j10, boolean z10, String str, Map<String, a.b> map) {
        this.f9510k.clear();
        this.f9511l.clear();
        if ("metadata".equals(this.f9501a)) {
            return;
        }
        if (!BuildConfig.FLAVOR.equals(this.f9507h)) {
            str = this.f9507h;
        }
        if (this.f9503c && z10) {
            SpannableStringBuilder f10 = f(str, map);
            String str2 = this.f9502b;
            Objects.requireNonNull(str2);
            f10.append((CharSequence) str2);
        } else if ("br".equals(this.f9501a) && z10) {
            f(str, map).append('\n');
        } else if (g(j10)) {
            for (Map.Entry<String, a.b> entry : map.entrySet()) {
                CharSequence charSequence = entry.getValue().f18527a;
                Objects.requireNonNull(charSequence);
                this.f9510k.put(entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = DvdsConfig.DEFAULT_ORDER_PARAM.equals(this.f9501a);
            for (int i10 = 0; i10 < d(); i10++) {
                c(i10).j(j10, z10 || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder f11 = f(str, map);
                int length = f11.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (f11.charAt(length) == ' ');
                if (length >= 0 && f11.charAt(length) != '\n') {
                    f11.append('\n');
                }
            }
            for (Map.Entry<String, a.b> entry2 : map.entrySet()) {
                CharSequence charSequence2 = entry2.getValue().f18527a;
                Objects.requireNonNull(charSequence2);
                this.f9511l.put(entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
