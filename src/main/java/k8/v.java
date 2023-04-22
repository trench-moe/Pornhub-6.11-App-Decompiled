package k8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class v {

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator<b> f12015h = i8.d.f10593m;

    /* renamed from: i  reason: collision with root package name */
    public static final Comparator<b> f12016i = i8.c.f10588j;

    /* renamed from: a  reason: collision with root package name */
    public final int f12017a;

    /* renamed from: e  reason: collision with root package name */
    public int f12020e;

    /* renamed from: f  reason: collision with root package name */
    public int f12021f;

    /* renamed from: g  reason: collision with root package name */
    public int f12022g;

    /* renamed from: c  reason: collision with root package name */
    public final b[] f12019c = new b[5];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f12018b = new ArrayList<>();
    public int d = -1;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f12023a;

        /* renamed from: b  reason: collision with root package name */
        public int f12024b;

        /* renamed from: c  reason: collision with root package name */
        public float f12025c;

        public b() {
        }

        public b(a aVar) {
        }
    }

    public v(int i10) {
        this.f12017a = i10;
    }

    public void a(int i10, float f10) {
        b bVar;
        if (this.d != 1) {
            Collections.sort(this.f12018b, f12015h);
            this.d = 1;
        }
        int i11 = this.f12022g;
        if (i11 > 0) {
            b[] bVarArr = this.f12019c;
            int i12 = i11 - 1;
            this.f12022g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b(null);
        }
        int i13 = this.f12020e;
        this.f12020e = i13 + 1;
        bVar.f12023a = i13;
        bVar.f12024b = i10;
        bVar.f12025c = f10;
        this.f12018b.add(bVar);
        this.f12021f += i10;
        while (true) {
            while (true) {
                int i14 = this.f12021f;
                int i15 = this.f12017a;
                if (i14 <= i15) {
                    return;
                }
                int i16 = i14 - i15;
                b bVar2 = this.f12018b.get(0);
                int i17 = bVar2.f12024b;
                if (i17 <= i16) {
                    this.f12021f -= i17;
                    this.f12018b.remove(0);
                    int i18 = this.f12022g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f12019c;
                        this.f12022g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f12024b = i17 - i16;
                    this.f12021f -= i16;
                }
            }
        }
    }

    public float b(float f10) {
        ArrayList<b> arrayList;
        if (this.d != 0) {
            Collections.sort(this.f12018b, f12016i);
            this.d = 0;
        }
        float f11 = f10 * this.f12021f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12018b.size(); i11++) {
            b bVar = this.f12018b.get(i11);
            i10 += bVar.f12024b;
            if (i10 >= f11) {
                return bVar.f12025c;
            }
        }
        if (this.f12018b.isEmpty()) {
            return Float.NaN;
        }
        return this.f12018b.get(arrayList.size() - 1).f12025c;
    }
}
