package q5;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q implements h5.e<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f14398a;

    public q(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f14398a = aVar;
    }

    @Override // h5.e
    public j5.i<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, h5.d dVar) {
        com.bumptech.glide.load.resource.bitmap.a aVar = this.f14398a;
        return aVar.a(new b.c(parcelFileDescriptor, aVar.d, aVar.f5868c), i10, i11, dVar, com.bumptech.glide.load.resource.bitmap.a.f5864k);
    }

    @Override // h5.e
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, h5.d dVar) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) {
            Objects.requireNonNull(this.f14398a);
            return true;
        }
        return false;
    }
}
