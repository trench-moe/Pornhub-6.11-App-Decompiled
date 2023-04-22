package x2;

import com.app.pornhub.data.model.channels.ChannelModel;
import com.app.pornhub.data.model.channels.ChannelResponse;
import com.app.pornhub.data.model.dvds.DvdListResponse;
import com.app.pornhub.data.model.gifs.GifModel;
import com.app.pornhub.data.model.gifs.GifResponse;
import com.app.pornhub.data.model.photo.CommunityAlbumsResponse;
import com.app.pornhub.data.model.playlist.PlaylistsOverviewResponse;
import com.app.pornhub.data.model.search.SearchSuggestionsResponse;
import com.app.pornhub.data.model.search.SuggestionItemModel;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.channel.Channel;
import com.app.pornhub.domain.model.channel.ChannelContainer;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.playlist.PlaylistsOverview;
import com.app.pornhub.domain.model.search.ChannelSuggestion;
import com.app.pornhub.domain.model.search.PornstarSuggestion;
import com.app.pornhub.domain.model.search.SearchSuggestions;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.repository.DataWrapper;
import com.app.pornhub.view.login.SignupActivity;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17764c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17765f;

    public /* synthetic */ k(Object obj, int i10) {
        this.f17764c = i10;
        this.f17765f = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        List<String> emptyList;
        List arrayList;
        switch (this.f17764c) {
            case 0:
                Collection categoryIds = (Collection) this.f17765f;
                DataWrapper wrapper = (DataWrapper) obj;
                Intrinsics.checkNotNullParameter(categoryIds, "$categoryIds");
                Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                if (wrapper instanceof DataWrapper.Success) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : (Iterable) ((DataWrapper.Success) wrapper).a()) {
                        if (categoryIds.contains(((Category) obj2).getId())) {
                            arrayList2.add(obj2);
                        }
                    }
                    return arrayList2;
                }
                return CollectionsKt.emptyList();
            case 1:
                o this$0 = (o) this.f17765f;
                ChannelResponse channelResponse = (ChannelResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(channelResponse, "it");
                s2.a aVar = this$0.f17820b;
                Objects.requireNonNull(aVar);
                Intrinsics.checkNotNullParameter(channelResponse, "channelResponse");
                ChannelModel channel = channelResponse.getChannel();
                ChannelMetaData e10 = aVar.e(channel);
                String username = channel.getUsername();
                String str = username == null ? BuildConfig.FLAVOR : username;
                String joinChannelLink = channel.getJoinChannelLink();
                String str2 = joinChannelLink == null ? BuildConfig.FLAVOR : joinChannelLink;
                String website = channel.getWebsite();
                String str3 = website == null ? BuildConfig.FLAVOR : website;
                String joined = channel.getJoined();
                String str4 = joined == null ? BuildConfig.FLAVOR : joined;
                String about = channel.getAbout();
                if (about == null) {
                    about = BuildConfig.FLAVOR;
                }
                return new ChannelContainer(aVar.v(channelResponse.getVideos()), new Channel(e10, str, str2, str3, str4, about), channelResponse.getOrders());
            case 2:
                m0 this$02 = (m0) this.f17765f;
                UserMetaData it = (UserMetaData) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                return this$02.u(it);
            case 3:
                n0 this$03 = (n0) this.f17765f;
                DvdListResponse it2 = (DvdListResponse) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                return this$03.f17815b.i(it2);
            case 4:
                r0 this$04 = (r0) this.f17765f;
                GifResponse it3 = (GifResponse) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                s2.a aVar2 = this$04.f17843b;
                GifModel gifModel = it3.getGif();
                Objects.requireNonNull(aVar2);
                Intrinsics.checkNotNullParameter(gifModel, "gifModel");
                GifMetaData l10 = aVar2.l(gifModel);
                long postedOn = gifModel.getPostedOn();
                String webm = gifModel.getWebm();
                String mp4 = gifModel.getMp4();
                int views = gifModel.getViews();
                int voteUp = gifModel.getVoteUp();
                int voteDown = gifModel.getVoteDown();
                int votePercent = gifModel.getVotePercent();
                boolean z10 = gifModel.getHasVideo() == 1;
                String older = gifModel.getOlder();
                String newer = gifModel.getNewer();
                boolean z11 = gifModel.isFavorite() == 1;
                String from_vkey = gifModel.getFrom_vkey();
                String fromTitle = gifModel.getFromTitle();
                String categories = gifModel.getCategories();
                List<String> w10 = aVar2.w(gifModel.getTags());
                String pornStar = gifModel.getPornStar();
                UserModel user = gifModel.getUser();
                Intrinsics.checkNotNull(user);
                UserMetaData s10 = aVar2.s(user);
                Map<String, String> flagTypes = gifModel.getFlagTypes();
                Intrinsics.checkNotNull(flagTypes);
                return new Gif(l10, postedOn, webm, mp4, views, voteUp, voteDown, votePercent, z10, older, newer, z11, from_vkey, fromTitle, categories, w10, pornStar, s10, flagTypes);
            case 5:
                x0 this$05 = (x0) this.f17765f;
                CommunityAlbumsResponse it4 = (CommunityAlbumsResponse) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4.getError() == null) {
                    return this$05.f17885b.b(it4.getCommunityAlbums());
                }
                throw new PornhubException(it4.getError().getCode(), it4.getError().getMessage());
            case 6:
                c1 this$06 = (c1) this.f17765f;
                PlaylistsOverviewResponse playlistsOverviewResponse = (PlaylistsOverviewResponse) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(playlistsOverviewResponse, "it");
                if (playlistsOverviewResponse.getError() == null) {
                    s2.a aVar3 = this$06.f17690b;
                    Objects.requireNonNull(aVar3);
                    Intrinsics.checkNotNullParameter(playlistsOverviewResponse, "playlistsOverviewResponse");
                    PlaylistsOverview playlistsOverview = new PlaylistsOverview(aVar3.o(playlistsOverviewResponse.getPublicPlayLists()), aVar3.o(playlistsOverviewResponse.getPrivatePlayLists()), aVar3.o(playlistsOverviewResponse.getFavoritePlayLists()));
                    this$06.f17692e = playlistsOverview;
                    this$06.f17693f = System.currentTimeMillis();
                    return playlistsOverview;
                }
                throw new PornhubException(playlistsOverviewResponse.getError().getCode(), playlistsOverviewResponse.getError().getMessage());
            case 7:
                d1 this$07 = (d1) this.f17765f;
                SearchSuggestionsResponse searchSuggestionsResponse = (SearchSuggestionsResponse) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(searchSuggestionsResponse, "it");
                Objects.requireNonNull(this$07.f17710b);
                Intrinsics.checkNotNullParameter(searchSuggestionsResponse, "searchSuggestionsResponse");
                String source = searchSuggestionsResponse.getSource();
                switch (source.hashCode()) {
                    case -989034367:
                        if (source.equals(SearchSuggestionsConfig.sourcePhotos)) {
                            emptyList = searchSuggestionsResponse.getResults().getPhotos();
                            if (emptyList == null) {
                                emptyList = CollectionsKt.emptyList();
                                break;
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        break;
                    case -816678056:
                        if (source.equals(SearchSuggestionsConfig.sourceVideos)) {
                            emptyList = searchSuggestionsResponse.getResults().getVideos();
                            if (emptyList == null) {
                                emptyList = CollectionsKt.emptyList();
                                break;
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        break;
                    case 3172655:
                        if (source.equals(SearchSuggestionsConfig.sourceGifs)) {
                            emptyList = searchSuggestionsResponse.getResults().getGifs();
                            if (emptyList == null) {
                                emptyList = CollectionsKt.emptyList();
                                break;
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        break;
                    case 948881689:
                        if (source.equals(SearchSuggestionsConfig.sourceMembers)) {
                            emptyList = searchSuggestionsResponse.getResults().getMembers();
                            if (emptyList == null) {
                                emptyList = CollectionsKt.emptyList();
                                break;
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        break;
                    case 962150598:
                        if (source.equals(SearchSuggestionsConfig.sourcePornstars)) {
                            emptyList = searchSuggestionsResponse.getResults().getPornstars();
                            if (emptyList == null) {
                                emptyList = CollectionsKt.emptyList();
                                break;
                            }
                        }
                        emptyList = CollectionsKt.emptyList();
                        break;
                    default:
                        emptyList = CollectionsKt.emptyList();
                        break;
                }
                String source2 = searchSuggestionsResponse.getSource();
                List<SuggestionItemModel> channelSuggestions = searchSuggestionsResponse.getResults().getChannelSuggestions();
                List list = 0;
                if (channelSuggestions == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(channelSuggestions, 10));
                    for (SuggestionItemModel suggestionItemModel : channelSuggestions) {
                        String slug = suggestionItemModel.getSlug();
                        String name = suggestionItemModel.getName();
                        String rank = suggestionItemModel.getRank();
                        Integer id2 = suggestionItemModel.getId();
                        Intrinsics.checkNotNull(id2);
                        arrayList.add(new ChannelSuggestion(slug, name, rank, id2.intValue()));
                    }
                }
                if (arrayList == 0) {
                    arrayList = CollectionsKt.emptyList();
                }
                List<SuggestionItemModel> pornstarSuggestions = searchSuggestionsResponse.getResults().getPornstarSuggestions();
                if (pornstarSuggestions != null) {
                    list = new ArrayList(CollectionsKt.collectionSizeOrDefault(pornstarSuggestions, 10));
                    for (SuggestionItemModel suggestionItemModel2 : pornstarSuggestions) {
                        list.add(new PornstarSuggestion(suggestionItemModel2.getSlug(), suggestionItemModel2.getName(), suggestionItemModel2.getRank()));
                    }
                }
                if (list == 0) {
                    list = CollectionsKt.emptyList();
                }
                return new SearchSuggestions(source2, emptyList, list, arrayList);
            default:
                CharSequence charSequence = (CharSequence) obj;
                int i10 = SignupActivity.S;
                return Boolean.valueOf(((SignupActivity) this.f17765f).K());
        }
    }
}
