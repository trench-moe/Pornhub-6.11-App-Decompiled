package o4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.view.home.explore.adapter.ExploreChannelsAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends n.e<ExploreChannelsAdapter.Item> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(ExploreChannelsAdapter.Item item, ExploreChannelsAdapter.Item item2) {
        ExploreChannelsAdapter.Item oldItem = item;
        ExploreChannelsAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return true;
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(ExploreChannelsAdapter.Item item, ExploreChannelsAdapter.Item item2) {
        ExploreChannelsAdapter.Item oldItem = item;
        ExploreChannelsAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ExploreChannelsAdapter.Item.Channel) && (newItem instanceof ExploreChannelsAdapter.Item.Channel)) {
            return Intrinsics.areEqual(((ExploreChannelsAdapter.Item.Channel) oldItem).a().getId(), ((ExploreChannelsAdapter.Item.Channel) newItem).a().getId());
        }
        return false;
    }
}
