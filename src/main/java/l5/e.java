package l5;

import android.util.Log;
import f5.a;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class e implements a {

    /* renamed from: b  reason: collision with root package name */
    public final File f12242b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12243c;

    /* renamed from: e  reason: collision with root package name */
    public f5.a f12244e;
    public final c d = new c();

    /* renamed from: a  reason: collision with root package name */
    public final k f12241a = new k();

    @Deprecated
    public e(File file, long j10) {
        this.f12242b = file;
        this.f12243c = j10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // l5.a
    public void a(h5.b r10, l5.a.b r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.e.a(h5.b, l5.a$b):void");
    }

    @Override // l5.a
    public File b(h5.b bVar) {
        String a10 = this.f12241a.a(bVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a10 + " for for Key: " + bVar);
        }
        try {
            a.e i10 = c().i(a10);
            if (i10 != null) {
                return i10.f9446a[0];
            }
            return null;
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
                return null;
            }
            return null;
        }
    }

    public final synchronized f5.a c() {
        try {
            if (this.f12244e == null) {
                this.f12244e = f5.a.m(this.f12242b, 1, 1, this.f12243c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12244e;
    }
}
