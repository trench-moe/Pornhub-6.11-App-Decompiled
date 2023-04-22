package g4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.app.pornhub.NavHomeDirections;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.categories.CategoriesFragment;
import com.app.pornhub.view.home.categories.CategoryAdapter;
import com.app.pornhub.view.home.categories.b;
import com.app.pornhub.view.home.topnav.TopNavAdapter;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.app.pornhub.view.playlistdetails.PlaylistVideosFragment;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements androidx.lifecycle.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9750a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9751b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f9750a = i10;
        this.f9751b = obj;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        switch (this.f9750a) {
            case 0:
                HomeActivity this$0 = (HomeActivity) this.f9751b;
                int i10 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopNavigation.ParentItem parentItem = (TopNavigation.ParentItem) ((z3.a) obj).a();
                if (parentItem == null) {
                    return;
                }
                this$0.Q();
                TopNavAdapter topNavAdapter = this$0.P;
                NavigationViewModel navigationViewModel = this$0.N;
                if (navigationViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel = null;
                }
                topNavAdapter.m(CollectionsKt.toMutableList((Collection) navigationViewModel.f5035g));
                ActivityHomeBinding activityHomeBinding = this$0.K;
                if (activityHomeBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityHomeBinding = null;
                }
                if (activityHomeBinding.f4390b.getSelectedItemId() != R.id.exploreFragment) {
                    ActivityHomeBinding activityHomeBinding2 = this$0.K;
                    if (activityHomeBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding2 = null;
                    }
                    activityHomeBinding2.f4390b.setSelectedItemId(R.id.exploreFragment);
                }
                if (parentItem instanceof TopNavigation.ParentItem.Explore) {
                    this$0.E().l(R.id.exploreFragment, false);
                    return;
                } else if (parentItem instanceof TopNavigation.ParentItem.Discover) {
                    this$0.E().g(R.id.action_global_discoverFragment, new Bundle(), null);
                    return;
                } else if (parentItem instanceof TopNavigation.ParentItem.Videos) {
                    this$0.E().g(R.id.action_global_videosFragment, new Bundle(), null);
                    return;
                } else if (parentItem instanceof TopNavigation.ParentItem.Channels) {
                    this$0.E().g(R.id.action_global_channelsFragment, new Bundle(), null);
                    return;
                } else if (parentItem instanceof TopNavigation.ParentItem.Gifs) {
                    this$0.E().g(R.id.action_global_gifsFragment, new Bundle(), null);
                    return;
                } else if (parentItem instanceof TopNavigation.ParentItem.Photos) {
                    this$0.E().i(NavHomeDirections.b.c(NavHomeDirections.f4266a, null, null, 3));
                    return;
                } else if (parentItem instanceof TopNavigation.ParentItem.Playlists) {
                    this$0.E().g(R.id.action_global_playlistsFragment, new Bundle(), null);
                    return;
                } else {
                    return;
                }
            case 1:
                CategoriesFragment categoriesFragment = (CategoriesFragment) this.f9751b;
                int i11 = CategoriesFragment.f5092y0;
                Objects.requireNonNull(categoriesFragment);
                b.a aVar = (b.a) ((z3.a) obj).a();
                int i12 = 8;
                if (aVar instanceof b.a.d) {
                    categoriesFragment.w0.setVisibility(((b.a.d) aVar).f5127a ? 0 : 8);
                }
                if (aVar instanceof b.a.C0052a) {
                    boolean z10 = ((b.a.C0052a) aVar).f5124a;
                    ProgressBar progressBar = categoriesFragment.w0;
                    if (z10) {
                        i12 = 0;
                    }
                    progressBar.setVisibility(i12);
                }
                if (aVar instanceof b.a.C0053b) {
                    String I = categoriesFragment.I(R.string.error_default);
                    ((ImageView) categoriesFragment.f5100x0.findViewById(R.id.error_segment_image)).setImageResource(t3.o.g(((b.a.C0053b) aVar).f5125a));
                    categoriesFragment.f5100x0.setVisibility(0);
                    ((TextView) categoriesFragment.f5100x0.findViewById(R.id.error_txtError)).setText(I);
                }
                if (aVar instanceof b.a.c) {
                    CategoryAdapter categoryAdapter = categoriesFragment.f5097t0;
                    categoryAdapter.f5104e.clear();
                    categoryAdapter.f5105f.clear();
                    categoryAdapter.f2802a.b();
                }
                return;
            case 2:
                VideoListingsViewModel this$02 = (VideoListingsViewModel) this.f9751b;
                n1.i<VideoMetaData> iVar = (n1.i) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (iVar == null) {
                    return;
                }
                this$02.c().l(iVar);
                return;
            default:
                PlaylistVideosFragment this$03 = (PlaylistVideosFragment) this.f9751b;
                List list = (List) obj;
                int i13 = PlaylistVideosFragment.C0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                b5.d dVar = this$03.B0;
                if (dVar == null) {
                    return;
                }
                dVar.d.clear();
                dVar.d.addAll(list);
                dVar.f2802a.b();
                return;
        }
    }
}
