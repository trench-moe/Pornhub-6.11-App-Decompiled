package l8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public boolean f12666c;

    /* renamed from: e  reason: collision with root package name */
    public int f12667e;

    /* renamed from: a  reason: collision with root package name */
    public a f12664a = new a();

    /* renamed from: b  reason: collision with root package name */
    public a f12665b = new a();
    public long d = -9223372036854775807L;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f12668a;

        /* renamed from: b  reason: collision with root package name */
        public long f12669b;

        /* renamed from: c  reason: collision with root package name */
        public long f12670c;
        public long d;

        /* renamed from: e  reason: collision with root package name */
        public long f12671e;

        /* renamed from: f  reason: collision with root package name */
        public long f12672f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean[] f12673g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        public int f12674h;

        public boolean a() {
            return this.d > 15 && this.f12674h == 0;
        }

        public void b(long j10) {
            long j11 = this.d;
            if (j11 == 0) {
                this.f12668a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f12668a;
                this.f12669b = j12;
                this.f12672f = j12;
                this.f12671e = 1L;
            } else {
                long j13 = j10 - this.f12670c;
                int i10 = (int) (j11 % 15);
                if (Math.abs(j13 - this.f12669b) <= 1000000) {
                    this.f12671e++;
                    this.f12672f += j13;
                    boolean[] zArr = this.f12673g;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f12674h--;
                    }
                } else {
                    boolean[] zArr2 = this.f12673g;
                    if (!zArr2[i10]) {
                        zArr2[i10] = true;
                        this.f12674h++;
                    }
                }
            }
            this.d++;
            this.f12670c = j10;
        }

        public void c() {
            this.d = 0L;
            this.f12671e = 0L;
            this.f12672f = 0L;
            this.f12674h = 0;
            Arrays.fill(this.f12673g, false);
        }
    }

    public boolean a() {
        return this.f12664a.a();
    }
}
