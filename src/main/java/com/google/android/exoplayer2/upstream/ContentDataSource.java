package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import j8.c;
import j8.h;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import k8.c0;

/* loaded from: classes.dex */
public final class ContentDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final ContentResolver f6687e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f6688f;

    /* renamed from: g  reason: collision with root package name */
    public AssetFileDescriptor f6689g;

    /* renamed from: h  reason: collision with root package name */
    public FileInputStream f6690h;

    /* renamed from: i  reason: collision with root package name */
    public long f6691i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6692j;

    /* loaded from: classes.dex */
    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f6687e = context.getContentResolver();
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6691i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
        }
        FileInputStream fileInputStream = this.f6690h;
        int i12 = c0.f11939a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f6691i;
        if (j11 != -1) {
            this.f6691i = j11 - read;
        }
        p(read);
        return read;
    }

    @Override // j8.f
    public Uri c() {
        return this.f6688f;
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
            r8 = this;
            r5 = r8
            r7 = 0
            r0 = r7
            r5.f6688f = r0
            r7 = 2000(0x7d0, float:2.803E-42)
            r1 = r7
            r7 = 0
            r2 = r7
            r7 = 2
            java.io.FileInputStream r3 = r5.f6690h     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            r7 = 6
            if (r3 == 0) goto L14
            r7 = 7
            r3.close()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
        L14:
            r7 = 1
            r5.f6690h = r0
            r7 = 2
            r7 = 5
            android.content.res.AssetFileDescriptor r3 = r5.f6689g     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r7 = 2
            if (r3 == 0) goto L21
            r3.close()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
        L21:
            r5.f6689g = r0
            boolean r0 = r5.f6692j
            if (r0 == 0) goto L2d
            r5.f6692j = r2
            r7 = 1
            r5.q()
        L2d:
            return
        L2e:
            r1 = move-exception
            goto L39
        L30:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L2e
            r7 = 4
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2e
            r7 = 2
            throw r4     // Catch: java.lang.Throwable -> L2e
        L39:
            r5.f6689g = r0
            boolean r0 = r5.f6692j
            r7 = 4
            if (r0 == 0) goto L46
            r7 = 6
            r5.f6692j = r2
            r5.q()
        L46:
            r7 = 2
            throw r1
        L48:
            r3 = move-exception
            goto L53
        L4a:
            r3 = move-exception
            r7 = 2
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L48
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L48
            r7 = 3
            throw r4     // Catch: java.lang.Throwable -> L48
        L53:
            r5.f6690h = r0
            r7 = 6
            android.content.res.AssetFileDescriptor r4 = r5.f6689g     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
            r7 = 1
            if (r4 == 0) goto L5f
            r7 = 1
            r4.close()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
        L5f:
            r5.f6689g = r0
            boolean r0 = r5.f6692j
            if (r0 == 0) goto L6b
            r5.f6692j = r2
            r5.q()
            r7 = 5
        L6b:
            throw r3
            r7 = 4
        L6d:
            r1 = move-exception
            goto L77
        L6f:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L6d
            r7 = 4
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L6d
            throw r4     // Catch: java.lang.Throwable -> L6d
        L77:
            r5.f6689g = r0
            boolean r0 = r5.f6692j
            if (r0 == 0) goto L84
            r7 = 4
            r5.f6692j = r2
            r5.q()
            r7 = 7
        L84:
            throw r1
            r7 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.ContentDataSource.close():void");
    }

    @Override // j8.f
    public long j(h hVar) {
        int i10 = FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS;
        try {
            Uri uri = hVar.f11575a;
            this.f6688f = uri;
            r(hVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f6687e.openAssetFileDescriptor(uri, "r");
            this.f6689g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
                sb2.append("Could not open file descriptor for: ");
                sb2.append(valueOf);
                throw new ContentDataSourceException(new IOException(sb2.toString()), FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f6690h = fileInputStream;
            int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i11 != 0 && hVar.f11579f > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(hVar.f11579f + startOffset) - startOffset;
            if (skip == hVar.f11579f) {
                if (i11 == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f6691i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f6691i = position;
                        if (position < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - skip;
                    this.f6691i = j10;
                    if (j10 < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                long j11 = hVar.f11580g;
                if (j11 != -1) {
                    long j12 = this.f6691i;
                    if (j12 != -1) {
                        j11 = Math.min(j12, j11);
                    }
                    this.f6691i = j11;
                }
                this.f6692j = true;
                s(hVar);
                long j13 = hVar.f11580g;
                return j13 != -1 ? j13 : this.f6691i;
            }
            throw new ContentDataSourceException(null, 2008);
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new ContentDataSourceException(e11, i10);
        }
    }
}
