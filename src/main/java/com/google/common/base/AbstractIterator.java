package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: c  reason: collision with root package name */
    public State f7881c = State.NOT_READY;
    @NullableDecl

    /* renamed from: f  reason: collision with root package name */
    public T f7882f;

    /* loaded from: classes.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r7 = r1.f11670u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (r7 != 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
        r5 = r1.f11667j.length();
        r1.f11669t = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r5 <= r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r8 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
        if (r1.f11668m.b(r1.f11667j.charAt(r8)) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        r1.f11670u = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r1 = r1.f11667j.subSequence(r4, r5).toString();
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractIterator.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f7881c = State.NOT_READY;
            T t2 = this.f7882f;
            this.f7882f = null;
            return t2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
