package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d extends MediaDataSource {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f5883c;

    public d(VideoDecoder.d dVar, ByteBuffer byteBuffer) {
        this.f5883c = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.f5883c.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (j10 >= this.f5883c.limit()) {
            return -1;
        }
        this.f5883c.position((int) j10);
        int min = Math.min(i11, this.f5883c.remaining());
        this.f5883c.get(bArr, i10, min);
        return min;
    }
}
