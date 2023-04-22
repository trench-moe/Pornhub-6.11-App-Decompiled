package t4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.view.home.topnav.TopNavAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends n.e<TopNavAdapter.TopNavItem> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(TopNavAdapter.TopNavItem topNavItem, TopNavAdapter.TopNavItem topNavItem2) {
        TopNavAdapter.TopNavItem oldItem = topNavItem;
        TopNavAdapter.TopNavItem newItem = topNavItem2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.c(), newItem.c()) && oldItem.d() == newItem.d();
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(TopNavAdapter.TopNavItem topNavItem, TopNavAdapter.TopNavItem topNavItem2) {
        TopNavAdapter.TopNavItem oldItem = topNavItem;
        TopNavAdapter.TopNavItem newItem = topNavItem2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.b(), newItem.b()) && Intrinsics.areEqual(oldItem.a(), newItem.a());
    }
}
