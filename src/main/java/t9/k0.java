package t9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkh;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;
import se.d;
import w9.a6;
import w9.b5;
import w9.b6;
import w9.c7;
import w9.p7;
import w9.u5;
import w9.u6;
import w9.v4;
import w9.v5;

/* loaded from: classes2.dex */
public class k0 implements o1, i6.d {

    /* renamed from: c  reason: collision with root package name */
    public static final o1 f15279c = new k0();

    /* renamed from: f  reason: collision with root package name */
    public static final Iterator f15280f = new x2();

    /* renamed from: j  reason: collision with root package name */
    public static final Iterable f15281j = new y2();

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ k0 f15282m = new k0();

    public /* synthetic */ k0() {
    }

    public /* synthetic */ k0(int i10) {
        if (i10 != 2) {
            return;
        }
        Object obj = v4.f17334f;
    }

    public static int B(c7 c7Var, byte[] bArr, int i10, int i11, int i12, b5 b5Var) {
        u6 u6Var = (u6) c7Var;
        Object r10 = ((u5) u6Var.f17320e).r(4, null, null);
        int A = u6Var.A(r10, bArr, i10, i11, i12, b5Var);
        u6Var.a(r10);
        b5Var.f17080c = r10;
        return A;
    }

    public static int C(c7 c7Var, byte[] bArr, int i10, int i11, b5 b5Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = K(i13, bArr, i12, b5Var);
            i13 = b5Var.f17078a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzkh.d();
        }
        Object d = c7Var.d();
        int i15 = i13 + i14;
        c7Var.i(d, bArr, i14, i15, b5Var);
        c7Var.a(d);
        b5Var.f17080c = d;
        return i15;
    }

    public static void D(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int E(c7 c7Var, int i10, byte[] bArr, int i11, int i12, a6 a6Var, b5 b5Var) {
        int C = C(c7Var, bArr, i11, i12, b5Var);
        a6Var.add(b5Var.f17080c);
        while (C < i12) {
            int J = J(bArr, C, b5Var);
            if (i10 != b5Var.f17078a) {
                break;
            }
            C = C(c7Var, bArr, J, i12, b5Var);
            a6Var.add(b5Var.f17080c);
        }
        return C;
    }

    public static int F(byte[] bArr, int i10, a6 a6Var, b5 b5Var) {
        v5 v5Var = (v5) a6Var;
        int J = J(bArr, i10, b5Var);
        int i11 = b5Var.f17078a + J;
        while (J < i11) {
            J = J(bArr, J, b5Var);
            v5Var.h(b5Var.f17078a);
        }
        if (J == i11) {
            return J;
        }
        throw zzkh.d();
    }

    public static int G(byte[] bArr, int i10, b5 b5Var) {
        int J = J(bArr, i10, b5Var);
        int i11 = b5Var.f17078a;
        if (i11 >= 0) {
            if (i11 == 0) {
                b5Var.f17080c = BuildConfig.FLAVOR;
                return J;
            }
            b5Var.f17080c = new String(bArr, J, i11, b6.f17081a);
            return J + i11;
        }
        throw zzkh.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static int H(byte[] r11, int r12, w9.b5 r13) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.k0.H(byte[], int, w9.b5):int");
    }

    public static int I(int i10, byte[] bArr, int i11, int i12, p7 p7Var, b5 b5Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int M = M(bArr, i11, b5Var);
                p7Var.c(i10, Long.valueOf(b5Var.f17079b));
                return M;
            } else if (i13 == 1) {
                p7Var.c(i10, Long.valueOf(N(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int J = J(bArr, i11, b5Var);
                int i14 = b5Var.f17078a;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - J) {
                        if (i14 == 0) {
                            p7Var.c(i10, zzix.f7071c);
                        } else {
                            p7Var.c(i10, zzix.r(bArr, J, i14));
                        }
                        return J + i14;
                    }
                    throw zzkh.d();
                }
                throw zzkh.b();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    p7Var.c(i10, Integer.valueOf(y(bArr, i11)));
                    return i11 + 4;
                }
                throw new zzkh("Protocol message contained an invalid tag (zero).");
            } else {
                int i15 = (i10 & (-8)) | 4;
                p7 b10 = p7.b();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int J2 = J(bArr, i11, b5Var);
                    int i17 = b5Var.f17078a;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = J2;
                        break;
                    }
                    i16 = i17;
                    i11 = I(i17, bArr, J2, i12, b10, b5Var);
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzkh.c();
                }
                p7Var.c(i10, b10);
                return i11;
            }
        }
        throw new zzkh("Protocol message contained an invalid tag (zero).");
    }

    public static int J(byte[] bArr, int i10, b5 b5Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            b5Var.f17078a = b10;
            return i11;
        }
        return K(b10, bArr, i11, b5Var);
    }

    public static int K(int i10, byte[] bArr, int i11, b5 b5Var) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            b5Var.f17078a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            b5Var.f17078a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            b5Var.f17078a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            b5Var.f17078a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                b5Var.f17078a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int L(int i10, byte[] bArr, int i11, int i12, a6 a6Var, b5 b5Var) {
        v5 v5Var = (v5) a6Var;
        int J = J(bArr, i11, b5Var);
        v5Var.h(b5Var.f17078a);
        while (J < i12) {
            int J2 = J(bArr, J, b5Var);
            if (i10 != b5Var.f17078a) {
                break;
            }
            J = J(bArr, J2, b5Var);
            v5Var.h(b5Var.f17078a);
        }
        return J;
    }

    public static int M(byte[] bArr, int i10, b5 b5Var) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            b5Var.f17079b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & ByteCompanionObject.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & ByteCompanionObject.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        b5Var.f17079b = j11;
        return i12;
    }

    public static long N(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static final void a(se.a aVar, se.c cVar, String str) {
        d.b bVar = se.d.f15019j;
        Logger logger = se.d.f15018i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f15016f);
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.f15010c);
        logger.fine(sb2.toString());
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static float c(float f10, float f11, float f12, float f13, float f14, float f15) {
        float b10 = b(f10, f11, f12, f13);
        float b11 = b(f10, f11, f14, f13);
        float b12 = b(f10, f11, f14, f15);
        float b13 = b(f10, f11, f12, f15);
        return (b10 <= b11 || b10 <= b12 || b10 <= b13) ? (b11 <= b12 || b11 <= b13) ? b12 > b13 ? b12 : b13 : b11 : b10;
    }

    public static void d(StringBuilder sb2, SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb2.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null) {
            address = address.getHostAddress();
        }
        sb2.append(address);
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
    }

    public static final String e(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / ((long) DurationKt.NANOS_IN_MILLIS)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / ((long) DurationKt.NANOS_IN_MILLIS)) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static void f(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(a1.a.l("state should be: ", str));
        }
    }

    public static float g(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    public static Object h(String str, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(a1.a.l(str, " can not be null"));
    }

    public static final Object i(Object obj, Continuation continuation) {
        if (obj instanceof le.m) {
            Result.Companion companion = Result.Companion;
            return Result.m16constructorimpl(ResultKt.createFailure(((le.m) obj).f12823a));
        }
        Result.Companion companion2 = Result.Companion;
        return Result.m16constructorimpl(obj);
    }

    public static final Object j(Object obj, Function1 function1) {
        Throwable m19exceptionOrNullimpl = Result.m19exceptionOrNullimpl(obj);
        return m19exceptionOrNullimpl == null ? function1 != null ? new le.n(obj, function1) : obj : new le.m(m19exceptionOrNullimpl, false, 2);
    }

    public static void k(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
            return;
        }
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void l(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeBundle(bundle);
        z(parcel, v2);
    }

    public static void m(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeByteArray(bArr);
        z(parcel, v2);
    }

    public static void n(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        z(parcel, v2);
    }

    public static void o(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeIntArray(iArr);
        z(parcel, v2);
    }

    public static void p(Parcel parcel, int i10, long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeLongArray(jArr);
        z(parcel, v2);
    }

    public static void q(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        z(parcel, v2);
    }

    public static void r(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeString(str);
        z(parcel, v2);
    }

    public static void s(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeStringList(list);
        z(parcel, v2);
    }

    public static void t(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11, boolean z10) {
        if (parcelableArr == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int v2 = v(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                D(parcel, parcelable, i11);
            }
        }
        z(parcel, v2);
    }

    public static void u(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int v2 = v(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                D(parcel, parcelable, 0);
            }
        }
        z(parcel, v2);
    }

    public static int v(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int w(byte[] bArr, int i10, b5 b5Var) {
        int J = J(bArr, i10, b5Var);
        int i11 = b5Var.f17078a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - J) {
                if (i11 == 0) {
                    b5Var.f17080c = zzix.f7071c;
                    return J;
                }
                b5Var.f17080c = zzix.r(bArr, J, i11);
                return J + i11;
            }
            throw zzkh.d();
        }
        throw zzkh.b();
    }

    public static String x(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb4.length() != 0 ? "Exception during lenientFormat for ".concat(sb4) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(sb4.length() + 9 + name2.length());
                    android.support.v4.media.a.o(sb5, "<", sb4, " threw ", name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb6 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i12, indexOf);
            sb6.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb6.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb6.append(", ");
                sb6.append(objArr[i13]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static int y(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static void z(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 163
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.k0.A(byte[], int, int):boolean");
    }

    @Override // i6.d
    public Object apply(Object obj) {
        com.google.android.gms.internal.cast.m mVar = (com.google.android.gms.internal.cast.m) obj;
        try {
            int f10 = mVar.f();
            byte[] bArr = new byte[f10];
            Logger logger = com.google.android.gms.internal.cast.j1.Q;
            com.google.android.gms.internal.cast.i1 i1Var = new com.google.android.gms.internal.cast.i1(bArr, 0, f10);
            mVar.d(i1Var);
            if (i1Var.I0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = mVar.getClass().getName();
            throw new RuntimeException(android.support.v4.media.b.n(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
