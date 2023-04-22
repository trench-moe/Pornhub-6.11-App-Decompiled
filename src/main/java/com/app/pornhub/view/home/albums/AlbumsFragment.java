package com.app.pornhub.view.home.albums;

import a1.a;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.q;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c4.e;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentBasicListingsBinding;
import com.app.pornhub.domain.config.PhotosConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.albums.AlbumsFragment;
import com.app.pornhub.view.home.albums.AlbumsFragmentArgs;
import com.app.pornhub.view.home.albums.AlbumsViewModel;
import com.app.pornhub.view.home.albums.Type;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.google.android.material.snackbar.Snackbar;
import g4.s;
import h4.h;
import i4.f;
import i4.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import t3.o;
import x2.e1;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/app/pornhub/view/home/albums/AlbumsFragment;", "Lv3/c;", "<init>", "()V", "Lcom/app/pornhub/view/home/albums/AlbumsFragmentArgs;", "args", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AlbumsFragment extends v3.c {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5052v0 = {Reflection.property1(new PropertyReference1Impl(AlbumsFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentBasicListingsBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5053p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5054q0;

    /* renamed from: r0  reason: collision with root package name */
    public NavigationViewModel f5055r0;

    /* renamed from: s0  reason: collision with root package name */
    public HomeActivityViewModel f5056s0;

    /* renamed from: t0  reason: collision with root package name */
    public AlbumsViewModel f5057t0;

    /* renamed from: u0  reason: collision with root package name */
    public Parcelable f5058u0;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements NotifyingGridLayoutManager.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NotifyingGridLayoutManager f5059a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AlbumsFragment f5060b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f5061c;

        public b(NotifyingGridLayoutManager notifyingGridLayoutManager, AlbumsFragment albumsFragment, f fVar) {
            this.f5059a = notifyingGridLayoutManager;
            this.f5060b = albumsFragment;
            this.f5061c = fVar;
        }

        @Override // com.app.pornhub.view.common.widget.NotifyingGridLayoutManager.a
        public void a() {
            int Y0 = this.f5059a.Y0();
            int X0 = this.f5059a.X0();
            if (X0 != -1 && Y0 != -1) {
                int i10 = (Y0 - X0) + 1;
                HomeActivityViewModel homeActivityViewModel = this.f5060b.f5056s0;
                if (homeActivityViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                    homeActivityViewModel = null;
                }
                homeActivityViewModel.f(o.c(this.f5061c, i10));
                this.f5059a.M = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends GridLayoutManager.b {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f5063c;

        public c(f fVar) {
            this.f5063c = fVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int c(int i10) {
            return this.f5063c.c(i10) == 1 ? 2 : 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends RecyclerView.p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f5064a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NotifyingGridLayoutManager f5065b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AlbumsFragment f5066c;

        public d(f fVar, NotifyingGridLayoutManager notifyingGridLayoutManager, AlbumsFragment albumsFragment) {
            this.f5064a = fVar;
            this.f5065b = notifyingGridLayoutManager;
            this.f5066c = albumsFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (this.f5064a.a() == 0 || this.f5065b.Y0() != this.f5064a.a() - 1) {
                return;
            }
            AlbumsViewModel albumsViewModel = this.f5066c.f5057t0;
            if (albumsViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                albumsViewModel = null;
            }
            int a10 = this.f5064a.a();
            Objects.requireNonNull(albumsViewModel);
            if (PhotosConfig.Companion.hasMoreAlbums(a10)) {
                albumsViewModel.c(a10);
            }
        }
    }

    public AlbumsFragment() {
        super(R.layout.fragment_basic_listings);
        this.f5053p0 = new LinkedHashMap();
        this.f5054q0 = m9.a.F(this, AlbumsFragment$binding$2.f5062c, null, 2);
    }

    @Override // v3.c
    public void K0() {
        this.f5053p0.clear();
    }

    public final void M0(f fVar, List<Album> list) {
        RecyclerView.l layoutManager = N0().f4557f.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.app.pornhub.view.common.widget.NotifyingGridLayoutManager");
        NotifyingGridLayoutManager notifyingGridLayoutManager = (NotifyingGridLayoutManager) layoutManager;
        notifyingGridLayoutManager.D1(new b(notifyingGridLayoutManager, this, fVar));
        int size = fVar.d.size();
        fVar.d.addAll(list);
        fVar.f2802a.e(size, list.size());
    }

    public final FragmentBasicListingsBinding N0() {
        return (FragmentBasicListingsBinding) this.f5054q0.getValue(this, f5052v0[0]);
    }

    public final void O0() {
        NavigationViewModel navigationViewModel = this.f5055r0;
        AlbumsViewModel albumsViewModel = null;
        if (navigationViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
            navigationViewModel = null;
        }
        AlbumsViewModel albumsViewModel2 = this.f5057t0;
        if (albumsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            albumsViewModel2 = null;
        }
        boolean d10 = albumsViewModel2.d();
        Objects.requireNonNull(navigationViewModel);
        navigationViewModel.k(TopNavigation.ChildItem.PhotoOrders.INSTANCE, TopNavigation.ChildItem.PhotoFilters.INSTANCE, d10);
        NavigationViewModel navigationViewModel2 = this.f5055r0;
        if (navigationViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
            navigationViewModel2 = null;
        }
        AlbumsViewModel albumsViewModel3 = this.f5057t0;
        if (albumsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            albumsViewModel3 = null;
        }
        PhotosConfig.PhotoOrder photoOrder = albumsViewModel3.f5075m;
        AlbumsViewModel albumsViewModel4 = this.f5057t0;
        if (albumsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            albumsViewModel = albumsViewModel4;
        }
        navigationViewModel2.C(photoOrder, albumsViewModel.n);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.fragment.app.o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        this.f5055r0 = (NavigationViewModel) new z(s02, L0()).a(NavigationViewModel.class);
        androidx.fragment.app.o s03 = s0();
        Intrinsics.checkNotNullExpressionValue(s03, "requireActivity()");
        this.f5056s0 = (HomeActivityViewModel) new z(s03, L0()).a(HomeActivityViewModel.class);
        a0 viewModelStore = j();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
        this.f5057t0 = (AlbumsViewModel) new z(viewModelStore, L0()).a(AlbumsViewModel.class);
        return super.W(inflater, viewGroup, bundle);
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f5053p0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        final androidx.navigation.f fVar = new androidx.navigation.f(Reflection.getOrCreateKotlinClass(AlbumsFragmentArgs.class), new Function0<Bundle>() { // from class: com.app.pornhub.view.home.albums.AlbumsFragment$onViewCreated$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Bundle invoke() {
                Bundle bundle2 = Fragment.this.f2019u;
                if (bundle2 != null) {
                    return bundle2;
                }
                StringBuilder m10 = a.m("Fragment ");
                m10.append(Fragment.this);
                m10.append(" has null arguments");
                throw new IllegalStateException(m10.toString());
            }
        });
        AlbumsViewModel albumsViewModel = this.f5057t0;
        AlbumFilters albumFilters = null;
        if (albumsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            albumsViewModel = null;
        }
        Type type = ((AlbumsFragmentArgs) fVar.getValue()).a();
        String userId = ((AlbumsFragmentArgs) fVar.getValue()).b();
        Objects.requireNonNull(albumsViewModel);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(userId, "userId");
        albumsViewModel.f5073k = type;
        albumsViewModel.f5074l = userId;
        final f fVar2 = new f(new e1(this, fVar, 1));
        Context u02 = u0();
        Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
        final NotifyingGridLayoutManager notifyingGridLayoutManager = new NotifyingGridLayoutManager(u02, 2);
        notifyingGridLayoutManager.K = new c(fVar2);
        N0().f4557f.setLayoutManager(notifyingGridLayoutManager);
        AlbumsViewModel albumsViewModel2 = this.f5057t0;
        if (albumsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            albumsViewModel2 = null;
        }
        if (!albumsViewModel2.f5079r.isEmpty()) {
            AlbumsViewModel albumsViewModel3 = this.f5057t0;
            if (albumsViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                albumsViewModel3 = null;
            }
            M0(fVar2, albumsViewModel3.f5079r);
        } else {
            AlbumsViewModel albumsViewModel4 = this.f5057t0;
            if (albumsViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                albumsViewModel4 = null;
            }
            z3.a<AlbumsViewModel.State> d10 = albumsViewModel4.f5080s.d();
            if ((d10 == null ? null : d10.f21761a) instanceof AlbumsViewModel.State.LoadingError) {
                N0().f4556e.f4698a.setVisibility(8);
                AlbumsViewModel albumsViewModel5 = this.f5057t0;
                if (albumsViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    albumsViewModel5 = null;
                }
                albumsViewModel5.e();
            }
        }
        N0().f4557f.setAdapter(fVar2);
        N0().f4557f.h(new d(fVar2, notifyingGridLayoutManager, this));
        N0().f4557f.g(new e(E().getDimensionPixelSize(R.dimen.item_grid_spacing_large), 2));
        AlbumsViewModel albumsViewModel6 = this.f5057t0;
        if (albumsViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            albumsViewModel6 = null;
        }
        albumsViewModel6.f5080s.f(K(), new q() { // from class: i4.h
            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                AlbumsViewModel albumsViewModel7;
                AlbumsViewModel albumsViewModel8;
                AlbumsViewModel albumsViewModel9;
                UserOrientation userOrientation;
                NavigationViewModel navigationViewModel;
                AlbumsFragment this$0 = AlbumsFragment.this;
                f adapter = fVar2;
                NotifyingGridLayoutManager layoutManager = notifyingGridLayoutManager;
                androidx.navigation.f args$delegate = fVar;
                KProperty<Object>[] kPropertyArr = AlbumsFragment.f5052v0;
                Type type2 = Type.COMMUNITY;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                Intrinsics.checkNotNullParameter(args$delegate, "$args$delegate");
                AlbumsViewModel.State state = (AlbumsViewModel.State) ((z3.a) obj).a();
                NavigationViewModel navigationViewModel2 = null;
                if (state instanceof AlbumsViewModel.State.b) {
                    if (((AlbumsFragmentArgs) args$delegate.getValue()).a() != type2) {
                        AlbumsViewModel albumsViewModel10 = this$0.f5057t0;
                        if (albumsViewModel10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            albumsViewModel10 = null;
                        }
                        albumsViewModel10.e();
                    }
                    Type a10 = ((AlbumsFragmentArgs) args$delegate.getValue()).a();
                    Objects.requireNonNull(this$0);
                    int ordinal = a10.ordinal();
                    if (ordinal == 0) {
                        t3.a.x(this$0.u0(), "Home", "CommunityAlbums");
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        t3.a.x(this$0.u0(), "UserProfile", "MyAlbumsPrivate");
                    } else {
                        AlbumsViewModel albumsViewModel11 = this$0.f5057t0;
                        if (albumsViewModel11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            albumsViewModel11 = null;
                        }
                        String str = albumsViewModel11.f5074l;
                        if (str == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userId");
                            str = null;
                        }
                        UserMetaData a11 = albumsViewModel11.f5070h.a();
                        t3.a.x(this$0.u0(), "UserProfile", Intrinsics.areEqual(str, a11 == null ? navigationViewModel2 : a11.getId()) ? "MyAlbums" : "UserAlbums");
                    }
                } else if (state instanceof AlbumsViewModel.State.d) {
                    if (adapter.a() != 0) {
                        adapter.p(true);
                        return;
                    }
                    if (this$0.N0().d.getVisibility() == 0) {
                        this$0.N0().d.setVisibility(8);
                    }
                    if (this$0.N0().f4556e.f4698a.getVisibility() == 0) {
                        this$0.N0().f4556e.f4698a.setVisibility(8);
                    }
                    this$0.N0().f4554b.setVisibility(0);
                } else if (state instanceof AlbumsViewModel.State.LoadingDone) {
                    if (adapter.a() == 0) {
                        this$0.N0().f4554b.setVisibility(8);
                        if (((AlbumsViewModel.State.LoadingDone) state).a().isEmpty()) {
                            this$0.N0().f4555c.setText(this$0.I(R.string.no_photos_to_display));
                            this$0.N0().d.setVisibility(0);
                        }
                    } else {
                        adapter.p(false);
                    }
                    this$0.M0(adapter, ((AlbumsViewModel.State.LoadingDone) state).a());
                } else if (state instanceof AlbumsViewModel.State.LoadingError) {
                    if (adapter.a() != 0) {
                        adapter.p(false);
                        Snackbar.k(this$0.N0().f4558g, R.string.error_loading_more_albums, 0).n();
                        return;
                    }
                    AlbumsViewModel.State.LoadingError loadingError = (AlbumsViewModel.State.LoadingError) state;
                    if ((loadingError.a() instanceof PornhubException) && o.l(((PornhubException) loadingError.a()).a())) {
                        NavigationViewModel navigationViewModel3 = this$0.f5055r0;
                        if (navigationViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                            navigationViewModel = navigationViewModel2;
                        } else {
                            navigationViewModel = navigationViewModel3;
                        }
                        navigationViewModel.q(((PornhubException) loadingError.a()).a());
                        return;
                    }
                    String I = this$0.I(R.string.error_default);
                    Intrinsics.checkNotNullExpressionValue(I, "getString(R.string.error_default)");
                    AlbumsViewModel albumsViewModel12 = this$0.f5057t0;
                    if (albumsViewModel12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        albumsViewModel12 = null;
                    }
                    Objects.requireNonNull(albumsViewModel12);
                    UsersConfig.Companion companion = UsersConfig.Companion;
                    UserOrientation userOrientation2 = albumsViewModel12.f5071i;
                    if (userOrientation2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                        userOrientation = navigationViewModel2;
                    } else {
                        userOrientation = userOrientation2;
                    }
                    this$0.N0().f4556e.f4699b.setImageResource(o.g(companion.isGay(userOrientation)));
                    this$0.N0().f4556e.f4698a.setVisibility(0);
                    this$0.N0().f4556e.f4700c.setText(I);
                } else if (state instanceof AlbumsViewModel.State.c) {
                    adapter.m();
                    AlbumsViewModel albumsViewModel13 = this$0.f5057t0;
                    if (albumsViewModel13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        albumsViewModel9 = navigationViewModel2;
                    } else {
                        albumsViewModel9 = albumsViewModel13;
                    }
                    albumsViewModel9.e();
                } else if (state instanceof AlbumsViewModel.State.a) {
                    if (((AlbumsFragmentArgs) args$delegate.getValue()).a() == type2) {
                        HomeActivityViewModel homeActivityViewModel = this$0.f5056s0;
                        if (homeActivityViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                            homeActivityViewModel = null;
                        }
                        homeActivityViewModel.e(((AlbumsViewModel.State.a) state).f5081a);
                        adapter.m();
                        AlbumsViewModel albumsViewModel14 = this$0.f5057t0;
                        if (albumsViewModel14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            albumsViewModel8 = navigationViewModel2;
                        } else {
                            albumsViewModel8 = albumsViewModel14;
                        }
                        albumsViewModel8.e();
                    }
                } else if (state instanceof AlbumsViewModel.State.g) {
                    this$0.f5058u0 = layoutManager.n0();
                    adapter.m();
                    this$0.O0();
                } else if (state instanceof AlbumsViewModel.State.f) {
                    adapter.m();
                } else if (state instanceof AlbumsViewModel.State.e) {
                    adapter.m();
                    AlbumsViewModel albumsViewModel15 = this$0.f5057t0;
                    if (albumsViewModel15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        albumsViewModel7 = navigationViewModel2;
                    } else {
                        albumsViewModel7 = albumsViewModel15;
                    }
                    this$0.M0(adapter, albumsViewModel7.f5079r);
                    this$0.N0().f4557f.post(new s(layoutManager, this$0, 1));
                    this$0.O0();
                    if (this$0.N0().d.getVisibility() == 0) {
                        this$0.N0().d.setVisibility(8);
                    }
                    if (this$0.N0().f4556e.f4698a.getVisibility() == 0) {
                        this$0.N0().f4556e.f4698a.setVisibility(8);
                    }
                    if (this$0.N0().f4554b.getVisibility() == 0) {
                        this$0.N0().f4554b.setVisibility(8);
                    }
                }
            }
        });
        if (((AlbumsFragmentArgs) fVar.getValue()).a() == Type.COMMUNITY) {
            RecyclerView recyclerView = N0().f4557f;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
            HomeActivityViewModel homeActivityViewModel = this.f5056s0;
            if (homeActivityViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel = null;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), homeActivityViewModel.f5019r, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            NavigationViewModel navigationViewModel = this.f5055r0;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                navigationViewModel = null;
            }
            navigationViewModel.f5041m.f(K(), new h(this, 1));
            HomeActivityViewModel homeActivityViewModel2 = this.f5056s0;
            if (homeActivityViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel2 = null;
            }
            homeActivityViewModel2.f5013k.f(K(), new g(this, 0));
            HomeActivityViewModel homeActivityViewModel3 = this.f5056s0;
            if (homeActivityViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel3 = null;
            }
            homeActivityViewModel3.d(true);
            HomeActivityViewModel homeActivityViewModel4 = this.f5056s0;
            if (homeActivityViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel4 = null;
            }
            AlbumsViewModel albumsViewModel7 = this.f5057t0;
            if (albumsViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                albumsViewModel7 = null;
            }
            AlbumFilters albumFilters2 = albumsViewModel7.f5072j;
            if (albumFilters2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("albumFilters");
            } else {
                albumFilters = albumFilters2;
            }
            homeActivityViewModel4.e(albumFilters.getFiltersCount());
        }
        N0().f4556e.f4698a.setOnClickListener(new x3.a(this, 4));
    }
}
