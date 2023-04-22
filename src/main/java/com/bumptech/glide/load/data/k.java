package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclableBufferedInputStream f5703a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final k5.b f5704a;

        public a(k5.b bVar) {
            this.f5704a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f5704a);
        }
    }

    public k(InputStream inputStream, k5.b bVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f5703a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f5703a.c();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c */
    public InputStream a() {
        this.f5703a.reset();
        return this.f5703a;
    }
}
