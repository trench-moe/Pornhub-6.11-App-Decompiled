package o4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.view.home.explore.adapter.ExplorePornstarAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends n.e<ExplorePornstarAdapter.Item> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(ExplorePornstarAdapter.Item item, ExplorePornstarAdapter.Item item2) {
        ExplorePornstarAdapter.Item oldItem = item;
        ExplorePornstarAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ExplorePornstarAdapter.Item.Performer) && (newItem instanceof ExplorePornstarAdapter.Item.Performer)) {
            return Intrinsics.areEqual(((ExplorePornstarAdapter.Item.Performer) oldItem).a(), ((ExplorePornstarAdapter.Item.Performer) newItem).a());
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(ExplorePornstarAdapter.Item item, ExplorePornstarAdapter.Item item2) {
        ExplorePornstarAdapter.Item oldItem = item;
        ExplorePornstarAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ExplorePornstarAdapter.Item.Performer) && (newItem instanceof ExplorePornstarAdapter.Item.Performer)) {
            return Intrinsics.areEqual(((ExplorePornstarAdapter.Item.Performer) oldItem).a().getSlug(), ((ExplorePornstarAdapter.Item.Performer) newItem).a().getSlug());
        }
        return true;
    }
}
