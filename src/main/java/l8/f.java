package l8;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import k8.t;
import k8.u;

/* loaded from: classes2.dex */
public class f implements ec.a {

    /* renamed from: c  reason: collision with root package name */
    public final int f12675c;

    /* renamed from: f  reason: collision with root package name */
    public final Object f12676f;

    /* renamed from: j  reason: collision with root package name */
    public final Object f12677j;

    public /* synthetic */ f(int i10, ec.a[] aVarArr) {
        this.f12675c = i10;
        this.f12676f = aVarArr;
        this.f12677j = new dc.c(i10);
    }

    public /* synthetic */ f(List list, int i10, String str) {
        this.f12676f = list;
        this.f12675c = i10;
        this.f12677j = str;
    }

    public static f b(t tVar) {
        try {
            tVar.E(21);
            int s10 = tVar.s() & 3;
            int s11 = tVar.s();
            int i10 = tVar.f12010b;
            int i11 = 0;
            for (int i12 = 0; i12 < s11; i12++) {
                tVar.E(1);
                int x10 = tVar.x();
                for (int i13 = 0; i13 < x10; i13++) {
                    int x11 = tVar.x();
                    i11 += x11 + 4;
                    tVar.E(x11);
                }
            }
            tVar.D(i10);
            byte[] bArr = new byte[i11];
            String str = null;
            int i14 = 0;
            for (int i15 = 0; i15 < s11; i15++) {
                int s12 = tVar.s() & 127;
                int x12 = tVar.x();
                for (int i16 = 0; i16 < x12; i16++) {
                    int x13 = tVar.x();
                    byte[] bArr2 = k8.q.f11982a;
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, length, x13);
                    if (s12 == 33 && i16 == 0) {
                        str = cb.e.q(new u(bArr, length, length + x13));
                    }
                    i14 = length + x13;
                    tVar.E(x13);
                }
            }
            return new f(i11 == 0 ? null : Collections.singletonList(bArr), s10 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing HEVC config", e10);
        }
    }

    @Override // ec.a
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        ec.a[] aVarArr;
        if (stackTraceElementArr.length <= this.f12675c) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (ec.a aVar : (ec.a[]) this.f12676f) {
            if (stackTraceElementArr2.length <= this.f12675c) {
                break;
            }
            stackTraceElementArr2 = aVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f12675c) {
            stackTraceElementArr2 = ((dc.c) this.f12677j).a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
