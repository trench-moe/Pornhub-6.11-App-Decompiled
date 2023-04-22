package c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0046a<T> {
        @SuppressLint({"UnknownNullness"})

        /* renamed from: a  reason: collision with root package name */
        public final T f3716a;

        public C0046a(@SuppressLint({"UnknownNullness"}) T t2) {
            this.f3716a = t2;
        }
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i10);

    public C0046a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i10) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i10, Intent intent);
}
