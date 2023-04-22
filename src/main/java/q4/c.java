package q4;

import androidx.recyclerview.widget.n;
import kotlin.jvm.internal.Intrinsics;
import q4.d;

/* loaded from: classes2.dex */
public final class c extends n.e<d.e> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(d.e eVar, d.e eVar2) {
        d.e oldItem = eVar;
        d.e newItem = eVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.f14355b, newItem.f14355b);
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(d.e eVar, d.e eVar2) {
        d.e oldItem = eVar;
        d.e newItem = eVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.f14354a == newItem.f14354a && Intrinsics.areEqual(oldItem.f14356c, newItem.f14356c);
    }
}
