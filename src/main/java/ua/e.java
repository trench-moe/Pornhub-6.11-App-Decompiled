package ua;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes2.dex */
public class e extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.ClassLoaderCreator<e> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new e(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new e(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e() {
    }

    public e(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i10 = 0; i10 < readInt; i10++) {
            put(iArr[i10], readParcelableArray[i10]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = keyAt(i11);
            parcelableArr[i11] = valueAt(i11);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
