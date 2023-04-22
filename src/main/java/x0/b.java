package x0;

import android.view.View;
import java.util.ArrayList;
import x0.a;
import x0.b;

/* loaded from: classes2.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: l  reason: collision with root package name */
    public static final k f17639l = new c("scaleX");

    /* renamed from: m  reason: collision with root package name */
    public static final k f17640m = new d("scaleY");
    public static final k n = new e("rotation");

    /* renamed from: o  reason: collision with root package name */
    public static final k f17641o = new f("rotationX");

    /* renamed from: p  reason: collision with root package name */
    public static final k f17642p = new g("rotationY");

    /* renamed from: q  reason: collision with root package name */
    public static final k f17643q = new a("alpha");
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final x0.c f17647e;

    /* renamed from: i  reason: collision with root package name */
    public float f17651i;

    /* renamed from: a  reason: collision with root package name */
    public float f17644a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f17645b = Float.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17646c = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17648f = false;

    /* renamed from: g  reason: collision with root package name */
    public float f17649g = -3.4028235E38f;

    /* renamed from: h  reason: collision with root package name */
    public long f17650h = 0;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<i> f17652j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<j> f17653k = new ArrayList<>();

    /* loaded from: classes2.dex */
    public static class a extends k {
        public a(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float a(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // x0.c
        public void b(Object obj, float f10) {
            ((View) obj).setAlpha(f10);
        }
    }

    /* renamed from: x0.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0292b extends k {
    }

    /* loaded from: classes2.dex */
    public static class c extends k {
        public c(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float a(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // x0.c
        public void b(Object obj, float f10) {
            ((View) obj).setScaleX(f10);
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends k {
        public d(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float a(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // x0.c
        public void b(Object obj, float f10) {
            ((View) obj).setScaleY(f10);
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends k {
        public e(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float a(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // x0.c
        public void b(Object obj, float f10) {
            ((View) obj).setRotation(f10);
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends k {
        public f(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float a(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // x0.c
        public void b(Object obj, float f10) {
            ((View) obj).setRotationX(f10);
        }
    }

    /* loaded from: classes2.dex */
    public static class g extends k {
        public g(String str) {
            super(str, null);
        }

        @Override // x0.c
        public float a(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // x0.c
        public void b(Object obj, float f10) {
            ((View) obj).setRotationY(f10);
        }
    }

    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public float f17654a;

        /* renamed from: b  reason: collision with root package name */
        public float f17655b;
    }

    /* loaded from: classes2.dex */
    public interface i {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    /* loaded from: classes2.dex */
    public interface j {
        void a(b bVar, float f10, float f11);
    }

    /* loaded from: classes2.dex */
    public static abstract class k extends x0.c {
        public k(String str, C0292b c0292b) {
            super(str);
        }
    }

    public <K> b(K k10, x0.c cVar) {
        this.d = k10;
        this.f17647e = cVar;
        if (cVar == n || cVar == f17641o || cVar == f17642p) {
            this.f17651i = 0.1f;
        } else if (cVar == f17643q) {
            this.f17651i = 0.00390625f;
        } else if (cVar == f17639l || cVar == f17640m) {
            this.f17651i = 0.00390625f;
        } else {
            this.f17651i = 1.0f;
        }
    }

    public static <T> void b(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    @Override // x0.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(long r26) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b.a(long):boolean");
    }

    public void c(float f10) {
        this.f17647e.b(this.d, f10);
        for (int i10 = 0; i10 < this.f17653k.size(); i10++) {
            if (this.f17653k.get(i10) != null) {
                this.f17653k.get(i10).a(this, this.f17645b, this.f17644a);
            }
        }
        b(this.f17653k);
    }
}
