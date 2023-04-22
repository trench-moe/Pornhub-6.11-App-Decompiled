package x2;

import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.TextView;
import c4.b;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.config.PlaylistsType;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.ads_promo.PornhubAd;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.gif.MostRecentGifsContainer;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.ChildCommentsActivity;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.discover.DiscoverViewModel;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import com.app.pornhub.view.home.gifs.GifListingsFragment;
import com.app.pornhub.view.home.playlists.PlaylistsViewModel;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kf.a;
import kotlin.jvm.internal.Intrinsics;
import u3.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17793c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17794f;

    public /* synthetic */ m(Object obj, int i10) {
        this.f17793c = i10;
        this.f17794f = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        PlaylistsType playlistsType = null;
        switch (this.f17793c) {
            case 0:
                o this$0 = (o) this.f17794f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17821c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            case 1:
                n0 this$02 = (n0) this.f17794f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17816c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
            case 2:
                c1 this$03 = (c1) this.f17794f;
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                y2.a aVar3 = this$03.f17691c;
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                throw aVar3.a(it3);
            case 3:
                d1 this$04 = (d1) this.f17794f;
                Throwable it4 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                y2.a aVar4 = this$04.f17711c;
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                throw aVar4.a(it4);
            case 4:
                u3.d dVar = (u3.d) this.f17794f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = u3.d.J0;
                Objects.requireNonNull(dVar);
                if (useCaseResult instanceof UseCaseResult.Result) {
                    PornhubAd pornhubAd = (PornhubAd) ((UseCaseResult.Result) useCaseResult).a();
                    dVar.H0 = pornhubAd;
                    dVar.I0.f4502b.setOnTouchListener(new d.b(pornhubAd));
                    WebSettings settings = dVar.I0.f4502b.getSettings();
                    settings.setLoadWithOverviewMode(true);
                    settings.setUseWideViewPort(true);
                    settings.setUserAgentString(settings.getUserAgentString() + "/android_porn_app");
                    dVar.I0.f4502b.setBackgroundColor(-16777216);
                    dVar.I0.f4502b.loadData(URLEncoder.encode("<html>\t<body bgcolor=\"#000000\">\t\t<img width=\"100%\" src=" + dVar.H0.getImgUrl() + " />\t</body></html>", "utf-8").replaceAll("\\+", " "), "text/html", "utf-8");
                    t3.g.h(dVar.q(), true, Long.valueOf(dVar.H0.getAdId()), Integer.valueOf(dVar.H0.getMemberId()), Long.valueOf(dVar.H0.getCampaignId()), dVar.H0.getLink());
                    dVar.F0.f15523b = dVar.H0;
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult).a(), "Error loading TrafficJunky Ads", new Object[0]);
                    return;
                }
                return;
            case 5:
                x3.d dVar2 = (x3.d) this.f17794f;
                int i11 = x3.d.E0;
                dVar2.V0(t3.o.h(dVar2.u0(), (Throwable) obj), UsersConfig.isGay(dVar2.B0.a().getOrientation()));
                return;
            case 6:
                ChildCommentsActivity childCommentsActivity = (ChildCommentsActivity) this.f17794f;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                int i12 = ChildCommentsActivity.Z;
                Objects.requireNonNull(childCommentsActivity);
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    childCommentsActivity.T.f4372f.setVisibility(4);
                    childCommentsActivity.T.f4373g.setVisibility(0);
                } else {
                    childCommentsActivity.T.f4372f.setVisibility(0);
                    childCommentsActivity.T.f4373g.setVisibility(8);
                }
                if (useCaseResult2 instanceof UseCaseResult.Result) {
                    CommentActionResult commentActionResult = (CommentActionResult) ((UseCaseResult.Result) useCaseResult2).a();
                    if (commentActionResult.getResult()) {
                        UserComment userComment = new UserComment(commentActionResult.getCommentId(), childCommentsActivity.T.f4370c.getText().toString().trim(), System.currentTimeMillis() / 1000, 0, 0, new ArrayList(), childCommentsActivity.K.a());
                        c4.b bVar = childCommentsActivity.U;
                        Objects.requireNonNull(bVar);
                        bVar.d.add(0, new b.c(userComment));
                        bVar.e(0);
                        e3.a aVar5 = childCommentsActivity.R;
                        String itemId = childCommentsActivity.X;
                        Objects.requireNonNull(aVar5);
                        Intrinsics.checkNotNullParameter(itemId, "itemId");
                        Intrinsics.checkNotNullParameter(userComment, "userComment");
                        aVar5.f9035a.m(itemId, userComment);
                        childCommentsActivity.T.f4370c.setText(BuildConfig.FLAVOR);
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.getString(R.string.comment_sent), -1).n();
                        childCommentsActivity.T.f4375i.setVisibility(0);
                        childCommentsActivity.T.f4374h.setVisibility(8);
                    } else {
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.getString(R.string.error_post_comment), -1).n();
                    }
                }
                if (useCaseResult2 instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult2).a();
                    if (a10 instanceof OperationException) {
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.C((OperationException) a10), -1).n();
                        return;
                    } else {
                        t3.o.h(childCommentsActivity, a10);
                        return;
                    }
                }
                return;
            case 7:
                GifDetailsActivity gifDetailsActivity = (GifDetailsActivity) this.f17794f;
                UseCaseResult useCaseResult3 = (UseCaseResult) obj;
                int i13 = GifDetailsActivity.U;
                Objects.requireNonNull(gifDetailsActivity);
                if (useCaseResult3 instanceof UseCaseResult.a) {
                    gifDetailsActivity.N.f4384h.setVisibility(0);
                } else {
                    gifDetailsActivity.N.f4384h.setVisibility(8);
                }
                if (useCaseResult3 instanceof UseCaseResult.Result) {
                    Gif gif = (Gif) ((UseCaseResult.Result) useCaseResult3).a();
                    a.C0174a c0174a = kf.a.f12078a;
                    c0174a.a("Got gif info", new Object[0]);
                    c0174a.a("Gif info loaded for gif: %s", gif.getGifMetaData().getTitle());
                    gifDetailsActivity.F(gif);
                    gifDetailsActivity.R.add(gif);
                    t3.a.u("Gif");
                }
                if (useCaseResult3 instanceof UseCaseResult.Failure) {
                    Throwable a11 = ((UseCaseResult.Failure) useCaseResult3).a();
                    kf.a.f12078a.d(a11, "Error loading gif details", new Object[0]);
                    if ((a11 instanceof PornhubException) && ((PornhubException) a11).a() == 72) {
                        gifDetailsActivity.H(gifDetailsActivity.getString(R.string.geolocation_gif_unavailable));
                        return;
                    } else {
                        gifDetailsActivity.H(t3.o.h(gifDetailsActivity, a11));
                        return;
                    }
                }
                return;
            case 8:
                f4.n nVar = (f4.n) this.f17794f;
                UseCaseResult useCaseResult4 = (UseCaseResult) obj;
                int i14 = f4.n.E0;
                Objects.requireNonNull(nVar);
                if (useCaseResult4 instanceof UseCaseResult.Result) {
                    for (Category category : (List) ((UseCaseResult.Result) useCaseResult4).a()) {
                        TextView textView = (TextView) nVar.x().inflate(R.layout.textview_tags, (ViewGroup) null);
                        textView.setText(category.getName());
                        textView.setTag(category);
                        textView.setOnClickListener(nVar.B0);
                        nVar.f9422z0.f4585c.addView(textView);
                    }
                    return;
                }
                return;
            case 9:
                f4.o oVar = (f4.o) this.f17794f;
                UseCaseResult useCaseResult5 = (UseCaseResult) obj;
                int i15 = f4.o.E0;
                Objects.requireNonNull(oVar);
                if (useCaseResult5 instanceof UseCaseResult.a) {
                    oVar.S0();
                } else {
                    oVar.T0();
                }
                if (useCaseResult5 instanceof UseCaseResult.Result) {
                    MostRecentGifsContainer mostRecentGifsContainer = (MostRecentGifsContainer) ((UseCaseResult.Result) useCaseResult5).a();
                    List<GifMetaData> old = mostRecentGifsContainer.getOld();
                    List<GifMetaData> list = mostRecentGifsContainer.getNew();
                    kf.a.f12078a.a("Got %s old and %s new most recent gifs", Integer.valueOf(old.size()), Integer.valueOf(list.size()));
                    oVar.f8761q0 = GifsConfig.Companion.hasMoreRelatedGifs(list.size() + old.size());
                    oVar.C0.q(old);
                    oVar.C0.q(list);
                }
                if (useCaseResult5 instanceof UseCaseResult.Failure) {
                    Throwable a12 = ((UseCaseResult.Failure) useCaseResult5).a();
                    kf.a.f12078a.d(a12, "Error loading most recent gifs", new Object[0]);
                    if (oVar.C0.a() == 0) {
                        oVar.V0(t3.o.h(oVar.u0(), a12), UsersConfig.isGay(oVar.A0.a().getOrientation()));
                        return;
                    } else {
                        Snackbar.k(oVar.f8767x0, R.string.error_loading_more_gifs, -1).n();
                        return;
                    }
                }
                return;
            case 10:
                HomeActivityViewModel this$05 = (HomeActivityViewModel) this.f17794f;
                VideoFilters it5 = (VideoFilters) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                t3.b bVar2 = this$05.f5011i;
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                bVar2.c(it5);
                return;
            case 11:
                DiscoverViewModel this$06 = (DiscoverViewModel) this.f17794f;
                UserOrientation it6 = (UserOrientation) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                UserOrientation userOrientation = this$06.f5150l;
                if (userOrientation == null) {
                    Intrinsics.checkNotNullExpressionValue(it6, "it");
                    this$06.f5150l = it6;
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(it6, "it");
                this$06.f5150l = it6;
                if (it6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                } else {
                    playlistsType = it6;
                }
                if (Intrinsics.areEqual(userOrientation, playlistsType)) {
                    return;
                }
                this$06.f5148j.l(new z3.a<>(DiscoverViewModel.State.c.f5154a));
                return;
            case 12:
                ExploreFragmentViewModel this$07 = (ExploreFragmentViewModel) this.f17794f;
                UserOrientation it7 = (UserOrientation) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                UserOrientation userOrientation2 = this$07.f5174l;
                if (userOrientation2 == null) {
                    Intrinsics.checkNotNullExpressionValue(it7, "it");
                    this$07.f5174l = it7;
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(it7, "it");
                this$07.f5174l = it7;
                if (it7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                } else {
                    playlistsType = it7;
                }
                if (Intrinsics.areEqual(userOrientation2, playlistsType)) {
                    return;
                }
                this$07.f5172j.l(new z3.a<>(ExploreFragmentViewModel.State.c.f5179a));
                return;
            case 13:
                GifListingsFragment gifListingsFragment = (GifListingsFragment) this.f17794f;
                UserSettings userSettings = (UserSettings) obj;
                UserSettings userSettings2 = gifListingsFragment.E0;
                gifListingsFragment.E0 = userSettings;
                if (userSettings2.getOrientation() != userSettings.getOrientation()) {
                    if (!gifListingsFragment.P()) {
                        gifListingsFragment.F0 = null;
                        return;
                    }
                    gifListingsFragment.F0.m();
                    gifListingsFragment.K0();
                    return;
                }
                return;
            case 14:
                PlaylistsViewModel this$08 = (PlaylistsViewModel) this.f17794f;
                UseCaseResult useCaseResult6 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.f5271k.l(useCaseResult6 instanceof UseCaseResult.a ? new z3.a<>(PlaylistsViewModel.State.c.f5274a) : new z3.a<>(PlaylistsViewModel.State.b.f5273a));
                if (useCaseResult6 instanceof UseCaseResult.Result) {
                    this$08.f5270j.l(((UseCaseResult.Result) useCaseResult6).a());
                }
                if (useCaseResult6 instanceof UseCaseResult.Failure) {
                    a.C0174a c0174a2 = kf.a.f12078a;
                    UseCaseResult.Failure failure = (UseCaseResult.Failure) useCaseResult6;
                    Throwable a13 = failure.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error fetching ");
                    PlaylistsType playlistsType2 = this$08.f5272l;
                    if (playlistsType2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contentType");
                    } else {
                        playlistsType = playlistsType2;
                    }
                    sb2.append(playlistsType);
                    sb2.append(" playlists");
                    c0174a2.d(a13, sb2.toString(), new Object[0]);
                    this$08.f5271k.l(new z3.a<>(new PlaylistsViewModel.State.ErrorLoadingPlaylists(failure.a(), UsersConfig.Companion.isGay(this$08.d.a().getOrientation()))));
                    return;
                }
                return;
            case 15:
                com.app.pornhub.view.launch.a aVar6 = (com.app.pornhub.view.launch.a) this.f17794f;
                Throwable th = (Throwable) obj;
                int i16 = com.app.pornhub.view.launch.a.f5378x0;
                Objects.requireNonNull(aVar6);
                kf.a.f12078a.d(th, "Error downloading update", new Object[0]);
                aVar6.M0(th);
                return;
            case 16:
                z4.b bVar3 = (z4.b) this.f17794f;
                UseCaseResult useCaseResult7 = (UseCaseResult) obj;
                int i17 = z4.b.f21776v0;
                Objects.requireNonNull(bVar3);
                if (useCaseResult7 instanceof UseCaseResult.Result) {
                    bVar3.f21784u0.addAll((Collection) ((UseCaseResult.Result) useCaseResult7).a());
                    return;
                }
                return;
            case 17:
                a5.c cVar = (a5.c) this.f17794f;
                UseCaseResult useCaseResult8 = (UseCaseResult) obj;
                String str = a5.c.f177v0;
                Objects.requireNonNull(cVar);
                if (useCaseResult8 instanceof UseCaseResult.Result) {
                    a5.b bVar4 = cVar.f182r0;
                    bVar4.f176j.addAll((List) ((UseCaseResult.Result) useCaseResult8).a());
                    synchronized (bVar4) {
                        DataSetObserver dataSetObserver = bVar4.f18385b;
                        if (dataSetObserver != null) {
                            dataSetObserver.onChanged();
                        }
                    }
                    bVar4.f18384a.notifyChanged();
                }
                if (useCaseResult8 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult8).a(), "Error fetching photos", new Object[0]);
                    return;
                }
                return;
            default:
                com.app.pornhub.view.videodetails.c cVar2 = (com.app.pornhub.view.videodetails.c) this.f17794f;
                int i18 = com.app.pornhub.view.videodetails.c.C0;
                Objects.requireNonNull(cVar2);
                if (UsersConfig.Companion.isUserLoggedIn((UserAuthLevel) obj)) {
                    cVar2.N0(!cVar2.f5600v0);
                    return;
                }
                return;
        }
    }
}
