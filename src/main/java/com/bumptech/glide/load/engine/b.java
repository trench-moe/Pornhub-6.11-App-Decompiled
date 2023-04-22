package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.c;
import java.io.File;
import java.util.List;
import n5.m;

/* loaded from: classes.dex */
public class b implements c, d.a<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final List<h5.b> f5745c;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f5746f;

    /* renamed from: j  reason: collision with root package name */
    public final c.a f5747j;

    /* renamed from: m  reason: collision with root package name */
    public int f5748m;
    public h5.b n;

    /* renamed from: t  reason: collision with root package name */
    public List<m<File, ?>> f5749t;

    /* renamed from: u  reason: collision with root package name */
    public int f5750u;

    /* renamed from: w  reason: collision with root package name */
    public volatile m.a<?> f5751w;
    public File y;

    public b(d<?> dVar, c.a aVar) {
        List<h5.b> a10 = dVar.a();
        this.f5748m = -1;
        this.f5745c = a10;
        this.f5746f = dVar;
        this.f5747j = aVar;
    }

    public b(List<h5.b> list, d<?> dVar, c.a aVar) {
        this.f5748m = -1;
        this.f5745c = list;
        this.f5746f = dVar;
        this.f5747j = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        r12.f5751w = null;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r0 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r12.f5750u >= r12.f5749t.size()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r3 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        r3 = r12.f5749t;
        r4 = r12.f5750u;
        r12.f5750u = r4 + 1;
        r4 = r12.y;
        r5 = r12.f5746f;
        r12.f5751w = r3.get(r4).b(r4, r5.f5755e, r5.f5756f, r5.f5759i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r12.f5751w == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r12.f5746f.h(r12.f5751w.f13340c.a()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        r12.f5751w.f13340c.e(r12.f5746f.f5764o, r12);
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        return r0;
     */
    @Override // com.bumptech.glide.load.engine.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.b.a():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f5747j.d(this.n, exc, this.f5751w.f13340c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.c
    public void cancel() {
        m.a<?> aVar = this.f5751w;
        if (aVar != null) {
            aVar.f13340c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f5747j.c(this.n, obj, this.f5751w.f13340c, DataSource.DATA_DISK_CACHE, this.n);
    }
}
