package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import h5.c;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class VideoDecoder<T> implements h5.e<T, Bitmap> {
    public static final h5.c<Long> d = new h5.c<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final h5.c<Integer> f5852e = new h5.c<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f5853f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f5854a;

    /* renamed from: b  reason: collision with root package name */
    public final k5.c f5855b;

    /* renamed from: c  reason: collision with root package name */
    public final e f5856c;

    /* loaded from: classes.dex */
    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* loaded from: classes.dex */
    public class a implements c.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5857a = ByteBuffer.allocate(8);

        @Override // h5.c.b
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            Long l11 = l10;
            messageDigest.update(bArr);
            synchronized (this.f5857a) {
                this.f5857a.position(0);
                messageDigest.update(this.f5857a.putLong(l11.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements c.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5858a = ByteBuffer.allocate(4);

        @Override // h5.c.b
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f5858a) {
                this.f5858a.position(0);
                messageDigest.update(this.f5858a.putInt(num2.intValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new com.bumptech.glide.load.resource.bitmap.d(this, byteBuffer));
        }
    }

    /* loaded from: classes.dex */
    public static class e {
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t2);
    }

    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.f
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(k5.c cVar, f<T> fVar) {
        e eVar = f5853f;
        this.f5855b = cVar;
        this.f5854a = fVar;
        this.f5856c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30202(0x75fa, float:4.2322E-41)
            r1 = 27
            if (r0 < r1) goto L69
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L69
            if (r14 == r0) goto L69
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.d
            if (r15 == r0) goto L69
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L59
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L59
            r1 = 758(0x2f6, float:1.062E-42)
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L59
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L59
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L59
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L59
            r3 = 90
            if (r2 == r3) goto L3c
            r3 = 17262(0x436e, float:2.4189E-41)
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L3f
        L3c:
            r8 = r1
            r1 = r0
            r0 = r8
        L3f:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L59
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L59
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L59
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L59
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L59
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L59
            goto L6b
        L59:
            r13 = move-exception
            r14 = 2
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L69
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L69:
            r13 = 0
            r13 = 0
        L6b:
            if (r13 != 0) goto L71
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L71:
            if (r13 == 0) goto L74
            return r13
        L74:
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException r9 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.c(android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // h5.e
    public j5.i<android.graphics.Bitmap> a(T r12, int r13, int r14, h5.d r15) {
        /*
            r11 = this;
            h5.c<java.lang.Long> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.d
            java.lang.String r10 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.Object r9 = r15.c(r0)
            r0 = r9
            java.lang.Long r0 = (java.lang.Long) r0
            r10 = 7
            long r2 = r0.longValue()
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r10 = 7
            if (r4 >= 0) goto L31
            r10 = 4
            r0 = -1
            r10 = 2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r10 = 7
            if (r4 != 0) goto L22
            r10 = 4
            goto L31
        L22:
            r10 = 6
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            r13 = r9
            java.lang.String r13 = android.support.v4.media.b.h(r13, r2)
            r12.<init>(r13)
            throw r12
            r10 = 6
        L31:
            h5.c<java.lang.Integer> r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.f5852e
            java.lang.Object r9 = r15.c(r0)
            r0 = r9
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L43
            r9 = 2
            r0 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = r9
        L43:
            r10 = 4
            h5.c<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f5842f
            java.lang.Object r9 = r15.c(r1)
            r15 = r9
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) r15
            if (r15 != 0) goto L52
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f5841e
            r10 = 7
        L52:
            r10 = 3
            r7 = r15
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$e r15 = r11.f5856c
            r10 = 4
            java.util.Objects.requireNonNull(r15)
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever
            r15.<init>()
            r8 = 29
            r10 = 7
            r10 = 7
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$f<T> r1 = r11.f5854a     // Catch: java.lang.Throwable -> L89
            r1.a(r15, r12)     // Catch: java.lang.Throwable -> L89
            r10 = 2
            int r9 = r0.intValue()     // Catch: java.lang.Throwable -> L89
            r4 = r9
            r1 = r15
            r5 = r13
            r6 = r14
            android.graphics.Bitmap r9 = c(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L89
            r12 = r9
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r8) goto L7f
            r10 = 1
            r15.close()
            goto L82
        L7f:
            r15.release()
        L82:
            k5.c r13 = r11.f5855b
            q5.d r12 = q5.d.e(r12, r13)
            return r12
        L89:
            r12 = move-exception
            int r13 = android.os.Build.VERSION.SDK_INT
            r10 = 4
            if (r13 < r8) goto L94
            r10 = 5
            r15.close()
            goto L98
        L94:
            r10 = 1
            r15.release()
        L98:
            throw r12
            r10 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.a(java.lang.Object, int, int, h5.d):j5.i");
    }

    @Override // h5.e
    public boolean b(T t2, h5.d dVar) {
        return true;
    }
}
