package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;
import k8.c0;
import y6.m;

/* loaded from: classes.dex */
public final class b {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a  reason: collision with root package name */
    public final a f5991a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f5992b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f5993c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f5994e;

    /* renamed from: f  reason: collision with root package name */
    public m f5995f;

    /* renamed from: g  reason: collision with root package name */
    public int f5996g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5997h;

    /* renamed from: i  reason: collision with root package name */
    public long f5998i;

    /* renamed from: j  reason: collision with root package name */
    public float f5999j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6000k;

    /* renamed from: l  reason: collision with root package name */
    public long f6001l;

    /* renamed from: m  reason: collision with root package name */
    public long f6002m;
    public Method n;

    /* renamed from: o  reason: collision with root package name */
    public long f6003o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6004p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6005q;

    /* renamed from: r  reason: collision with root package name */
    public long f6006r;

    /* renamed from: s  reason: collision with root package name */
    public long f6007s;

    /* renamed from: t  reason: collision with root package name */
    public long f6008t;

    /* renamed from: u  reason: collision with root package name */
    public long f6009u;

    /* renamed from: v  reason: collision with root package name */
    public int f6010v;

    /* renamed from: w  reason: collision with root package name */
    public int f6011w;

    /* renamed from: x  reason: collision with root package name */
    public long f6012x;
    public long y;

    /* renamed from: z  reason: collision with root package name */
    public long f6013z;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public b(a aVar) {
        this.f5991a = aVar;
        if (c0.f11939a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f5992b = new long[10];
    }

    public final long a(long j10) {
        return (j10 * 1000000) / this.f5996g;
    }

    public final long b() {
        AudioTrack audioTrack = this.f5993c;
        Objects.requireNonNull(audioTrack);
        if (this.f6012x != -9223372036854775807L) {
            return Math.min(this.A, this.f6013z + ((((SystemClock.elapsedRealtime() * 1000) - this.f6012x) * this.f5996g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f5997h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6009u = this.f6007s;
            }
            playbackHeadPosition += this.f6009u;
        }
        if (c0.f11939a <= 29) {
            if (playbackHeadPosition == 0 && this.f6007s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.f6007s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.f6007s > playbackHeadPosition) {
            this.f6008t++;
        }
        this.f6007s = playbackHeadPosition;
        return playbackHeadPosition + (this.f6008t << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(long r10) {
        /*
            r9 = this;
            long r0 = r9.b()
            r2 = 0
            r5 = 1
            r3 = r5
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 > 0) goto L32
            r8 = 6
            boolean r10 = r9.f5997h
            if (r10 == 0) goto L2d
            android.media.AudioTrack r10 = r9.f5993c
            r8 = 5
            java.util.Objects.requireNonNull(r10)
            int r10 = r10.getPlayState()
            r11 = 2
            r8 = 1
            if (r10 != r11) goto L2d
            long r10 = r9.b()
            r0 = 0
            r8 = 6
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r7 = 5
            if (r4 != 0) goto L2d
            r5 = 1
            r10 = r5
            goto L30
        L2d:
            r8 = 3
            r5 = 0
            r10 = r5
        L30:
            if (r10 == 0) goto L34
        L32:
            r7 = 2
            r2 = 1
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.b.c(long):boolean");
    }

    public void d() {
        this.f6001l = 0L;
        this.f6011w = 0;
        this.f6010v = 0;
        this.f6002m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f6000k = false;
        this.f5993c = null;
        this.f5995f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.media.AudioTrack r6, boolean r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            r2 = r5
            r2.f5993c = r6
            r4 = 7
            r2.d = r9
            r2.f5994e = r10
            y6.m r0 = new y6.m
            r4 = 4
            r0.<init>(r6)
            r4 = 6
            r2.f5995f = r0
            r4 = 5
            int r4 = r6.getSampleRate()
            r6 = r4
            r2.f5996g = r6
            r6 = 1
            r4 = 2
            r4 = 0
            r0 = r4
            if (r7 == 0) goto L37
            int r7 = k8.c0.f11939a
            r4 = 3
            r1 = 23
            r4 = 2
            if (r7 >= r1) goto L32
            r7 = 5
            r4 = 2
            if (r8 == r7) goto L2f
            r4 = 7
            r7 = 6
            if (r8 != r7) goto L32
        L2f:
            r7 = 1
            r4 = 7
            goto L33
        L32:
            r7 = 0
        L33:
            if (r7 == 0) goto L37
            r4 = 3
            goto L3a
        L37:
            r4 = 4
            r6 = 0
            r4 = 5
        L3a:
            r2.f5997h = r6
            boolean r6 = k8.c0.y(r8)
            r2.f6005q = r6
            r4 = 4
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 1
            if (r6 == 0) goto L53
            int r10 = r10 / r9
            long r9 = (long) r10
            r4 = 2
            long r9 = r2.a(r9)
            goto L55
        L53:
            r4 = 5
            r9 = r7
        L55:
            r2.f5998i = r9
            r9 = 0
            r2.f6007s = r9
            r2.f6008t = r9
            r4 = 4
            r2.f6009u = r9
            r2.f6004p = r0
            r4 = 4
            r2.f6012x = r7
            r4 = 3
            r2.y = r7
            r2.f6006r = r9
            r4 = 1
            r2.f6003o = r9
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = r4
            r2.f5999j = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.b.e(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
