package eb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p.g;

/* loaded from: classes.dex */
public class a extends s0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0129a();

    /* renamed from: j  reason: collision with root package name */
    public final g<String, Bundle> f9307j;

    /* renamed from: eb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0129a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel, ClassLoader classLoader, C0129a c0129a) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f9307j = new g<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f9307j.put(strArr[i10], bundleArr[i10]);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f9307j = new g<>();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ExtendableSavedState{");
        m10.append(Integer.toHexString(System.identityHashCode(this)));
        m10.append(" states=");
        m10.append(this.f9307j);
        m10.append("}");
        return m10.toString();
    }

    @Override // s0.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f14775c, i10);
        int i11 = this.f9307j.f13768j;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = this.f9307j.h(i12);
            bundleArr[i12] = this.f9307j.l(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
