package y7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k8.c0;
import w6.y;
import w6.z;

/* loaded from: classes2.dex */
public final class j extends w6.f implements Handler.Callback {
    public final Handler B;
    public final i C;
    public final f D;
    public final z E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public y J;
    public e K;
    public g L;
    public h M;
    public h N;
    public int O;
    public long P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, Looper looper) {
        super(3);
        Handler handler;
        f fVar = f.f18542a;
        Objects.requireNonNull(iVar);
        this.C = iVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = c0.f11939a;
            handler = new Handler(looper, this);
        }
        this.B = handler;
        this.D = fVar;
        this.E = new z(0);
        this.P = -9223372036854775807L;
    }

    @Override // w6.f
    public void C() {
        this.J = null;
        this.P = -9223372036854775807L;
        K();
        O();
        e eVar = this.K;
        Objects.requireNonNull(eVar);
        eVar.a();
        this.K = null;
        this.I = 0;
    }

    @Override // w6.f
    public void E(long j10, boolean z10) {
        K();
        this.F = false;
        this.G = false;
        this.P = -9223372036854775807L;
        if (this.I != 0) {
            P();
            return;
        }
        O();
        e eVar = this.K;
        Objects.requireNonNull(eVar);
        eVar.flush();
    }

    @Override // w6.f
    public void I(y[] yVarArr, long j10, long j11) {
        this.J = yVarArr[0];
        if (this.K != null) {
            this.I = 1;
        } else {
            N();
        }
    }

    public final void K() {
        List<a> emptyList = Collections.emptyList();
        Handler handler = this.B;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.C.R(emptyList);
        }
    }

    public final long L() {
        if (this.O == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.M);
        int i10 = this.O;
        d dVar = this.M.f18543j;
        Objects.requireNonNull(dVar);
        if (i10 >= dVar.e()) {
            return Long.MAX_VALUE;
        }
        h hVar = this.M;
        int i11 = this.O;
        d dVar2 = hVar.f18543j;
        Objects.requireNonNull(dVar2);
        return dVar2.c(i11) + hVar.f18544m;
    }

    public final void M(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.J);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(valueOf);
        k8.a.i("TextRenderer", sb2.toString(), subtitleDecoderException);
        K();
        P();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
        if (r1.equals("application/pgs") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.j.N():void");
    }

    public final void O() {
        this.L = null;
        this.O = -1;
        h hVar = this.M;
        if (hVar != null) {
            hVar.l();
            this.M = null;
        }
        h hVar2 = this.N;
        if (hVar2 != null) {
            hVar2.l();
            this.N = null;
        }
    }

    public final void P() {
        O();
        e eVar = this.K;
        Objects.requireNonNull(eVar);
        eVar.a();
        this.K = null;
        this.I = 0;
        N();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    @Override // w6.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(w6.y r9) {
        /*
            r8 = this;
            y7.f r0 = r8.D
            y7.f$a r0 = (y7.f.a) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = r9.B
            r6 = 3
            java.lang.String r4 = "text/vtt"
            r1 = r4
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            r7 = 4
            if (r1 != 0) goto L7d
            r7 = 7
            java.lang.String r4 = "text/x-ssa"
            r1 = r4
            boolean r4 = r1.equals(r0)
            r1 = r4
            if (r1 != 0) goto L7d
            java.lang.String r4 = "application/ttml+xml"
            r1 = r4
            boolean r4 = r1.equals(r0)
            r1 = r4
            if (r1 != 0) goto L7d
            r5 = 6
            java.lang.String r4 = "application/x-mp4-vtt"
            r1 = r4
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7d
            java.lang.String r1 = "application/x-subrip"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7d
            r6 = 2
            java.lang.String r1 = "application/x-quicktime-tx3g"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7d
            r5 = 3
            java.lang.String r4 = "application/cea-608"
            r1 = r4
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7d
            java.lang.String r4 = "application/x-mp4-cea-608"
            r1 = r4
            boolean r4 = r1.equals(r0)
            r1 = r4
            if (r1 != 0) goto L7d
            java.lang.String r1 = "application/cea-708"
            boolean r4 = r1.equals(r0)
            r1 = r4
            if (r1 != 0) goto L7d
            r7 = 2
            java.lang.String r4 = "application/dvbsubs"
            r1 = r4
            boolean r4 = r1.equals(r0)
            r1 = r4
            if (r1 != 0) goto L7d
            r6 = 7
            java.lang.String r1 = "application/pgs"
            boolean r4 = r1.equals(r0)
            r0 = r4
            if (r0 == 0) goto L7a
            r7 = 4
            goto L7e
        L7a:
            r0 = 0
            r5 = 4
            goto L80
        L7d:
            r7 = 3
        L7e:
            r0 = 1
            r6 = 1
        L80:
            if (r0 == 0) goto L91
            r5 = 7
            java.lang.Class<? extends b7.h> r9 = r9.U
            if (r9 != 0) goto L8a
            r9 = 4
            r6 = 5
            goto L8c
        L8a:
            r6 = 7
            r9 = 2
        L8c:
            r9 = r9 | r3
            r5 = 6
            r9 = r9 | r3
            r5 = 5
            return r9
        L91:
            r5 = 7
            java.lang.String r9 = r9.B
            boolean r9 = k8.p.i(r9)
            if (r9 == 0) goto L9b
            return r2
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.j.c(w6.y):int");
    }

    @Override // w6.q0
    public boolean d() {
        return this.G;
    }

    @Override // w6.q0
    public boolean f() {
        return true;
    }

    @Override // w6.q0, w6.r0
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.C.R((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104 A[EXC_TOP_SPLITTER, LOOP:1: B:97:0x0104->B:108:0x0104, LOOP_START, SYNTHETIC] */
    @Override // w6.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(long r11, long r13) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.j.q(long, long):void");
    }
}
