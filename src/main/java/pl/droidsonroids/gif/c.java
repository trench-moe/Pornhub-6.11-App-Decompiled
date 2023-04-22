package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes3.dex */
public class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: c */
    public final long[][] f14123c;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel, a aVar) {
        super(parcel);
        this.f14123c = new long[parcel.readInt()];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.f14123c;
            if (i10 >= jArr.length) {
                return;
            }
            jArr[i10] = parcel.createLongArray();
            i10++;
        }
    }

    public c(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.f14123c = r2;
        long[][] jArr2 = {jArr};
    }

    public c(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f14123c = new long[drawableArr.length];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable instanceof b) {
                this.f14123c[i10] = ((b) drawable).f14118u.j();
            } else {
                this.f14123c[i10] = null;
            }
        }
    }

    public void a(Drawable drawable, int i10) {
        long[][] jArr = this.f14123c;
        if (jArr[i10] == null || !(drawable instanceof b)) {
            return;
        }
        b bVar = (b) drawable;
        bVar.a(bVar.f14118u.s(jArr[i10], bVar.f14117t));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f14123c.length);
        for (long[] jArr : this.f14123c) {
            parcel.writeLongArray(jArr);
        }
    }
}
