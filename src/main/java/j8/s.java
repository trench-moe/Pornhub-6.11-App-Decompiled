package j8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class s implements f {

    /* renamed from: a  reason: collision with root package name */
    public final f f11647a;

    /* renamed from: b  reason: collision with root package name */
    public long f11648b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f11649c;
    public Map<String, List<String>> d;

    public s(f fVar) {
        Objects.requireNonNull(fVar);
        this.f11647a = fVar;
        this.f11649c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        int a10 = this.f11647a.a(bArr, i10, i11);
        if (a10 != -1) {
            this.f11648b += a10;
        }
        return a10;
    }

    @Override // j8.f
    public Uri c() {
        return this.f11647a.c();
    }

    @Override // j8.f
    public void close() {
        this.f11647a.close();
    }

    @Override // j8.f
    public long j(h hVar) {
        this.f11649c = hVar.f11575a;
        this.d = Collections.emptyMap();
        long j10 = this.f11647a.j(hVar);
        Uri c10 = c();
        Objects.requireNonNull(c10);
        this.f11649c = c10;
        this.d = k();
        return j10;
    }

    @Override // j8.f
    public Map<String, List<String>> k() {
        return this.f11647a.k();
    }

    @Override // j8.f
    public void n(t tVar) {
        Objects.requireNonNull(tVar);
        this.f11647a.n(tVar);
    }
}
