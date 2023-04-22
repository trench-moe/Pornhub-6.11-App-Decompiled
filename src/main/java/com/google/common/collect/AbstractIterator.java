package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import kb.u;
import kb.x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class AbstractIterator<T> extends x<T> {

    /* renamed from: c  reason: collision with root package name */
    public State f7887c = State.NOT_READY;
    @NullableDecl

    /* renamed from: f  reason: collision with root package name */
    public T f7888f;

    /* loaded from: classes.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        T t2;
        State state = this.f7887c;
        State state2 = State.FAILED;
        if (state != state2) {
            int ordinal = state.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    State state3 = State.DONE;
                    this.f7887c = state2;
                    u uVar = (u) this;
                    while (true) {
                        if (!uVar.f12060j.hasNext()) {
                            uVar.f7887c = state3;
                            t2 = null;
                            break;
                        }
                        t2 = (T) uVar.f12060j.next();
                        if (uVar.f12061m.f12063f.contains(t2)) {
                            break;
                        }
                    }
                    this.f7888f = t2;
                    if (this.f7887c != state3) {
                        this.f7887c = State.READY;
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f7887c = State.NOT_READY;
            T t2 = this.f7888f;
            this.f7888f = null;
            return t2;
        }
        throw new NoSuchElementException();
    }
}
