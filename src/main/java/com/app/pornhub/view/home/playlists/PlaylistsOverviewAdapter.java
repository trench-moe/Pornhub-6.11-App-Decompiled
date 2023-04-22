package com.app.pornhub.view.home.playlists;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.config.PlaylistsType;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PlaylistsOverviewAdapter extends RecyclerView.Adapter<b> {
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public List<Item> f5253e;

    /* renamed from: f  reason: collision with root package name */
    public String f5254f;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/view/home/playlists/PlaylistsOverviewAdapter$Item;", BuildConfig.FLAVOR, "Lcom/app/pornhub/view/home/playlists/PlaylistsOverviewAdapter$d;", "component1", "type", "Lcom/app/pornhub/view/home/playlists/PlaylistsOverviewAdapter$d;", DvdsConfig.TYPE_CATEGORY, "()Lcom/app/pornhub/view/home/playlists/PlaylistsOverviewAdapter$d;", "Lcom/app/pornhub/domain/model/playlist/Playlist;", PlaylistsConfig.TYPE_PLAYLIST, "Lcom/app/pornhub/domain/model/playlist/Playlist;", "a", "()Lcom/app/pornhub/domain/model/playlist/Playlist;", "Lcom/app/pornhub/domain/config/PlaylistsType;", "playlistCategory", "Lcom/app/pornhub/domain/config/PlaylistsType;", "b", "()Lcom/app/pornhub/domain/config/PlaylistsType;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Item {
        private final Playlist playlist;
        private final PlaylistsType playlistCategory;
        private final d type;

        public Item(d type, Playlist playlist, PlaylistsType playlistsType) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.playlist = playlist;
            this.playlistCategory = playlistsType;
        }

        public final Playlist a() {
            return this.playlist;
        }

        public final PlaylistsType b() {
            return this.playlistCategory;
        }

        public final d c() {
            return this.type;
        }

        public final d component1() {
            return this.type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Item) {
                Item item = (Item) obj;
                if (Intrinsics.areEqual(this.type, item.type) && Intrinsics.areEqual(this.playlist, item.playlist) && Intrinsics.areEqual(this.playlistCategory, item.playlistCategory)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Playlist playlist = this.playlist;
            int i10 = 0;
            int hashCode2 = (hashCode + (playlist == null ? 0 : playlist.hashCode())) * 31;
            PlaylistsType playlistsType = this.playlistCategory;
            if (playlistsType != null) {
                i10 = playlistsType.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Item(type=");
            m10.append(this.type);
            m10.append(", playlist=");
            m10.append(this.playlist);
            m10.append(", playlistCategory=");
            m10.append(this.playlistCategory);
            m10.append(')');
            return m10.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(Playlist playlist, r4.c cVar);

        void b(PlaylistsType playlistsType);
    }

    /* loaded from: classes.dex */
    public static abstract class b extends RecyclerView.z {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }

        public abstract void x(Item item, int i10);
    }

    /* loaded from: classes.dex */
    public final class c extends b {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ int f5255w = 0;

        /* renamed from: u  reason: collision with root package name */
        public final View f5256u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ PlaylistsOverviewAdapter f5257v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PlaylistsOverviewAdapter this$0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5257v = this$0;
            this.f5256u = view;
        }

        @Override // com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter.b
        public void x(Item item, int i10) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) this.f5256u.findViewById(R.id.plsHeaderTitle);
            d c10 = item.c();
            textView.setText(c10 instanceof d.c ? this.f5256u.getContext().getString(R.string.my_public_playlists) : c10 instanceof d.b ? this.f5256u.getContext().getString(R.string.my_private_playlists) : c10 instanceof d.a ? this.f5256u.getContext().getString(R.string.my_favorite_playlists) : BuildConfig.FLAVOR);
            ((TextView) this.f5256u.findViewById(R.id.plsHeaderActionButton)).setOnClickListener(new r4.d(item, this.f5257v, 1));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* loaded from: classes.dex */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5258a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5259a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5260a = new c();

            public c() {
                super(null);
            }
        }

        /* renamed from: com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0055d extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final C0055d f5261a = new C0055d();

            public C0055d() {
                super(null);
            }
        }

        public d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public final class e extends b {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ int f5262w = 0;

        /* renamed from: u  reason: collision with root package name */
        public final View f5263u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ PlaylistsOverviewAdapter f5264v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PlaylistsOverviewAdapter this$0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5264v = this$0;
            this.f5263u = view;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01de  */
        @Override // com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void x(com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter.Item r13, int r14) {
            /*
                Method dump skipped, instructions count: 563
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter.e.x(com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter$Item, int):void");
        }
    }

    public PlaylistsOverviewAdapter(a clickCallback) {
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        this.d = clickCallback;
        this.f5253e = new ArrayList();
        this.f5254f = BuildConfig.FLAVOR;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.f5253e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        d c10 = this.f5253e.get(i10).c();
        if (c10 instanceof d.c ? true : Intrinsics.areEqual(c10, d.b.f5259a) ? true : Intrinsics.areEqual(c10, d.a.f5258a)) {
            return 0;
        }
        if (c10 instanceof d.C0055d) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(b bVar, int i10) {
        b holder = bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.x(this.f5253e.get(i10), i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public b i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 == 0) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlists_header, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…lse\n                    )");
            return new c(this, inflate);
        } else if (i10 == 1) {
            View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "from(parent.context).inf…lse\n                    )");
            return new e(this, inflate2);
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }
}
