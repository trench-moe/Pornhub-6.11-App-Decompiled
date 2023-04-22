package o4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.view.home.explore.adapter.ExploreAlbumAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreVideoAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends n.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13550a;

    @Override // androidx.recyclerview.widget.n.e
    public boolean a(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.f13550a) {
            case 0:
                ExploreAlbumAdapter.Item oldItem = (ExploreAlbumAdapter.Item) obj;
                ExploreAlbumAdapter.Item newItem = (ExploreAlbumAdapter.Item) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof ExploreAlbumAdapter.Item.AlbumItem) && (newItem instanceof ExploreAlbumAdapter.Item.AlbumItem)) {
                    z10 = Intrinsics.areEqual(((ExploreAlbumAdapter.Item.AlbumItem) oldItem).a(), ((ExploreAlbumAdapter.Item.AlbumItem) newItem).a());
                }
                return z10;
            default:
                ExploreVideoAdapter.Item oldItem2 = (ExploreVideoAdapter.Item) obj;
                ExploreVideoAdapter.Item newItem2 = (ExploreVideoAdapter.Item) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                return (oldItem2 instanceof ExploreVideoAdapter.Item.a) && (newItem2 instanceof ExploreVideoAdapter.Item.a);
        }
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(Object obj, Object obj2) {
        switch (this.f13550a) {
            case 0:
                ExploreAlbumAdapter.Item oldItem = (ExploreAlbumAdapter.Item) obj;
                ExploreAlbumAdapter.Item newItem = (ExploreAlbumAdapter.Item) obj2;
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof ExploreAlbumAdapter.Item.AlbumItem) && (newItem instanceof ExploreAlbumAdapter.Item.AlbumItem)) {
                    return Intrinsics.areEqual(((ExploreAlbumAdapter.Item.AlbumItem) oldItem).a().getId(), ((ExploreAlbumAdapter.Item.AlbumItem) newItem).a().getId());
                }
                return false;
            default:
                ExploreVideoAdapter.Item oldItem2 = (ExploreVideoAdapter.Item) obj;
                ExploreVideoAdapter.Item newItem2 = (ExploreVideoAdapter.Item) obj2;
                Intrinsics.checkNotNullParameter(oldItem2, "oldItem");
                Intrinsics.checkNotNullParameter(newItem2, "newItem");
                if ((oldItem2 instanceof ExploreVideoAdapter.Item.Video) && (newItem2 instanceof ExploreVideoAdapter.Item.Video)) {
                    return Intrinsics.areEqual(((ExploreVideoAdapter.Item.Video) oldItem2).a().getVkey(), ((ExploreVideoAdapter.Item.Video) newItem2).a().getVkey());
                }
                return true;
        }
    }
}
