package io.reactivex.observers;

import a1.a;
import io.reactivex.Notification;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {
    public boolean checkSubscriptionOnce;
    public long completions;
    public int establishedFusionMode;
    public int initialFusionMode;
    public Thread lastThread;
    public CharSequence tag;
    public boolean timeout;
    public final List<T> values = new VolatileSizeArrayList();
    public final List<Throwable> errors = new VolatileSizeArrayList();
    public final CountDownLatch done = new CountDownLatch(1);

    /* loaded from: classes2.dex */
    public enum TestWaitStrategy implements Runnable {
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
            }
        },
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1);
            }
        },
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(10);
            }
        },
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(100);
            }
        },
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1000);
            }
        };

        public static void sleep(int i10) {
            try {
                Thread.sleep(i10);
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static String valueAndClass(Object obj) {
        if (obj != null) {
            return obj + " (class: " + obj.getClass().getSimpleName() + ")";
        }
        return "null";
    }

    public final U assertComplete() {
        long j10 = this.completions;
        if (j10 != 0) {
            if (j10 <= 1) {
                return this;
            }
            throw fail("Multiple completions: " + j10);
        }
        throw fail("Not completed");
    }

    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final U assertError(io.reactivex.functions.Predicate<java.lang.Throwable> r9) {
        /*
            r8 = this;
            r5 = r8
            java.util.List<java.lang.Throwable> r0 = r5.errors
            r7 = 6
            int r7 = r0.size()
            r0 = r7
            if (r0 == 0) goto L4e
            r7 = 5
            r7 = 0
            r1 = r7
            java.util.List<java.lang.Throwable> r2 = r5.errors
            r7 = 5
            java.util.Iterator r2 = r2.iterator()
        L15:
            r7 = 5
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L36
            r7 = 2
            java.lang.Object r7 = r2.next()
            r3 = r7
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r7 = 3
            boolean r3 = r9.test(r3)     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L15
            r7 = 3
            r1 = 1
            r7 = 5
            goto L36
        L30:
            r9 = move-exception
            java.lang.RuntimeException r9 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r9)
            throw r9
        L36:
            if (r1 == 0) goto L46
            r7 = 4
            if (r0 != r4) goto L3d
            r7 = 5
            return r5
        L3d:
            java.lang.String r9 = "Error present but other errors as well"
            r7 = 6
            java.lang.AssertionError r9 = r5.fail(r9)
            throw r9
            r7 = 6
        L46:
            java.lang.String r9 = "Error not present"
            java.lang.AssertionError r9 = r5.fail(r9)
            throw r9
            r7 = 4
        L4e:
            java.lang.String r9 = "No errors"
            r7 = 1
            java.lang.AssertionError r9 = r5.fail(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.BaseTestConsumer.assertError(io.reactivex.functions.Predicate):io.reactivex.observers.BaseTestConsumer");
    }

    public final U assertError(Class<? extends Throwable> cls) {
        return assertError(Functions.isInstanceOf(cls));
    }

    public final U assertError(Throwable th) {
        return assertError(Functions.equalsWith(th));
    }

    public final U assertErrorMessage(String str) {
        int size = this.errors.size();
        if (size != 0) {
            if (size == 1) {
                String message = this.errors.get(0).getMessage();
                if (ObjectHelper.equals(str, message)) {
                    return this;
                }
                throw fail("Error message differs; exptected: " + str + " but was: " + message);
            }
            throw fail("Multiple errors");
        }
        throw fail("No errors");
    }

    public final U assertFailure(Predicate<Throwable> predicate, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(predicate).assertNotComplete();
    }

    public final U assertFailure(Class<? extends Throwable> cls, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final U assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final U assertNever(Predicate<? super T> predicate) {
        int size = this.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                if (predicate.test((T) this.values.get(i10))) {
                    throw fail("Value at position " + i10 + " matches predicate " + predicate.toString() + ", which was not expected.");
                }
            } catch (Exception e10) {
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }
        return this;
    }

    public final U assertNever(T t2) {
        int size = this.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ObjectHelper.equals(this.values.get(i10), t2)) {
                StringBuilder n = a.n("Value at position ", i10, " is equal to ");
                n.append(valueAndClass(t2));
                n.append("; Expected them to be different");
                throw fail(n.toString());
            }
        }
        return this;
    }

    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        StringBuilder m10 = a.m("Error(s) present: ");
        m10.append(this.errors);
        throw fail(m10.toString());
    }

    public final U assertNoTimeout() {
        if (this.timeout) {
            throw fail("Timeout?!");
        }
        return this;
    }

    public final U assertNoValues() {
        return assertValueCount(0);
    }

    public final U assertNotComplete() {
        long j10 = this.completions;
        int i10 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
        if (i10 != 0) {
            if (i10 <= 0) {
                return this;
            }
            throw fail("Multiple completions: " + j10);
        }
        throw fail("Completed!");
    }

    public abstract U assertNotSubscribed();

    public final U assertNotTerminated() {
        if (this.done.getCount() != 0) {
            return this;
        }
        throw fail("Subscriber terminated!");
    }

    public final U assertResult(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public abstract U assertSubscribed();

    public final U assertTerminated() {
        if (this.done.getCount() == 0) {
            long j10 = this.completions;
            if (j10 > 1) {
                throw fail("Terminated with multiple completions: " + j10);
            }
            int size = this.errors.size();
            if (size > 1) {
                throw fail("Terminated with multiple errors: " + size);
            } else if (j10 == 0 || size == 0) {
                return this;
            } else {
                throw fail("Terminated with multiple completions and errors: " + j10);
            }
        }
        throw fail("Subscriber still running!");
    }

    public final U assertTimeout() {
        if (this.timeout) {
            return this;
        }
        throw fail("No timeout?!");
    }

    public final U assertValue(Predicate<T> predicate) {
        assertValueAt(0, (Predicate) predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    public final U assertValue(T t2) {
        if (this.values.size() != 1) {
            StringBuilder m10 = a.m("expected: ");
            m10.append(valueAndClass(t2));
            m10.append(" but was: ");
            m10.append(this.values);
            throw fail(m10.toString());
        }
        T t8 = this.values.get(0);
        if (ObjectHelper.equals(t2, t8)) {
            return this;
        }
        StringBuilder m11 = a.m("expected: ");
        m11.append(valueAndClass(t2));
        m11.append(" but was: ");
        m11.append(valueAndClass(t8));
        throw fail(m11.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final U assertValueAt(int r6, io.reactivex.functions.Predicate<T> r7) {
        /*
            r5 = this;
            java.util.List<T> r0 = r5.values
            int r1 = r0.size()
            r0 = r1
            if (r0 == 0) goto L4e
            r2 = 4
            java.util.List<T> r0 = r5.values
            r4 = 5
            int r1 = r0.size()
            r0 = r1
            if (r6 >= r0) goto L33
            r2 = 3
            java.util.List<T> r0 = r5.values     // Catch: java.lang.Exception -> L2c
            r4 = 4
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Exception -> L2c
            boolean r1 = r7.test(r6)     // Catch: java.lang.Exception -> L2c
            r6 = r1
            if (r6 == 0) goto L24
            return r5
        L24:
            java.lang.String r1 = "Value not present"
            r6 = r1
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        L2c:
            r6 = move-exception
            java.lang.RuntimeException r6 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r6)
            throw r6
            r4 = 5
        L33:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r4 = 4
            r7.<init>()
            r3 = 2
            java.lang.String r1 = "Invalid index: "
            r0 = r1
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.AssertionError r1 = r5.fail(r6)
            r6 = r1
            throw r6
            r2 = 2
        L4e:
            r4 = 2
            java.lang.String r1 = "No values"
            r6 = r1
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.BaseTestConsumer.assertValueAt(int, io.reactivex.functions.Predicate):io.reactivex.observers.BaseTestConsumer");
    }

    public final U assertValueAt(int i10, T t2) {
        int size = this.values.size();
        if (size != 0) {
            if (i10 >= size) {
                throw fail("Invalid index: " + i10);
            }
            T t8 = this.values.get(i10);
            if (ObjectHelper.equals(t2, t8)) {
                return this;
            }
            StringBuilder m10 = a.m("expected: ");
            m10.append(valueAndClass(t2));
            m10.append(" but was: ");
            m10.append(valueAndClass(t8));
            throw fail(m10.toString());
        }
        throw fail("No values");
    }

    public final U assertValueCount(int i10) {
        int size = this.values.size();
        if (size == i10) {
            return this;
        }
        throw fail("Value counts differ; expected: " + i10 + " but was: " + size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r3 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r2 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        throw fail("Fewer values received than expected (" + r1 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
        throw fail("More values received than expected (" + r1 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U assertValueSequence(java.lang.Iterable<? extends T> r9) {
        /*
            r8 = this;
            java.util.List<T> r0 = r8.values
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
            r6 = 4
        Lc:
            boolean r2 = r9.hasNext()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            r7 = 5
            if (r2 != 0) goto L1b
            r6 = 5
            goto L58
        L1b:
            java.lang.Object r5 = r9.next()
            r2 = r5
            java.lang.Object r5 = r0.next()
            r3 = r5
            boolean r4 = io.reactivex.internal.functions.ObjectHelper.equals(r2, r3)
            if (r4 == 0) goto L2e
            int r1 = r1 + 1
            goto Lc
        L2e:
            java.lang.String r9 = "Values at position "
            r6 = 3
            java.lang.String r0 = " differ; expected: "
            r6 = 4
            java.lang.StringBuilder r5 = a1.a.n(r9, r1, r0)
            r9 = r5
            java.lang.String r0 = valueAndClass(r2)
            r9.append(r0)
            java.lang.String r5 = " but was: "
            r0 = r5
            r9.append(r0)
            java.lang.String r0 = valueAndClass(r3)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.AssertionError r5 = r8.fail(r9)
            r9 = r5
            throw r9
            r7 = 7
        L58:
            java.lang.String r9 = ")"
            if (r3 != 0) goto L7b
            if (r2 != 0) goto L60
            r6 = 5
            return r8
        L60:
            r7 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Fewer values received than expected ("
            r2 = r5
            r0.append(r2)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.AssertionError r9 = r8.fail(r9)
            throw r9
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = 7
            r0.<init>()
            r6 = 4
            java.lang.String r2 = "More values received than expected ("
            r6 = 6
            r0.append(r2)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.AssertionError r5 = r8.fail(r9)
            r9 = r5
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.BaseTestConsumer.assertValueSequence(java.lang.Iterable):io.reactivex.observers.BaseTestConsumer");
    }

    public final U assertValueSequenceOnly(Iterable<? extends T> iterable) {
        return (U) assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSet(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (T t2 : this.values) {
            if (!collection.contains(t2)) {
                StringBuilder m10 = a.m("Value not in the expected collection: ");
                m10.append(valueAndClass(t2));
                throw fail(m10.toString());
            }
        }
        return this;
    }

    public final U assertValueSetOnly(Collection<? extends T> collection) {
        return (U) assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final U assertValues(T... tArr) {
        int size = this.values.size();
        if (size != tArr.length) {
            StringBuilder m10 = a.m("Value count differs; expected: ");
            m10.append(tArr.length);
            m10.append(" ");
            m10.append(Arrays.toString(tArr));
            m10.append(" but was: ");
            m10.append(size);
            m10.append(" ");
            m10.append(this.values);
            throw fail(m10.toString());
        }
        for (int i10 = 0; i10 < size; i10++) {
            T t2 = this.values.get(i10);
            T t8 = tArr[i10];
            if (!ObjectHelper.equals(t8, t2)) {
                StringBuilder n = a.n("Values at position ", i10, " differ; expected: ");
                n.append(valueAndClass(t8));
                n.append(" but was: ");
                n.append(valueAndClass(t2));
                throw fail(n.toString());
            }
        }
        return this;
    }

    public final U assertValuesOnly(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public final U await() {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final boolean await(long j10, TimeUnit timeUnit) {
        boolean z10;
        if (this.done.getCount() != 0 && !this.done.await(j10, timeUnit)) {
            z10 = false;
            this.timeout = !z10;
            return z10;
        }
        z10 = true;
        this.timeout = !z10;
        return z10;
    }

    public final U awaitCount(int i10) {
        return awaitCount(i10, TestWaitStrategy.SLEEP_10MS, 5000L);
    }

    public final U awaitCount(int i10, Runnable runnable) {
        return awaitCount(i10, runnable, 5000L);
    }

    public final U awaitCount(int i10, Runnable runnable, long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j10 > 0 && System.currentTimeMillis() - currentTimeMillis >= j10) {
                this.timeout = true;
                break;
            } else if (this.done.getCount() != 0 && this.values.size() < i10) {
                runnable.run();
            }
        }
        return this;
    }

    public final U awaitDone(long j10, TimeUnit timeUnit) {
        try {
            if (!this.done.await(j10, timeUnit)) {
                this.timeout = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e10) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e10);
        }
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean awaitTerminalEvent(long j10, TimeUnit timeUnit) {
        try {
            return await(j10, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U clearTimeout() {
        this.timeout = false;
        return this;
    }

    public final long completions() {
        return this.completions;
    }

    public final int errorCount() {
        return this.errors.size();
    }

    public final List<Throwable> errors() {
        return this.errors;
    }

    public final AssertionError fail(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (");
        sb2.append("latch = ");
        sb2.append(this.done.getCount());
        sb2.append(", ");
        sb2.append("values = ");
        sb2.append(this.values.size());
        sb2.append(", ");
        sb2.append("errors = ");
        sb2.append(this.errors.size());
        sb2.append(", ");
        sb2.append("completions = ");
        sb2.append(this.completions);
        if (this.timeout) {
            sb2.append(", timeout!");
        }
        if (isDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
                return assertionError;
            }
            assertionError.initCause(new CompositeException(this.errors));
        }
        return assertionError;
    }

    public final List<List<Object>> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        ArrayList arrayList2 = new ArrayList();
        for (long j10 = 0; j10 < this.completions; j10++) {
            arrayList2.add(Notification.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean isTerminated() {
        return this.done.getCount() == 0;
    }

    public final boolean isTimeout() {
        return this.timeout;
    }

    public final Thread lastThread() {
        return this.lastThread;
    }

    public final int valueCount() {
        return this.values.size();
    }

    public final List<T> values() {
        return this.values;
    }

    public final U withTag(CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }
}
