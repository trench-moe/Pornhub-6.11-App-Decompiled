package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import j8.c;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class UdpDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public final int f6719e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f6720f;

    /* renamed from: g  reason: collision with root package name */
    public final DatagramPacket f6721g;

    /* renamed from: h  reason: collision with root package name */
    public Uri f6722h;

    /* renamed from: i  reason: collision with root package name */
    public DatagramSocket f6723i;

    /* renamed from: j  reason: collision with root package name */
    public MulticastSocket f6724j;

    /* renamed from: k  reason: collision with root package name */
    public InetAddress f6725k;

    /* renamed from: l  reason: collision with root package name */
    public InetSocketAddress f6726l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6727m;
    public int n;

    /* loaded from: classes.dex */
    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f6719e = 8000;
        byte[] bArr = new byte[FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS];
        this.f6720f = bArr;
        this.f6721g = new DatagramPacket(bArr, 0, (int) FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.f6723i.receive(this.f6721g);
                int length = this.f6721g.getLength();
                this.n = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f6721g.getLength();
        int i12 = this.n;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f6720f, length2 - i12, bArr, i10, min);
        this.n -= min;
        return min;
    }

    @Override // j8.f
    public Uri c() {
        return this.f6722h;
    }

    @Override // j8.f
    public void close() {
        this.f6722h = null;
        MulticastSocket multicastSocket = this.f6724j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f6725k);
            } catch (IOException unused) {
            }
            this.f6724j = null;
        }
        DatagramSocket datagramSocket = this.f6723i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f6723i = null;
        }
        this.f6725k = null;
        this.f6726l = null;
        this.n = 0;
        if (this.f6727m) {
            this.f6727m = false;
            q();
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
    public long j(j8.h r7) {
        /*
            r6 = this;
            r3 = r6
            android.net.Uri r0 = r7.f11575a
            r5 = 7
            r3.f6722h = r0
            java.lang.String r0 = r0.getHost()
            android.net.Uri r1 = r3.f6722h
            r5 = 5
            int r5 = r1.getPort()
            r1 = r5
            r3.r(r7)
            r5 = 1
            r5 = 5
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r0)     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r0 = r5
            r3.f6725k = r0     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 7
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            java.net.InetAddress r2 = r3.f6725k     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 4
            r0.<init>(r2, r1)     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 5
            r3.f6726l = r0     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 5
            java.net.InetAddress r0 = r3.f6725k     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            boolean r0 = r0.isMulticastAddress()     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            if (r0 == 0) goto L4c
            r5 = 2
            java.net.MulticastSocket r0 = new java.net.MulticastSocket     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            java.net.InetSocketAddress r1 = r3.f6726l     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r0.<init>(r1)     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 2
            r3.f6724j = r0     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 7
            java.net.InetAddress r1 = r3.f6725k     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 5
            r0.joinGroup(r1)     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 7
            java.net.MulticastSocket r0 = r3.f6724j     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r3.f6723i = r0     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 6
            goto L57
        L4c:
            r5 = 7
            java.net.DatagramSocket r0 = new java.net.DatagramSocket     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 1
            java.net.InetSocketAddress r1 = r3.f6726l     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r0.<init>(r1)     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r3.f6723i = r0     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
        L57:
            java.net.DatagramSocket r0 = r3.f6723i     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 2
            int r1 = r3.f6719e     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 2
            r0.setSoTimeout(r1)     // Catch: java.io.IOException -> L6b java.lang.SecurityException -> L77
            r5 = 1
            r0 = r5
            r3.f6727m = r0
            r5 = 1
            r3.s(r7)
            r0 = -1
            return r0
        L6b:
            r7 = move-exception
            com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException r0 = new com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException
            r5 = 2001(0x7d1, float:2.804E-42)
            r1 = r5
            r0.<init>(r7, r1)
            r5 = 4
            throw r0
            r5 = 7
        L77:
            r7 = move-exception
            com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException r0 = new com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException
            r1 = 2006(0x7d6, float:2.811E-42)
            r5 = 6
            r0.<init>(r7, r1)
            throw r0
            r5 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.UdpDataSource.j(j8.h):long");
    }
}
