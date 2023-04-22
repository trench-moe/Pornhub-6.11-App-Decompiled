package aa;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public class b extends i9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new o();

    /* renamed from: c  reason: collision with root package name */
    public String f323c;

    /* renamed from: f  reason: collision with root package name */
    public DataHolder f324f;

    /* renamed from: j  reason: collision with root package name */
    public ParcelFileDescriptor f325j;

    /* renamed from: m  reason: collision with root package name */
    public long f326m;
    public byte[] n;

    public b() {
        this.f323c = null;
        this.f324f = null;
        this.f325j = null;
        this.f326m = 0L;
        this.n = null;
    }

    public b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j10, byte[] bArr) {
        this.f323c = str;
        this.f324f = dataHolder;
        this.f325j = parcelFileDescriptor;
        this.f326m = j10;
        this.n = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor = this.f325j;
        o.a(this, parcel, i10);
        this.f325j = null;
    }
}
