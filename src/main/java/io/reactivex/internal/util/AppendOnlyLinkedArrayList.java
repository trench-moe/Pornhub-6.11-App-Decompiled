package io.reactivex.internal.util;

import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;

/* loaded from: classes2.dex */
public class AppendOnlyLinkedArrayList<T> {
    public final int capacity;
    public final Object[] head;
    public int offset;
    public Object[] tail;

    /* loaded from: classes2.dex */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t2);
    }

    public AppendOnlyLinkedArrayList(int i10) {
        this.capacity = i10;
        Object[] objArr = new Object[i10 + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean accept(df.c<? super U> r7) {
        /*
            r6 = this;
            java.lang.Object[] r0 = r6.head
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            int r1 = r6.capacity
            r5 = 5
        L7:
            r4 = 0
            r2 = r4
            if (r0 == 0) goto L25
            r5 = 2
        Lc:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            if (r3 != 0) goto L13
            goto L20
        L13:
            boolean r4 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r7)
            r3 = r4
            if (r3 == 0) goto L1d
            r7 = 1
            r5 = 7
            return r7
        L1d:
            int r2 = r2 + 1
            goto Lc
        L20:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L7
        L25:
            r5 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.accept(df.c):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean accept(io.reactivex.Observer<? super U> r9) {
        /*
            r8 = this;
            r4 = r8
            java.lang.Object[] r0 = r4.head
            int r1 = r4.capacity
        L5:
            r2 = 0
            r6 = 5
            if (r0 == 0) goto L27
            r7 = 1
        La:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            if (r3 != 0) goto L12
            r6 = 6
            goto L20
        L12:
            boolean r7 = io.reactivex.internal.util.NotificationLite.acceptFull(r3, r9)
            r3 = r7
            if (r3 == 0) goto L1b
            r9 = 1
            return r9
        L1b:
            r6 = 7
            int r2 = r2 + 1
            goto La
        L1f:
            r6 = 6
        L20:
            r0 = r0[r1]
            r7 = 5
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r7 = 2
            goto L5
        L27:
            r7 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.accept(io.reactivex.Observer):boolean");
    }

    public void add(T t2) {
        int i10 = this.capacity;
        int i11 = this.offset;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.tail[i10] = objArr;
            this.tail = objArr;
            i11 = 0;
        }
        this.tail[i11] = t2;
        this.offset = i11 + 1;
    }

    public void forEachWhile(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i10 = this.capacity;
        for (Object[] objArr = this.head; objArr != null; objArr = objArr[i10]) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null) {
                    break;
                } else if (nonThrowingPredicate.test(obj)) {
                    return;
                }
            }
        }
    }

    public <S> void forEachWhile(S s10, BiPredicate<? super S, ? super T> biPredicate) {
        int i10;
        Object[] objArr = this.head;
        int i11 = this.capacity;
        while (true) {
            while (i10 < i11) {
                Object obj = objArr[i10];
                i10 = (obj == null || biPredicate.test(s10, obj)) ? 0 : i10 + 1;
                return;
            }
            objArr = objArr[i11];
        }
    }

    public void setFirst(T t2) {
        this.head[0] = t2;
    }
}
