package w6;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d0 {
    public static final d0 D = new b().a();
    public final CharSequence A;
    public final CharSequence B;
    public final Bundle C;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f16512a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f16513b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f16514c;
    public final CharSequence d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f16515e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f16516f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f16517g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f16518h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f16519i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f16520j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f16521k;

    /* renamed from: l  reason: collision with root package name */
    public final Integer f16522l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f16523m;
    public final Integer n;

    /* renamed from: o  reason: collision with root package name */
    public final Boolean f16524o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f16525p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f16526q;

    /* renamed from: r  reason: collision with root package name */
    public final Integer f16527r;

    /* renamed from: s  reason: collision with root package name */
    public final Integer f16528s;

    /* renamed from: t  reason: collision with root package name */
    public final Integer f16529t;

    /* renamed from: u  reason: collision with root package name */
    public final Integer f16530u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f16531v;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f16532w;

    /* renamed from: x  reason: collision with root package name */
    public final CharSequence f16533x;
    public final Integer y;

    /* renamed from: z  reason: collision with root package name */
    public final Integer f16534z;

    /* loaded from: classes2.dex */
    public static final class b {
        public CharSequence A;
        public CharSequence B;
        public Bundle C;

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f16535a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f16536b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f16537c;
        public CharSequence d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f16538e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f16539f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f16540g;

        /* renamed from: h  reason: collision with root package name */
        public Uri f16541h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f16542i;

        /* renamed from: j  reason: collision with root package name */
        public Integer f16543j;

        /* renamed from: k  reason: collision with root package name */
        public Uri f16544k;

        /* renamed from: l  reason: collision with root package name */
        public Integer f16545l;

        /* renamed from: m  reason: collision with root package name */
        public Integer f16546m;
        public Integer n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f16547o;

        /* renamed from: p  reason: collision with root package name */
        public Integer f16548p;

        /* renamed from: q  reason: collision with root package name */
        public Integer f16549q;

        /* renamed from: r  reason: collision with root package name */
        public Integer f16550r;

        /* renamed from: s  reason: collision with root package name */
        public Integer f16551s;

        /* renamed from: t  reason: collision with root package name */
        public Integer f16552t;

        /* renamed from: u  reason: collision with root package name */
        public Integer f16553u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence f16554v;

        /* renamed from: w  reason: collision with root package name */
        public CharSequence f16555w;

        /* renamed from: x  reason: collision with root package name */
        public CharSequence f16556x;
        public Integer y;

        /* renamed from: z  reason: collision with root package name */
        public Integer f16557z;

        public b() {
        }

        public b(d0 d0Var, a aVar) {
            this.f16535a = d0Var.f16512a;
            this.f16536b = d0Var.f16513b;
            this.f16537c = d0Var.f16514c;
            this.d = d0Var.d;
            this.f16538e = d0Var.f16515e;
            this.f16539f = d0Var.f16516f;
            this.f16540g = d0Var.f16517g;
            this.f16541h = d0Var.f16518h;
            this.f16542i = d0Var.f16519i;
            this.f16543j = d0Var.f16520j;
            this.f16544k = d0Var.f16521k;
            this.f16545l = d0Var.f16522l;
            this.f16546m = d0Var.f16523m;
            this.n = d0Var.n;
            this.f16547o = d0Var.f16524o;
            this.f16548p = d0Var.f16525p;
            this.f16549q = d0Var.f16526q;
            this.f16550r = d0Var.f16527r;
            this.f16551s = d0Var.f16528s;
            this.f16552t = d0Var.f16529t;
            this.f16553u = d0Var.f16530u;
            this.f16554v = d0Var.f16531v;
            this.f16555w = d0Var.f16532w;
            this.f16556x = d0Var.f16533x;
            this.y = d0Var.y;
            this.f16557z = d0Var.f16534z;
            this.A = d0Var.A;
            this.B = d0Var.B;
            this.C = d0Var.C;
        }

        public d0 a() {
            return new d0(this, null);
        }

        public b b(byte[] bArr, int i10) {
            if (this.f16542i == null || k8.c0.a(Integer.valueOf(i10), 3) || !k8.c0.a(this.f16543j, 3)) {
                this.f16542i = (byte[]) bArr.clone();
                this.f16543j = Integer.valueOf(i10);
            }
            return this;
        }
    }

    public d0(b bVar, a aVar) {
        this.f16512a = bVar.f16535a;
        this.f16513b = bVar.f16536b;
        this.f16514c = bVar.f16537c;
        this.d = bVar.d;
        this.f16515e = bVar.f16538e;
        this.f16516f = bVar.f16539f;
        this.f16517g = bVar.f16540g;
        this.f16518h = bVar.f16541h;
        this.f16519i = bVar.f16542i;
        this.f16520j = bVar.f16543j;
        this.f16521k = bVar.f16544k;
        this.f16522l = bVar.f16545l;
        this.f16523m = bVar.f16546m;
        this.n = bVar.n;
        this.f16524o = bVar.f16547o;
        this.f16525p = bVar.f16548p;
        this.f16526q = bVar.f16549q;
        this.f16527r = bVar.f16550r;
        this.f16528s = bVar.f16551s;
        this.f16529t = bVar.f16552t;
        this.f16530u = bVar.f16553u;
        this.f16531v = bVar.f16554v;
        this.f16532w = bVar.f16555w;
        this.f16533x = bVar.f16556x;
        this.y = bVar.y;
        this.f16534z = bVar.f16557z;
        this.A = bVar.A;
        this.B = bVar.B;
        this.C = bVar.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            return k8.c0.a(this.f16512a, d0Var.f16512a) && k8.c0.a(this.f16513b, d0Var.f16513b) && k8.c0.a(this.f16514c, d0Var.f16514c) && k8.c0.a(this.d, d0Var.d) && k8.c0.a(this.f16515e, d0Var.f16515e) && k8.c0.a(this.f16516f, d0Var.f16516f) && k8.c0.a(this.f16517g, d0Var.f16517g) && k8.c0.a(this.f16518h, d0Var.f16518h) && k8.c0.a(null, null) && k8.c0.a(null, null) && Arrays.equals(this.f16519i, d0Var.f16519i) && k8.c0.a(this.f16520j, d0Var.f16520j) && k8.c0.a(this.f16521k, d0Var.f16521k) && k8.c0.a(this.f16522l, d0Var.f16522l) && k8.c0.a(this.f16523m, d0Var.f16523m) && k8.c0.a(this.n, d0Var.n) && k8.c0.a(this.f16524o, d0Var.f16524o) && k8.c0.a(this.f16525p, d0Var.f16525p) && k8.c0.a(this.f16526q, d0Var.f16526q) && k8.c0.a(this.f16527r, d0Var.f16527r) && k8.c0.a(this.f16528s, d0Var.f16528s) && k8.c0.a(this.f16529t, d0Var.f16529t) && k8.c0.a(this.f16530u, d0Var.f16530u) && k8.c0.a(this.f16531v, d0Var.f16531v) && k8.c0.a(this.f16532w, d0Var.f16532w) && k8.c0.a(this.f16533x, d0Var.f16533x) && k8.c0.a(this.y, d0Var.y) && k8.c0.a(this.f16534z, d0Var.f16534z) && k8.c0.a(this.A, d0Var.A) && k8.c0.a(this.B, d0Var.B);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16512a, this.f16513b, this.f16514c, this.d, this.f16515e, this.f16516f, this.f16517g, this.f16518h, null, null, Integer.valueOf(Arrays.hashCode(this.f16519i)), this.f16520j, this.f16521k, this.f16522l, this.f16523m, this.n, this.f16524o, this.f16525p, this.f16526q, this.f16527r, this.f16528s, this.f16529t, this.f16530u, this.f16531v, this.f16532w, this.f16533x, this.y, this.f16534z, this.A, this.B});
    }
}
