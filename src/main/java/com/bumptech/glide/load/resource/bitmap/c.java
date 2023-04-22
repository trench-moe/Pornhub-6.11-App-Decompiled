package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.resource.bitmap.b;
import d6.j;
import h5.e;
import j5.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/* loaded from: classes.dex */
public class c implements e<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f5879a;

    /* renamed from: b  reason: collision with root package name */
    public final k5.b f5880b;

    /* loaded from: classes.dex */
    public static class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclableBufferedInputStream f5881a;

        /* renamed from: b  reason: collision with root package name */
        public final d6.d f5882b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, d6.d dVar) {
            this.f5881a = recyclableBufferedInputStream;
            this.f5882b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a(k5.c cVar, Bitmap bitmap) {
            IOException iOException = this.f5882b.f8787f;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f5881a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f5849j = recyclableBufferedInputStream.f5847c.length;
            }
        }
    }

    public c(com.bumptech.glide.load.resource.bitmap.a aVar, k5.b bVar) {
        this.f5879a = aVar;
        this.f5880b = bVar;
    }

    @Override // h5.e
    public i<Bitmap> a(InputStream inputStream, int i10, int i11, h5.d dVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z10;
        d6.d dVar2;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream2;
            z10 = false;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream2, this.f5880b);
            z10 = true;
        }
        Queue<d6.d> queue = d6.d.f8785j;
        synchronized (queue) {
            try {
                dVar2 = (d6.d) ((ArrayDeque) queue).poll();
            } finally {
            }
        }
        if (dVar2 == null) {
            dVar2 = new d6.d();
        }
        dVar2.f8786c = recyclableBufferedInputStream;
        j jVar = new j(dVar2);
        a aVar = new a(recyclableBufferedInputStream, dVar2);
        try {
            com.bumptech.glide.load.resource.bitmap.a aVar2 = this.f5879a;
            i<Bitmap> a10 = aVar2.a(new b.C0075b(jVar, aVar2.d, aVar2.f5868c), i10, i11, dVar, aVar);
            dVar2.a();
            if (z10) {
                recyclableBufferedInputStream.c();
            }
            return a10;
        } catch (Throwable th) {
            dVar2.a();
            if (z10) {
                recyclableBufferedInputStream.c();
            }
            throw th;
        }
    }

    @Override // h5.e
    public boolean b(InputStream inputStream, h5.d dVar) {
        Objects.requireNonNull(this.f5879a);
        return true;
    }
}
