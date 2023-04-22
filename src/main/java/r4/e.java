package r4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.databinding.ItemPlaylistBindingBinding;
import com.app.pornhub.domain.model.playlist.Playlist;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends c4.c<Playlist, ItemPlaylistBindingBinding> {

    /* renamed from: f  reason: collision with root package name */
    public final Function2<Playlist, c, Unit> f14663f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14664g;

    /* loaded from: classes2.dex */
    public static final class a extends n.e<Playlist> {
        @Override // androidx.recyclerview.widget.n.e
        public boolean a(Playlist playlist, Playlist playlist2) {
            Playlist oldItem = playlist;
            Playlist newItem = playlist2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(newItem.getTitle(), oldItem.getTitle()) && newItem.getPercent() == oldItem.getPercent() && newItem.getVideoCount() == oldItem.getVideoCount() && newItem.getFavouriteCount() == oldItem.getFavouriteCount() && newItem.getViews() == oldItem.getViews() && Intrinsics.areEqual(newItem.getStatus(), oldItem.getStatus());
        }

        @Override // androidx.recyclerview.widget.n.e
        public boolean b(Playlist playlist, Playlist playlist2) {
            Playlist oldItem = playlist;
            Playlist newItem = playlist2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return newItem.getId() == oldItem.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function2<? super Playlist, ? super c, Unit> function2, String currentUserId) {
        super(new a());
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        this.f14663f = function2;
        this.f14664g = currentUserId;
    }
}
