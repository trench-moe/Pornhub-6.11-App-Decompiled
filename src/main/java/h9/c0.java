package h9;

import android.content.Context;
import android.util.SparseIntArray;
import d9.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f10292a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public c9.f f10293b;

    public c0(c9.f fVar) {
        Objects.requireNonNull(fVar, "null reference");
        this.f10293b = fVar;
    }

    public final int a(Context context, a.f fVar) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(fVar, "null reference");
        int i10 = 0;
        if (fVar.requiresGooglePlayServices()) {
            int minApkVersion = fVar.getMinApkVersion();
            int i11 = this.f10292a.get(minApkVersion, -1);
            if (i11 == -1) {
                int i12 = 0;
                while (true) {
                    if (i12 >= this.f10292a.size()) {
                        i10 = -1;
                        break;
                    }
                    int keyAt = this.f10292a.keyAt(i12);
                    if (keyAt > minApkVersion && this.f10292a.get(keyAt) == 0) {
                        break;
                    }
                    i12++;
                }
                i11 = i10 == -1 ? this.f10293b.c(context, minApkVersion) : i10;
                this.f10292a.put(minApkVersion, i11);
            }
            return i11;
        }
        return 0;
    }
}
