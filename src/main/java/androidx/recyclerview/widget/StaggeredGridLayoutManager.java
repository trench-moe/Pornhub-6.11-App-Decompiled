package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public boolean D;
    public boolean E;
    public d F;
    public int[] J;

    /* renamed from: p  reason: collision with root package name */
    public int f2902p;

    /* renamed from: q  reason: collision with root package name */
    public e[] f2903q;

    /* renamed from: r  reason: collision with root package name */
    public y f2904r;

    /* renamed from: s  reason: collision with root package name */
    public y f2905s;

    /* renamed from: t  reason: collision with root package name */
    public int f2906t;

    /* renamed from: u  reason: collision with root package name */
    public int f2907u;

    /* renamed from: v  reason: collision with root package name */
    public final q f2908v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2909w;
    public BitSet y;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2910x = false;

    /* renamed from: z  reason: collision with root package name */
    public int f2911z = -1;
    public int A = IntCompanionObject.MIN_VALUE;
    public c B = new c();
    public int C = 2;
    public final Rect G = new Rect();
    public final b H = new b();
    public boolean I = true;
    public final Runnable K = new a();

    /* loaded from: classes.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public e f2912e;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.N0();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2914a;

        /* renamed from: b  reason: collision with root package name */
        public int f2915b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2916c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2917e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f2918f;

        public b() {
            b();
        }

        public void a() {
            this.f2915b = this.f2916c ? StaggeredGridLayoutManager.this.f2904r.g() : StaggeredGridLayoutManager.this.f2904r.k();
        }

        public void b() {
            this.f2914a = -1;
            this.f2915b = IntCompanionObject.MIN_VALUE;
            this.f2916c = false;
            this.d = false;
            this.f2917e = false;
            int[] iArr = this.f2918f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2920a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f2921b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0037a();

            /* renamed from: c  reason: collision with root package name */
            public int f2922c;

            /* renamed from: f  reason: collision with root package name */
            public int f2923f;

            /* renamed from: j  reason: collision with root package name */
            public int[] f2924j;

            /* renamed from: m  reason: collision with root package name */
            public boolean f2925m;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0037a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f2922c = parcel.readInt();
                this.f2923f = parcel.readInt();
                this.f2925m = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2924j = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("FullSpanItem{mPosition=");
                m10.append(this.f2922c);
                m10.append(", mGapDir=");
                m10.append(this.f2923f);
                m10.append(", mHasUnwantedGapAfter=");
                m10.append(this.f2925m);
                m10.append(", mGapPerSpan=");
                m10.append(Arrays.toString(this.f2924j));
                m10.append('}');
                return m10.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2922c);
                parcel.writeInt(this.f2923f);
                parcel.writeInt(this.f2925m ? 1 : 0);
                int[] iArr = this.f2924j;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2924j);
            }
        }

        public void a() {
            int[] iArr = this.f2920a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2921b = null;
        }

        public void b(int i10) {
            int[] iArr = this.f2920a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f2920a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2920a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2920a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i10) {
            List<a> list = this.f2921b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2921b.get(size);
                if (aVar.f2922c == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r9) {
            /*
                r8 = this;
                r4 = r8
                int[] r0 = r4.f2920a
                r7 = 6
                r7 = -1
                r1 = r7
                if (r0 != 0) goto L9
                return r1
            L9:
                int r0 = r0.length
                r7 = 7
                if (r9 < r0) goto Lf
                r7 = 6
                return r1
            Lf:
                r6 = 3
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r0 = r4.f2921b
                r6 = 6
                if (r0 != 0) goto L1a
                r7 = 4
            L16:
                r6 = 5
                r7 = -1
                r0 = r7
                goto L5c
            L1a:
                r7 = 1
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a r7 = r4.c(r9)
                r0 = r7
                if (r0 == 0) goto L28
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r2 = r4.f2921b
                r7 = 2
                r2.remove(r0)
            L28:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r0 = r4.f2921b
                r6 = 5
                int r0 = r0.size()
                r2 = 0
                r7 = 2
            L31:
                if (r2 >= r0) goto L47
                r7 = 4
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r3 = r4.f2921b
                r7 = 4
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c.a) r3
                int r3 = r3.f2922c
                if (r3 < r9) goto L43
                r6 = 7
                goto L49
            L43:
                int r2 = r2 + 1
                r7 = 5
                goto L31
            L47:
                r6 = -1
                r2 = r6
            L49:
                if (r2 == r1) goto L16
                r6 = 7
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r0 = r4.f2921b
                r7 = 5
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r3 = r4.f2921b
                r3.remove(r2)
                int r0 = r0.f2922c
            L5c:
                if (r0 != r1) goto L6c
                int[] r0 = r4.f2920a
                r6 = 6
                int r2 = r0.length
                r7 = 2
                java.util.Arrays.fill(r0, r9, r2, r1)
                r7 = 2
                int[] r9 = r4.f2920a
                r6 = 7
                int r9 = r9.length
                return r9
            L6c:
                r7 = 3
                int r0 = r0 + 1
                r6 = 3
                int[] r2 = r4.f2920a
                r6 = 4
                int r2 = r2.length
                int r6 = java.lang.Math.min(r0, r2)
                r0 = r6
                int[] r2 = r4.f2920a
                java.util.Arrays.fill(r2, r9, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c.d(int):int");
        }

        public void e(int i10, int i11) {
            int[] iArr = this.f2920a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f2920a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f2920a, i10, i12, -1);
            List<a> list = this.f2921b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2921b.get(size);
                int i13 = aVar.f2922c;
                if (i13 >= i10) {
                    aVar.f2922c = i13 + i11;
                }
            }
        }

        public void f(int i10, int i11) {
            int[] iArr = this.f2920a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f2920a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f2920a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<a> list = this.f2921b;
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f2921b.get(size);
                    int i13 = aVar.f2922c;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f2921b.remove(size);
                        } else {
                            aVar.f2922c = i13 - i11;
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2926c;

        /* renamed from: f  reason: collision with root package name */
        public int f2927f;

        /* renamed from: j  reason: collision with root package name */
        public int f2928j;

        /* renamed from: m  reason: collision with root package name */
        public int[] f2929m;
        public int n;

        /* renamed from: t  reason: collision with root package name */
        public int[] f2930t;

        /* renamed from: u  reason: collision with root package name */
        public List<c.a> f2931u;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2932w;
        public boolean y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f2933z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f2926c = parcel.readInt();
            this.f2927f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2928j = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2929m = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.n = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2930t = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2932w = parcel.readInt() == 1;
            this.y = parcel.readInt() == 1;
            this.f2933z = parcel.readInt() == 1;
            this.f2931u = parcel.readArrayList(c.a.class.getClassLoader());
        }

        public d(d dVar) {
            this.f2928j = dVar.f2928j;
            this.f2926c = dVar.f2926c;
            this.f2927f = dVar.f2927f;
            this.f2929m = dVar.f2929m;
            this.n = dVar.n;
            this.f2930t = dVar.f2930t;
            this.f2932w = dVar.f2932w;
            this.y = dVar.y;
            this.f2933z = dVar.f2933z;
            this.f2931u = dVar.f2931u;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2926c);
            parcel.writeInt(this.f2927f);
            parcel.writeInt(this.f2928j);
            if (this.f2928j > 0) {
                parcel.writeIntArray(this.f2929m);
            }
            parcel.writeInt(this.n);
            if (this.n > 0) {
                parcel.writeIntArray(this.f2930t);
            }
            parcel.writeInt(this.f2932w ? 1 : 0);
            parcel.writeInt(this.y ? 1 : 0);
            parcel.writeInt(this.f2933z ? 1 : 0);
            parcel.writeList(this.f2931u);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f2934a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2935b = IntCompanionObject.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f2936c = IntCompanionObject.MIN_VALUE;
        public int d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f2937e;

        public e(int i10) {
            this.f2937e = i10;
        }

        public void a(View view) {
            LayoutParams j10 = j(view);
            j10.f2912e = this;
            this.f2934a.add(view);
            this.f2936c = IntCompanionObject.MIN_VALUE;
            if (this.f2934a.size() == 1) {
                this.f2935b = IntCompanionObject.MIN_VALUE;
            }
            if (j10.c() || j10.b()) {
                this.d = StaggeredGridLayoutManager.this.f2904r.c(view) + this.d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.f2934a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams j10 = j(view);
            this.f2936c = StaggeredGridLayoutManager.this.f2904r.b(view);
            Objects.requireNonNull(j10);
        }

        public void c() {
            View view = this.f2934a.get(0);
            LayoutParams j10 = j(view);
            this.f2935b = StaggeredGridLayoutManager.this.f2904r.e(view);
            Objects.requireNonNull(j10);
        }

        public void d() {
            this.f2934a.clear();
            this.f2935b = IntCompanionObject.MIN_VALUE;
            this.f2936c = IntCompanionObject.MIN_VALUE;
            this.d = 0;
        }

        public int e() {
            return StaggeredGridLayoutManager.this.f2909w ? g(this.f2934a.size() - 1, -1, true) : g(0, this.f2934a.size(), true);
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f2909w ? g(0, this.f2934a.size(), true) : g(this.f2934a.size() - 1, -1, true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
            if (r6 < r1) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int g(int r13, int r14, boolean r15) {
            /*
                r12 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                androidx.recyclerview.widget.y r0 = r0.f2904r
                int r10 = r0.k()
                r0 = r10
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                androidx.recyclerview.widget.y r1 = r1.f2904r
                r11 = 1
                int r1 = r1.g()
                r2 = -1
                r11 = 7
                r10 = 1
                r3 = r10
                if (r14 <= r13) goto L1b
                r11 = 7
                r4 = 1
                goto L1e
            L1b:
                r11 = 7
                r10 = -1
                r4 = r10
            L1e:
                if (r13 == r14) goto L6f
                r11 = 4
                java.util.ArrayList<android.view.View> r5 = r12.f2934a
                r11 = 3
                java.lang.Object r10 = r5.get(r13)
                r5 = r10
                android.view.View r5 = (android.view.View) r5
                r11 = 3
                androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                androidx.recyclerview.widget.y r6 = r6.f2904r
                int r6 = r6.e(r5)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                r11 = 3
                androidx.recyclerview.widget.y r7 = r7.f2904r
                r11 = 4
                int r7 = r7.b(r5)
                r8 = 0
                r11 = 6
                if (r15 == 0) goto L47
                r11 = 7
                if (r6 > r1) goto L4d
                r11 = 4
                goto L4a
            L47:
                r11 = 3
                if (r6 >= r1) goto L4d
            L4a:
                r10 = 1
                r9 = r10
                goto L50
            L4d:
                r11 = 3
                r10 = 0
                r9 = r10
            L50:
                if (r15 == 0) goto L56
                if (r7 < r0) goto L5c
                r11 = 1
                goto L5a
            L56:
                r11 = 1
                if (r7 <= r0) goto L5c
                r11 = 6
            L5a:
                r10 = 1
                r8 = r10
            L5c:
                if (r9 == 0) goto L6c
                if (r8 == 0) goto L6c
                if (r6 < r0) goto L64
                if (r7 <= r1) goto L6c
            L64:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                r11 = 5
                int r2 = r13.P(r5)
                goto L6f
            L6c:
                int r13 = r13 + r4
                r11 = 2
                goto L1e
            L6f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e.g(int, int, boolean):int");
        }

        public int h(int i10) {
            int i11 = this.f2936c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2934a.size() == 0) {
                return i10;
            }
            b();
            return this.f2936c;
        }

        public View i(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f2934a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2934a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2909w && staggeredGridLayoutManager.P(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2909w && staggeredGridLayoutManager2.P(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2934a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f2934a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2909w && staggeredGridLayoutManager3.P(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2909w && staggeredGridLayoutManager4.P(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public LayoutParams j(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public int k(int i10) {
            int i11 = this.f2935b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2934a.size() == 0) {
                return i10;
            }
            c();
            return this.f2935b;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l() {
            /*
                r7 = this;
                r4 = r7
                java.util.ArrayList<android.view.View> r0 = r4.f2934a
                int r0 = r0.size()
                java.util.ArrayList<android.view.View> r1 = r4.f2934a
                int r2 = r0 + (-1)
                java.lang.Object r1 = r1.remove(r2)
                android.view.View r1 = (android.view.View) r1
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = r4.j(r1)
                r3 = 0
                r6 = 4
                r2.f2912e = r3
                r6 = 5
                boolean r3 = r2.c()
                if (r3 != 0) goto L28
                boolean r6 = r2.b()
                r2 = r6
                if (r2 == 0) goto L38
                r6 = 7
            L28:
                int r2 = r4.d
                r6 = 4
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                androidx.recyclerview.widget.y r3 = r3.f2904r
                int r6 = r3.c(r1)
                r1 = r6
                int r2 = r2 - r1
                r4.d = r2
                r6 = 3
            L38:
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r6
                r6 = 1
                r2 = r6
                if (r0 != r2) goto L42
                r6 = 7
                r4.f2935b = r1
            L42:
                r6 = 5
                r4.f2936c = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e.l():void");
        }

        public void m() {
            View remove = this.f2934a.remove(0);
            LayoutParams j10 = j(remove);
            j10.f2912e = null;
            if (this.f2934a.size() == 0) {
                this.f2936c = IntCompanionObject.MIN_VALUE;
            }
            if (j10.c() || j10.b()) {
                this.d -= StaggeredGridLayoutManager.this.f2904r.c(remove);
            }
            this.f2935b = IntCompanionObject.MIN_VALUE;
        }

        public void n(View view) {
            LayoutParams j10 = j(view);
            j10.f2912e = this;
            this.f2934a.add(0, view);
            this.f2935b = IntCompanionObject.MIN_VALUE;
            if (this.f2934a.size() == 1) {
                this.f2936c = IntCompanionObject.MIN_VALUE;
            }
            if (!j10.c()) {
                if (j10.b()) {
                }
            }
            this.d = StaggeredGridLayoutManager.this.f2904r.c(view) + this.d;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2902p = -1;
        this.f2909w = false;
        RecyclerView.l.d Q = RecyclerView.l.Q(context, attributeSet, i10, i11);
        int i12 = Q.f2836a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i12 != this.f2906t) {
            this.f2906t = i12;
            y yVar = this.f2904r;
            this.f2904r = this.f2905s;
            this.f2905s = yVar;
            w0();
        }
        int i13 = Q.f2837b;
        d(null);
        if (i13 != this.f2902p) {
            this.B.a();
            w0();
            this.f2902p = i13;
            this.y = new BitSet(this.f2902p);
            this.f2903q = new e[this.f2902p];
            for (int i14 = 0; i14 < this.f2902p; i14++) {
                this.f2903q[i14] = new e(i14);
            }
            w0();
        }
        boolean z10 = Q.f2838c;
        d(null);
        d dVar = this.F;
        if (dVar != null && dVar.f2932w != z10) {
            dVar.f2932w = z10;
        }
        this.f2909w = z10;
        w0();
        this.f2908v = new q();
        this.f2904r = y.a(this, this.f2906t);
        this.f2905s = y.a(this, 1 - this.f2906t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void D0(Rect rect, int i10, int i11) {
        int h10;
        int h11;
        int N = N() + M();
        int L = L() + O();
        if (this.f2906t == 1) {
            h11 = RecyclerView.l.h(i11, rect.height() + L, J());
            h10 = RecyclerView.l.h(i10, (this.f2907u * this.f2902p) + N, K());
        } else {
            h10 = RecyclerView.l.h(i10, rect.width() + N, K());
            h11 = RecyclerView.l.h(i11, (this.f2907u * this.f2902p) + L, J());
        }
        this.f2822b.setMeasuredDimension(h10, h11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void J0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.f2853a = i10;
        K0(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean L0() {
        return this.F == null;
    }

    public final int M0(int i10) {
        if (x() == 0) {
            return this.f2910x ? 1 : -1;
        }
        return (i10 < W0()) != this.f2910x ? -1 : 1;
    }

    public boolean N0() {
        int W0;
        if (x() != 0 && this.C != 0 && this.f2826g) {
            if (this.f2910x) {
                W0 = X0();
                W0();
            } else {
                W0 = W0();
                X0();
            }
            if (W0 == 0 && b1() != null) {
                this.B.a();
                this.f2825f = true;
                w0();
                return true;
            }
        }
        return false;
    }

    public final int O0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        return d0.a(wVar, this.f2904r, T0(!this.I), S0(!this.I), this, this.I);
    }

    public final int P0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        return d0.b(wVar, this.f2904r, T0(!this.I), S0(!this.I), this, this.I, this.f2910x);
    }

    public final int Q0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        return d0.c(wVar, this.f2904r, T0(!this.I), S0(!this.I), this, this.I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, boolean] */
    public final int R0(RecyclerView.r rVar, q qVar, RecyclerView.w wVar) {
        int i10;
        e eVar;
        ?? r22;
        int i11;
        int c10;
        int k10;
        int c11;
        int i12;
        int i13;
        int i14;
        boolean z10 = false;
        this.y.set(0, this.f2902p, true);
        if (this.f2908v.f3109i) {
            i10 = qVar.f3105e == 1 ? IntCompanionObject.MAX_VALUE : IntCompanionObject.MIN_VALUE;
        } else {
            i10 = qVar.f3105e == 1 ? qVar.f3107g + qVar.f3103b : qVar.f3106f - qVar.f3103b;
        }
        n1(qVar.f3105e, i10);
        int g10 = this.f2910x ? this.f2904r.g() : this.f2904r.k();
        boolean z11 = false;
        while (true) {
            int i15 = qVar.f3104c;
            if (!(i15 >= 0 && i15 < wVar.b()) || (!this.f2908v.f3109i && this.y.isEmpty())) {
                break;
            }
            View view = rVar.j(qVar.f3104c, z10, Long.MAX_VALUE).f2885a;
            qVar.f3104c += qVar.d;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int a10 = layoutParams.a();
            int[] iArr = this.B.f2920a;
            int i16 = (iArr == null || a10 >= iArr.length) ? -1 : iArr[a10];
            if (i16 == -1) {
                if (f1(qVar.f3105e)) {
                    i13 = this.f2902p - 1;
                    i12 = -1;
                    i14 = -1;
                } else {
                    i12 = this.f2902p;
                    i13 = 0;
                    i14 = 1;
                }
                e eVar2 = null;
                if (qVar.f3105e == 1) {
                    int k11 = this.f2904r.k();
                    int i17 = IntCompanionObject.MAX_VALUE;
                    while (i13 != i12) {
                        e eVar3 = this.f2903q[i13];
                        int h10 = eVar3.h(k11);
                        if (h10 < i17) {
                            eVar2 = eVar3;
                            i17 = h10;
                        }
                        i13 += i14;
                    }
                } else {
                    int g11 = this.f2904r.g();
                    int i18 = IntCompanionObject.MIN_VALUE;
                    while (i13 != i12) {
                        e eVar4 = this.f2903q[i13];
                        int k12 = eVar4.k(g11);
                        if (k12 > i18) {
                            eVar2 = eVar4;
                            i18 = k12;
                        }
                        i13 += i14;
                    }
                }
                eVar = eVar2;
                c cVar = this.B;
                cVar.b(a10);
                cVar.f2920a[a10] = eVar.f2937e;
            } else {
                eVar = this.f2903q[i16];
            }
            e eVar5 = eVar;
            layoutParams.f2912e = eVar5;
            if (qVar.f3105e == 1) {
                r22 = 0;
                c(view, -1, false);
            } else {
                r22 = 0;
                c(view, 0, false);
            }
            if (this.f2906t == 1) {
                d1(view, RecyclerView.l.y(this.f2907u, this.f2831l, r22, ((ViewGroup.MarginLayoutParams) layoutParams).width, r22), RecyclerView.l.y(this.f2833o, this.f2832m, L() + O(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), r22);
            } else {
                d1(view, RecyclerView.l.y(this.n, this.f2831l, N() + M(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.l.y(this.f2907u, this.f2832m, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), false);
            }
            if (qVar.f3105e == 1) {
                int h11 = eVar5.h(g10);
                c10 = h11;
                i11 = this.f2904r.c(view) + h11;
            } else {
                int k13 = eVar5.k(g10);
                i11 = k13;
                c10 = k13 - this.f2904r.c(view);
            }
            if (qVar.f3105e == 1) {
                layoutParams.f2912e.a(view);
            } else {
                layoutParams.f2912e.n(view);
            }
            if (c1() && this.f2906t == 1) {
                c11 = this.f2905s.g() - (((this.f2902p - 1) - eVar5.f2937e) * this.f2907u);
                k10 = c11 - this.f2905s.c(view);
            } else {
                k10 = this.f2905s.k() + (eVar5.f2937e * this.f2907u);
                c11 = this.f2905s.c(view) + k10;
            }
            int i19 = c11;
            int i20 = k10;
            if (this.f2906t == 1) {
                V(view, i20, c10, i19, i11);
            } else {
                V(view, c10, i20, i11, i19);
            }
            p1(eVar5, this.f2908v.f3105e, i10);
            h1(rVar, this.f2908v);
            if (this.f2908v.f3108h && view.hasFocusable()) {
                this.y.set(eVar5.f2937e, false);
            }
            z11 = true;
            z10 = false;
        }
        if (!z11) {
            h1(rVar, this.f2908v);
        }
        int k14 = this.f2908v.f3105e == -1 ? this.f2904r.k() - Z0(this.f2904r.k()) : Y0(this.f2904r.g()) - this.f2904r.g();
        if (k14 > 0) {
            return Math.min(qVar.f3103b, k14);
        }
        return 0;
    }

    public View S0(boolean z10) {
        int k10 = this.f2904r.k();
        int g10 = this.f2904r.g();
        View view = null;
        for (int x10 = x() - 1; x10 >= 0; x10--) {
            View w10 = w(x10);
            int e10 = this.f2904r.e(w10);
            int b10 = this.f2904r.b(w10);
            if (b10 > k10 && e10 < g10) {
                if (b10 > g10 && z10) {
                    if (view == null) {
                        view = w10;
                    }
                }
                return w10;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean T() {
        return this.C != 0;
    }

    public View T0(boolean z10) {
        int k10 = this.f2904r.k();
        int g10 = this.f2904r.g();
        int x10 = x();
        View view = null;
        for (int i10 = 0; i10 < x10; i10++) {
            View w10 = w(i10);
            int e10 = this.f2904r.e(w10);
            if (this.f2904r.b(w10) > k10) {
                if (e10 < g10) {
                    if (e10 < k10 && z10) {
                        if (view == null) {
                            view = w10;
                        }
                    }
                    return w10;
                }
                continue;
            }
        }
        return view;
    }

    public final void U0(RecyclerView.r rVar, RecyclerView.w wVar, boolean z10) {
        int Y0 = Y0(IntCompanionObject.MIN_VALUE);
        if (Y0 == Integer.MIN_VALUE) {
            return;
        }
        int g10 = this.f2904r.g() - Y0;
        if (g10 > 0) {
            int i10 = g10 - (-l1(-g10, rVar, wVar));
            if (z10 && i10 > 0) {
                this.f2904r.p(i10);
            }
        }
    }

    public final void V0(RecyclerView.r rVar, RecyclerView.w wVar, boolean z10) {
        int k10;
        int Z0 = Z0(IntCompanionObject.MAX_VALUE);
        if (Z0 != Integer.MAX_VALUE && (k10 = Z0 - this.f2904r.k()) > 0) {
            int l1 = k10 - l1(k10, rVar, wVar);
            if (!z10 || l1 <= 0) {
                return;
            }
            this.f2904r.p(-l1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void W(int i10) {
        super.W(i10);
        for (int i11 = 0; i11 < this.f2902p; i11++) {
            e eVar = this.f2903q[i11];
            int i12 = eVar.f2935b;
            if (i12 != Integer.MIN_VALUE) {
                eVar.f2935b = i12 + i10;
            }
            int i13 = eVar.f2936c;
            if (i13 != Integer.MIN_VALUE) {
                eVar.f2936c = i13 + i10;
            }
        }
    }

    public int W0() {
        if (x() == 0) {
            return 0;
        }
        return P(w(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void X(int i10) {
        super.X(i10);
        for (int i11 = 0; i11 < this.f2902p; i11++) {
            e eVar = this.f2903q[i11];
            int i12 = eVar.f2935b;
            if (i12 != Integer.MIN_VALUE) {
                eVar.f2935b = i12 + i10;
            }
            int i13 = eVar.f2936c;
            if (i13 != Integer.MIN_VALUE) {
                eVar.f2936c = i13 + i10;
            }
        }
    }

    public int X0() {
        int x10 = x();
        if (x10 == 0) {
            return 0;
        }
        return P(w(x10 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void Y(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.B.a();
        for (int i10 = 0; i10 < this.f2902p; i10++) {
            this.f2903q[i10].d();
        }
    }

    public final int Y0(int i10) {
        int h10 = this.f2903q[0].h(i10);
        for (int i11 = 1; i11 < this.f2902p; i11++) {
            int h11 = this.f2903q[i11].h(i10);
            if (h11 > h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void Z(RecyclerView recyclerView, RecyclerView.r rVar) {
        Runnable runnable = this.K;
        RecyclerView recyclerView2 = this.f2822b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i10 = 0; i10 < this.f2902p; i10++) {
            this.f2903q[i10].d();
        }
        recyclerView.requestLayout();
    }

    public final int Z0(int i10) {
        int k10 = this.f2903q[0].k(i10);
        for (int i11 = 1; i11 < this.f2902p; i11++) {
            int k11 = this.f2903q[i11].k(i10);
            if (k11 < k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    public PointF a(int i10) {
        int M0 = M0(i10);
        PointF pointF = new PointF();
        if (M0 == 0) {
            return null;
        }
        if (this.f2906t == 0) {
            pointF.x = M0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = M0;
        }
        return pointF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r11.f2906t == 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        if (c1() == false) goto L23;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a0(android.view.View r12, int r13, androidx.recyclerview.widget.RecyclerView.r r14, androidx.recyclerview.widget.RecyclerView.w r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1(int r10, int r11, int r12) {
        /*
            r9 = this;
            r6 = r9
            boolean r0 = r6.f2910x
            if (r0 == 0) goto La
            int r0 = r6.X0()
            goto Lf
        La:
            int r8 = r6.W0()
            r0 = r8
        Lf:
            r8 = 8
            r1 = r8
            if (r12 != r1) goto L20
            r8 = 4
            if (r10 >= r11) goto L1b
            r8 = 7
            int r2 = r11 + 1
            goto L22
        L1b:
            int r2 = r10 + 1
            r8 = 2
            r3 = r11
            goto L23
        L20:
            int r2 = r10 + r11
        L22:
            r3 = r10
        L23:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r6.B
            r8 = 2
            r4.d(r3)
            r4 = 1
            if (r12 == r4) goto L4b
            r8 = 4
            r5 = 2
            r8 = 3
            if (r12 == r5) goto L42
            r8 = 6
            if (r12 == r1) goto L35
            goto L52
        L35:
            r8 = 1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r12 = r6.B
            r12.f(r10, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r6.B
            r8 = 6
            r10.e(r11, r4)
            goto L52
        L42:
            r8 = 2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r12 = r6.B
            r8 = 6
            r12.f(r10, r11)
            r8 = 6
            goto L52
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r12 = r6.B
            r8 = 5
            r12.e(r10, r11)
            r8 = 5
        L52:
            if (r2 > r0) goto L55
            return
        L55:
            boolean r10 = r6.f2910x
            if (r10 == 0) goto L5e
            int r10 = r6.W0()
            goto L64
        L5e:
            r8 = 1
            int r8 = r6.X0()
            r10 = r8
        L64:
            if (r3 > r10) goto L6a
            r8 = 4
            r6.w0()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (x() > 0) {
            View T0 = T0(false);
            View S0 = S0(false);
            if (T0 != null) {
                if (S0 == null) {
                    return;
                }
                int P = P(T0);
                int P2 = P(S0);
                if (P < P2) {
                    accessibilityEvent.setFromIndex(P);
                    accessibilityEvent.setToIndex(P2);
                    return;
                }
                accessibilityEvent.setFromIndex(P2);
                accessibilityEvent.setToIndex(P);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        if (r10 == r11) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View b1() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b1():android.view.View");
    }

    public boolean c1() {
        return I() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d(String str) {
        RecyclerView recyclerView;
        if (this.F != null || (recyclerView = this.f2822b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    public final void d1(View view, int i10, int i11, boolean z10) {
        Rect rect = this.G;
        RecyclerView recyclerView = this.f2822b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect2 = this.G;
        int q12 = q1(i10, i12 + rect2.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect2.right);
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect3 = this.G;
        int q13 = q1(i11, i13 + rect3.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect3.bottom);
        if (z10 ? I0(view, q12, q13, layoutParams) : G0(view, q12, q13, layoutParams)) {
            view.measure(q12, q13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean e() {
        return this.f2906t == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0343, code lost:
        if (r9 <= r6.f2938f.f2904r.k()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0518, code lost:
        if (N0() != false) goto L271;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037a A[LOOP:6: B:198:0x0378->B:199:0x037a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e1(androidx.recyclerview.widget.RecyclerView.r r13, androidx.recyclerview.widget.RecyclerView.w r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f() {
        return this.f2906t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void f0(RecyclerView recyclerView, int i10, int i11) {
        a1(i10, i11, 1);
    }

    public final boolean f1(int i10) {
        if (this.f2906t == 0) {
            return (i10 == -1) != this.f2910x;
        }
        return ((i10 == -1) == this.f2910x) == c1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g0(RecyclerView recyclerView) {
        this.B.a();
        w0();
    }

    public void g1(int i10, RecyclerView.w wVar) {
        int W0;
        int i11;
        if (i10 > 0) {
            W0 = X0();
            i11 = 1;
        } else {
            W0 = W0();
            i11 = -1;
        }
        this.f2908v.f3102a = true;
        o1(W0, wVar);
        m1(i11);
        q qVar = this.f2908v;
        qVar.f3104c = W0 + qVar.d;
        qVar.f3103b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h0(RecyclerView recyclerView, int i10, int i11, int i12) {
        a1(i10, i11, 8);
    }

    public final void h1(RecyclerView.r rVar, q qVar) {
        if (!qVar.f3102a || qVar.f3109i) {
            return;
        }
        if (qVar.f3103b == 0) {
            if (qVar.f3105e == -1) {
                i1(rVar, qVar.f3107g);
                return;
            } else {
                j1(rVar, qVar.f3106f);
                return;
            }
        }
        int i10 = 1;
        if (qVar.f3105e == -1) {
            int i11 = qVar.f3106f;
            int k10 = this.f2903q[0].k(i11);
            while (i10 < this.f2902p) {
                int k11 = this.f2903q[i10].k(i11);
                if (k11 > k10) {
                    k10 = k11;
                }
                i10++;
            }
            int i12 = i11 - k10;
            i1(rVar, i12 < 0 ? qVar.f3107g : qVar.f3107g - Math.min(i12, qVar.f3103b));
            return;
        }
        int i13 = qVar.f3107g;
        int h10 = this.f2903q[0].h(i13);
        while (i10 < this.f2902p) {
            int h11 = this.f2903q[i10].h(i13);
            if (h11 < h10) {
                h10 = h11;
            }
            i10++;
        }
        int i14 = h10 - qVar.f3107g;
        j1(rVar, i14 < 0 ? qVar.f3106f : Math.min(i14, qVar.f3103b) + qVar.f3106f);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r9, int r10, androidx.recyclerview.widget.RecyclerView.w r11, androidx.recyclerview.widget.RecyclerView.l.c r12) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.i(int, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$l$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i0(RecyclerView recyclerView, int i10, int i11) {
        a1(i10, i11, 2);
    }

    public final void i1(RecyclerView.r rVar, int i10) {
        for (int x10 = x() - 1; x10 >= 0; x10--) {
            View w10 = w(x10);
            if (this.f2904r.e(w10) < i10 || this.f2904r.o(w10) < i10) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) w10.getLayoutParams();
            Objects.requireNonNull(layoutParams);
            if (layoutParams.f2912e.f2934a.size() == 1) {
                return;
            }
            layoutParams.f2912e.l();
            s0(w10, rVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        a1(i10, i11, 4);
    }

    public final void j1(RecyclerView.r rVar, int i10) {
        while (x() > 0) {
            View w10 = w(0);
            if (this.f2904r.b(w10) > i10 || this.f2904r.n(w10) > i10) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) w10.getLayoutParams();
            Objects.requireNonNull(layoutParams);
            if (layoutParams.f2912e.f2934a.size() == 1) {
                return;
            }
            layoutParams.f2912e.m();
            s0(w10, rVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.w wVar) {
        return O0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k0(RecyclerView.r rVar, RecyclerView.w wVar) {
        e1(rVar, wVar, true);
    }

    public final void k1() {
        if (this.f2906t != 1 && c1()) {
            this.f2910x = !this.f2909w;
            return;
        }
        this.f2910x = this.f2909w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.w wVar) {
        return P0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l0(RecyclerView.w wVar) {
        this.f2911z = -1;
        this.A = IntCompanionObject.MIN_VALUE;
        this.F = null;
        this.H.b();
    }

    public int l1(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (x() == 0 || i10 == 0) {
            return 0;
        }
        g1(i10, wVar);
        int R0 = R0(rVar, this.f2908v, wVar);
        if (this.f2908v.f3103b >= R0) {
            i10 = i10 < 0 ? -R0 : R0;
        }
        this.f2904r.p(-i10);
        this.D = this.f2910x;
        q qVar = this.f2908v;
        qVar.f3103b = 0;
        h1(rVar, qVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void m0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.F = dVar;
            if (this.f2911z != -1) {
                dVar.f2929m = null;
                dVar.f2928j = 0;
                dVar.f2926c = -1;
                dVar.f2927f = -1;
                dVar.f2929m = null;
                dVar.f2928j = 0;
                dVar.n = 0;
                dVar.f2930t = null;
                dVar.f2931u = null;
            }
            w0();
        }
    }

    public final void m1(int i10) {
        q qVar = this.f2908v;
        qVar.f3105e = i10;
        int i11 = 1;
        if (this.f2910x != (i10 == -1)) {
            i11 = -1;
        }
        qVar.d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.w wVar) {
        return O0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public Parcelable n0() {
        int k10;
        int k11;
        int[] iArr;
        d dVar = this.F;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        dVar2.f2932w = this.f2909w;
        dVar2.y = this.D;
        dVar2.f2933z = this.E;
        c cVar = this.B;
        if (cVar == null || (iArr = cVar.f2920a) == null) {
            dVar2.n = 0;
        } else {
            dVar2.f2930t = iArr;
            dVar2.n = iArr.length;
            dVar2.f2931u = cVar.f2921b;
        }
        if (x() > 0) {
            dVar2.f2926c = this.D ? X0() : W0();
            View S0 = this.f2910x ? S0(true) : T0(true);
            dVar2.f2927f = S0 != null ? P(S0) : -1;
            int i10 = this.f2902p;
            dVar2.f2928j = i10;
            dVar2.f2929m = new int[i10];
            for (int i11 = 0; i11 < this.f2902p; i11++) {
                if (this.D) {
                    k10 = this.f2903q[i11].h(IntCompanionObject.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        k11 = this.f2904r.g();
                        k10 -= k11;
                        dVar2.f2929m[i11] = k10;
                    } else {
                        dVar2.f2929m[i11] = k10;
                    }
                } else {
                    k10 = this.f2903q[i11].k(IntCompanionObject.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        k11 = this.f2904r.k();
                        k10 -= k11;
                        dVar2.f2929m[i11] = k10;
                    } else {
                        dVar2.f2929m[i11] = k10;
                    }
                }
            }
        } else {
            dVar2.f2926c = -1;
            dVar2.f2927f = -1;
            dVar2.f2928j = 0;
        }
        return dVar2;
    }

    public final void n1(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2902p; i12++) {
            if (!this.f2903q[i12].f2934a.isEmpty()) {
                p1(this.f2903q[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.w wVar) {
        return P0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void o0(int i10) {
        if (i10 == 0) {
            N0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o1(int r9, androidx.recyclerview.widget.RecyclerView.w r10) {
        /*
            Method dump skipped, instructions count: 163
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o1(int, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int p(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    public final void p1(e eVar, int i10, int i11) {
        int i12 = eVar.d;
        if (i10 == -1) {
            int i13 = eVar.f2935b;
            if (i13 == Integer.MIN_VALUE) {
                eVar.c();
                i13 = eVar.f2935b;
            }
            if (i13 + i12 <= i11) {
                this.y.set(eVar.f2937e, false);
            }
        } else {
            int i14 = eVar.f2936c;
            if (i14 == Integer.MIN_VALUE) {
                eVar.b();
                i14 = eVar.f2936c;
            }
            if (i14 - i12 >= i11) {
                this.y.set(eVar.f2937e, false);
            }
        }
    }

    public final int q1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.LayoutParams t() {
        return this.f2906t == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.LayoutParams u(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.LayoutParams v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int x0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        return l1(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void y0(int i10) {
        d dVar = this.F;
        if (dVar != null && dVar.f2926c != i10) {
            dVar.f2929m = null;
            dVar.f2928j = 0;
            dVar.f2926c = -1;
            dVar.f2927f = -1;
        }
        this.f2911z = i10;
        this.A = IntCompanionObject.MIN_VALUE;
        w0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int z0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        return l1(i10, rVar, wVar);
    }
}
