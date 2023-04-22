package ud;

import cz.msebera.android.httpclient.message.BasicNameValuePair;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import md.o;
import t9.j0;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f15853a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final BitSet f15854b;

    /* renamed from: c  reason: collision with root package name */
    public static final BitSet f15855c;

    static {
        int[] iArr = {61, 59, 44};
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < 3; i10++) {
            bitSet.set(iArr[i10]);
        }
        f15854b = bitSet;
        int[] iArr2 = {59, 44};
        BitSet bitSet2 = new BitSet();
        for (int i11 = 0; i11 < 2; i11++) {
            bitSet2.set(iArr2[i11]);
        }
        f15855c = bitSet2;
    }

    public md.e[] a(CharArrayBuffer charArrayBuffer, l lVar) {
        o[] oVarArr;
        l9.e.l(charArrayBuffer, "Char array buffer");
        ArrayList arrayList = new ArrayList();
        while (!lVar.a()) {
            o b10 = b(charArrayBuffer, lVar);
            if (lVar.a() || charArrayBuffer.charAt(lVar.f15876b - 1) == ',') {
                oVarArr = null;
            } else {
                int i10 = lVar.f15876b;
                int i11 = lVar.f15875a;
                int i12 = i10;
                while (i10 < i11 && j0.g(charArrayBuffer.charAt(i10))) {
                    i12++;
                    i10++;
                }
                lVar.b(i12);
                ArrayList arrayList2 = new ArrayList();
                while (!lVar.a()) {
                    arrayList2.add(b(charArrayBuffer, lVar));
                    if (charArrayBuffer.charAt(lVar.f15876b - 1) == ',') {
                        break;
                    }
                }
                oVarArr = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
            }
            BasicNameValuePair basicNameValuePair = (BasicNameValuePair) b10;
            b bVar = new b(basicNameValuePair.getName(), basicNameValuePair.getValue(), oVarArr);
            if (!bVar.f15850c.isEmpty() || bVar.f15851f != null) {
                arrayList.add(bVar);
            }
        }
        return (md.e[]) arrayList.toArray(new md.e[arrayList.size()]);
    }

    public o b(CharArrayBuffer charArrayBuffer, l lVar) {
        j0 j0Var = j0.n;
        String h10 = j0Var.h(charArrayBuffer, lVar, f15854b);
        if (lVar.a()) {
            return new BasicNameValuePair(h10, null);
        }
        char charAt = charArrayBuffer.charAt(lVar.f15876b);
        lVar.b(lVar.f15876b + 1);
        if (charAt != '=') {
            return new BasicNameValuePair(h10, null);
        }
        BitSet bitSet = f15855c;
        StringBuilder sb2 = new StringBuilder();
        loop0: while (true) {
            boolean z10 = false;
            while (!lVar.a()) {
                char charAt2 = charArrayBuffer.charAt(lVar.f15876b);
                if (bitSet != null && bitSet.get(charAt2)) {
                    break loop0;
                } else if (j0.g(charAt2)) {
                    j0Var.i(charArrayBuffer, lVar);
                    z10 = true;
                } else if (charAt2 == '\"') {
                    if (z10 && sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    if (!lVar.a()) {
                        int i10 = lVar.f15876b;
                        int i11 = lVar.f15875a;
                        if (charArrayBuffer.charAt(i10) == '\"') {
                            int i12 = i10 + 1;
                            int i13 = i12;
                            boolean z11 = false;
                            while (true) {
                                if (i12 >= i11) {
                                    break;
                                }
                                char charAt3 = charArrayBuffer.charAt(i12);
                                if (z11) {
                                    if (charAt3 != '\"' && charAt3 != '\\') {
                                        sb2.append('\\');
                                    }
                                    sb2.append(charAt3);
                                    z11 = false;
                                } else if (charAt3 == '\"') {
                                    i13++;
                                    break;
                                } else if (charAt3 == '\\') {
                                    z11 = true;
                                } else if (charAt3 != '\r' && charAt3 != '\n') {
                                    sb2.append(charAt3);
                                }
                                i12++;
                                i13++;
                            }
                            lVar.b(i13);
                        }
                    }
                } else {
                    if (z10 && sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    int i14 = lVar.f15876b;
                    int i15 = lVar.f15875a;
                    int i16 = i14;
                    while (i14 < i15) {
                        char charAt4 = charArrayBuffer.charAt(i14);
                        if ((bitSet != null && bitSet.get(charAt4)) || j0.g(charAt4) || charAt4 == '\"') {
                            break;
                        }
                        i16++;
                        sb2.append(charAt4);
                        i14++;
                    }
                    lVar.b(i16);
                }
            }
            break loop0;
        }
        String sb3 = sb2.toString();
        if (!lVar.a()) {
            lVar.b(lVar.f15876b + 1);
        }
        return new BasicNameValuePair(h10, sb3);
    }
}
