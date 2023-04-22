package k5;

import android.graphics.Bitmap;
import android.os.Build;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class l implements j {
    public static final Bitmap.Config[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f11809e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f11810f;

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f11811g;

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f11812h;

    /* renamed from: a  reason: collision with root package name */
    public final c f11813a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final f<b, Bitmap> f11814b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f11815c = new HashMap();

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11816a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f11816a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11816a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11816a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11816a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f11817a;

        /* renamed from: b  reason: collision with root package name */
        public int f11818b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f11819c;

        public b(c cVar) {
            this.f11817a = cVar;
        }

        @Override // k5.k
        public void a() {
            this.f11817a.e(this);
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f11818b == bVar.f11818b && d6.l.b(this.f11819c, bVar.f11819c)) {
                    z10 = true;
                }
            }
            return z10;
        }

        public int hashCode() {
            int i10 = this.f11818b * 31;
            Bitmap.Config config = this.f11819c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return l.c(this.f11818b, this.f11819c);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends h2.k {
        @Override // h2.k
        public k c() {
            return new b(this);
        }

        public b v(int i10, Bitmap.Config config) {
            b bVar = (b) d();
            bVar.f11818b = i10;
            bVar.f11819c = config;
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        f11809e = configArr;
        f11810f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f11811g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f11812h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = (Integer) d10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d10.remove(num);
                return;
            } else {
                d10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r15 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r5.equals(r15) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap b(int r13, int r14, android.graphics.Bitmap.Config r15) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.l.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f11815c.get(config);
        if (navigableMap == null) {
            navigableMap = new TreeMap<>();
            this.f11815c.put(config, navigableMap);
        }
        return navigableMap;
    }

    public String e(Bitmap bitmap) {
        return c(d6.l.c(bitmap), bitmap.getConfig());
    }

    public void f(Bitmap bitmap) {
        b v2 = this.f11813a.v(d6.l.c(bitmap), bitmap.getConfig());
        this.f11814b.b(v2, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = (Integer) d10.get(Integer.valueOf(v2.f11818b));
        Integer valueOf = Integer.valueOf(v2.f11818b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("SizeConfigStrategy{groupedMap=");
        m10.append(this.f11814b);
        m10.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f11815c.entrySet()) {
            m10.append(entry.getKey());
            m10.append('[');
            m10.append(entry.getValue());
            m10.append("], ");
        }
        if (!this.f11815c.isEmpty()) {
            m10.replace(m10.length() - 2, m10.length(), BuildConfig.FLAVOR);
        }
        m10.append(")}");
        return m10.toString();
    }
}
