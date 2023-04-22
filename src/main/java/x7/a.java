package x7;

import android.net.Uri;
import java.util.Arrays;
import k8.c0;
import l6.s;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f18048g = new a(null, new C0293a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h  reason: collision with root package name */
    public static final C0293a f18049h;

    /* renamed from: a  reason: collision with root package name */
    public final Object f18050a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18051b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18052c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18053e;

    /* renamed from: f  reason: collision with root package name */
    public final C0293a[] f18054f;

    /* renamed from: x7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0293a {

        /* renamed from: a  reason: collision with root package name */
        public final long f18055a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18056b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri[] f18057c;
        public final int[] d;

        /* renamed from: e  reason: collision with root package name */
        public final long[] f18058e;

        /* renamed from: f  reason: collision with root package name */
        public final long f18059f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f18060g;

        static {
            s sVar = s.f12317w;
        }

        public C0293a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            k8.a.c(iArr.length == uriArr.length);
            this.f18055a = j10;
            this.f18056b = i10;
            this.d = iArr;
            this.f18057c = uriArr;
            this.f18058e = jArr;
            this.f18059f = j11;
            this.f18060g = z10;
        }

        public int a(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.d;
                if (i11 >= iArr.length || this.f18060g || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean b() {
            int i10;
            if (this.f18056b == -1) {
                return true;
            }
            for (i10 = 0; i10 < this.f18056b; i10 = i10 + 1) {
                int[] iArr = this.d;
                i10 = (iArr[i10] == 0 || iArr[i10] == 1) ? 0 : i10 + 1;
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0293a.class == obj.getClass()) {
                C0293a c0293a = (C0293a) obj;
                return this.f18055a == c0293a.f18055a && this.f18056b == c0293a.f18056b && Arrays.equals(this.f18057c, c0293a.f18057c) && Arrays.equals(this.d, c0293a.d) && Arrays.equals(this.f18058e, c0293a.f18058e) && this.f18059f == c0293a.f18059f && this.f18060g == c0293a.f18060g;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f18055a;
            int hashCode = Arrays.hashCode(this.d);
            int hashCode2 = Arrays.hashCode(this.f18058e);
            long j11 = this.f18059f;
            return ((((hashCode2 + ((hashCode + (((((this.f18056b * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f18057c)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f18060g ? 1 : 0);
        }
    }

    static {
        C0293a c0293a = new C0293a(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = c0293a.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0293a.f18058e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f18049h = new C0293a(c0293a.f18055a, 0, copyOf, (Uri[]) Arrays.copyOf(c0293a.f18057c, 0), copyOf2, c0293a.f18059f, c0293a.f18060g);
    }

    public a(Object obj, C0293a[] c0293aArr, long j10, long j11, int i10) {
        this.f18050a = obj;
        this.f18052c = j10;
        this.d = j11;
        this.f18051b = c0293aArr.length + i10;
        this.f18054f = c0293aArr;
        this.f18053e = i10;
    }

    public C0293a a(int i10) {
        int i11 = this.f18053e;
        return i10 < i11 ? f18049h : this.f18054f[i10 - i11];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            return c0.a(this.f18050a, aVar.f18050a) && this.f18051b == aVar.f18051b && this.f18052c == aVar.f18052c && this.d == aVar.d && this.f18053e == aVar.f18053e && Arrays.equals(this.f18054f, aVar.f18054f);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f18051b * 31;
        Object obj = this.f18050a;
        return Arrays.hashCode(this.f18054f) + ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f18052c)) * 31) + ((int) this.d)) * 31) + this.f18053e) * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("AdPlaybackState(adsId=");
        m10.append(this.f18050a);
        m10.append(", adResumePositionUs=");
        m10.append(this.f18052c);
        m10.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f18054f.length; i10++) {
            m10.append("adGroup(timeUs=");
            m10.append(this.f18054f[i10].f18055a);
            m10.append(", ads=[");
            for (int i11 = 0; i11 < this.f18054f[i10].d.length; i11++) {
                m10.append("ad(state=");
                int i12 = this.f18054f[i10].d[i11];
                if (i12 == 0) {
                    m10.append('_');
                } else if (i12 == 1) {
                    m10.append('R');
                } else if (i12 == 2) {
                    m10.append('S');
                } else if (i12 == 3) {
                    m10.append('P');
                } else if (i12 != 4) {
                    m10.append('?');
                } else {
                    m10.append('!');
                }
                m10.append(", durationUs=");
                m10.append(this.f18054f[i10].f18058e[i11]);
                m10.append(')');
                if (i11 < this.f18054f[i10].d.length - 1) {
                    m10.append(", ");
                }
            }
            m10.append("])");
            if (i10 < this.f18054f.length - 1) {
                m10.append(", ");
            }
        }
        m10.append("])");
        return m10.toString();
    }
}
