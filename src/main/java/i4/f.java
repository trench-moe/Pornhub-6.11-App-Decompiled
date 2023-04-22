package i4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.view.common.widget.AlbumCoverImageViewCustom;
import com.app.pornhub.view.home.albums.AlbumsFragment;
import com.app.pornhub.view.home.albums.AlbumsFragmentArgs;
import com.app.pornhub.view.home.albums.Type;
import com.app.pornhub.view.photos.AlbumDetailsActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import x2.e1;

/* loaded from: classes2.dex */
public class f extends c4.a<Album> {

    /* renamed from: e  reason: collision with root package name */
    public b f10507e;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public int f10508c;

        public a(int i10) {
            this.f10508c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f fVar = f.this;
            b bVar = fVar.f10507e;
            Album album = (Album) fVar.d.get(this.f10508c);
            e1 e1Var = (e1) bVar;
            AlbumsFragment this$0 = (AlbumsFragment) e1Var.f17717f;
            androidx.navigation.f args$delegate = (androidx.navigation.f) e1Var.f17718j;
            KProperty<Object>[] kPropertyArr = AlbumsFragment.f5052v0;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(args$delegate, "$args$delegate");
            Type a10 = ((AlbumsFragmentArgs) args$delegate.getValue()).a();
            Objects.requireNonNull(this$0);
            if (AlbumsFragment.a.$EnumSwitchMapping$0[a10.ordinal()] == 1) {
                t3.a.y(ExploreModel.ALBUM);
                Context u02 = this$0.u0();
                FirebaseAnalytics.getInstance(u02).a("album_selection", android.support.v4.media.b.c("album_type", "community", u02));
            } else {
                t3.a.y("album_owner");
                Context u03 = this$0.u0();
                FirebaseAnalytics.getInstance(u03).a("album_selection", android.support.v4.media.b.c("album_type", PlaylistsConfig.TYPE_PRIVATE, u03));
            }
            this$0.I0(AlbumDetailsActivity.C(this$0.u0(), album, ((AlbumsFragmentArgs) args$delegate.getValue()).a() == Type.PRIVATE));
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public static class c extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public AlbumCoverImageViewCustom f10510u;

        /* renamed from: v  reason: collision with root package name */
        public TextView f10511v;

        /* renamed from: w  reason: collision with root package name */
        public TextView f10512w;

        public c(View view) {
            super(view);
            this.f10510u = (AlbumCoverImageViewCustom) view.findViewById(R.id.album_tile_imgThumbnail);
            this.f10511v = (TextView) view.findViewById(R.id.album_tile_txtName);
            this.f10512w = (TextView) view.findViewById(R.id.album_tile_txtCount);
        }
    }

    public f(b bVar) {
        super(new ArrayList());
        this.f10507e = bVar;
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        c cVar = (c) zVar;
        Album album = (Album) this.d.get(i10);
        cVar.f10511v.setText(album.getTitle());
        cVar.f10512w.setText(Integer.toString(album.getImgCount()));
        com.bumptech.glide.b.e(cVar.f10510u).o(album.getUrlThumbnail()).j(R.drawable.thumb_preview).A(cVar.f10510u);
        cVar.f10510u.setOnClickListener(new a(i10));
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_tile, viewGroup, false));
    }
}
