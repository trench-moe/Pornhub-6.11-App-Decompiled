package kotlin.collections;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", BuildConfig.FLAVOR, "(I)V", "()V", "elements", BuildConfig.FLAVOR, "(Ljava/util/Collection;)V", "elementData", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "[Ljava/lang/Object;", "head", "<set-?>", "size", "getSize", "()I", "add", BuildConfig.FLAVOR, "element", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
/* loaded from: classes2.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private static final int maxArraySize = 2147483639;
    private Object[] elementData;
    private int head;
    private int size;
    public static final Companion Companion = new Companion(null);
    private static final Object[] emptyElementData = new Object[0];

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", BuildConfig.FLAVOR, "()V", "defaultMinCapacity", BuildConfig.FLAVOR, "emptyElementData", BuildConfig.FLAVOR, "[Ljava/lang/Object;", "maxArraySize", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int newCapacity$kotlin_stdlib(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - ArrayDeque.maxArraySize > 0 ? i11 > ArrayDeque.maxArraySize ? IntCompanionObject.MAX_VALUE : ArrayDeque.maxArraySize : i12;
        }
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = emptyElementData;
        } else if (i10 <= 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Illegal Capacity: ", Integer.valueOf(i10)));
        } else {
            objArr = new Object[i10];
        }
        this.elementData = objArr;
    }

    public ArrayDeque(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    private final void copyCollectionElements(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.elementData.length;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (!it.hasNext()) {
                break;
            }
            this.elementData[i10] = it.next();
            i10 = i11;
        }
        int i12 = 0;
        int i13 = this.head;
        while (i12 < i13) {
            int i14 = i12 + 1;
            if (!it.hasNext()) {
                break;
            }
            this.elementData[i12] = it.next();
            i12 = i14;
        }
        this.size = collection.size() + size();
    }

    private final void copyElements(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.elementData;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i11 = this.head;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, length - i11, 0, i11);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i10) {
        return i10 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : i10 - 1;
    }

    private final void ensureCapacity(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(i10, 10)];
        } else {
            copyElements(Companion.newCapacity$kotlin_stdlib(objArr.length, i10));
        }
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> function1) {
        boolean z10 = false;
        z10 = false;
        int i10 = 0;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int c10 = a.c(this, size(), this);
                int i11 = this.head;
                if (this.head < c10) {
                    int i12 = this.head;
                    while (i12 < c10) {
                        int i13 = i12 + 1;
                        Object obj = this.elementData[i12];
                        if (function1.invoke(obj).booleanValue()) {
                            this.elementData[i11] = obj;
                            i12 = i13;
                            i11++;
                        } else {
                            z10 = true;
                            i12 = i13;
                        }
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, i11, c10);
                } else {
                    int i14 = this.head;
                    int length = this.elementData.length;
                    boolean z11 = false;
                    while (i14 < length) {
                        int i15 = i14 + 1;
                        Object obj2 = this.elementData[i14];
                        this.elementData[i14] = null;
                        if (function1.invoke(obj2).booleanValue()) {
                            this.elementData[i11] = obj2;
                            i14 = i15;
                            i11++;
                        } else {
                            z11 = true;
                            i14 = i15;
                        }
                    }
                    i11 = positiveMod(i11);
                    while (i10 < c10) {
                        int i16 = i10 + 1;
                        Object obj3 = this.elementData[i10];
                        this.elementData[i10] = null;
                        if (function1.invoke(obj3).booleanValue()) {
                            this.elementData[i11] = obj3;
                            i11 = incremented(i11);
                        } else {
                            z11 = true;
                        }
                        i10 = i16;
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.size = negativeMod(i11 - this.head);
                }
            }
        }
        return z10;
    }

    public final int incremented(int i10) {
        if (i10 == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i10 + 1;
    }

    @InlineOnly
    private final E internalGet(int i10) {
        return (E) this.elementData[i10];
    }

    @InlineOnly
    private final int internalIndex(int i10) {
        return a.c(this, i10, this);
    }

    public final int negativeMod(int i10) {
        return i10 < 0 ? i10 + this.elementData.length : i10;
    }

    public final int positiveMod(int i10) {
        Object[] objArr = this.elementData;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, size());
        if (i10 == size()) {
            addLast(e10);
        } else if (i10 == 0) {
            addFirst(e10);
        } else {
            ensureCapacity(size() + 1);
            int c10 = a.c(this, i10, this);
            if (i10 < ((size() + 1) >> 1)) {
                int decremented = decremented(c10);
                int decremented2 = decremented(this.head);
                int i11 = this.head;
                if (decremented >= i11) {
                    Object[] objArr = this.elementData;
                    objArr[decremented2] = objArr[i11];
                    ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i11, i11 + 1, decremented + 1);
                } else {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.elementData;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, decremented + 1);
                }
                this.elementData[decremented] = e10;
                this.head = decremented2;
            } else {
                int c11 = a.c(this, size(), this);
                if (c10 < c11) {
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, c10 + 1, c10, c11);
                } else {
                    Object[] objArr5 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, 1, 0, c11);
                    Object[] objArr6 = this.elementData;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, c10 + 1, c10, objArr6.length - 1);
                }
                this.elementData[c10] = e10;
            }
            this.size = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        ensureCapacity(elements.size() + size());
        int c10 = a.c(this, size(), this);
        int c11 = a.c(this, i10, this);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.head;
            int i12 = i11 - size;
            if (c11 < i11) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i12, i11, objArr.length);
                if (size >= c11) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, c11);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 0, size, c11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, i12, i11, c11);
            } else {
                Object[] objArr6 = this.elementData;
                i12 += objArr6.length;
                int i13 = c11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, i12, i11, c11);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, this.head + length, c11);
                }
            }
            this.head = i12;
            copyCollectionElements(negativeMod(c11 - size), elements);
        } else {
            int i14 = c11 + size;
            if (c11 < c10) {
                int i15 = size + c10;
                Object[] objArr8 = this.elementData;
                if (i15 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i14, c11, c10);
                } else if (i14 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i14 - objArr8.length, c11, c10);
                } else {
                    int length2 = c10 - (i15 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, 0, length2, c10);
                    Object[] objArr9 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, i14, c11, length2);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, size, 0, c10);
                Object[] objArr11 = this.elementData;
                if (i14 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i14 - objArr11.length, c11, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr12, objArr12, i14, c11, objArr12.length - size);
                }
            }
            copyCollectionElements(c11, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(elements.size() + size());
        copyCollectionElements(a.c(this, size(), this), elements);
        return true;
    }

    public final void addFirst(E e10) {
        ensureCapacity(size() + 1);
        int decremented = decremented(this.head);
        this.head = decremented;
        this.elementData[decremented] = e10;
        this.size = size() + 1;
    }

    public final void addLast(E e10) {
        ensureCapacity(size() + 1);
        this.elementData[a.c(this, size(), this)] = e10;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int c10 = a.c(this, size(), this);
        int i10 = this.head;
        if (i10 < c10) {
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, i10, c10);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, this.head, objArr.length);
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, 0, c10);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        return (E) this.elementData[positiveMod(this.head + i10)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int c10 = a.c(this, size(), this);
        int i11 = this.head;
        if (i11 < c10) {
            while (i11 < c10) {
                int i12 = i11 + 1;
                if (Intrinsics.areEqual(obj, this.elementData[i11])) {
                    i10 = this.head;
                } else {
                    i11 = i12;
                }
            }
            return -1;
        } else if (i11 < c10) {
            return -1;
        } else {
            int length = this.elementData.length;
            while (true) {
                if (i11 >= length) {
                    int i13 = 0;
                    while (i13 < c10) {
                        int i14 = i13 + 1;
                        if (Intrinsics.areEqual(obj, this.elementData[i13])) {
                            i11 = i13 + this.elementData.length;
                            i10 = this.head;
                        } else {
                            i13 = i14;
                        }
                    }
                    return -1;
                }
                int i15 = i11 + 1;
                if (Intrinsics.areEqual(obj, this.elementData[i11])) {
                    i10 = this.head;
                    break;
                }
                i11 = i15;
            }
        }
        return i11 - i10;
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> structure) {
        int i10;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i10 = this.head) < a.c(this, size(), this)) ? this.head : i10 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[a.c(this, CollectionsKt__CollectionsKt.getLastIndex(this), this)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i10;
        int c10 = a.c(this, size(), this);
        int i11 = this.head;
        if (i11 < c10) {
            lastIndex = c10 - 1;
            if (i11 > lastIndex) {
                return -1;
            }
            while (true) {
                int i12 = lastIndex - 1;
                if (Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    i10 = this.head;
                    break;
                } else if (lastIndex == i11) {
                    return -1;
                } else {
                    lastIndex = i12;
                }
            }
        } else if (i11 <= c10) {
            return -1;
        } else {
            int i13 = c10 - 1;
            if (i13 >= 0) {
                while (true) {
                    int i14 = i13 - 1;
                    if (Intrinsics.areEqual(obj, this.elementData[i13])) {
                        lastIndex = i13 + this.elementData.length;
                        i10 = this.head;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        i13 = i14;
                    }
                }
            }
            lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
            int i15 = this.head;
            if (i15 > lastIndex) {
                return -1;
            }
            while (true) {
                int i16 = lastIndex - 1;
                if (Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    i10 = this.head;
                    break;
                } else if (lastIndex == i15) {
                    return -1;
                } else {
                    lastIndex = i16;
                }
            }
        }
        return lastIndex - i10;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[a.c(this, CollectionsKt__CollectionsKt.getLastIndex(this), this)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        int i10 = 0;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int c10 = a.c(this, size(), this);
                int i11 = this.head;
                if (this.head < c10) {
                    int i12 = this.head;
                    while (i12 < c10) {
                        int i13 = i12 + 1;
                        Object obj = this.elementData[i12];
                        if (!elements.contains(obj)) {
                            this.elementData[i11] = obj;
                            i12 = i13;
                            i11++;
                        } else {
                            z10 = true;
                            i12 = i13;
                        }
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, i11, c10);
                } else {
                    int i14 = this.head;
                    int length = this.elementData.length;
                    boolean z11 = false;
                    while (i14 < length) {
                        int i15 = i14 + 1;
                        Object obj2 = this.elementData[i14];
                        this.elementData[i14] = null;
                        if (!elements.contains(obj2)) {
                            this.elementData[i11] = obj2;
                            i14 = i15;
                            i11++;
                        } else {
                            z11 = true;
                            i14 = i15;
                        }
                    }
                    i11 = positiveMod(i11);
                    while (i10 < c10) {
                        int i16 = i10 + 1;
                        Object obj3 = this.elementData[i10];
                        this.elementData[i10] = null;
                        if (!elements.contains(obj3)) {
                            this.elementData[i11] = obj3;
                            i11 = incremented(i11);
                        } else {
                            z11 = true;
                        }
                        i10 = i16;
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.size = negativeMod(i11 - this.head);
                }
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        if (i10 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int c10 = a.c(this, i10, this);
        E e10 = (E) this.elementData[c10];
        if (i10 < (size() >> 1)) {
            int i11 = this.head;
            if (c10 >= i11) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i11 + 1, i11, c10);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, c10);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.head;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i13 = this.head;
            objArr4[i13] = null;
            this.head = incremented(i13);
        } else {
            int c11 = a.c(this, CollectionsKt__CollectionsKt.getLastIndex(this), this);
            if (c10 <= c11) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, c10, c10 + 1, c11 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, c10, c10 + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, 1, c11 + 1);
            }
            this.elementData[c11] = null;
        }
        this.size = size() - 1;
        return e10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        E e10 = (E) this.elementData[this.head];
        Object[] objArr = this.elementData;
        int i10 = this.head;
        objArr[i10] = null;
        this.head = incremented(i10);
        this.size = size() - 1;
        return e10;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int c10 = a.c(this, CollectionsKt__CollectionsKt.getLastIndex(this), this);
        E e10 = (E) this.elementData[c10];
        this.elementData[c10] = null;
        this.size = size() - 1;
        return e10;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        int i10 = 0;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int c10 = a.c(this, size(), this);
                int i11 = this.head;
                if (this.head < c10) {
                    int i12 = this.head;
                    while (i12 < c10) {
                        int i13 = i12 + 1;
                        Object obj = this.elementData[i12];
                        if (elements.contains(obj)) {
                            this.elementData[i11] = obj;
                            i12 = i13;
                            i11++;
                        } else {
                            z10 = true;
                            i12 = i13;
                        }
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, i11, c10);
                } else {
                    int i14 = this.head;
                    int length = this.elementData.length;
                    boolean z11 = false;
                    while (i14 < length) {
                        int i15 = i14 + 1;
                        Object obj2 = this.elementData[i14];
                        this.elementData[i14] = null;
                        if (elements.contains(obj2)) {
                            this.elementData[i11] = obj2;
                            i14 = i15;
                            i11++;
                        } else {
                            z11 = true;
                            i14 = i15;
                        }
                    }
                    i11 = positiveMod(i11);
                    while (i10 < c10) {
                        int i16 = i10 + 1;
                        Object obj3 = this.elementData[i10];
                        this.elementData[i10] = null;
                        if (elements.contains(obj3)) {
                            this.elementData[i11] = obj3;
                            i11 = incremented(i11);
                        } else {
                            z11 = true;
                        }
                        i10 = i16;
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.size = negativeMod(i11 - this.head);
                }
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        int positiveMod = positiveMod(this.head + i10);
        E e11 = (E) this.elementData[positiveMod];
        this.elementData[positiveMod] = e10;
        return e11;
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        int c10 = a.c(this, size(), this);
        int i10 = this.head;
        if (i10 < c10) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.elementData, array, 0, i10, c10, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, array, objArr2.length - this.head, 0, c10);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
