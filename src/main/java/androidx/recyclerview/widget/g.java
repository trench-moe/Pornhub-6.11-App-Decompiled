package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final b f2982a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2983b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f2984c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2985a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2986b;

        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f2986b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                }
            } else {
                this.f2985a &= ~(1 << i10);
            }
        }

        public int b(int i10) {
            a aVar = this.f2986b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f2985a) : Long.bitCount(this.f2985a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f2985a & ((1 << i10) - 1));
            } else {
                return Long.bitCount(this.f2985a) + aVar.b(i10 - 64);
            }
        }

        public final void c() {
            if (this.f2986b == null) {
                this.f2986b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f2985a & (1 << i10)) != 0;
            }
            c();
            return this.f2986b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f2986b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f2985a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f2985a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f2986b != null) {
                c();
                this.f2986b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f2986b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f2985a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2985a = j12;
            long j13 = j10 - 1;
            this.f2985a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2986b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2986b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f2985a = 0L;
            a aVar = this.f2986b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f2985a |= 1 << i10;
                return;
            }
            c();
            this.f2986b.h(i10 - 64);
        }

        public String toString() {
            if (this.f2986b == null) {
                return Long.toBinaryString(this.f2985a);
            }
            return this.f2986b.toString() + "xx" + Long.toBinaryString(this.f2985a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public g(b bVar) {
        this.f2982a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int b10 = i10 < 0 ? ((a0) this.f2982a).b() : f(i10);
        this.f2983b.e(b10, z10);
        if (z10) {
            i(view);
        }
        a0 a0Var = (a0) this.f2982a;
        a0Var.f2947a.addView(view, b10);
        RecyclerView recyclerView = a0Var.f2947a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.K(view);
        List<RecyclerView.m> list = recyclerView.S;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            recyclerView.S.get(size).b(view);
        }
    }

    public void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int b10 = i10 < 0 ? ((a0) this.f2982a).b() : f(i10);
        this.f2983b.e(b10, z10);
        if (z10) {
            i(view);
        }
        a0 a0Var = (a0) this.f2982a;
        Objects.requireNonNull(a0Var);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            if (!K.p() && !K.v()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called attach on a child which is not detached: ");
                sb2.append(K);
                throw new IllegalArgumentException(android.support.v4.media.b.g(a0Var.f2947a, sb2));
            }
            K.f2893j &= -257;
        }
        a0Var.f2947a.attachViewToParent(view, b10, layoutParams);
    }

    public void c(int i10) {
        RecyclerView.z K;
        int f10 = f(i10);
        this.f2983b.f(f10);
        a0 a0Var = (a0) this.f2982a;
        View childAt = a0Var.f2947a.getChildAt(f10);
        if (childAt != null && (K = RecyclerView.K(childAt)) != null) {
            if (K.p() && !K.v()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("called detach on an already detached child ");
                sb2.append(K);
                throw new IllegalArgumentException(android.support.v4.media.b.g(a0Var.f2947a, sb2));
            }
            K.b(256);
        }
        a0Var.f2947a.detachViewFromParent(f10);
    }

    public View d(int i10) {
        return ((a0) this.f2982a).a(f(i10));
    }

    public int e() {
        return ((a0) this.f2982a).b() - this.f2984c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int b10 = ((a0) this.f2982a).b();
        int i11 = i10;
        while (i11 < b10) {
            int b11 = i10 - (i11 - this.f2983b.b(i11));
            if (b11 == 0) {
                while (this.f2983b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b11;
        }
        return -1;
    }

    public View g(int i10) {
        return ((a0) this.f2982a).f2947a.getChildAt(i10);
    }

    public int h() {
        return ((a0) this.f2982a).b();
    }

    public final void i(View view) {
        this.f2984c.add(view);
        a0 a0Var = (a0) this.f2982a;
        Objects.requireNonNull(a0Var);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            RecyclerView recyclerView = a0Var.f2947a;
            int i10 = K.f2899q;
            if (i10 != -1) {
                K.f2898p = i10;
            } else {
                View view2 = K.f2885a;
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                K.f2898p = x.d.c(view2);
            }
            recyclerView.i0(K, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((a0) this.f2982a).f2947a.indexOfChild(view);
        if (indexOfChild == -1 || this.f2983b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.f2983b.b(indexOfChild);
    }

    public boolean k(View view) {
        return this.f2984c.contains(view);
    }

    public final boolean l(View view) {
        if (this.f2984c.remove(view)) {
            a0 a0Var = (a0) this.f2982a;
            Objects.requireNonNull(a0Var);
            RecyclerView.z K = RecyclerView.K(view);
            if (K != null) {
                a0Var.f2947a.i0(K, K.f2898p);
                K.f2898p = 0;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f2983b.toString() + ", hidden list:" + this.f2984c.size();
    }
}
