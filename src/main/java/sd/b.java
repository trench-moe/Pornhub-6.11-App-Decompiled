package sd;

import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.MalformedChunkCodingException;
import cz.msebera.android.httpclient.TruncatedChunkException;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0186;

/* loaded from: classes2.dex */
public class b extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public final td.b f14962c;

    /* renamed from: f  reason: collision with root package name */
    public final CharArrayBuffer f14963f;

    /* renamed from: j  reason: collision with root package name */
    public final od.a f14964j;

    /* renamed from: m  reason: collision with root package name */
    public int f14965m;
    public long n;

    /* renamed from: t  reason: collision with root package name */
    public long f14966t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14967u = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14968w = false;
    public md.d[] y = new md.d[0];

    public b(td.b bVar, od.a aVar) {
        l9.e.l(bVar, "Session input buffer");
        this.f14962c = bVar;
        this.f14966t = 0L;
        this.f14963f = new CharArrayBuffer(16);
        this.f14964j = aVar == null ? od.a.f13635j : aVar;
        this.f14965m = 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final long a() {
        /*
            r8 = this;
            r4 = r8
            int r0 = r4.f14965m
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r1 = -1
            java.lang.String r6 = "Ⓢⓜⓞⓑ⓸⓺"
            r7 = 1
            r2 = r7
            if (r0 == r2) goto L4b
            r3 = 3
            if (r0 != r3) goto L41
            cz.msebera.android.httpclient.util.CharArrayBuffer r0 = r4.f14963f
            r0.clear()
            td.b r0 = r4.f14962c
            r6 = 7
            cz.msebera.android.httpclient.util.CharArrayBuffer r3 = r4.f14963f
            int r6 = r0.c(r3)
            r0 = r6
            if (r0 == r1) goto L38
            cz.msebera.android.httpclient.util.CharArrayBuffer r0 = r4.f14963f
            r6 = 3
            boolean r0 = r0.j()
            if (r0 == 0) goto L2e
            r7 = 2
            r4.f14965m = r2
            r7 = 3
            goto L4b
        L2e:
            cz.msebera.android.httpclient.MalformedChunkCodingException r0 = new cz.msebera.android.httpclient.MalformedChunkCodingException
            r7 = 4
            java.lang.String r6 = "Unexpected content at the end of chunk"
            r1 = r6
            r0.<init>(r1)
            throw r0
        L38:
            cz.msebera.android.httpclient.MalformedChunkCodingException r0 = new cz.msebera.android.httpclient.MalformedChunkCodingException
            java.lang.String r1 = "CRLF expected at end of chunk"
            r0.<init>(r1)
            r7 = 6
            throw r0
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Inconsistent codec state"
            r0.<init>(r1)
            r7 = 7
            throw r0
            r6 = 1
        L4b:
            cz.msebera.android.httpclient.util.CharArrayBuffer r0 = r4.f14963f
            r0.clear()
            r7 = 3
            td.b r0 = r4.f14962c
            java.lang.String r7 = "Ⓢⓜⓞⓑ⓸⓺"
            cz.msebera.android.httpclient.util.CharArrayBuffer r2 = r4.f14963f
            int r0 = r0.c(r2)
            if (r0 == r1) goto L93
            cz.msebera.android.httpclient.util.CharArrayBuffer r0 = r4.f14963f
            r6 = 6
            r1 = 59
            r6 = 5
            int r6 = r0.h(r1)
            r0 = r6
            if (r0 >= 0) goto L72
            r7 = 1
            cz.msebera.android.httpclient.util.CharArrayBuffer r0 = r4.f14963f
            r7 = 7
            int r0 = r0.length()
        L72:
            r7 = 4
            cz.msebera.android.httpclient.util.CharArrayBuffer r1 = r4.f14963f
            r2 = 0
            r7 = 2
            java.lang.String r0 = r1.l(r2, r0)
            r7 = 16
            r1 = r7
            r6 = 3
            long r0 = java.lang.Long.parseLong(r0, r1)     // Catch: java.lang.NumberFormatException -> L84
            return r0
        L84:
            cz.msebera.android.httpclient.MalformedChunkCodingException r1 = new cz.msebera.android.httpclient.MalformedChunkCodingException
            r6 = 7
            java.lang.String r2 = "Bad chunk header: "
            r6 = 2
            java.lang.String r0 = a1.a.l(r2, r0)
            r1.<init>(r0)
            r7 = 7
            throw r1
        L93:
            r7 = 3
            cz.msebera.android.httpclient.ConnectionClosedException r0 = new cz.msebera.android.httpclient.ConnectionClosedException
            r7 = 6
            java.lang.String r6 = "Premature end of chunk coded message body: closing chunk expected"
            r1 = r6
            r0.<init>(r1)
            r6 = 4
            throw r0
            r6 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.b.a():long");
    }

    @Override // java.io.InputStream
    public int available() {
        td.b bVar = this.f14962c;
        if (bVar instanceof td.a) {
            return (int) Math.min(((td.a) bVar).length(), this.n - this.f14966t);
        }
        return 0;
    }

    public final void c() {
        if (this.f14965m == Integer.MAX_VALUE) {
            throw new MalformedChunkCodingException("Corrupt data stream");
        }
        try {
            long a10 = a();
            this.n = a10;
            if (a10 < 0) {
                throw new MalformedChunkCodingException("Negative chunk size");
            }
            this.f14965m = 2;
            this.f14966t = 0L;
            if (a10 == 0) {
                this.f14967u = true;
                d();
            }
        } catch (MalformedChunkCodingException e10) {
            this.f14965m = IntCompanionObject.MAX_VALUE;
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14968w) {
            return;
        }
        try {
            if (this.f14967u || this.f14965m == Integer.MAX_VALUE) {
                this.f14967u = true;
                this.f14968w = true;
            }
            do {
            } while (read(new byte[InterfaceC0186.f43]) >= 0);
            this.f14967u = true;
            this.f14968w = true;
        } catch (Throwable th) {
            this.f14967u = true;
            this.f14968w = true;
            throw th;
        }
    }

    public final void d() {
        try {
            td.b bVar = this.f14962c;
            od.a aVar = this.f14964j;
            this.y = a.b(bVar, aVar.f13637f, aVar.f13636c, ud.g.f15865b, new ArrayList());
        } catch (HttpException e10) {
            StringBuilder m10 = a1.a.m("Invalid footer: ");
            m10.append(e10.getMessage());
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException(m10.toString());
            malformedChunkCodingException.initCause(e10);
            throw malformedChunkCodingException;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f14968w) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f14967u) {
            return -1;
        }
        if (this.f14965m != 2) {
            c();
            if (this.f14967u) {
                return -1;
            }
        }
        int b10 = this.f14962c.b();
        if (b10 != -1) {
            long j10 = this.f14966t + 1;
            this.f14966t = j10;
            if (j10 >= this.n) {
                this.f14965m = 3;
            }
        }
        return b10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f14968w) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f14967u) {
            return -1;
        }
        if (this.f14965m != 2) {
            c();
            if (this.f14967u) {
                return -1;
            }
        }
        int a10 = this.f14962c.a(bArr, i10, (int) Math.min(i11, this.n - this.f14966t));
        if (a10 == -1) {
            this.f14967u = true;
            throw new TruncatedChunkException("Truncated chunk (expected size: %,d; actual size: %,d)", Long.valueOf(this.n), Long.valueOf(this.f14966t));
        }
        long j10 = this.f14966t + a10;
        this.f14966t = j10;
        if (j10 >= this.n) {
            this.f14965m = 3;
        }
        return a10;
    }
}
