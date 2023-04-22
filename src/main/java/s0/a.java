package s0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: c  reason: collision with root package name */
    public final Parcelable f14775c;

    /* renamed from: f  reason: collision with root package name */
    public static final a f14774f = new C0259a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0259a extends a {
        public C0259a() {
            super((C0259a) null);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f14774f;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f14774f;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f14775c = readParcelable == null ? f14774f : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f14775c = parcelable == f14774f ? null : parcelable;
    }

    public a(C0259a c0259a) {
        this.f14775c = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f14775c, i10);
    }
}
