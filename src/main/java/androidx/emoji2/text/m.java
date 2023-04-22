package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final y0.b f1992a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1993b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1994c = new a(1024);
    public final Typeface d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1995a;

        /* renamed from: b  reason: collision with root package name */
        public g f1996b;

        public a() {
            this.f1995a = new SparseArray<>(1);
        }

        public a(int i10) {
            this.f1995a = new SparseArray<>(i10);
        }

        public void a(g gVar, int i10, int i11) {
            int a10 = gVar.a(i10);
            SparseArray<a> sparseArray = this.f1995a;
            a aVar = sparseArray == null ? null : sparseArray.get(a10);
            if (aVar == null) {
                aVar = new a();
                this.f1995a.put(gVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(gVar, i10 + 1, i11);
            } else {
                aVar.f1996b = gVar;
            }
        }
    }

    public m(Typeface typeface, y0.b bVar) {
        this.d = typeface;
        this.f1992a = bVar;
        this.f1993b = new char[bVar.c() * 2];
        int c10 = bVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            g gVar = new g(this, i10);
            Character.toChars(gVar.d(), this.f1993b, i10 * 2);
            cb.e.r(gVar.b() > 0, "invalid metadata codepoint length");
            this.f1994c.a(gVar, 0, gVar.b() - 1);
        }
    }
}
