package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import n5.m;

/* loaded from: classes.dex */
public class e<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f5768a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends h5.e<DataType, ResourceType>> f5769b;

    /* renamed from: c  reason: collision with root package name */
    public final v5.b<ResourceType, Transcode> f5770c;
    public final m0.c<List<Throwable>> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5771e;

    /* loaded from: classes.dex */
    public interface a<ResourceType> {
    }

    public e(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends h5.e<DataType, ResourceType>> list, v5.b<ResourceType, Transcode> bVar, m0.c<List<Throwable>> cVar) {
        this.f5768a = cls;
        this.f5769b = list;
        this.f5770c = bVar;
        this.d = cVar;
        StringBuilder m10 = a1.a.m("Failed DecodePath{");
        m10.append(cls.getSimpleName());
        m10.append("->");
        m10.append(cls2.getSimpleName());
        m10.append("->");
        m10.append(cls3.getSimpleName());
        m10.append("}");
        this.f5771e = m10.toString();
    }

    public j5.i<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, h5.d dVar, a<ResourceType> aVar) {
        j5.i<ResourceType> iVar;
        h5.g gVar;
        EncodeStrategy encodeStrategy;
        h5.b bVar;
        List<Throwable> b10 = this.d.b();
        Objects.requireNonNull(b10, "Argument must not be null");
        List<Throwable> list = b10;
        try {
            j5.i<ResourceType> b11 = b(eVar, i10, i11, dVar, list);
            this.d.a(list);
            DecodeJob.b bVar2 = (DecodeJob.b) aVar;
            DecodeJob decodeJob = DecodeJob.this;
            DataSource dataSource = bVar2.f5727a;
            Objects.requireNonNull(decodeJob);
            Class<?> cls = b11.get().getClass();
            h5.f fVar = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                h5.g g10 = decodeJob.f5709c.g(cls);
                gVar = g10;
                iVar = g10.a(decodeJob.f5715w, b11, decodeJob.B, decodeJob.C);
            } else {
                iVar = b11;
                gVar = null;
            }
            if (!b11.equals(iVar)) {
                b11.b();
            }
            boolean z10 = false;
            if (decodeJob.f5709c.f5754c.f5642b.d.a(iVar.d()) != null) {
                fVar = decodeJob.f5709c.f5754c.f5642b.d.a(iVar.d());
                if (fVar == null) {
                    throw new Registry.NoResultEncoderAvailableException(iVar.d());
                }
                encodeStrategy = fVar.c(decodeJob.E);
            } else {
                encodeStrategy = EncodeStrategy.NONE;
            }
            h5.f fVar2 = fVar;
            d<R> dVar2 = decodeJob.f5709c;
            h5.b bVar3 = decodeJob.N;
            List<m.a<?>> c10 = dVar2.c();
            int size = c10.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                } else if (c10.get(i12).f13338a.equals(bVar3)) {
                    z10 = true;
                    break;
                } else {
                    i12++;
                }
            }
            j5.i<ResourceType> iVar2 = iVar;
            if (decodeJob.D.d(!z10, dataSource, encodeStrategy)) {
                if (fVar2 == null) {
                    throw new Registry.NoResultEncoderAvailableException(iVar.get().getClass());
                }
                int ordinal = encodeStrategy.ordinal();
                if (ordinal == 0) {
                    bVar = new j5.b(decodeJob.N, decodeJob.y);
                } else if (ordinal != 1) {
                    throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                } else {
                    bVar = new j5.j(decodeJob.f5709c.f5754c.f5641a, decodeJob.N, decodeJob.y, decodeJob.B, decodeJob.C, gVar, cls, decodeJob.E);
                }
                j5.h<Z> a10 = j5.h.a(iVar);
                DecodeJob.c<?> cVar = decodeJob.f5713t;
                cVar.f5729a = bVar;
                cVar.f5730b = fVar2;
                cVar.f5731c = a10;
                iVar2 = a10;
            }
            return this.f5770c.a(iVar2, dVar);
        } catch (Throwable th) {
            this.d.a(list);
            throw th;
        }
    }

    public final j5.i<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, h5.d dVar, List<Throwable> list) {
        int size = this.f5769b.size();
        j5.i<ResourceType> iVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            h5.e<DataType, ResourceType> eVar2 = this.f5769b.get(i12);
            try {
                if (eVar2.b(eVar.a(), dVar)) {
                    iVar = eVar2.a(eVar.a(), i10, i11, dVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + eVar2, e10);
                }
                list.add(e10);
            }
            if (iVar != null) {
                break;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        throw new GlideException(this.f5771e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("DecodePath{ dataClass=");
        m10.append(this.f5768a);
        m10.append(", decoders=");
        m10.append(this.f5769b);
        m10.append(", transcoder=");
        m10.append(this.f5770c);
        m10.append('}');
        return m10.toString();
    }
}
