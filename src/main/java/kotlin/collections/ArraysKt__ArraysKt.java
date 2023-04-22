package kotlin.collections;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0002H\u0018\"\u0010\b\u0000\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", BuildConfig.FLAVOR, "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", BuildConfig.FLAVOR, "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", BuildConfig.FLAVOR, "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", BuildConfig.FLAVOR, "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes2.dex */
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepEquals")
    public static final <T> boolean contentDeepEquals(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            T t2 = tArr[i10];
            T t8 = tArr2[i10];
            if (t2 != t8) {
                if (t2 == null || t8 == null) {
                    return false;
                }
                if ((t2 instanceof Object[]) && (t8 instanceof Object[])) {
                    if (!contentDeepEquals((Object[]) t2, (Object[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof byte[]) && (t8 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) t2, (byte[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof short[]) && (t8 instanceof short[])) {
                    if (!Arrays.equals((short[]) t2, (short[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof int[]) && (t8 instanceof int[])) {
                    if (!Arrays.equals((int[]) t2, (int[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof long[]) && (t8 instanceof long[])) {
                    if (!Arrays.equals((long[]) t2, (long[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof float[]) && (t8 instanceof float[])) {
                    if (!Arrays.equals((float[]) t2, (float[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof double[]) && (t8 instanceof double[])) {
                    if (!Arrays.equals((double[]) t2, (double[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof char[]) && (t8 instanceof char[])) {
                    if (!Arrays.equals((char[]) t2, (char[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof boolean[]) && (t8 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) t2, (boolean[]) t8)) {
                        return false;
                    }
                } else if ((t2 instanceof UByteArray) && (t8 instanceof UByteArray)) {
                    if (!UArraysKt.m558contentEqualskV0jMPg(((UByteArray) t2).m100unboximpl(), ((UByteArray) t8).m100unboximpl())) {
                        return false;
                    }
                } else if ((t2 instanceof UShortArray) && (t8 instanceof UShortArray)) {
                    if (!UArraysKt.m555contentEqualsFGO6Aew(((UShortArray) t2).m360unboximpl(), ((UShortArray) t8).m360unboximpl())) {
                        return false;
                    }
                } else if ((t2 instanceof UIntArray) && (t8 instanceof UIntArray)) {
                    if (!UArraysKt.m556contentEqualsKJPZfPQ(((UIntArray) t2).m178unboximpl(), ((UIntArray) t8).m178unboximpl())) {
                        return false;
                    }
                } else if ((t2 instanceof ULongArray) && (t8 instanceof ULongArray)) {
                    if (!UArraysKt.m560contentEqualslec5QzE(((ULongArray) t2).m256unboximpl(), ((ULongArray) t8).m256unboximpl())) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(t2, t8)) {
                    return false;
                }
            }
            i10 = i11;
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepToString")
    public static final <T> String contentDeepToString(T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder((RangesKt.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb2, new ArrayList());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb2, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(tArr);
        sb2.append('[');
        int i10 = 0;
        int length = tArr.length;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (i10 != 0) {
                sb2.append(", ");
            }
            T t2 = tArr[i10];
            if (t2 == null) {
                sb2.append("null");
            } else if (t2 instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt((Object[]) t2, sb2, list);
            } else if (t2 instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
                sb2.append(arrays);
            } else if (t2 instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
                sb2.append(arrays2);
            } else if (t2 instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays3, "toString(this)");
                sb2.append(arrays3);
            } else if (t2 instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays4, "toString(this)");
                sb2.append(arrays4);
            } else if (t2 instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays5, "toString(this)");
                sb2.append(arrays5);
            } else if (t2 instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays6, "toString(this)");
                sb2.append(arrays6);
            } else if (t2 instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays7, "toString(this)");
                sb2.append(arrays7);
            } else if (t2 instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) t2);
                Intrinsics.checkNotNullExpressionValue(arrays8, "toString(this)");
                sb2.append(arrays8);
            } else if (t2 instanceof UByteArray) {
                sb2.append(UArraysKt.m572contentToString2csIQuQ(((UByteArray) t2).m100unboximpl()));
            } else if (t2 instanceof UShortArray) {
                sb2.append(UArraysKt.m576contentToStringd6D3K8(((UShortArray) t2).m360unboximpl()));
            } else if (t2 instanceof UIntArray) {
                sb2.append(UArraysKt.m575contentToStringXUkPCBk(((UIntArray) t2).m178unboximpl()));
            } else if (t2 instanceof ULongArray) {
                sb2.append(UArraysKt.m578contentToStringuLth9ew(((ULongArray) t2).m256unboximpl()));
            } else {
                sb2.append(t2.toString());
            }
            i10 = i11;
        }
        sb2.append(']');
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    public static final <T> List<T> flatten(T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            T[] tArr2 = tArr[i11];
            i11++;
            i12 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i12);
        int length2 = tArr.length;
        while (i10 < length2) {
            T[] tArr3 = tArr[i10];
            i10++;
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Object[] objArr, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean isNullOrEmpty(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        int length = pairArr.length;
        int i10 = 0;
        while (i10 < length) {
            Pair<? extends T, ? extends R> pair = pairArr[i10];
            i10++;
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
