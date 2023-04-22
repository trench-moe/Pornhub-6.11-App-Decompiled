package k7;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import k7.h;
import k8.t;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import w6.y;

/* loaded from: classes2.dex */
public final class g extends h {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f11908o = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean n;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    @Override // k7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c(k8.t r11) {
        /*
            r10 = this;
            r6 = r10
            byte[] r11 = r11.f12009a
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r8 = 0
            r0 = r8
            r0 = r11[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r8 = 5
            r1 = r0 & 3
            r9 = 3
            r9 = 2
            r2 = r9
            r3 = 1
            r8 = 2
            if (r1 == 0) goto L21
            r9 = 3
            if (r1 == r3) goto L24
            if (r1 == r2) goto L24
            r8 = 6
            r11 = r11[r3]
            r2 = r11 & 63
            r8 = 1
            goto L25
        L21:
            r9 = 3
            r2 = 1
            r9 = 2
        L24:
            r8 = 5
        L25:
            r11 = 3
            r8 = 7
            int r0 = r0 >> r11
            r9 = 7
            r1 = r0 & 3
            r9 = 2
            r4 = 16
            r9 = 6
            if (r0 < r4) goto L38
            r8 = 7
            r11 = 2500(0x9c4, float:3.503E-42)
            r8 = 5
            int r11 = r11 << r1
            r8 = 4
            goto L52
        L38:
            r9 = 12
            r4 = r9
            r5 = 10000(0x2710, float:1.4013E-41)
            r8 = 5
            if (r0 < r4) goto L46
            r11 = r1 & 1
            int r11 = r5 << r11
            r9 = 3
            goto L52
        L46:
            if (r1 != r11) goto L4e
            r8 = 2
            r11 = 60000(0xea60, float:8.4078E-41)
            r8 = 7
            goto L52
        L4e:
            r8 = 5
            int r11 = r5 << r1
            r8 = 2
        L52:
            long r0 = (long) r2
            long r2 = (long) r11
            long r0 = r0 * r2
            r9 = 2
            long r0 = r6.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.g.c(k8.t):long");
    }

    @Override // k7.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean d(t tVar, long j10, h.b bVar) {
        boolean z10 = true;
        if (this.n) {
            Objects.requireNonNull(bVar.f11921a);
            if (tVar.f() != 1332770163) {
                z10 = false;
            }
            tVar.D(0);
            return z10;
        }
        byte[] copyOf = Arrays.copyOf(tVar.f12009a, tVar.f12011c);
        int i10 = copyOf[9] & UByte.MAX_VALUE;
        List<byte[]> j11 = m9.a.j(copyOf);
        y.b bVar2 = new y.b();
        bVar2.f16879k = "audio/opus";
        bVar2.f16891x = i10;
        bVar2.y = 48000;
        bVar2.f16881m = j11;
        bVar.f11921a = bVar2.a();
        this.n = true;
        return true;
    }

    @Override // k7.h
    public void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.n = false;
        }
    }
}
