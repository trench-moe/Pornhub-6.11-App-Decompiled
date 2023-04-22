package o4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.view.home.explore.adapter.ExploreCategoryAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends n.e<ExploreCategoryAdapter.Item> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(ExploreCategoryAdapter.Item item, ExploreCategoryAdapter.Item item2) {
        ExploreCategoryAdapter.Item oldItem = item;
        ExploreCategoryAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ExploreCategoryAdapter.Item.CategoryItem) && (newItem instanceof ExploreCategoryAdapter.Item.CategoryItem)) {
            return Intrinsics.areEqual(((ExploreCategoryAdapter.Item.CategoryItem) oldItem).a(), ((ExploreCategoryAdapter.Item.CategoryItem) newItem).a());
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(ExploreCategoryAdapter.Item item, ExploreCategoryAdapter.Item item2) {
        ExploreCategoryAdapter.Item oldItem = item;
        ExploreCategoryAdapter.Item newItem = item2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof ExploreCategoryAdapter.Item.CategoryItem) && (newItem instanceof ExploreCategoryAdapter.Item.CategoryItem)) {
            return Intrinsics.areEqual(((ExploreCategoryAdapter.Item.CategoryItem) oldItem).a().getId(), ((ExploreCategoryAdapter.Item.CategoryItem) newItem).a().getId());
        }
        return false;
    }
}
