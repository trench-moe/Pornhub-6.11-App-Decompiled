package j8;

import java.util.Arrays;
import k8.c0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11584a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11585b;

    /* renamed from: c  reason: collision with root package name */
    public final a[] f11586c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f11587e;

    /* renamed from: f  reason: collision with root package name */
    public int f11588f;

    /* renamed from: g  reason: collision with root package name */
    public a[] f11589g;

    public i(boolean z10, int i10) {
        k8.a.c(i10 > 0);
        this.f11584a = z10;
        this.f11585b = i10;
        this.f11588f = 0;
        this.f11589g = new a[100];
        this.f11586c = new a[1];
    }

    public synchronized void a(a[] aVarArr) {
        try {
            int i10 = this.f11588f;
            int length = aVarArr.length + i10;
            a[] aVarArr2 = this.f11589g;
            if (length >= aVarArr2.length) {
                this.f11589g = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                a[] aVarArr3 = this.f11589g;
                int i11 = this.f11588f;
                this.f11588f = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            this.f11587e -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(int i10) {
        boolean z10 = i10 < this.d;
        this.d = i10;
        if (z10) {
            c();
        }
    }

    public synchronized void c() {
        try {
            int max = Math.max(0, c0.f(this.d, this.f11585b) - this.f11587e);
            int i10 = this.f11588f;
            if (max >= i10) {
                return;
            }
            Arrays.fill(this.f11589g, max, i10, (Object) null);
            this.f11588f = max;
        } catch (Throwable th) {
            throw th;
        }
    }
}
