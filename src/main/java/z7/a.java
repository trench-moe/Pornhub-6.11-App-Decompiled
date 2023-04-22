package z7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k8.c0;
import k8.t;
import kotlin.jvm.internal.IntCompanionObject;
import y7.h;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: h  reason: collision with root package name */
    public final int f21842h;

    /* renamed from: i  reason: collision with root package name */
    public final int f21843i;

    /* renamed from: j  reason: collision with root package name */
    public final int f21844j;

    /* renamed from: k  reason: collision with root package name */
    public final long f21845k;
    public List<y7.a> n;

    /* renamed from: o  reason: collision with root package name */
    public List<y7.a> f21848o;

    /* renamed from: p  reason: collision with root package name */
    public int f21849p;

    /* renamed from: q  reason: collision with root package name */
    public int f21850q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f21851r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f21852s;

    /* renamed from: t  reason: collision with root package name */
    public byte f21853t;

    /* renamed from: u  reason: collision with root package name */
    public byte f21854u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f21856w;

    /* renamed from: x  reason: collision with root package name */
    public long f21857x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f21840z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    public final t f21841g = new t();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<C0317a> f21846l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public C0317a f21847m = new C0317a(0, 4);

    /* renamed from: v  reason: collision with root package name */
    public int f21855v = 0;

    /* renamed from: z7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0317a {

        /* renamed from: a  reason: collision with root package name */
        public final List<C0318a> f21858a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<SpannableString> f21859b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final StringBuilder f21860c = new StringBuilder();
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f21861e;

        /* renamed from: f  reason: collision with root package name */
        public int f21862f;

        /* renamed from: g  reason: collision with root package name */
        public int f21863g;

        /* renamed from: h  reason: collision with root package name */
        public int f21864h;

        /* renamed from: z7.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0318a {

            /* renamed from: a  reason: collision with root package name */
            public final int f21865a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f21866b;

            /* renamed from: c  reason: collision with root package name */
            public int f21867c;

            public C0318a(int i10, boolean z10, int i11) {
                this.f21865a = i10;
                this.f21866b = z10;
                this.f21867c = i11;
            }
        }

        public C0317a(int i10, int i11) {
            f(i10);
            this.f21864h = i11;
        }

        public void a(char c10) {
            if (this.f21860c.length() < 32) {
                this.f21860c.append(c10);
            }
        }

        public void b() {
            int length = this.f21860c.length();
            if (length > 0) {
                this.f21860c.delete(length - 1, length);
                for (int size = this.f21858a.size() - 1; size >= 0; size--) {
                    C0318a c0318a = this.f21858a.get(size);
                    int i10 = c0318a.f21867c;
                    if (i10 != length) {
                        break;
                    }
                    c0318a.f21867c = i10 - 1;
                }
            }
        }

        public y7.a c(int i10) {
            float f10;
            int i11 = this.f21861e + this.f21862f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f21859b.size(); i13++) {
                SpannableString spannableString = this.f21859b.get(i13);
                int i14 = c0.f11939a;
                if (spannableString.length() > i12) {
                    spannableString = spannableString.subSequence(0, i12);
                }
                spannableStringBuilder.append(spannableString);
                spannableStringBuilder.append('\n');
            }
            SpannableString d = d();
            int i15 = c0.f11939a;
            int length = d.length();
            CharSequence charSequence = d;
            if (length > i12) {
                charSequence = d.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequence);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i12 - spannableStringBuilder.length();
            int i16 = i11 - length2;
            int i17 = i10 != Integer.MIN_VALUE ? i10 : (this.f21863g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) ? (this.f21863g != 2 || i16 <= 0) ? 0 : 2 : 1;
            if (i17 != 1) {
                if (i17 == 2) {
                    i11 = 32 - length2;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i18 = this.d;
            if (i18 > 7) {
                i18 = (i18 - 15) - 2;
            } else if (this.f21863g == 1) {
                i18 -= this.f21864h - 1;
            }
            return new y7.a(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, IntCompanionObject.MIN_VALUE, f10, i17, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null);
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21860c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            boolean z10 = false;
            int i15 = -1;
            while (i10 < this.f21858a.size()) {
                C0318a c0318a = this.f21858a.get(i10);
                boolean z11 = c0318a.f21866b;
                int i16 = c0318a.f21865a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0318a.f21867c;
                i10++;
                if (i17 != (i10 < this.f21858a.size() ? this.f21858a.get(i10).f21867c : length)) {
                    if (i11 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        if (i14 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, i17, 33);
                        }
                        i13 = i17;
                        i14 = i15;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (i12 != -1 && i12 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
            }
            if (i13 != length && i14 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean e() {
            return this.f21858a.isEmpty() && this.f21859b.isEmpty() && this.f21860c.length() == 0;
        }

        public void f(int i10) {
            this.f21863g = i10;
            this.f21858a.clear();
            this.f21859b.clear();
            this.f21860c.setLength(0);
            this.d = 15;
            this.f21861e = 0;
            this.f21862f = 0;
        }
    }

    public a(String str, int i10, long j10) {
        this.f21845k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f21842h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f21844j = 0;
            this.f21843i = 0;
        } else if (i10 == 2) {
            this.f21844j = 1;
            this.f21843i = 0;
        } else if (i10 == 3) {
            this.f21844j = 0;
            this.f21843i = 1;
        } else if (i10 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f21844j = 0;
            this.f21843i = 0;
        } else {
            this.f21844j = 1;
            this.f21843i = 1;
        }
        m(0);
        l();
        this.f21856w = true;
        this.f21857x = -9223372036854775807L;
    }

    @Override // z7.d, z6.c
    public void a() {
    }

    @Override // z7.d
    public y7.d f() {
        List<y7.a> list = this.n;
        this.f21848o = list;
        Objects.requireNonNull(list);
        return new e(list);
    }

    @Override // z7.d, z6.c
    public void flush() {
        super.flush();
        this.n = null;
        this.f21848o = null;
        m(0);
        n(4);
        l();
        this.f21851r = false;
        this.f21852s = false;
        this.f21853t = (byte) 0;
        this.f21854u = (byte) 0;
        this.f21855v = 0;
        this.f21856w = true;
        this.f21857x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(y7.g r15) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.a.g(y7.g):void");
    }

    @Override // z7.d, z6.c
    /* renamed from: h */
    public h c() {
        h pollFirst;
        h c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j10 = this.f21845k;
        boolean z10 = false;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f21857x;
            if (j11 != -9223372036854775807L && this.f21911e - j11 >= j10) {
                z10 = true;
            }
        }
        if (!z10 || (pollFirst = this.f21909b.pollFirst()) == null) {
            return null;
        }
        List<y7.a> emptyList = Collections.emptyList();
        this.n = emptyList;
        this.f21857x = -9223372036854775807L;
        this.f21848o = emptyList;
        Objects.requireNonNull(emptyList);
        pollFirst.n(this.f21911e, new e(emptyList), Long.MAX_VALUE);
        return pollFirst;
    }

    @Override // z7.d
    public boolean i() {
        return this.n != this.f21848o;
    }

    public final List<y7.a> k() {
        int size = this.f21846l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            y7.a c10 = this.f21846l.get(i11).c(IntCompanionObject.MIN_VALUE);
            arrayList.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f18519i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            y7.a aVar = (y7.a) arrayList.get(i12);
            if (aVar != null) {
                if (aVar.f18519i != i10) {
                    aVar = this.f21846l.get(i12).c(i10);
                    Objects.requireNonNull(aVar);
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    public final void l() {
        this.f21847m.f(this.f21849p);
        this.f21846l.clear();
        this.f21846l.add(this.f21847m);
    }

    public final void m(int i10) {
        int i11 = this.f21849p;
        if (i11 == i10) {
            return;
        }
        this.f21849p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f21846l.size(); i12++) {
                this.f21846l.get(i12).f21863g = i10;
            }
            return;
        }
        l();
        if (i11 != 3 && i10 != 1 && i10 != 0) {
            return;
        }
        this.n = Collections.emptyList();
    }

    public final void n(int i10) {
        this.f21850q = i10;
        this.f21847m.f21864h = i10;
    }
}
