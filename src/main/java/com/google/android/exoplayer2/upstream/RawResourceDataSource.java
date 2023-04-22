package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import j8.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import k8.c0;

/* loaded from: classes.dex */
public final class RawResourceDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final Resources f6712e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6713f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f6714g;

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f6715h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f6716i;

    /* renamed from: j  reason: collision with root package name */
    public long f6717j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6718k;

    /* loaded from: classes.dex */
    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f6712e = context.getResources();
        this.f6713f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(i10);
        return Uri.parse(sb2.toString());
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6717j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(null, e10, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
        }
        InputStream inputStream = this.f6716i;
        int i12 = c0.f11939a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f6717j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
        }
        long j11 = this.f6717j;
        if (j11 != -1) {
            this.f6717j = j11 - read;
        }
        p(read);
        return read;
    }

    @Override // j8.f
    public Uri c() {
        return this.f6714g;
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
    public void close() {
        /*
            r9 = this;
            r5 = r9
            r8 = 0
            r0 = r8
            r5.f6714g = r0
            r7 = 4
            r8 = 2000(0x7d0, float:2.803E-42)
            r1 = r8
            r8 = 0
            r2 = r8
            java.io.InputStream r3 = r5.f6716i     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r8 = 4
            if (r3 == 0) goto L14
            r8 = 1
            r3.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
        L14:
            r8 = 1
            r5.f6716i = r0
            r7 = 3
            r7 = 6
            android.content.res.AssetFileDescriptor r3 = r5.f6715h     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            r8 = 2
            if (r3 == 0) goto L21
            r3.close()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
        L21:
            r7 = 6
            r5.f6715h = r0
            boolean r0 = r5.f6718k
            if (r0 == 0) goto L2f
            r7 = 3
            r5.f6718k = r2
            r5.q()
            r8 = 2
        L2f:
            return
        L30:
            r1 = move-exception
            goto L3c
        L32:
            r3 = move-exception
            r8 = 2
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L30
            r7 = 1
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L30
            r7 = 7
            throw r4     // Catch: java.lang.Throwable -> L30
        L3c:
            r5.f6715h = r0
            r8 = 6
            boolean r0 = r5.f6718k
            if (r0 == 0) goto L4b
            r8 = 6
            r5.f6718k = r2
            r7 = 5
            r5.q()
            r7 = 6
        L4b:
            r8 = 6
            throw r1
            r7 = 7
        L4e:
            r3 = move-exception
            goto L59
        L50:
            r3 = move-exception
            r8 = 5
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r8 = 4
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L59:
            r5.f6716i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f6715h     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
            r7 = 3
            if (r4 == 0) goto L64
            r8 = 6
            r4.close()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78
        L64:
            r8 = 3
            r5.f6715h = r0
            r8 = 4
            boolean r0 = r5.f6718k
            if (r0 == 0) goto L73
            r8 = 2
            r5.f6718k = r2
            r7 = 6
            r5.q()
        L73:
            r8 = 2
            throw r3
            r8 = 7
        L76:
            r1 = move-exception
            goto L7f
        L78:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L76
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L76
            throw r4     // Catch: java.lang.Throwable -> L76
        L7f:
            r5.f6715h = r0
            boolean r0 = r5.f6718k
            if (r0 == 0) goto L8c
            r7 = 3
            r5.f6718k = r2
            r8 = 3
            r5.q()
        L8c:
            r8 = 2
            throw r1
            r8 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (r3.matches("\\d+") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    @Override // j8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j(j8.h r18) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.j(j8.h):long");
    }
}
