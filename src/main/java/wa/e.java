package wa;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import ha.a;

/* loaded from: classes2.dex */
public class e implements i {

    /* renamed from: c  reason: collision with root package name */
    public d f17418c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17419f = false;

    /* renamed from: j  reason: collision with root package name */
    public int f17420j;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0285a();

        /* renamed from: c  reason: collision with root package name */
        public int f17421c;

        /* renamed from: f  reason: collision with root package name */
        public ua.e f17422f;

        /* renamed from: wa.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0285a implements Parcelable.Creator<a> {
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
            this.f17421c = parcel.readInt();
            this.f17422f = (ua.e) parcel.readParcelable(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f17421c);
            parcel.writeParcelable(this.f17422f, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public int a() {
        return this.f17420j;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(boolean z10) {
        if (this.f17419f) {
            return;
        }
        if (z10) {
            this.f17418c.a();
            return;
        }
        d dVar = this.f17418c;
        androidx.appcompat.view.menu.e eVar = dVar.R;
        if (eVar != null && dVar.f17413t != null) {
            int size = eVar.size();
            if (size != dVar.f17413t.length) {
                dVar.a();
                return;
            }
            int i10 = dVar.f17414u;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = dVar.R.getItem(i11);
                if (item.isChecked()) {
                    dVar.f17414u = item.getItemId();
                    dVar.f17415w = i11;
                }
            }
            if (i10 != dVar.f17414u) {
                androidx.transition.d.a(dVar, dVar.f17409c);
            }
            boolean f10 = dVar.f(dVar.n, dVar.R.l().size());
            for (int i12 = 0; i12 < size; i12++) {
                dVar.Q.f17419f = true;
                dVar.f17413t[i12].setLabelVisibilityMode(dVar.n);
                dVar.f17413t[i12].setShifting(f10);
                dVar.f17413t[i12].d((androidx.appcompat.view.menu.g) dVar.R.getItem(i12), 0);
                dVar.Q.f17419f = false;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f17418c.R = eVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void k(Parcelable parcelable) {
        if (parcelable instanceof a) {
            d dVar = this.f17418c;
            a aVar = (a) parcelable;
            int i10 = aVar.f17421c;
            int size = dVar.R.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = dVar.R.getItem(i11);
                if (i10 == item.getItemId()) {
                    dVar.f17414u = i10;
                    dVar.f17415w = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f17418c.getContext();
            ua.e eVar = aVar.f17422f;
            SparseArray<ha.a> sparseArray = new SparseArray<>(eVar.size());
            for (int i12 = 0; i12 < eVar.size(); i12++) {
                int keyAt = eVar.keyAt(i12);
                a.C0148a c0148a = (a.C0148a) eVar.valueAt(i12);
                if (c0148a == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                ha.a aVar2 = new ha.a(context);
                aVar2.j(c0148a.n);
                int i13 = c0148a.f10408m;
                if (i13 != -1) {
                    aVar2.k(i13);
                }
                aVar2.g(c0148a.f10405c);
                aVar2.i(c0148a.f10406f);
                aVar2.h(c0148a.y);
                aVar2.f10403w.A = c0148a.A;
                aVar2.m();
                aVar2.f10403w.B = c0148a.B;
                aVar2.m();
                aVar2.f10403w.C = c0148a.C;
                aVar2.m();
                aVar2.f10403w.D = c0148a.D;
                aVar2.m();
                aVar2.f10403w.E = c0148a.E;
                aVar2.m();
                aVar2.f10403w.F = c0148a.F;
                aVar2.m();
                boolean z10 = c0148a.f10412z;
                aVar2.setVisible(z10, false);
                aVar2.f10403w.f10412z = z10;
                sparseArray.put(keyAt, aVar2);
            }
            this.f17418c.setBadgeDrawables(sparseArray);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(l lVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable n() {
        a aVar = new a();
        aVar.f17421c = this.f17418c.getSelectedItemId();
        SparseArray<ha.a> badgeDrawables = this.f17418c.getBadgeDrawables();
        ua.e eVar = new ua.e();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int keyAt = badgeDrawables.keyAt(i10);
            ha.a valueAt = badgeDrawables.valueAt(i10);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            eVar.put(keyAt, valueAt.f10403w);
        }
        aVar.f17422f = eVar;
        return aVar;
    }
}
