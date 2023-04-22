package j8;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class l implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11614a;

    /* renamed from: b  reason: collision with root package name */
    public final List<t> f11615b;

    /* renamed from: c  reason: collision with root package name */
    public final f f11616c;
    public f d;

    /* renamed from: e  reason: collision with root package name */
    public f f11617e;

    /* renamed from: f  reason: collision with root package name */
    public f f11618f;

    /* renamed from: g  reason: collision with root package name */
    public f f11619g;

    /* renamed from: h  reason: collision with root package name */
    public f f11620h;

    /* renamed from: i  reason: collision with root package name */
    public f f11621i;

    /* renamed from: j  reason: collision with root package name */
    public f f11622j;

    /* renamed from: k  reason: collision with root package name */
    public f f11623k;

    public l(Context context, f fVar) {
        this.f11614a = context.getApplicationContext();
        Objects.requireNonNull(fVar);
        this.f11616c = fVar;
        this.f11615b = new ArrayList();
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        f fVar = this.f11623k;
        Objects.requireNonNull(fVar);
        return fVar.a(bArr, i10, i11);
    }

    @Override // j8.f
    public Uri c() {
        f fVar = this.f11623k;
        if (fVar == null) {
            return null;
        }
        return fVar.c();
    }

    @Override // j8.f
    public void close() {
        f fVar = this.f11623k;
        if (fVar != null) {
            try {
                fVar.close();
                this.f11623k = null;
            } catch (Throwable th) {
                this.f11623k = null;
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        r0 = r9.f11575a.getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r0.startsWith("/android_asset/") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r8.f11617e != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        r0 = new com.google.android.exoplayer2.upstream.AssetDataSource(r8.f11614a);
        r8.f11617e = r0;
        p(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        r8.f11623k = r8.f11617e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r8.d != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        r0 = new com.google.android.exoplayer2.upstream.FileDataSource();
        r8.d = r0;
        p(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        r8.f11623k = r8.d;
     */
    @Override // j8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j(j8.h r9) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.l.j(j8.h):long");
    }

    @Override // j8.f
    public Map<String, List<String>> k() {
        f fVar = this.f11623k;
        return fVar == null ? Collections.emptyMap() : fVar.k();
    }

    @Override // j8.f
    public void n(t tVar) {
        Objects.requireNonNull(tVar);
        this.f11616c.n(tVar);
        this.f11615b.add(tVar);
        f fVar = this.d;
        if (fVar != null) {
            fVar.n(tVar);
        }
        f fVar2 = this.f11617e;
        if (fVar2 != null) {
            fVar2.n(tVar);
        }
        f fVar3 = this.f11618f;
        if (fVar3 != null) {
            fVar3.n(tVar);
        }
        f fVar4 = this.f11619g;
        if (fVar4 != null) {
            fVar4.n(tVar);
        }
        f fVar5 = this.f11620h;
        if (fVar5 != null) {
            fVar5.n(tVar);
        }
        f fVar6 = this.f11621i;
        if (fVar6 != null) {
            fVar6.n(tVar);
        }
        f fVar7 = this.f11622j;
        if (fVar7 != null) {
            fVar7.n(tVar);
        }
    }

    public final void p(f fVar) {
        for (int i10 = 0; i10 < this.f11615b.size(); i10++) {
            fVar.n(this.f11615b.get(i10));
        }
    }
}
