package kotlin.collections;

import com.appsflyer.oaid.BuildConfig;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", BuildConfig.FLAVOR, "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", BuildConfig.FLAVOR, "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4  reason: not valid java name */
    private static final int m463partitionnroSd4(long[] jArr, int i10, int i11) {
        long m247getsVKNKU = ULongArray.m247getsVKNKU(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (UnsignedKt.ulongCompare(ULongArray.m247getsVKNKU(jArr, i10), m247getsVKNKU) < 0) {
                i10++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m247getsVKNKU(jArr, i11), m247getsVKNKU) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long m247getsVKNKU2 = ULongArray.m247getsVKNKU(jArr, i10);
                ULongArray.m252setk8EXiF4(jArr, i10, ULongArray.m247getsVKNKU(jArr, i11));
                ULongArray.m252setk8EXiF4(jArr, i11, m247getsVKNKU2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c  reason: not valid java name */
    private static final int m464partition4UcCI2c(byte[] bArr, int i10, int i11) {
        int i12;
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(bArr, i10) & UByte.MAX_VALUE;
                i12 = m91getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m91getw2LRezQ2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UByteArray.m91getw2LRezQ(bArr, i11) & UByte.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte m91getw2LRezQ3 = UByteArray.m91getw2LRezQ(bArr, i10);
                UByteArray.m96setVurrAj0(bArr, i10, UByteArray.m91getw2LRezQ(bArr, i11));
                UByteArray.m96setVurrAj0(bArr, i11, m91getw2LRezQ3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o  reason: not valid java name */
    private static final int m465partitionAa5vz7o(short[] sArr, int i10, int i11) {
        int i12;
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(sArr, i10) & UShort.MAX_VALUE;
                i12 = m351getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m351getMh2AYeg2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UShortArray.m351getMh2AYeg(sArr, i11) & UShort.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short m351getMh2AYeg3 = UShortArray.m351getMh2AYeg(sArr, i10);
                UShortArray.m356set01HTLdE(sArr, i10, UShortArray.m351getMh2AYeg(sArr, i11));
                UShortArray.m356set01HTLdE(sArr, i11, m351getMh2AYeg3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg  reason: not valid java name */
    private static final int m466partitionoBK06Vg(int[] iArr, int i10, int i11) {
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (UnsignedKt.uintCompare(UIntArray.m169getpVg5ArA(iArr, i10), m169getpVg5ArA) < 0) {
                i10++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m169getpVg5ArA(iArr, i11), m169getpVg5ArA) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(iArr, i10);
                UIntArray.m174setVXSXFK8(iArr, i10, UIntArray.m169getpVg5ArA(iArr, i11));
                UIntArray.m174setVXSXFK8(iArr, i11, m169getpVg5ArA2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4  reason: not valid java name */
    private static final void m467quickSortnroSd4(long[] jArr, int i10, int i11) {
        int m463partitionnroSd4 = m463partitionnroSd4(jArr, i10, i11);
        int i12 = m463partitionnroSd4 - 1;
        if (i10 < i12) {
            m467quickSortnroSd4(jArr, i10, i12);
        }
        if (m463partitionnroSd4 < i11) {
            m467quickSortnroSd4(jArr, m463partitionnroSd4, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c  reason: not valid java name */
    private static final void m468quickSort4UcCI2c(byte[] bArr, int i10, int i11) {
        int m464partition4UcCI2c = m464partition4UcCI2c(bArr, i10, i11);
        int i12 = m464partition4UcCI2c - 1;
        if (i10 < i12) {
            m468quickSort4UcCI2c(bArr, i10, i12);
        }
        if (m464partition4UcCI2c < i11) {
            m468quickSort4UcCI2c(bArr, m464partition4UcCI2c, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o  reason: not valid java name */
    private static final void m469quickSortAa5vz7o(short[] sArr, int i10, int i11) {
        int m465partitionAa5vz7o = m465partitionAa5vz7o(sArr, i10, i11);
        int i12 = m465partitionAa5vz7o - 1;
        if (i10 < i12) {
            m469quickSortAa5vz7o(sArr, i10, i12);
        }
        if (m465partitionAa5vz7o < i11) {
            m469quickSortAa5vz7o(sArr, m465partitionAa5vz7o, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg  reason: not valid java name */
    private static final void m470quickSortoBK06Vg(int[] iArr, int i10, int i11) {
        int m466partitionoBK06Vg = m466partitionoBK06Vg(iArr, i10, i11);
        int i12 = m466partitionoBK06Vg - 1;
        if (i10 < i12) {
            m470quickSortoBK06Vg(iArr, i10, i12);
        }
        if (m466partitionoBK06Vg < i11) {
            m470quickSortoBK06Vg(iArr, m466partitionoBK06Vg, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4  reason: not valid java name */
    public static final void m471sortArraynroSd4(long[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m467quickSortnroSd4(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c  reason: not valid java name */
    public static final void m472sortArray4UcCI2c(byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m468quickSort4UcCI2c(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o  reason: not valid java name */
    public static final void m473sortArrayAa5vz7o(short[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m469quickSortAa5vz7o(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg  reason: not valid java name */
    public static final void m474sortArrayoBK06Vg(int[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m470quickSortoBK06Vg(array, i10, i11 - 1);
    }
}
