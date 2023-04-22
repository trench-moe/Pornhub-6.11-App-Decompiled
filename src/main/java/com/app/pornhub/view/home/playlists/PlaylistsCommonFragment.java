package com.app.pornhub.view.home.playlists;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentBasicListingsBinding;
import com.app.pornhub.domain.config.PlaylistsType;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import g4.p;
import j3.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import r4.c;
import r4.e;
import r4.f;
import r4.g;
import t3.l;
import v3.c;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/playlists/PlaylistsCommonFragment;", "Lv3/c;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PlaylistsCommonFragment extends c {

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5245u0 = {Reflection.property1(new PropertyReference1Impl(PlaylistsCommonFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentBasicListingsBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5246p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5247q0;

    /* renamed from: r0  reason: collision with root package name */
    public HomeActivityViewModel f5248r0;

    /* renamed from: s0  reason: collision with root package name */
    public NavigationViewModel f5249s0;

    /* renamed from: t0  reason: collision with root package name */
    public PlaylistsViewModel f5250t0;

    /* loaded from: classes.dex */
    public static final class a implements PlaylistsOverviewAdapter.a {
        public a() {
        }

        @Override // com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter.a
        public void a(Playlist playlist, r4.c actionType) {
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            PlaylistsCommonFragment.M0(PlaylistsCommonFragment.this, playlist, actionType);
        }

        @Override // com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter.a
        public void b(PlaylistsType playlistsType) {
            Intrinsics.checkNotNullParameter(playlistsType, "playlistsType");
            NavigationViewModel navigationViewModel = PlaylistsCommonFragment.this.f5249s0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                navigationViewModel = null;
            }
            navigationViewModel.o(playlistsType);
        }
    }

    public PlaylistsCommonFragment() {
        super(R.layout.fragment_basic_listings);
        this.f5246p0 = new LinkedHashMap();
        this.f5247q0 = m9.a.F(this, PlaylistsCommonFragment$binding$2.f5252c, null, 2);
    }

    public static final void M0(PlaylistsCommonFragment playlistsCommonFragment, Playlist playlist, r4.c cVar) {
        Objects.requireNonNull(playlistsCommonFragment);
        if (Intrinsics.areEqual(cVar, c.b.f14657a)) {
            Context context = playlistsCommonFragment.u0();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
            long id2 = playlist.getId();
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, PlaylistDetailsActivity.class);
            intent.putExtra("playlist_id", id2);
            playlistsCommonFragment.I0(intent);
            return;
        }
        PlaylistsViewModel playlistsViewModel = null;
        if (Intrinsics.areEqual(cVar, c.C0253c.f14658a)) {
            PlaylistsViewModel playlistsViewModel2 = playlistsCommonFragment.f5250t0;
            if (playlistsViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                playlistsViewModel2 = null;
            }
            Objects.requireNonNull(playlistsViewModel2);
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            b bVar = playlistsViewModel2.f5268h;
            Objects.requireNonNull(bVar);
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            bVar.f11370a.h(playlist, null, null);
            playlistsCommonFragment.I0(VideoDetailsActivity.F(playlistsCommonFragment.q(), playlist));
        } else if (!Intrinsics.areEqual(cVar, c.a.f14656a)) {
            if (Intrinsics.areEqual(cVar, c.d.f14659a)) {
                Context u02 = playlistsCommonFragment.u0();
                String string = u02.getString(R.string.share_playlist);
                String title = playlist.getTitle();
                StringBuilder m10 = a1.a.m("https://www.pornhub.com/playlist/view?id=");
                m10.append(playlist.getId());
                l.e(u02, string, title, m10.toString());
            }
        } else {
            long id3 = playlist.getId();
            String title2 = playlist.getTitle();
            String description = playlist.getDescription();
            String status = playlist.getStatus();
            String type = playlist.getType();
            List<String> tags = playlist.getTags();
            PlaylistsViewModel playlistsViewModel3 = playlistsCommonFragment.f5250t0;
            if (playlistsViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                playlistsViewModel = playlistsViewModel3;
            }
            boolean areEqual = Intrinsics.areEqual(playlistsViewModel.d(), String.valueOf(playlist.getUserId()));
            Intrinsics.checkNotNullParameter(title2, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Bundle bundle = new Bundle();
            bundle.putLong("playlist_id", id3);
            bundle.putString("title", title2);
            bundle.putString("description", description);
            bundle.putString("status", status);
            bundle.putString("type", type);
            Object[] array = tags.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            bundle.putStringArray("tags", (String[]) array);
            bundle.putBoolean("curent_user_playlist", areEqual);
            r4.a aVar = new r4.a();
            aVar.A0(bundle);
            aVar.Q0(playlistsCommonFragment.p(), r4.a.class.getSimpleName());
        }
    }

    @Override // v3.c
    public void K0() {
        this.f5246p0.clear();
    }

    public final FragmentBasicListingsBinding N0() {
        return (FragmentBasicListingsBinding) this.f5247q0.getValue(this, f5245u0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        this.f5248r0 = (HomeActivityViewModel) new z(s02, L0()).a(HomeActivityViewModel.class);
        o s03 = s0();
        Intrinsics.checkNotNullExpressionValue(s03, "requireActivity()");
        this.f5249s0 = (NavigationViewModel) new z(s03, L0()).a(NavigationViewModel.class);
        a0 viewModelStore = j();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        this.f5250t0 = (PlaylistsViewModel) new z(viewModelStore, L0()).a(PlaylistsViewModel.class);
        return super.W(inflater, viewGroup, bundle);
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f5246p0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        N0().f4555c.setText(I(R.string.no_playlists));
        Context u02 = u0();
        Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
        NotifyingLinearLayoutManager notifyingLinearLayoutManager = new NotifyingLinearLayoutManager(u02);
        N0().f4557f.setLayoutManager(notifyingLinearLayoutManager);
        RecyclerView recyclerView = N0().f4557f;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
        HomeActivityViewModel homeActivityViewModel = this.f5248r0;
        NavigationViewModel navigationViewModel = null;
        if (homeActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel = null;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), homeActivityViewModel.f5019r, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        PlaylistsOverviewAdapter playlistsOverviewAdapter = new PlaylistsOverviewAdapter(new a());
        Function2<Playlist, r4.c, Unit> function2 = new Function2<Playlist, r4.c, Unit>() { // from class: com.app.pornhub.view.home.playlists.PlaylistsCommonFragment$onViewCreated$playlistListAdapter$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(Playlist playlist, r4.c cVar) {
                Playlist playlist2 = playlist;
                r4.c type = cVar;
                Intrinsics.checkNotNullParameter(playlist2, "playlist");
                Intrinsics.checkNotNullParameter(type, "type");
                PlaylistsCommonFragment.M0(PlaylistsCommonFragment.this, playlist2, type);
                return Unit.INSTANCE;
            }
        };
        PlaylistsViewModel playlistsViewModel = this.f5250t0;
        if (playlistsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            playlistsViewModel = null;
        }
        e eVar = new e(function2, playlistsViewModel.d());
        N0().f4557f.setAdapter(playlistsOverviewAdapter);
        PlaylistsViewModel playlistsViewModel2 = this.f5250t0;
        if (playlistsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            playlistsViewModel2 = null;
        }
        playlistsViewModel2.f5271k.f(K(), new p(this, 5));
        PlaylistsViewModel playlistsViewModel3 = this.f5250t0;
        if (playlistsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            playlistsViewModel3 = null;
        }
        playlistsViewModel3.f5269i.f(K(), new g(notifyingLinearLayoutManager, playlistsOverviewAdapter, this, 0));
        PlaylistsViewModel playlistsViewModel4 = this.f5250t0;
        if (playlistsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            playlistsViewModel4 = null;
        }
        playlistsViewModel4.f5270j.f(K(), new f(notifyingLinearLayoutManager, eVar, this));
        NavigationViewModel navigationViewModel2 = this.f5249s0;
        if (navigationViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
        } else {
            navigationViewModel = navigationViewModel2;
        }
        navigationViewModel.f5041m.f(K(), new g4.c(this, 3));
    }
}
