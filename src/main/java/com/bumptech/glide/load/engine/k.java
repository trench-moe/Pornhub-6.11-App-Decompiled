package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.c;
import j5.l;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import n5.m;

/* loaded from: classes.dex */
public class k implements c, c.a {

    /* renamed from: c  reason: collision with root package name */
    public final d<?> f5827c;

    /* renamed from: f  reason: collision with root package name */
    public final c.a f5828f;

    /* renamed from: j  reason: collision with root package name */
    public volatile int f5829j;

    /* renamed from: m  reason: collision with root package name */
    public volatile b f5830m;
    public volatile Object n;

    /* renamed from: t  reason: collision with root package name */
    public volatile m.a<?> f5831t;

    /* renamed from: u  reason: collision with root package name */
    public volatile j5.b f5832u;

    public k(d<?> dVar, c.a aVar) {
        this.f5827c = dVar;
        this.f5828f = aVar;
    }

    @Override // com.bumptech.glide.load.engine.c
    public boolean a() {
        if (this.n != null) {
            Object obj = this.n;
            this.n = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f5830m == null || !this.f5830m.a()) {
            this.f5830m = null;
            this.f5831t = null;
            boolean z10 = false;
            loop0: while (true) {
                while (!z10) {
                    if (!(this.f5829j < this.f5827c.c().size())) {
                        break loop0;
                    }
                    List<m.a<?>> c10 = this.f5827c.c();
                    int i10 = this.f5829j;
                    this.f5829j = i10 + 1;
                    this.f5831t = c10.get(i10);
                    if (this.f5831t != null && (this.f5827c.f5765p.c(this.f5831t.f13340c.d()) || this.f5827c.h(this.f5831t.f13340c.a()))) {
                        this.f5831t.f13340c.e(this.f5827c.f5764o, new l(this, this.f5831t));
                        z10 = true;
                    }
                }
                break loop0;
            }
            return z10;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public void c(h5.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, h5.b bVar2) {
        this.f5828f.c(bVar, obj, dVar, this.f5831t.f13340c.d(), bVar);
    }

    @Override // com.bumptech.glide.load.engine.c
    public void cancel() {
        m.a<?> aVar = this.f5831t;
        if (aVar != null) {
            aVar.f13340c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public void d(h5.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        this.f5828f.d(bVar, exc, dVar, this.f5831t.f13340c.d());
    }

    public final boolean e(Object obj) {
        int i10 = d6.h.f8793b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e g10 = this.f5827c.f5754c.f5642b.g(obj);
            Object a10 = g10.a();
            h5.a<X> f10 = this.f5827c.f(a10);
            j5.c cVar = new j5.c(f10, a10, this.f5827c.f5759i);
            h5.b bVar = this.f5831t.f13338a;
            d<?> dVar = this.f5827c;
            j5.b bVar2 = new j5.b(bVar, dVar.n);
            l5.a b10 = dVar.b();
            b10.a(bVar2, cVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + bVar2 + ", data: " + obj + ", encoder: " + f10 + ", duration: " + d6.h.a(elapsedRealtimeNanos));
            }
            if (b10.b(bVar2) != null) {
                this.f5832u = bVar2;
                this.f5830m = new b(Collections.singletonList(this.f5831t.f13338a), this.f5827c, this);
                this.f5831t.f13340c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f5832u + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f5828f.c(this.f5831t.f13338a, g10.a(), this.f5831t.f13340c, this.f5831t.f13340c.d(), this.f5831t.f13338a);
                return false;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    this.f5831t.f13340c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
