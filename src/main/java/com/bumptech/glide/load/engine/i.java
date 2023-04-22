package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class i<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final m0.c<List<Throwable>> f5816a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends e<Data, ResourceType, Transcode>> f5817b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5818c;

    public i(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<e<Data, ResourceType, Transcode>> list, m0.c<List<Throwable>> cVar) {
        this.f5816a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f5817b = list;
        StringBuilder m10 = a1.a.m("Failed LoadPath{");
        m10.append(cls.getSimpleName());
        m10.append("->");
        m10.append(cls2.getSimpleName());
        m10.append("->");
        m10.append(cls3.getSimpleName());
        m10.append("}");
        this.f5818c = m10.toString();
    }

    public j5.i<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, h5.d dVar, int i10, int i11, e.a<ResourceType> aVar) {
        List<Throwable> b10 = this.f5816a.b();
        Objects.requireNonNull(b10, "Argument must not be null");
        List<Throwable> list = b10;
        try {
            int size = this.f5817b.size();
            j5.i<Transcode> iVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    iVar = this.f5817b.get(i12).a(eVar, i10, i11, dVar, aVar);
                } catch (GlideException e10) {
                    list.add(e10);
                }
                if (iVar != null) {
                    break;
                }
            }
            if (iVar != null) {
                return iVar;
            }
            throw new GlideException(this.f5818c, new ArrayList(list));
        } finally {
            this.f5816a.a(list);
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("LoadPath{decodePaths=");
        m10.append(Arrays.toString(this.f5817b.toArray()));
        m10.append('}');
        return m10.toString();
    }
}
