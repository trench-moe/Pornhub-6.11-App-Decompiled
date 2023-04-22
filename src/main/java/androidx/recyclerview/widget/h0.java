package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f3014a;

    /* renamed from: b  reason: collision with root package name */
    public a f3015b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3016a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f3017b;

        /* renamed from: c  reason: collision with root package name */
        public int f3018c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f3019e;

        public boolean a() {
            int i10 = this.f3016a;
            if ((i10 & 7) == 0 || (i10 & (b(this.d, this.f3017b) << 0)) != 0) {
                int i11 = this.f3016a;
                if ((i11 & 112) == 0 || (i11 & (b(this.d, this.f3018c) << 4)) != 0) {
                    int i12 = this.f3016a;
                    if ((i12 & 1792) == 0 || (i12 & (b(this.f3019e, this.f3017b) << 8)) != 0) {
                        int i13 = this.f3016a;
                        return (i13 & 28672) == 0 || (i13 & (b(this.f3019e, this.f3018c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int b(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public h0(b bVar) {
        this.f3014a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int b10 = this.f3014a.b();
        int c10 = this.f3014a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View d = this.f3014a.d(i10);
            int a10 = this.f3014a.a(d);
            int e10 = this.f3014a.e(d);
            a aVar = this.f3015b;
            aVar.f3017b = b10;
            aVar.f3018c = c10;
            aVar.d = a10;
            aVar.f3019e = e10;
            if (i12 != 0) {
                aVar.f3016a = 0;
                aVar.f3016a = i12 | 0;
                if (aVar.a()) {
                    return d;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f3015b;
                aVar2.f3016a = 0;
                aVar2.f3016a = i13 | 0;
                if (aVar2.a()) {
                    view = d;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        a aVar = this.f3015b;
        int b10 = this.f3014a.b();
        int c10 = this.f3014a.c();
        int a10 = this.f3014a.a(view);
        int e10 = this.f3014a.e(view);
        aVar.f3017b = b10;
        aVar.f3018c = c10;
        aVar.d = a10;
        aVar.f3019e = e10;
        if (i10 != 0) {
            a aVar2 = this.f3015b;
            aVar2.f3016a = 0;
            aVar2.f3016a = 0 | i10;
            return aVar2.a();
        }
        return false;
    }
}
