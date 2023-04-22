package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import jb.e;
import jb.j;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Ints {

    /* loaded from: classes.dex */
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int[] array;
        public final int end;
        public final int start;

        public IntArrayAsList(int[] iArr, int i10, int i11) {
            this.array = iArr;
            this.start = i10;
            this.end = i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.start;
                int i11 = this.end;
                while (true) {
                    if (i10 >= i11) {
                        i10 = -1;
                        break;
                    } else if (iArr[i10] == intValue) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof IntArrayAsList) {
                IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
                int size = size();
                if (intArrayAsList.size() != size) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.array[this.start + i10] != intArrayAsList.array[intArrayAsList.start + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            e.d(i10, size());
            return Integer.valueOf(this.array[this.start + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                i10 = (i10 * 31) + this.array[i11];
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.start;
                int i11 = this.end;
                while (true) {
                    if (i10 >= i11) {
                        i10 = -1;
                        break;
                    } else if (iArr[i10] == intValue) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    return i10 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i10 = this.start;
                int i11 = this.end - 1;
                while (true) {
                    if (i11 < i10) {
                        i11 = -1;
                        break;
                    } else if (iArr[i11] == intValue) {
                        break;
                    } else {
                        i11--;
                    }
                }
                if (i11 >= 0) {
                    return i11 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            Integer num = (Integer) obj;
            e.d(i10, size());
            int[] iArr = this.array;
            int i11 = this.start + i10;
            int i12 = iArr[i11];
            Objects.requireNonNull(num);
            iArr[i11] = num.intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            e.f(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i12 = this.start;
            return new IntArrayAsList(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.array[this.start]);
            int i10 = this.start;
            while (true) {
                i10++;
                if (i10 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.array[i10]);
            }
        }
    }

    public static int a(long j10) {
        int i10 = (int) j10;
        if (((long) i10) == j10) {
            return i10;
        }
        throw new IllegalArgumentException(j.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static int[] b(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            IntArrayAsList intArrayAsList = (IntArrayAsList) collection;
            return Arrays.copyOfRange(intArrayAsList.array, intArrayAsList.start, intArrayAsList.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            Objects.requireNonNull(obj);
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
