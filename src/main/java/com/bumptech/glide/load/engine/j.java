package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.c;
import java.io.File;
import java.util.List;
import n5.m;

/* loaded from: classes.dex */
public class j implements c, d.a<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final c.a f5819c;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f5820f;

    /* renamed from: j  reason: collision with root package name */
    public int f5821j;

    /* renamed from: m  reason: collision with root package name */
    public int f5822m = -1;
    public h5.b n;

    /* renamed from: t  reason: collision with root package name */
    public List<m<File, ?>> f5823t;

    /* renamed from: u  reason: collision with root package name */
    public int f5824u;

    /* renamed from: w  reason: collision with root package name */
    public volatile m.a<?> f5825w;
    public File y;

    /* renamed from: z  reason: collision with root package name */
    public j5.j f5826z;

    public j(d<?> dVar, c.a aVar) {
        this.f5820f = dVar;
        this.f5819c = aVar;
    }

    @Override // com.bumptech.glide.load.engine.c
    public boolean a() {
        List<h5.b> a10 = this.f5820f.a();
        if (a10.isEmpty()) {
            return false;
        }
        List<Class<?>> e10 = this.f5820f.e();
        if (e10.isEmpty()) {
            if (File.class.equals(this.f5820f.f5761k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f5820f.d.getClass() + " to " + this.f5820f.f5761k);
        }
        while (true) {
            List<m<File, ?>> list = this.f5823t;
            if (list != null) {
                if (this.f5824u < list.size()) {
                    this.f5825w = null;
                    boolean z10 = false;
                    while (!z10) {
                        if (!(this.f5824u < this.f5823t.size())) {
                            break;
                        }
                        List<m<File, ?>> list2 = this.f5823t;
                        int i10 = this.f5824u;
                        this.f5824u = i10 + 1;
                        File file = this.y;
                        d<?> dVar = this.f5820f;
                        this.f5825w = list2.get(i10).b(file, dVar.f5755e, dVar.f5756f, dVar.f5759i);
                        if (this.f5825w != null && this.f5820f.h(this.f5825w.f13340c.a())) {
                            this.f5825w.f13340c.e(this.f5820f.f5764o, this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
            }
            int i11 = this.f5822m + 1;
            this.f5822m = i11;
            if (i11 >= e10.size()) {
                int i12 = this.f5821j + 1;
                this.f5821j = i12;
                if (i12 >= a10.size()) {
                    return false;
                }
                this.f5822m = 0;
            }
            h5.b bVar = a10.get(this.f5821j);
            Class<?> cls = e10.get(this.f5822m);
            h5.g<Z> g10 = this.f5820f.g(cls);
            d<?> dVar2 = this.f5820f;
            this.f5826z = new j5.j(dVar2.f5754c.f5641a, bVar, dVar2.n, dVar2.f5755e, dVar2.f5756f, g10, cls, dVar2.f5759i);
            File b10 = dVar2.b().b(this.f5826z);
            this.y = b10;
            if (b10 != null) {
                this.n = bVar;
                this.f5823t = this.f5820f.f5754c.f5642b.f(b10);
                this.f5824u = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f5819c.d(this.f5826z, exc, this.f5825w.f13340c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.c
    public void cancel() {
        m.a<?> aVar = this.f5825w;
        if (aVar != null) {
            aVar.f13340c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f5819c.c(this.n, obj, this.f5825w.f13340c, DataSource.RESOURCE_DISK_CACHE, this.f5826z);
    }
}
