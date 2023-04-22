package bf;

import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements y {

    /* renamed from: c  reason: collision with root package name */
    public int f3678c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3679f;

    /* renamed from: j  reason: collision with root package name */
    public final h f3680j;

    /* renamed from: m  reason: collision with root package name */
    public final Inflater f3681m;

    public m(h source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f3680j = source;
        this.f3681m = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[SYNTHETIC] */
    @Override // bf.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long O(bf.f r10, long r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.m.O(bf.f, long):long");
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3679f) {
            return;
        }
        this.f3681m.end();
        this.f3679f = true;
        this.f3680j.close();
    }

    @Override // bf.y
    public z g() {
        return this.f3680j.g();
    }
}
