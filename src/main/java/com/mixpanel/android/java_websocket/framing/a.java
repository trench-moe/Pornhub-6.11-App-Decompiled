package com.mixpanel.android.java_websocket.framing;

import com.appsflyer.oaid.BuildConfig;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a extends c implements zc.a {

    /* renamed from: h  reason: collision with root package name */
    public static final ByteBuffer f8150h = ByteBuffer.allocate(0);

    /* renamed from: f  reason: collision with root package name */
    public int f8151f;

    /* renamed from: g  reason: collision with root package name */
    public String f8152g;

    public a() {
        super(Framedata.Opcode.CLOSING);
        this.f8154a = true;
    }

    public a(int i10) {
        super(Framedata.Opcode.CLOSING);
        this.f8154a = true;
        h(i10, BuildConfig.FLAVOR);
    }

    public a(int i10, String str) {
        super(Framedata.Opcode.CLOSING);
        this.f8154a = true;
        h(i10, str);
    }

    @Override // zc.a
    public String a() {
        return this.f8152g;
    }

    @Override // zc.a
    public int e() {
        return this.f8151f;
    }

    @Override // com.mixpanel.android.java_websocket.framing.c, com.mixpanel.android.java_websocket.framing.Framedata
    public ByteBuffer f() {
        return this.f8151f == 1005 ? f8150h : this.f8156c;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.mixpanel.android.java_websocket.framing.c, com.mixpanel.android.java_websocket.framing.b
    public void g(java.nio.ByteBuffer r7) {
        /*
            r6 = this;
            r6.f8156c = r7
            r5 = 5
            r0 = 1005(0x3ed, float:1.408E-42)
            r6.f8151f = r0
            r5 = 7
            r7.mark()
            int r4 = r7.remaining()
            r1 = r4
            r4 = 2
            r2 = r4
            if (r1 < r2) goto L64
            r4 = 4
            r1 = r4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r1)
            r1 = r4
            r1.position(r2)
            short r3 = r7.getShort()
            r1.putShort(r3)
            r4 = 0
            r3 = r4
            r1.position(r3)
            int r1 = r1.getInt()
            r6.f8151f = r1
            r3 = 1006(0x3ee, float:1.41E-42)
            if (r1 == r3) goto L4b
            r5 = 2
            r3 = 1015(0x3f7, float:1.422E-42)
            r5 = 2
            if (r1 == r3) goto L4b
            if (r1 == r0) goto L4b
            r5 = 1
            r4 = 4999(0x1387, float:7.005E-42)
            r3 = r4
            if (r1 > r3) goto L4b
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r3) goto L4b
            r3 = 1004(0x3ec, float:1.407E-42)
            if (r1 == r3) goto L4b
            goto L64
        L4b:
            r5 = 1
            com.mixpanel.android.java_websocket.exceptions.InvalidFrameException r7 = new com.mixpanel.android.java_websocket.exceptions.InvalidFrameException
            java.lang.String r0 = "closecode must not be sent over the wire: "
            r5 = 4
            java.lang.StringBuilder r0 = a1.a.m(r0)
            int r1 = r6.f8151f
            r5 = 6
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
            r5 = 7
        L64:
            r7.reset()
            int r7 = r6.f8151f
            r5 = 3
            if (r7 != r0) goto L77
            java.nio.ByteBuffer r7 = r6.f8156c
            r5 = 7
            java.lang.String r4 = bd.b.a(r7)
            r7 = r4
            r6.f8152g = r7
            goto L91
        L77:
            java.nio.ByteBuffer r7 = r6.f8156c
            r5 = 3
            int r4 = r7.position()
            r0 = r4
            int r4 = r7.position()     // Catch: java.lang.Throwable -> L92 java.lang.IllegalArgumentException -> L94
            r1 = r4
            int r1 = r1 + r2
            r7.position(r1)     // Catch: java.lang.Throwable -> L92 java.lang.IllegalArgumentException -> L94
            java.lang.String r1 = bd.b.a(r7)     // Catch: java.lang.Throwable -> L92 java.lang.IllegalArgumentException -> L94
            r6.f8152g = r1     // Catch: java.lang.Throwable -> L92 java.lang.IllegalArgumentException -> L94
            r7.position(r0)
        L91:
            return
        L92:
            r1 = move-exception
            goto L9c
        L94:
            r1 = move-exception
            com.mixpanel.android.java_websocket.exceptions.InvalidFrameException r2 = new com.mixpanel.android.java_websocket.exceptions.InvalidFrameException     // Catch: java.lang.Throwable -> L92
            r5 = 2
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L92
            throw r2     // Catch: java.lang.Throwable -> L92
        L9c:
            r7.position(r0)
            throw r1
            r5 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.java_websocket.framing.a.g(java.nio.ByteBuffer):void");
    }

    public final void h(int i10, String str) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (i10 == 1015) {
            i10 = 1005;
        } else {
            str2 = str;
        }
        if (i10 == 1005) {
            if (str2.length() > 0) {
                throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        byte[] b10 = bd.b.b(str2);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(b10.length + 2);
        allocate2.put(allocate);
        allocate2.put(b10);
        allocate2.rewind();
        g(allocate2);
    }

    @Override // com.mixpanel.android.java_websocket.framing.c
    public String toString() {
        return super.toString() + "code: " + this.f8151f;
    }
}
