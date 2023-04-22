package x2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.app.pornhub.R;
import com.app.pornhub.data.model.update.PronstoreEventResponse;
import com.app.pornhub.data.model.user.SignUpTokenModel;
import com.app.pornhub.domain.config.CommentsConfig;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PhotosConfig;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.OptionalKt;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.model.dvd.Dvd;
import com.app.pornhub.domain.model.dvd.DvdListContainer;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.comments.a;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.albums.AlbumsViewModel;
import com.app.pornhub.view.home.categories.b;
import com.app.pornhub.view.home.discover.DiscoverViewModel;
import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import com.app.pornhub.view.launch.LaunchViewModel;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import com.app.pornhub.view.user.UserFriendsFragment;
import com.app.pornhub.view.user.UserVideoListingsFragment;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17729c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17730f;

    public /* synthetic */ g(Object obj, int i10) {
        this.f17729c = i10;
        this.f17730f = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        Disposable disposable;
        boolean z10 = true;
        UserOrientation userOrientation = null;
        switch (this.f17729c) {
            case 0:
                l this$0 = (l) this.f17730f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17778c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            case 1:
                m0 this$02 = (m0) this.f17730f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.f17803j = (SignUpTokenModel) obj;
                return;
            case 2:
                n0 this$03 = (n0) this.f17730f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                y2.a aVar2 = this$03.f17816c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
            case 3:
                x0 this$04 = (x0) this.f17730f;
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                y2.a aVar3 = this$04.f17886c;
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                throw aVar3.a(it3);
            case 4:
                j1 this$05 = (j1) this.f17730f;
                PronstoreEventResponse pronstoreEventResponse = (PronstoreEventResponse) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                kf.a.f12078a.a("Got pronstore event response ::: %s", pronstoreEventResponse);
                this$05.f17763i = pronstoreEventResponse.getId();
                return;
            case 5:
                m1 this$06 = (m1) this.f17730f;
                Throwable it4 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                y2.a aVar4 = this$06.d;
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                throw aVar4.a(it4);
            case 6:
                PremiumRegistrationActivity premiumRegistrationActivity = (PremiumRegistrationActivity) this.f17730f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = PremiumRegistrationActivity.P;
                Objects.requireNonNull(premiumRegistrationActivity);
                if (useCaseResult instanceof UseCaseResult.Result) {
                    kf.a.f12078a.c("Auto login after premium purchase completed", new Object[0]);
                    premiumRegistrationActivity.O = true;
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult).a(), "Auto login after premium purchase failed", new Object[0]);
                    premiumRegistrationActivity.O = true;
                    return;
                }
                return;
            case 7:
                CommentsFragment commentsFragment = (CommentsFragment) this.f17730f;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                int i11 = CommentsFragment.M0;
                Objects.requireNonNull(commentsFragment);
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    commentsFragment.E0 = true;
                    if (commentsFragment.J0.a() == 0) {
                        commentsFragment.C0.f4663h.setVisibility(0);
                        commentsFragment.C0.f4665j.setVisibility(8);
                    } else {
                        new Handler().post(new q0.d(commentsFragment, 2));
                    }
                } else {
                    commentsFragment.E0 = false;
                    if (commentsFragment.J0.a() == 0) {
                        commentsFragment.C0.f4663h.setVisibility(8);
                    } else {
                        commentsFragment.J0.p(false);
                    }
                }
                if (useCaseResult2 instanceof UseCaseResult.Result) {
                    List<UserComment> list = (List) ((UseCaseResult.Result) useCaseResult2).a();
                    kf.a.f12078a.a("Got %s comments", Integer.valueOf(list.size()));
                    commentsFragment.D0 = CommentsConfig.Companion.hasMoreComments(list.size());
                    com.app.pornhub.view.comments.a aVar5 = commentsFragment.J0;
                    Objects.requireNonNull(aVar5);
                    ArrayList arrayList = new ArrayList();
                    for (UserComment userComment : list) {
                        arrayList.add(new a.c(userComment));
                    }
                    int size = aVar5.d.size();
                    aVar5.d.addAll(arrayList);
                    aVar5.f2802a.e(size, arrayList.size());
                    commentsFragment.C0.f4668m.setText(String.format(Locale.getDefault(), "(%d)", Integer.valueOf(commentsFragment.J0.a())));
                    commentsFragment.P0();
                }
                if (useCaseResult2 instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult2).a();
                    kf.a.f12078a.d(a10, "Error loading video comments for vkey %s", commentsFragment.H0);
                    commentsFragment.Q0(t3.o.h(commentsFragment.u0(), a10));
                    return;
                }
                return;
            case 8:
                HomeActivityViewModel this$07 = (HomeActivityViewModel) this.f17730f;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                String searchQuery = (String) pair.getFirst();
                SearchSuggestionsConfig.SearchSource source = (SearchSuggestionsConfig.SearchSource) pair.getSecond();
                Objects.requireNonNull(this$07);
                if (searchQuery.length() == 0) {
                    this$07.f5014l.l(new HomeActivityViewModel.GlobalStateEvent.SearchSuggestion(BuildConfig.FLAVOR, OptionalKt.asOptional(null)));
                    return;
                }
                Disposable disposable2 = this$07.f5018q;
                if (((disposable2 == null || disposable2.isDisposed()) ? false : false) && (disposable = this$07.f5018q) != null) {
                    disposable.dispose();
                }
                l3.a aVar6 = this$07.f5010h;
                Objects.requireNonNull(aVar6);
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                Intrinsics.checkNotNullParameter(source, "source");
                Observable startWith = aVar6.f12220a.a(searchQuery, source).toObservable().map(z.H).onErrorReturn(a0.L).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith, "searchSuggestionsReposit…th(UseCaseResult.Loading)");
                this$07.f5018q = startWith.subscribe(new y3.b(searchQuery, this$07));
                return;
            case 9:
                AlbumsViewModel this$08 = (AlbumsViewModel) this.f17730f;
                AlbumFilters it5 = (AlbumFilters) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (this$08.f5072j != null) {
                    this$08.f5080s.l(new z3.a<>(new AlbumsViewModel.State.a(it5.getFiltersCount())));
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                this$08.f5072j = AlbumFilters.copy$default(it5, null, null, 3, null);
                return;
            case 10:
                com.app.pornhub.view.home.categories.b this$09 = (com.app.pornhub.view.home.categories.b) this.f17730f;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                kf.a.f12078a.d((Throwable) obj, "Error fetching all categories combo", new Object[0]);
                this$09.f5121j.l(new z3.a<>(new b.a.C0053b(UsersConfig.Companion.isGay(this$09.f5120i.a()))));
                return;
            case 11:
                DiscoverViewModel this$010 = (DiscoverViewModel) this.f17730f;
                UseCaseResult useCaseResult3 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                if (useCaseResult3 instanceof UseCaseResult.Result) {
                    this$010.f5149k.l(new z3.a<>(((UseCaseResult.Result) useCaseResult3).a()));
                    return;
                } else if (useCaseResult3 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.a("Promo banner not available", new Object[0]);
                    return;
                } else {
                    return;
                }
            case 12:
                m4.d dVar = (m4.d) this.f17730f;
                UseCaseResult useCaseResult4 = (UseCaseResult) obj;
                int i12 = m4.d.F0;
                Objects.requireNonNull(dVar);
                if (useCaseResult4 instanceof UseCaseResult.a) {
                    dVar.f8759o0 = null;
                    dVar.f8765u0.setVisibility(8);
                    dVar.S0();
                } else {
                    dVar.T0();
                }
                if (useCaseResult4 instanceof UseCaseResult.Result) {
                    List<Dvd> dvds = ((DvdListContainer) ((UseCaseResult.Result) useCaseResult4).a()).getDvds();
                    dVar.f8761q0 = DvdsConfig.Companion.hasMoreDvds(dvds.size());
                    m4.c cVar = dVar.C0;
                    int size2 = cVar.d.size();
                    cVar.d.addAll(dvds);
                    cVar.f2802a.e(size2, dvds.size());
                    dVar.R0();
                }
                if (useCaseResult4 instanceof UseCaseResult.Failure) {
                    Throwable a11 = ((UseCaseResult.Failure) useCaseResult4).a();
                    kf.a.f12078a.d(a11, "Error loading dvds", new Object[0]);
                    dVar.V0(t3.o.h(dVar.u0(), a11), UsersConfig.isGay(dVar.B0));
                    return;
                }
                return;
            case 13:
                PerformersViewModel this$011 = (PerformersViewModel) this.f17730f;
                UserOrientation it6 = (UserOrientation) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullExpressionValue(it6, "it");
                this$011.f5303k = it6;
                k3.d dVar2 = this$011.f5302j;
                if (it6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                } else {
                    userOrientation = it6;
                }
                Objects.requireNonNull(dVar2);
                Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
                Observable startWith2 = dVar2.f11781a.h(userOrientation).toObservable().map(y.F).onErrorReturn(i1.C).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith2, "performersRepository.get…th(UseCaseResult.Loading)");
                Disposable subscribe = startWith2.subscribe(new c(this$011, 16));
                Intrinsics.checkNotNullExpressionValue(subscribe, "getPerformersConfigUseCa…          }\n            }");
                DisposableKt.addTo(subscribe, this$011.f16001c);
                return;
            case 14:
                LaunchViewModel this$012 = (LaunchViewModel) this.f17730f;
                UseCaseResult useCaseResult5 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                if (useCaseResult5 instanceof UseCaseResult.Result) {
                    this$012.f5374l.onNext(((Boolean) ((UseCaseResult.Result) useCaseResult5).a()).booleanValue() ? LaunchViewModel.UpdateState.a.f5376a : LaunchViewModel.UpdateState.b.f5377a);
                    return;
                } else if (useCaseResult5 instanceof UseCaseResult.Failure) {
                    UseCaseResult.Failure failure = (UseCaseResult.Failure) useCaseResult5;
                    kf.a.f12078a.d(failure.a(), "Error checking for updates", new Object[0]);
                    this$012.f5374l.onNext(new LaunchViewModel.UpdateState.ErrorCheckUpdate(failure.a()));
                    return;
                } else {
                    return;
                }
            case 15:
                a5.e eVar = (a5.e) this.f17730f;
                UseCaseResult useCaseResult6 = (UseCaseResult) obj;
                String str = a5.e.I0;
                Objects.requireNonNull(eVar);
                if (useCaseResult6 instanceof UseCaseResult.a) {
                    eVar.S0();
                } else {
                    eVar.T0();
                }
                if (useCaseResult6 instanceof UseCaseResult.Result) {
                    List list2 = (List) ((UseCaseResult.Result) useCaseResult6).a();
                    a5.d dVar3 = eVar.E0;
                    int size3 = dVar3.d.size();
                    dVar3.d.addAll(list2);
                    dVar3.f2802a.e(size3, list2.size());
                    eVar.f8761q0 = PhotosConfig.Companion.hasMorePhotos(list2.size());
                    eVar.R0();
                }
                if (useCaseResult6 instanceof UseCaseResult.Failure) {
                    Throwable a12 = ((UseCaseResult.Failure) useCaseResult6).a();
                    kf.a.f12078a.d(a12, "Error fetching photos", new Object[0]);
                    if (eVar.E0.a() == 0) {
                        eVar.V0(t3.o.h(eVar.u0(), a12), UsersConfig.isGay(eVar.D0));
                        return;
                    }
                    eVar.T0();
                    Toast.makeText(eVar.n(), eVar.I(R.string.error_loading_more_photos), 0).show();
                    return;
                }
                return;
            case 16:
                PlaylistDetailsViewModel this$013 = (PlaylistDetailsViewModel) this.f17730f;
                UseCaseResult useCaseResult7 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                this$013.f5436h.l(useCaseResult7 instanceof UseCaseResult.a ? PlaylistDetailsViewModel.a.f.f5448a : PlaylistDetailsViewModel.a.b.f5443a);
                if (useCaseResult7 instanceof UseCaseResult.Result) {
                    this$013.c(((Playlist) ((UseCaseResult.Result) useCaseResult7).a()).getVideos());
                }
                if (useCaseResult7 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult7).a(), "Error fetching more playlist videos", new Object[0]);
                    this$013.f5436h.l(PlaylistDetailsViewModel.a.d.f5446a);
                    return;
                }
                return;
            case 17:
                UserFriendsFragment userFriendsFragment = (UserFriendsFragment) this.f17730f;
                UseCaseResult useCaseResult8 = (UseCaseResult) obj;
                int i13 = UserFriendsFragment.O0;
                Objects.requireNonNull(userFriendsFragment);
                if (useCaseResult8 instanceof UseCaseResult.a) {
                    userFriendsFragment.L0 = true;
                    if (userFriendsFragment.f5502v0.a() == 0) {
                        userFriendsFragment.f5503x0.setVisibility(0);
                        userFriendsFragment.f5504y0.setVisibility(0);
                        userFriendsFragment.f5505z0.setVisibility(8);
                    }
                    userFriendsFragment.C0.setVisibility(0);
                    userFriendsFragment.D0.setVisibility(8);
                } else {
                    userFriendsFragment.L0 = false;
                }
                if (useCaseResult8 instanceof UseCaseResult.Result) {
                    List<UserMetaData> list3 = (List) ((UseCaseResult.Result) useCaseResult8).a();
                    kf.a.f12078a.e("Got %s users", Integer.valueOf(list3.size()));
                    if (userFriendsFragment.f5502v0.a() == 0) {
                        userFriendsFragment.w0.setOnScrollListener(userFriendsFragment.M0);
                    }
                    com.app.pornhub.view.user.a aVar7 = userFriendsFragment.f5502v0;
                    Objects.requireNonNull(aVar7);
                    for (UserMetaData userMetaData : list3) {
                        String substring = userMetaData.getUsername().substring(0, 1);
                        if (!substring.equalsIgnoreCase(aVar7.n)) {
                            aVar7.n = substring;
                            aVar7.f5524m.append(aVar7.f5522f.size(), substring);
                            aVar7.f5522f.add(null);
                            aVar7.notifyDataSetChanged();
                            aVar7.f5523j.add(Integer.valueOf(aVar7.f5522f.size() - 1));
                        }
                        aVar7.f5522f.add(userMetaData);
                    }
                    aVar7.notifyDataSetChanged();
                    userFriendsFragment.w0.setVisibility(0);
                    userFriendsFragment.f5503x0.setVisibility(8);
                    userFriendsFragment.f5504y0.setVisibility(8);
                    userFriendsFragment.C0.setVisibility(8);
                    userFriendsFragment.D0.setVisibility(8);
                    userFriendsFragment.f5501u0 = UsersConfig.Companion.hasMoreFriends(userFriendsFragment.f5502v0.a());
                    if (userFriendsFragment.f5502v0.a() == 0) {
                        int ordinal = userFriendsFragment.f5500t0.ordinal();
                        userFriendsFragment.L0(ordinal != 1 ? ordinal != 2 ? userFriendsFragment.I(R.string.no_friend) : userFriendsFragment.I(R.string.no_subscriptions) : userFriendsFragment.I(R.string.no_subscribers), false);
                    }
                }
                if (useCaseResult8 instanceof UseCaseResult.Failure) {
                    Throwable a13 = ((UseCaseResult.Failure) useCaseResult8).a();
                    kf.a.f12078a.d(a13, "Error fetching users list", new Object[0]);
                    if (userFriendsFragment.f5502v0.a() == 0) {
                        userFriendsFragment.L0(t3.o.h(userFriendsFragment.u0(), a13), true);
                        return;
                    }
                    String h10 = t3.o.h(userFriendsFragment.u0(), a13);
                    userFriendsFragment.w0.setVisibility(0);
                    userFriendsFragment.f5503x0.setVisibility(8);
                    userFriendsFragment.C0.setVisibility(8);
                    userFriendsFragment.D0.setVisibility(0);
                    userFriendsFragment.E0.setText(h10);
                    userFriendsFragment.F0.setOnClickListener(userFriendsFragment.N0);
                    return;
                }
                return;
            case 18:
                UserVideoListingsFragment userVideoListingsFragment = (UserVideoListingsFragment) this.f17730f;
                UseCaseResult useCaseResult9 = (UseCaseResult) obj;
                int i14 = UserVideoListingsFragment.Q0;
                Objects.requireNonNull(userVideoListingsFragment);
                if (useCaseResult9 instanceof UseCaseResult.a) {
                    userVideoListingsFragment.S0();
                    userVideoListingsFragment.X0(false);
                } else {
                    userVideoListingsFragment.T0();
                }
                if (useCaseResult9 instanceof UseCaseResult.Result) {
                    List<VideoMetaData> list4 = (List) ((UseCaseResult.Result) useCaseResult9).a();
                    kf.a.f12078a.a("Got %s user videos", Integer.valueOf(list4.size()));
                    userVideoListingsFragment.f8761q0 = VideosConfig.Companion.hasMoreVideos(list4.size());
                    userVideoListingsFragment.O0.q(list4);
                    if (userVideoListingsFragment.O0.a() != 0) {
                        UserMetaData p10 = userVideoListingsFragment.F0.f9375a.p();
                        userVideoListingsFragment.X0(p10 == null ? false : p10.getEmailVerificationRequired());
                    }
                    userVideoListingsFragment.R0();
                }
                if (useCaseResult9 instanceof UseCaseResult.Failure) {
                    Throwable a14 = ((UseCaseResult.Failure) useCaseResult9).a();
                    kf.a.f12078a.d(a14, "Error loading videos", new Object[0]);
                    if (userVideoListingsFragment.O0.a() == 0) {
                        userVideoListingsFragment.V0(t3.o.h(userVideoListingsFragment.u0(), a14), UsersConfig.isGay(userVideoListingsFragment.B0));
                        return;
                    }
                    t3.o.h(userVideoListingsFragment.u0(), a14);
                    Snackbar.k(userVideoListingsFragment.f8767x0, R.string.error_loading_more_videos, 0).n();
                    return;
                }
                return;
            case 19:
                LockedVideoActivity lockedVideoActivity = (LockedVideoActivity) this.f17730f;
                UseCaseResult useCaseResult10 = (UseCaseResult) obj;
                int i15 = LockedVideoActivity.Q;
                Objects.requireNonNull(lockedVideoActivity);
                if (useCaseResult10 instanceof UseCaseResult.a) {
                    lockedVideoActivity.F(true);
                } else {
                    lockedVideoActivity.F(false);
                }
                if (useCaseResult10 instanceof UseCaseResult.Result) {
                    List<VideoMetaData> list5 = (List) ((UseCaseResult.Result) useCaseResult10).a();
                    kf.a.f12078a.a("Got %s related premium videos", Integer.valueOf(list5.size()));
                    if (list5.isEmpty()) {
                        lockedVideoActivity.M.f4425g.setVisibility(8);
                        lockedVideoActivity.M.f4423e.setVisibility(0);
                    } else {
                        if (lockedVideoActivity.M.d.getChildCount() > 0) {
                            lockedVideoActivity.M.d.removeAllViews();
                        }
                        for (VideoMetaData videoMetaData : list5) {
                            View inflate = LayoutInflater.from(lockedVideoActivity).inflate(R.layout.item_layout_video, (ViewGroup) lockedVideoActivity.M.d, false);
                            ((ViewGroup.MarginLayoutParams) inflate.getLayoutParams()).topMargin = lockedVideoActivity.getResources().getDimensionPixelSize(R.dimen.activity_vertical_margin);
                            com.bumptech.glide.b.f(lockedVideoActivity).o(videoMetaData.getUrlThumbnail()).A((ImageView) inflate.findViewById(R.id.imgThumb));
                            ((TextView) inflate.findViewById(R.id.videoTitle)).setText(videoMetaData.getTitle());
                            t3.o.o(videoMetaData, (ImageView) inflate.findViewById(R.id.imageViewUploaderType));
                            ((TextView) inflate.findViewById(R.id.userName)).setText(videoMetaData.getUserMetaData().getUsername());
                            ((TextView) inflate.findViewById(R.id.viewCount)).setText(a0.b.u(videoMetaData.getViewCount()));
                            ((TextView) inflate.findViewById(R.id.rating)).setText(a0.b.z(videoMetaData.getRating()));
                            t3.o.b(videoMetaData.getVideoContentType(), (ImageView) inflate.findViewById(R.id.icPremium));
                            TextView textView = (TextView) inflate.findViewById(R.id.videoType);
                            if (videoMetaData.isHd()) {
                                textView.setText(lockedVideoActivity.getString(R.string.f21944hd));
                            } else if (videoMetaData.isVr()) {
                                textView.setText(lockedVideoActivity.getString(R.string.vr));
                            } else {
                                textView.setText(BuildConfig.FLAVOR);
                            }
                            ((TextView) inflate.findViewById(R.id.videoLength)).setText(a0.b.y(videoMetaData.getDuration() * 1000));
                            inflate.setTag(videoMetaData);
                            inflate.setOnClickListener(lockedVideoActivity.P);
                            lockedVideoActivity.M.d.addView(inflate);
                        }
                    }
                }
                if (useCaseResult10 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult10).a(), "Error loading videos", new Object[0]);
                    lockedVideoActivity.M.f4425g.setVisibility(8);
                    lockedVideoActivity.M.f4423e.setVisibility(0);
                    return;
                }
                return;
            default:
                VideoDetailsViewModel this$014 = (VideoDetailsViewModel) this.f17730f;
                UseCaseResult useCaseResult11 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                if (useCaseResult11 instanceof UseCaseResult.Result) {
                    this$014.f5586z.l(((UseCaseResult.Result) useCaseResult11).a());
                    return;
                }
                return;
        }
    }
}
