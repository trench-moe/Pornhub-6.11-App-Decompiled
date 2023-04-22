package o4;

import androidx.recyclerview.widget.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o4.c;

/* loaded from: classes2.dex */
public final class g extends n.e<c.b> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(c.b bVar, c.b bVar2) {
        c.b oldItem = bVar;
        c.b newItem = bVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(c.b bVar, c.b bVar2) {
        c.b oldItem = bVar;
        c.b newItem = bVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(oldItem.getClass()), Reflection.getOrCreateKotlinClass(newItem.getClass())) && Intrinsics.areEqual(oldItem.f13560a, newItem.f13560a);
    }
}
