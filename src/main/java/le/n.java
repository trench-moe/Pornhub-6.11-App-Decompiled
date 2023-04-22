package le;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public final Object f12824a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final Function1<Throwable, Unit> f12825b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Object obj, Function1<? super Throwable, Unit> function1) {
        this.f12824a = obj;
        this.f12825b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f12824a, nVar.f12824a) && Intrinsics.areEqual(this.f12825b, nVar.f12825b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f12824a;
        return this.f12825b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CompletedWithCancellation(result=");
        m10.append(this.f12824a);
        m10.append(", onCancellation=");
        m10.append(this.f12825b);
        m10.append(')');
        return m10.toString();
    }
}
