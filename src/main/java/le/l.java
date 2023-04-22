package le;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public final Object f12817a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final d f12818b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final Function1<Throwable, Unit> f12819c;
    @JvmField
    public final Object d;
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f12820e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Object obj, d dVar, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th) {
        this.f12817a = obj;
        this.f12818b = dVar;
        this.f12819c = function1;
        this.d = obj2;
        this.f12820e = th;
    }

    public l(Object obj, d dVar, Function1 function1, Object obj2, Throwable th, int i10) {
        dVar = (i10 & 2) != 0 ? null : dVar;
        function1 = (i10 & 4) != 0 ? null : function1;
        obj2 = (i10 & 8) != 0 ? null : obj2;
        th = (i10 & 16) != 0 ? null : th;
        this.f12817a = obj;
        this.f12818b = dVar;
        this.f12819c = function1;
        this.d = obj2;
        this.f12820e = th;
    }

    public static l a(l lVar, Object obj, d dVar, Function1 function1, Object obj2, Throwable th, int i10) {
        Object obj3 = (i10 & 1) != 0 ? lVar.f12817a : null;
        if ((i10 & 2) != 0) {
            dVar = lVar.f12818b;
        }
        d dVar2 = dVar;
        Function1<Throwable, Unit> function12 = (i10 & 4) != 0 ? lVar.f12819c : null;
        Object obj4 = (i10 & 8) != 0 ? lVar.d : null;
        if ((i10 & 16) != 0) {
            th = lVar.f12820e;
        }
        Objects.requireNonNull(lVar);
        return new l(obj3, dVar2, function12, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return Intrinsics.areEqual(this.f12817a, lVar.f12817a) && Intrinsics.areEqual(this.f12818b, lVar.f12818b) && Intrinsics.areEqual(this.f12819c, lVar.f12819c) && Intrinsics.areEqual(this.d, lVar.d) && Intrinsics.areEqual(this.f12820e, lVar.f12820e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f12817a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f12818b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.f12819c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f12820e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CompletedContinuation(result=");
        m10.append(this.f12817a);
        m10.append(", cancelHandler=");
        m10.append(this.f12818b);
        m10.append(", onCancellation=");
        m10.append(this.f12819c);
        m10.append(", idempotentResume=");
        m10.append(this.d);
        m10.append(", cancelCause=");
        m10.append(this.f12820e);
        m10.append(')');
        return m10.toString();
    }
}
