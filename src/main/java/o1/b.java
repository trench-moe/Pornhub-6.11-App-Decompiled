package o1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final c f13513f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f13514a;

    /* renamed from: b  reason: collision with root package name */
    public final List<o1.c> f13515b;

    /* renamed from: e  reason: collision with root package name */
    public final d f13517e;
    public final SparseBooleanArray d = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    public final Map<o1.c, d> f13516c = new p.a();

    /* loaded from: classes2.dex */
    public static class a implements c {
        @Override // o1.b.c
        public boolean a(int i10, float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return false;
            }
            if (fArr[2] <= 0.05f) {
                return false;
            }
            return !((fArr[0] > 10.0f ? 1 : (fArr[0] == 10.0f ? 0 : -1)) >= 0 && (fArr[0] > 37.0f ? 1 : (fArr[0] == 37.0f ? 0 : -1)) <= 0 && (fArr[1] > 0.82f ? 1 : (fArr[1] == 0.82f ? 0 : -1)) <= 0);
        }
    }

    /* renamed from: o1.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0232b {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f13518a;

        /* renamed from: b  reason: collision with root package name */
        public final List<o1.c> f13519b;

        /* renamed from: c  reason: collision with root package name */
        public int f13520c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f13521e;

        /* renamed from: f  reason: collision with root package name */
        public final List<c> f13522f;

        public C0232b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f13519b = arrayList;
            this.f13520c = 16;
            this.d = 12544;
            this.f13521e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f13522f = arrayList2;
            if (bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f13513f);
            this.f13518a = bitmap;
            arrayList.add(o1.c.d);
            arrayList.add(o1.c.f13531e);
            arrayList.add(o1.c.f13532f);
            arrayList.add(o1.c.f13533g);
            arrayList.add(o1.c.f13534h);
            arrayList.add(o1.c.f13535i);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public o1.b a() {
            /*
                Method dump skipped, instructions count: 461
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o1.b.C0232b.a():o1.b");
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(int i10, float[] fArr);
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f13523a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13524b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13525c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13526e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f13527f;

        /* renamed from: g  reason: collision with root package name */
        public int f13528g;

        /* renamed from: h  reason: collision with root package name */
        public int f13529h;

        /* renamed from: i  reason: collision with root package name */
        public float[] f13530i;

        public d(int i10, int i11) {
            this.f13523a = Color.red(i10);
            this.f13524b = Color.green(i10);
            this.f13525c = Color.blue(i10);
            this.d = i10;
            this.f13526e = i11;
        }

        public final void a() {
            if (!this.f13527f) {
                int e10 = e0.a.e(-1, this.d, 4.5f);
                int e11 = e0.a.e(-1, this.d, 3.0f);
                if (e10 != -1 && e11 != -1) {
                    this.f13529h = e0.a.j(-1, e10);
                    this.f13528g = e0.a.j(-1, e11);
                    this.f13527f = true;
                    return;
                }
                int e12 = e0.a.e(-16777216, this.d, 4.5f);
                int e13 = e0.a.e(-16777216, this.d, 3.0f);
                if (e12 != -1 && e13 != -1) {
                    this.f13529h = e0.a.j(-16777216, e12);
                    this.f13528g = e0.a.j(-16777216, e13);
                    this.f13527f = true;
                    return;
                }
                this.f13529h = e10 != -1 ? e0.a.j(-1, e10) : e0.a.j(-16777216, e12);
                this.f13528g = e11 != -1 ? e0.a.j(-1, e11) : e0.a.j(-16777216, e13);
                this.f13527f = true;
            }
        }

        public float[] b() {
            if (this.f13530i == null) {
                this.f13530i = new float[3];
            }
            e0.a.a(this.f13523a, this.f13524b, this.f13525c, this.f13530i);
            return this.f13530i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                return this.f13526e == dVar.f13526e && this.d == dVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (this.d * 31) + this.f13526e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
            sb2.append(" [RGB: #");
            sb2.append(Integer.toHexString(this.d));
            sb2.append(']');
            sb2.append(" [HSL: ");
            sb2.append(Arrays.toString(b()));
            sb2.append(']');
            sb2.append(" [Population: ");
            sb2.append(this.f13526e);
            sb2.append(']');
            sb2.append(" [Title Text: #");
            a();
            sb2.append(Integer.toHexString(this.f13528g));
            sb2.append(']');
            sb2.append(" [Body Text: #");
            a();
            sb2.append(Integer.toHexString(this.f13529h));
            sb2.append(']');
            return sb2.toString();
        }
    }

    public b(List<d> list, List<o1.c> list2) {
        this.f13514a = list;
        this.f13515b = list2;
        int size = list.size();
        int i10 = IntCompanionObject.MIN_VALUE;
        d dVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = this.f13514a.get(i11);
            int i12 = dVar2.f13526e;
            if (i12 > i10) {
                dVar = dVar2;
                i10 = i12;
            }
        }
        this.f13517e = dVar;
    }

    public List<d> a() {
        return Collections.unmodifiableList(this.f13514a);
    }
}
