package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import j8.c;
import java.io.IOException;
import java.io.InputStream;
import k8.c0;

/* loaded from: classes.dex */
public final class AssetDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f6682e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f6683f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f6684g;

    /* renamed from: h  reason: collision with root package name */
    public long f6685h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6686i;

    /* loaded from: classes.dex */
    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f6682e = context.getAssets();
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6685h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
        }
        InputStream inputStream = this.f6684g;
        int i12 = c0.f11939a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f6685h;
        if (j11 != -1) {
            this.f6685h = j11 - read;
        }
        p(read);
        return read;
    }

    @Override // j8.f
    public Uri c() {
        return this.f6683f;
    }

    @Override // j8.f
    public void close() {
        this.f6683f = null;
        try {
            try {
                InputStream inputStream = this.f6684g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f6684g = null;
                if (this.f6686i) {
                    this.f6686i = false;
                    q();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
        } catch (Throwable th) {
            this.f6684g = null;
            if (this.f6686i) {
                this.f6686i = false;
                q();
            }
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // j8.f
    public long j(j8.h r13) {
        /*
            r12 = this;
            android.net.Uri r0 = r13.f11575a     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r11 = 5
            r12.f6683f = r0     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r10 = 5
            java.lang.String r8 = r0.getPath()     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r0 = r8
            java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            java.lang.String r8 = "/android_asset/"
            r1 = r8
            boolean r1 = r0.startsWith(r1)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r8 = 1
            r2 = r8
            if (r1 == 0) goto L21
            r1 = 15
            java.lang.String r8 = r0.substring(r1)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r0 = r8
            goto L32
        L21:
            java.lang.String r1 = "/"
            r9 = 6
            boolean r8 = r0.startsWith(r1)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r1 = r8
            if (r1 == 0) goto L31
            r10 = 3
            java.lang.String r8 = r0.substring(r2)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r0 = r8
        L31:
            r10 = 1
        L32:
            r12.r(r13)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r11 = 5
            android.content.res.AssetManager r1 = r12.f6682e     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            java.io.InputStream r0 = r1.open(r0, r2)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r12.f6684g = r0     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            long r3 = r13.f11579f     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r9 = 4
            long r0 = r0.skip(r3)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            long r3 = r13.f11579f     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r9 = 2
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L7c
            r9 = 5
            long r0 = r13.f11580g     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r10 = 3
            r3 = -1
            r9 = 4
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r11 = 3
            if (r5 == 0) goto L5d
            r11 = 7
            r12.f6685h = r0     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r9 = 7
            goto L73
        L5d:
            r11 = 2
            java.io.InputStream r0 = r12.f6684g     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r10 = 7
            int r0 = r0.available()     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            long r0 = (long) r0     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r12.f6685h = r0     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r10 = 3
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L72
            r12.f6685h = r3     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
        L72:
            r9 = 2
        L73:
            r12.f6686i = r2
            r11 = 4
            r12.s(r13)
            long r0 = r12.f6685h
            return r0
        L7c:
            r11 = 1
            r11 = 4
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r13 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r13.<init>(r0, r1)     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
            r9 = 5
            throw r13     // Catch: java.io.IOException -> L88 com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException -> L9d
        L88:
            r13 = move-exception
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r0 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException
            boolean r1 = r13 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L92
            r1 = 2005(0x7d5, float:2.81E-42)
            goto L96
        L92:
            r9 = 7
            r8 = 2000(0x7d0, float:2.803E-42)
            r1 = r8
        L96:
            r0.<init>(r13, r1)
            java.lang.String r9 = "Ⓢⓜⓞⓑ⓸⓺"
            throw r0
            r10 = 4
        L9d:
            r13 = move-exception
            throw r13
            r9 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.AssetDataSource.j(j8.h):long");
    }
}
