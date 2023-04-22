package o4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.view.home.explore.adapter.ExploreGifAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends n.e<ExploreGifAdapter.Item> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(ExploreGifAdapter.Item item, ExploreGifAdapter.Item item2) {
        ExploreGifAdapter.Item oldItem = item;
        ExploreGifAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ExploreGifAdapter.Item.GifItem) && (newItem instanceof ExploreGifAdapter.Item.GifItem)) {
            return Intrinsics.areEqual(((ExploreGifAdapter.Item.GifItem) oldItem).a(), ((ExploreGifAdapter.Item.GifItem) newItem).a());
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(ExploreGifAdapter.Item item, ExploreGifAdapter.Item item2) {
        ExploreGifAdapter.Item oldItem = item;
        ExploreGifAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ExploreGifAdapter.Item.GifItem) && (newItem instanceof ExploreGifAdapter.Item.GifItem)) {
            return Intrinsics.areEqual(((ExploreGifAdapter.Item.GifItem) oldItem).a().getId(), ((ExploreGifAdapter.Item.GifItem) newItem).a().getId());
        }
        return false;
    }
}
