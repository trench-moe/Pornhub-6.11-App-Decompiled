package x2;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityChannelBinding;
import com.app.pornhub.databinding.ActivityLockedPayVideoBinding;
import com.app.pornhub.domain.config.ChannelsConfig;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.channel.Channel;
import com.app.pornhub.domain.model.channel.ChannelContainer;
import com.app.pornhub.domain.model.channel.ChannelListContainer;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.albums.AlbumsViewModel;
import com.app.pornhub.view.home.channels.ChannelsFragment;
import com.app.pornhub.view.home.discover.DiscoverViewModel;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import com.app.pornhub.view.launch.LaunchViewModel;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17669c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17670f;

    public /* synthetic */ a(Object obj, int i10) {
        this.f17669c = i10;
        this.f17670f = obj;
    }

    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object] */
    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17669c) {
            case 0:
                f this$0 = (f) this.f17670f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.d;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            case 1:
                l this$02 = (l) this.f17670f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17778c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
            case 2:
                m0 this$03 = (m0) this.f17670f;
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                y2.a aVar3 = this$03.f17799f;
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                throw aVar3.a(it3);
            case 3:
                t0 this$04 = (t0) this.f17670f;
                Throwable it4 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                y2.a aVar4 = this$04.f17861c;
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                throw aVar4.a(it4);
            case 4:
                VideoDlService videoDlService = (VideoDlService) this.f17670f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = VideoDlService.C;
                Objects.requireNonNull(videoDlService);
                if (useCaseResult instanceof UseCaseResult.Result) {
                    Video video = (Video) ((UseCaseResult.Result) useCaseResult).a();
                    kf.a.f12078a.a("PROCESSING INTERRUPTED DOWNLOADS ::::: %s :::::: %s", video.getVideoMetaData().getVkey(), Long.valueOf(System.currentTimeMillis()));
                    video.setUrlVideo(t3.p.b(video));
                    videoDlService.g(VideoDlService.c(videoDlService, video));
                    return;
                }
                return;
            case 5:
                ChannelActivity channelActivity = (ChannelActivity) this.f17670f;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                int i11 = ChannelActivity.O;
                Objects.requireNonNull(channelActivity);
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    channelActivity.M.f4363e.setVisibility(0);
                }
                if (useCaseResult2 instanceof UseCaseResult.Result) {
                    ChannelContainer channelContainer = (ChannelContainer) ((UseCaseResult.Result) useCaseResult2).a();
                    Channel channel = channelContainer.getChannel();
                    com.bumptech.glide.b.f(channelActivity).o(channel.getChannelMetaData().getCover()).j(R.drawable.placeholder_channel_banner).A(channelActivity.M.f4361b.f4828e);
                    com.bumptech.glide.b.f(channelActivity).o(channel.getChannelMetaData().getAvatar()).j(R.drawable.placeholder_channel_avatar).A(channelActivity.M.f4361b.d);
                    String joinChannelLink = channel.getJoinChannelLink();
                    if (TextUtils.isEmpty(joinChannelLink) || joinChannelLink.contains("http://")) {
                        channelActivity.M.f4361b.f4827c.setVisibility(8);
                        channelActivity.M.f4361b.f4837o.setVisibility(8);
                        channelActivity.M.f4361b.f4838p.setVisibility(8);
                    } else {
                        channelActivity.M.f4361b.f4827c.setText(String.format(channelActivity.getString(R.string.join_x_now), channel.getChannelMetaData().getTitle()));
                        channelActivity.M.f4361b.f4827c.setOnClickListener(new x3.c(channelActivity, channel, 0));
                        channelActivity.M.f4361b.f4838p.setText(channel.getWebsite());
                        channelActivity.M.f4361b.f4838p.setTag(channel.getJoinChannelLink());
                    }
                    channelActivity.M.f4361b.f4833j.setVisibility(channel.getChannelMetaData().isPremium() ? 0 : 8);
                    channelActivity.M.f4361b.f4831h.setOnClickListener(new u3.a(channelActivity, 1));
                    channelActivity.M.f4361b.f4829f.setText(channel.getChannelMetaData().getTitle());
                    channelActivity.M.f4361b.f4836m.setText(channel.getUsername());
                    if (TextUtils.isEmpty(channel.getAbout())) {
                        channelActivity.M.f4361b.f4826b.setVisibility(8);
                    } else {
                        SpannableString spannableString = new SpannableString(channelActivity.getString(R.string.info_about).toUpperCase() + " " + channel.getAbout());
                        spannableString.setSpan(new ForegroundColorSpan(-1), 0, 6, 0);
                        channelActivity.M.f4361b.f4826b.setText(spannableString, TextView.BufferType.SPANNABLE);
                    }
                    channelActivity.M.f4361b.f4832i.setText(channel.getJoined());
                    channelActivity.M.f4361b.f4834k.setText(channel.getChannelMetaData().getRank());
                    channelActivity.M.f4361b.f4835l.setText(channel.getChannelMetaData().getSubscribersCount());
                    channelActivity.M.f4361b.n.setText(channel.getChannelMetaData().getVideosCount());
                    channelActivity.M.f4365g.setAdapter(new ChannelActivity.a(channelActivity.u(), channelContainer));
                    if (channelContainer.getOrders().size() <= 3) {
                        channelActivity.M.f4366h.setTabMode(1);
                    } else {
                        channelActivity.M.f4366h.setTabMode(0);
                    }
                    ActivityChannelBinding activityChannelBinding = channelActivity.M;
                    activityChannelBinding.f4366h.setupWithViewPager(activityChannelBinding.f4365g);
                    channelActivity.M.f4363e.setVisibility(8);
                }
                if (useCaseResult2 instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult2).a();
                    kf.a.f12078a.d(a10, "Error fetching channel data", new Object[0]);
                    String h10 = t3.o.h(channelActivity.getBaseContext(), a10);
                    ((ImageView) channelActivity.M.d.f4698a.findViewById(R.id.error_segment_image)).setImageResource(UsersConfig.Companion.isGay(channelActivity.L.a()) ? R.drawable.men : R.drawable.girls);
                    channelActivity.M.d.f4698a.setVisibility(0);
                    channelActivity.M.f4364f.setVisibility(4);
                    ((TextView) channelActivity.M.d.f4698a.findViewById(R.id.error_txtError)).setText(h10);
                    return;
                }
                return;
            case 6:
                Pair pair = (Pair) obj;
                com.app.pornhub.view.comments.a aVar5 = ((CommentsFragment) this.f17670f).J0;
                UserComment userComment = (UserComment) pair.getSecond();
                UserComment s10 = aVar5.s((String) pair.getFirst());
                if (s10 != null) {
                    s10.getChildren().add(0, userComment);
                }
                aVar5.f2802a.b();
                return;
            case 7:
                f4.q qVar = (f4.q) this.f17670f;
                UseCaseResult useCaseResult3 = (UseCaseResult) obj;
                int i12 = f4.q.E0;
                Objects.requireNonNull(qVar);
                if (useCaseResult3 instanceof UseCaseResult.a) {
                    qVar.S0();
                } else {
                    qVar.T0();
                }
                if (useCaseResult3 instanceof UseCaseResult.Result) {
                    List<GifMetaData> list = (List) ((UseCaseResult.Result) useCaseResult3).a();
                    kf.a.f12078a.a("Got %s related gifs", Integer.valueOf(list.size()));
                    qVar.f8761q0 = GifsConfig.Companion.hasMoreRelatedGifs(list.size());
                    qVar.C0.q(list);
                    qVar.R0();
                }
                if (useCaseResult3 instanceof UseCaseResult.Failure) {
                    Throwable a11 = ((UseCaseResult.Failure) useCaseResult3).a();
                    kf.a.f12078a.d(a11, "Error loading related gifs", new Object[0]);
                    if (qVar.C0.a() == 0) {
                        qVar.V0(t3.o.h(qVar.u0(), a11), UsersConfig.isGay(qVar.A0.a().getOrientation()));
                        return;
                    } else {
                        Snackbar.k(qVar.f8767x0, R.string.error_loading_more_gifs, -1).n();
                        return;
                    }
                }
                return;
            case 8:
                HomeActivityViewModel this$05 = (HomeActivityViewModel) this.f17670f;
                UserSettings it5 = (UserSettings) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                t3.b bVar = this$05.f5011i;
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                bVar.b(it5);
                return;
            case 9:
                AlbumsViewModel this$06 = (AlbumsViewModel) this.f17670f;
                UserOrientation it6 = (UserOrientation) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullExpressionValue(it6, "it");
                this$06.f5071i = it6;
                return;
            case 10:
                com.app.pornhub.view.home.categories.b this$07 = (com.app.pornhub.view.home.categories.b) this.f17670f;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.f5122k.l((Pair) obj);
                return;
            case 11:
                final ChannelsFragment channelsFragment = (ChannelsFragment) this.f17670f;
                UseCaseResult useCaseResult4 = (UseCaseResult) obj;
                int i13 = ChannelsFragment.J0;
                Objects.requireNonNull(channelsFragment);
                if (useCaseResult4 instanceof UseCaseResult.a) {
                    channelsFragment.S0();
                } else {
                    channelsFragment.T0();
                }
                if (useCaseResult4 instanceof UseCaseResult.Result) {
                    List<ChannelMetaData> channels = ((ChannelListContainer) ((UseCaseResult.Result) useCaseResult4).a()).getChannels();
                    channelsFragment.f8761q0 = ChannelsConfig.Companion.hasMoreChannels(channels.size());
                    final com.app.pornhub.view.home.channels.a aVar6 = channelsFragment.F0;
                    NotifyingGridLayoutManager N0 = channelsFragment.N0();
                    Function1 action = new Function1() { // from class: k4.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ChannelsFragment.this.E0.f(o.c(aVar6, ((Integer) obj2).intValue()));
                            return null;
                        }
                    };
                    Objects.requireNonNull(N0);
                    Intrinsics.checkNotNullParameter(action, "action");
                    N0.D1(new b4.f(N0, action));
                    int size = aVar6.d.size();
                    aVar6.d.addAll(channels);
                    aVar6.f2802a.e(size, channels.size());
                    channelsFragment.R0();
                }
                if (useCaseResult4 instanceof UseCaseResult.Failure) {
                    Throwable a12 = ((UseCaseResult.Failure) useCaseResult4).a();
                    kf.a.f12078a.d(a12, "Error loading channels", new Object[0]);
                    if (a12 instanceof PornhubException) {
                        PornhubException pornhubException = (PornhubException) a12;
                        if (t3.o.l(pornhubException.a())) {
                            channelsFragment.D0.q(pornhubException.a());
                            return;
                        }
                    }
                    channelsFragment.V0(t3.o.h(channelsFragment.u0(), a12), UsersConfig.isGay(channelsFragment.C0));
                    return;
                }
                return;
            case 12:
                DiscoverViewModel this$08 = (DiscoverViewModel) this.f17670f;
                UserAuthLevel it7 = (UserAuthLevel) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                UserAuthLevel userAuthLevel = this$08.f5151m;
                if (userAuthLevel != null && !Intrinsics.areEqual(userAuthLevel, it7)) {
                    this$08.f5148j.l(new z3.a<>(DiscoverViewModel.State.a.f5152a));
                }
                Intrinsics.checkNotNullExpressionValue(it7, "it");
                this$08.f5151m = it7;
                return;
            case 13:
                ExploreFragmentViewModel this$09 = (ExploreFragmentViewModel) this.f17670f;
                UserAuthLevel it8 = (UserAuthLevel) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                UserAuthLevel userAuthLevel2 = this$09.f5175m;
                if (userAuthLevel2 != null && !Intrinsics.areEqual(userAuthLevel2, it8)) {
                    this$09.f5172j.l(new z3.a<>(ExploreFragmentViewModel.State.a.f5176a));
                }
                Intrinsics.checkNotNullExpressionValue(it8, "it");
                this$09.f5175m = it8;
                return;
            case 14:
                u4.d dVar = (u4.d) this.f17670f;
                UseCaseResult useCaseResult5 = (UseCaseResult) obj;
                String str = u4.d.U0;
                Objects.requireNonNull(dVar);
                if ((useCaseResult5 instanceof UseCaseResult.Result) && dVar.L()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(dVar.I(R.string.all));
                    for (Category category : (List) ((UseCaseResult.Result) useCaseResult5).a()) {
                        arrayList.add(category.getName());
                    }
                    String category2 = dVar.S0.getCategory();
                    if (category2.contains(",")) {
                        arrayList.add(category2.replace(",", "+"));
                    }
                    dVar.Q0 = new ArrayAdapter<>(dVar.u0(), (int) R.layout.spinner_video_filter_item, arrayList);
                    int count = category2.contains(",") ? dVar.Q0.getCount() - 1 : dVar.R0(dVar.S0.getCategory(), dVar.Q0);
                    dVar.L0.setAdapter((SpinnerAdapter) dVar.Q0);
                    dVar.L0.setSelection(count, false);
                    dVar.L0.setOnItemSelectedListener(dVar.R0);
                    return;
                }
                return;
            case 15:
                LaunchViewModel this$010 = (LaunchViewModel) this.f17670f;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.f5368f.edit().putBoolean("first_launch", false).apply();
                this$010.n.l((LaunchViewModel.UpdateState) obj);
                return;
            case 16:
                z4.b bVar2 = (z4.b) this.f17670f;
                UseCaseResult useCaseResult6 = (UseCaseResult) obj;
                int i14 = z4.b.f21776v0;
                Objects.requireNonNull(bVar2);
                if (useCaseResult6 instanceof UseCaseResult.Result) {
                    bVar2.f21784u0.addAll((Collection) ((UseCaseResult.Result) useCaseResult6).a());
                    return;
                }
                return;
            case 17:
                PlaylistDetailsViewModel this$011 = (PlaylistDetailsViewModel) this.f17670f;
                UseCaseResult useCaseResult7 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                this$011.f5436h.l(useCaseResult7 instanceof UseCaseResult.a ? PlaylistDetailsViewModel.a.e.f5447a : PlaylistDetailsViewModel.a.C0060a.f5442a);
                if (useCaseResult7 instanceof UseCaseResult.Result) {
                    UseCaseResult.Result result = (UseCaseResult.Result) useCaseResult7;
                    this$011.e().l(result.a());
                    this$011.c(((Playlist) result.a()).getVideos());
                }
                if (useCaseResult7 instanceof UseCaseResult.Failure) {
                    Throwable a13 = ((UseCaseResult.Failure) useCaseResult7).a();
                    kf.a.f12078a.d(a13, Intrinsics.stringPlus("Error fetching playlist with ID ", Long.valueOf(this$011.n)), new Object[0]);
                    this$011.f5436h.l(new PlaylistDetailsViewModel.a.c(UsersConfig.Companion.isGay(this$011.d.a().getOrientation()), a13));
                    return;
                }
                return;
            case 18:
                LockedPayVideoActivity this$012 = (LockedPayVideoActivity) this.f17670f;
                UseCaseResult useCaseResult8 = (UseCaseResult) obj;
                int i15 = LockedPayVideoActivity.R;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                if (useCaseResult8 instanceof UseCaseResult.a) {
                    this$012.G(true);
                } else {
                    this$012.G(false);
                }
                if (useCaseResult8 instanceof UseCaseResult.Result) {
                    UseCaseResult.Result result2 = (UseCaseResult.Result) useCaseResult8;
                    kf.a.f12078a.e("Got related premium videos ::: %s", Integer.valueOf(((List) result2.a()).size()));
                    if (!((Collection) result2.a()).isEmpty()) {
                        List list2 = (List) result2.a();
                        Objects.requireNonNull(this$012);
                        VideoMetaData videoMetaData = (VideoMetaData) list2.get(0);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this$012.N;
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding2 = null;
                        if (activityLockedPayVideoBinding == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding = null;
                        }
                        ConstraintLayout constraintLayout = activityLockedPayVideoBinding.f4410p.f4725a;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ltVideo1.root");
                        this$012.C(videoMetaData, constraintLayout);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding3 = this$012.N;
                        if (activityLockedPayVideoBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding3 = null;
                        }
                        activityLockedPayVideoBinding3.f4410p.f4725a.setTag(list2.get(0));
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding4 = this$012.N;
                        if (activityLockedPayVideoBinding4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding4 = null;
                        }
                        activityLockedPayVideoBinding4.f4410p.f4725a.setOnClickListener(this$012.Q);
                        VideoMetaData videoMetaData2 = (VideoMetaData) list2.get(1);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding5 = this$012.N;
                        if (activityLockedPayVideoBinding5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding5 = null;
                        }
                        ConstraintLayout constraintLayout2 = activityLockedPayVideoBinding5.f4411q.f4725a;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ltVideo2.root");
                        this$012.C(videoMetaData2, constraintLayout2);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding6 = this$012.N;
                        if (activityLockedPayVideoBinding6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding6 = null;
                        }
                        activityLockedPayVideoBinding6.f4411q.f4725a.setTag(list2.get(1));
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding7 = this$012.N;
                        if (activityLockedPayVideoBinding7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding7 = null;
                        }
                        activityLockedPayVideoBinding7.f4411q.f4725a.setOnClickListener(this$012.Q);
                        VideoMetaData videoMetaData3 = (VideoMetaData) list2.get(2);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding8 = this$012.N;
                        if (activityLockedPayVideoBinding8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding8 = null;
                        }
                        ConstraintLayout constraintLayout3 = activityLockedPayVideoBinding8.f4412r.f4725a;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.ltVideo3.root");
                        this$012.C(videoMetaData3, constraintLayout3);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding9 = this$012.N;
                        if (activityLockedPayVideoBinding9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding9 = null;
                        }
                        activityLockedPayVideoBinding9.f4412r.f4725a.setTag(list2.get(2));
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding10 = this$012.N;
                        if (activityLockedPayVideoBinding10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding10 = null;
                        }
                        activityLockedPayVideoBinding10.f4412r.f4725a.setOnClickListener(this$012.Q);
                        VideoMetaData videoMetaData4 = (VideoMetaData) list2.get(3);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding11 = this$012.N;
                        if (activityLockedPayVideoBinding11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding11 = null;
                        }
                        ConstraintLayout constraintLayout4 = activityLockedPayVideoBinding11.f4413s.f4725a;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "binding.ltVideo4.root");
                        this$012.C(videoMetaData4, constraintLayout4);
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding12 = this$012.N;
                        if (activityLockedPayVideoBinding12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLockedPayVideoBinding12 = null;
                        }
                        activityLockedPayVideoBinding12.f4413s.f4725a.setTag(list2.get(3));
                        ActivityLockedPayVideoBinding activityLockedPayVideoBinding13 = this$012.N;
                        if (activityLockedPayVideoBinding13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityLockedPayVideoBinding2 = activityLockedPayVideoBinding13;
                        }
                        activityLockedPayVideoBinding2.f4413s.f4725a.setOnClickListener(this$012.Q);
                    } else {
                        this$012.F();
                    }
                }
                if (useCaseResult8 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult8).a(), "Error fetching related premium videos", new Object[0]);
                    this$012.F();
                    return;
                }
                return;
            default:
                VideoDetailsViewModel this$013 = (VideoDetailsViewModel) this.f17670f;
                Throwable th = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                this$013.B.l(new VideoDetailsViewModel.a.b(false));
                return;
        }
    }
}
