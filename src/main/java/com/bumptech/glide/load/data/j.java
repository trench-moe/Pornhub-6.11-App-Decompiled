package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: t  reason: collision with root package name */
    public static final b f5698t = new a();

    /* renamed from: c  reason: collision with root package name */
    public final n5.f f5699c;

    /* renamed from: f  reason: collision with root package name */
    public final int f5700f;

    /* renamed from: j  reason: collision with root package name */
    public HttpURLConnection f5701j;

    /* renamed from: m  reason: collision with root package name */
    public InputStream f5702m;
    public volatile boolean n;

    /* loaded from: classes.dex */
    public static class a implements b {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public j(n5.f fVar, int i10) {
        this.f5699c = fVar;
        this.f5700f = i10;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    @Override // com.bumptech.glide.load.data.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.f5702m
            if (r0 == 0) goto Lb
            r3 = 5
            r0.close()     // Catch: java.io.IOException -> L9
            goto Lc
        L9:
            r3 = 7
        Lb:
            r3 = 1
        Lc:
            java.net.HttpURLConnection r0 = r4.f5701j
            if (r0 == 0) goto L15
            r2 = 5
            r0.disconnect()
            r3 = 7
        L15:
            r0 = 0
            r4.f5701j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.j.b():void");
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.n = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public DataSource d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(Priority priority, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        int i10 = d6.h.f8793b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(f(this.f5699c.d(), 0, null, this.f5699c.f13317b.a()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
                sb2 = new StringBuilder();
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(d6.h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder m10 = a1.a.m("Finished http url fetcher fetch in ");
                m10.append(d6.h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", m10.toString());
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
    public final java.io.InputStream f(java.net.URL r12, int r13, java.net.URL r14, java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.j.f(java.net.URL, int, java.net.URL, java.util.Map):java.io.InputStream");
    }
}
