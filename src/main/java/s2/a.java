package s2;

import com.app.pornhub.data.model.categories.CategoryModel;
import com.app.pornhub.data.model.channels.ChannelModel;
import com.app.pornhub.data.model.comments.CommentActionResponse;
import com.app.pornhub.data.model.comments.CommentModel;
import com.app.pornhub.data.model.dvds.DvdListResponse;
import com.app.pornhub.data.model.dvds.DvdModel;
import com.app.pornhub.data.model.gifs.GifModel;
import com.app.pornhub.data.model.photo.AlbumModel;
import com.app.pornhub.data.model.photo.PhotoModel;
import com.app.pornhub.data.model.playlist.PlaylistModel;
import com.app.pornhub.data.model.playlist.PlaylistThumbsModel;
import com.app.pornhub.data.model.pornstar.PerformerModel;
import com.app.pornhub.data.model.pornstar.PerformerResponse;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.model.dvd.Dvd;
import com.app.pornhub.domain.model.dvd.DvdListContainer;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.performer.Performer;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.photo.Photo;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.playlist.PlaylistThumbs;
import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class a {
    public final Album a(AlbumModel albumModel) {
        String id2 = albumModel.getId();
        String title = albumModel.getTitle();
        Integer rating = albumModel.getRating();
        return new Album(id2, title, rating == null ? 0 : rating.intValue(), albumModel.getImgCount(), albumModel.getDateAdded(), albumModel.getUrlThumbnail(), albumModel.getViewCount(), albumModel.getTags(), albumModel.getSegment(), s(albumModel.getUser()));
    }

    public final List<Album> b(List<AlbumModel> list) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AlbumModel albumModel : list) {
            arrayList.add(a(albumModel));
        }
        return arrayList;
    }

    public final Category c(CategoryModel categoryModel) {
        return new Category(categoryModel.getId(), categoryModel.getName(), categoryModel.getSlug(), categoryModel.getImageUrl(), Integer.parseInt(categoryModel.getVideosCount()), categoryModel.isVerified());
    }

    public final List<Category> d(List<CategoryModel> list) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (CategoryModel categoryModel : list) {
            arrayList.add(c(categoryModel));
        }
        return arrayList;
    }

    public final ChannelMetaData e(ChannelModel channelModel) {
        return new ChannelMetaData(channelModel.getId(), channelModel.getTitle(), channelModel.getRank(), channelModel.getAvatar(), channelModel.getCover(), channelModel.isPremium(), channelModel.getVideoViewsCount(), channelModel.getVideosCount(), channelModel.getSubscribersCount());
    }

    public final CommentActionResult f(CommentActionResponse commentActionResponse) {
        Intrinsics.checkNotNullParameter(commentActionResponse, "commentActionResponse");
        boolean result = commentActionResponse.getResult();
        String id2 = commentActionResponse.getId();
        if (id2 == null) {
            id2 = BuildConfig.FLAVOR;
        }
        return new CommentActionResult(result, id2);
    }

    public final List<UserComment> g(List<CommentModel> comments) {
        Intrinsics.checkNotNullParameter(comments, "comments");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(comments, 10));
        for (CommentModel commentModel : comments) {
            List list = null;
            List<UserComment> g10 = commentModel.getChildren() != null ? g(commentModel.getChildren()) : null;
            String id2 = commentModel.getId();
            String text = commentModel.getText();
            long dateAdded = commentModel.getDateAdded();
            int parseInt = Integer.parseInt(commentModel.getVotesUp());
            int parseInt2 = Integer.parseInt(commentModel.getVotesDown());
            UserMetaData s10 = s(commentModel.getUser());
            if (g10 != null) {
                list = CollectionsKt.toMutableList((Collection) g10);
            }
            arrayList.add(new UserComment(id2, text, dateAdded, parseInt, parseInt2, list == null ? new ArrayList() : list, s10));
        }
        return arrayList;
    }

    public final Dvd h(DvdModel dvdModel) {
        long parseLong = Long.parseLong(dvdModel.getId());
        String channelId = dvdModel.getChannelId();
        String title = dvdModel.getTitle();
        String fromChannel = dvdModel.getFromChannel();
        String videosCount = dvdModel.getVideosCount();
        String viewsCount = dvdModel.getViewsCount();
        String cover = dvdModel.getCover();
        String description = dvdModel.getDescription();
        String str = description == null ? BuildConfig.FLAVOR : description;
        String duration = dvdModel.getDuration();
        return new Dvd(parseLong, channelId, title, fromChannel, videosCount, viewsCount, cover, str, duration == null ? BuildConfig.FLAVOR : duration, dvdModel.isPremium(), dvdModel.isHd());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    public final DvdListContainer i(DvdListResponse dvdListResponse) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dvdListResponse, "dvdListResponse");
        Map<String, Map<String, Object>> orders = dvdListResponse.getOrders();
        if (orders == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(orders.size()));
            Iterator it = orders.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), MapsKt.toMap((Map) entry.getValue()));
            }
        }
        List<DvdModel> dvds = dvdListResponse.getDvds();
        if (dvds == null) {
            arrayList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dvds, 10));
            for (DvdModel dvdModel : dvds) {
                arrayList2.add(h(dvdModel));
            }
            arrayList = arrayList2;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        DvdListContainer dvdListContainer = new DvdListContainer(arrayList, linkedHashMap, null, null, null, 28, null);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(dvdListContainer.getOrdersMap().keySet());
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        int size = arrayList3.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            Map<String, Object> map = dvdListContainer.getOrdersMap().get(arrayList3.get(i10));
            Object obj = map == null ? null : map.get("title");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList4.add(i10, (String) obj);
            i10 = i11;
        }
        dvdListContainer.setOrdersAbbr(arrayList3);
        dvdListContainer.setOrderTitles(arrayList4);
        return dvdListContainer;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.util.List<com.app.pornhub.domain.model.explore.ExploreData> j(java.util.List<com.app.pornhub.data.model.explore.ExploreModel> r14) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.j(java.util.List):java.util.List");
    }

    public final List<GifMetaData> k(List<GifModel> gifs) {
        Intrinsics.checkNotNullParameter(gifs, "gifs");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(gifs, 10));
        for (GifModel gifModel : gifs) {
            arrayList.add(l(gifModel));
        }
        return arrayList;
    }

    public final GifMetaData l(GifModel gifModel) {
        String id2 = gifModel.getId();
        String title = gifModel.getTitle();
        String urlThumbnail16x9 = gifModel.getUrlThumbnail16x9();
        if (urlThumbnail16x9 == null) {
            urlThumbnail16x9 = BuildConfig.FLAVOR;
        }
        return new GifMetaData(id2, title, urlThumbnail16x9);
    }

    public final List<Photo> m(List<PhotoModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PhotoModel photoModel : list) {
            arrayList.add(new Photo(photoModel.getId(), photoModel.getIdAlbum(), photoModel.getIdNext(), photoModel.getIdPrevious(), photoModel.getPosition(), photoModel.getUrlThumbnail(), photoModel.getUrlPhoto(), photoModel.getCommentCount()));
        }
        return arrayList;
    }

    public final Playlist n(PlaylistModel playlistModel) {
        long id2 = playlistModel.getId();
        long userId = playlistModel.getUserId();
        String username = playlistModel.getUsername();
        String title = playlistModel.getTitle();
        String description = playlistModel.getDescription();
        String status = playlistModel.getStatus();
        int percent = playlistModel.getPercent();
        int videoCount = playlistModel.getVideoCount();
        int favouriteCount = playlistModel.getFavouriteCount();
        int views = playlistModel.getViews();
        boolean premium = playlistModel.getPremium();
        int parseInt = Integer.parseInt(playlistModel.getSegment());
        boolean isFull = playlistModel.isFull();
        String type = playlistModel.getType();
        List mutableList = CollectionsKt.toMutableList((Collection) playlistModel.getTags());
        List<PlaylistThumbsModel> urlThumbnails = playlistModel.getUrlThumbnails();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(urlThumbnails, 10));
        Iterator it = urlThumbnails.iterator();
        while (it.hasNext()) {
            PlaylistThumbsModel playlistThumbsModel = (PlaylistThumbsModel) it.next();
            Iterator it2 = it;
            String id3 = playlistThumbsModel.getId();
            String vkey = playlistThumbsModel.getVkey();
            boolean z10 = premium;
            int i10 = views;
            boolean areEqual = Intrinsics.areEqual(playlistThumbsModel.getPremium(), "1");
            String thumb = playlistThumbsModel.getThumb();
            String thumbMedium = playlistThumbsModel.getThumbMedium();
            String str = thumbMedium == null ? BuildConfig.FLAVOR : thumbMedium;
            String thumbLarge = playlistThumbsModel.getThumbLarge();
            String str2 = thumbLarge == null ? BuildConfig.FLAVOR : thumbLarge;
            String mobileLargeThumb = playlistThumbsModel.getMobileLargeThumb();
            arrayList.add(new PlaylistThumbs(id3, vkey, areEqual, thumb, str, str2, mobileLargeThumb == null ? BuildConfig.FLAVOR : mobileLargeThumb));
            it = it2;
            premium = z10;
            views = i10;
        }
        int i11 = views;
        boolean z11 = premium;
        List<String> playlistVkeys = playlistModel.getPlaylistVkeys();
        if (playlistVkeys == null) {
            playlistVkeys = new ArrayList<>();
        }
        return new Playlist(id2, userId, username, title, description, status, percent, videoCount, favouriteCount, i11, z11, parseInt, isFull, type, mutableList, arrayList, playlistVkeys, v(playlistModel.getVideos()));
    }

    public final List<Playlist> o(List<PlaylistModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PlaylistModel playlistModel : list) {
            arrayList.add(n(playlistModel));
        }
        return arrayList;
    }

    public final PerformerMetaData p(PerformerModel performerModel) {
        Intrinsics.checkNotNullParameter(performerModel, "performerModel");
        return new PerformerMetaData(performerModel.getSlug(), performerModel.getName(), performerModel.getThumb(), performerModel.getRank(), performerModel.getViews(), performerModel.getRating(), performerModel.getNumberOfVideos(), performerModel.isPremium(), performerModel.isVerified(), performerModel.getPerformerType(), performerModel.getTrophy());
    }

    public final PerformerContainer q(PerformerResponse performerResponse) {
        Intrinsics.checkNotNullParameter(performerResponse, "performerResponse");
        PerformerModel performerModel = performerResponse.getPornstar();
        Intrinsics.checkNotNullParameter(performerModel, "performerModel");
        PerformerMetaData p10 = p(performerModel);
        String bio = performerModel.getBio();
        String born = performerModel.getBorn();
        String birthplace = performerModel.getBirthplace();
        String height = performerModel.getHeight();
        String weight = performerModel.getWeight();
        String subscribers = performerModel.getSubscribers();
        String weeklyRank = performerModel.getWeeklyRank();
        String yearlyRank = performerModel.getYearlyRank();
        String lastMonthRank = performerModel.getLastMonthRank();
        String cover = performerModel.getCover();
        String previuosPornstarSlug = performerModel.getPreviuosPornstarSlug();
        String str = previuosPornstarSlug == null ? BuildConfig.FLAVOR : previuosPornstarSlug;
        String nextPornstarSlug = performerModel.getNextPornstarSlug();
        if (nextPornstarSlug == null) {
            nextPornstarSlug = BuildConfig.FLAVOR;
        }
        Performer performer = new Performer(p10, bio, born, birthplace, height, weight, subscribers, weeklyRank, yearlyRank, lastMonthRank, cover, str, nextPornstarSlug);
        List<VideoMetaData> v2 = v(performerResponse.getVideos());
        Map<String, String> orders = performerResponse.getOrders();
        List<String> premium = performerResponse.getPremium();
        if (premium == null) {
            premium = CollectionsKt.emptyList();
        }
        return new PerformerContainer(performer, v2, orders, premium);
    }

    public final User r(UserModel userModel) {
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        UserMetaData s10 = s(userModel);
        String fullName = userModel.getFullName();
        if (fullName == null) {
            fullName = BuildConfig.FLAVOR;
        }
        Integer gender = userModel.getGender();
        int intValue = gender == null ? 0 : gender.intValue();
        Integer age = userModel.getAge();
        int intValue2 = age == null ? 0 : age.intValue();
        Integer relationStatus = userModel.getRelationStatus();
        int intValue3 = relationStatus == null ? 0 : relationStatus.intValue();
        Integer orientation = userModel.getOrientation();
        int intValue4 = orientation == null ? 0 : orientation.intValue();
        Integer videoWatchedCount = userModel.getVideoWatchedCount();
        int intValue5 = videoWatchedCount == null ? 0 : videoWatchedCount.intValue();
        Integer myProfileViewedCount = userModel.getMyProfileViewedCount();
        int intValue6 = myProfileViewedCount == null ? 0 : myProfileViewedCount.intValue();
        Long dateAdded = userModel.getDateAdded();
        long longValue = dateAdded == null ? 0L : dateAdded.longValue();
        Long lastLogin = userModel.getLastLogin();
        return new User(s10, fullName, intValue, intValue2, intValue3, intValue4, intValue5, intValue6, longValue, lastLogin != null ? lastLogin.longValue() : 0L);
    }

    public final UserMetaData s(UserModel userModel) {
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        String id2 = userModel.getId();
        String username = userModel.getUsername();
        String urlThumbnail = userModel.getUrlThumbnail();
        Boolean isVerified = userModel.isVerified();
        boolean booleanValue = isVerified == null ? false : isVerified.booleanValue();
        String channelId = userModel.getChannelId();
        if (channelId == null) {
            channelId = BuildConfig.FLAVOR;
        }
        String userType = userModel.getUserType();
        String str = userType == null ? BuildConfig.FLAVOR : userType;
        String accessToken = userModel.getAccessToken();
        String refreshToken = userModel.getRefreshToken();
        Boolean emailVerificationRequired = userModel.getEmailVerificationRequired();
        return new UserMetaData(id2, username, urlThumbnail, booleanValue, channelId, emailVerificationRequired == null ? false : emailVerificationRequired.booleanValue(), str, accessToken, refreshToken);
    }

    public final List<UserMetaData> t(List<UserModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UserModel userModel : list) {
            arrayList.add(s(userModel));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.app.pornhub.domain.model.video.VideoMetaData u(com.app.pornhub.data.model.videos.VideoModel r28) {
        /*
            r27 = this;
            java.lang.String r1 = r28.getId()
            java.lang.String r2 = r28.getVkey()
            java.lang.String r3 = r28.getTitle()
            int r4 = r28.getDuration()
            int r5 = r28.getRating()
            int r6 = r28.getViewCount()
            java.lang.String r0 = r28.getCommentsCount()
            int r7 = java.lang.Integer.parseInt(r0)
            long r8 = r28.getApprovedOn()
            java.lang.String r10 = r28.getUrlThumbnail16x9()
            java.lang.String r11 = r28.getWebm()
            boolean r12 = r28.getHd()
            boolean r13 = r28.getVr()
            boolean r14 = r28.getCanSeeVideo()
            java.lang.String r0 = r28.getContentType()
            java.util.Locale r15 = java.util.Locale.ROOT     // Catch: java.lang.IllegalArgumentException -> L53
            r16 = r14
            java.lang.String r14 = "ROOT"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)     // Catch: java.lang.IllegalArgumentException -> L55
            java.lang.String r0 = r0.toUpperCase(r15)     // Catch: java.lang.IllegalArgumentException -> L55
            java.lang.String r14 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r14)     // Catch: java.lang.IllegalArgumentException -> L55
            com.app.pornhub.domain.model.video.VideoContentType r0 = com.app.pornhub.domain.model.video.VideoContentType.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L55
            goto L57
        L53:
            r16 = r14
        L55:
            com.app.pornhub.domain.model.video.VideoContentType r0 = com.app.pornhub.domain.model.video.VideoContentType.FREE
        L57:
            r15 = r0
            boolean r17 = r28.isPrivate()
            boolean r18 = r28.isVerified()
            boolean r19 = r28.isAvailable()
            boolean r20 = r28.isPaidVideo()
            java.lang.String r0 = r28.getPrice()
            java.lang.String r14 = ""
            if (r0 != 0) goto L73
            r21 = r14
            goto L75
        L73:
            r21 = r0
        L75:
            java.lang.String r0 = r28.getChannelLink()
            if (r0 != 0) goto L7e
            r22 = r14
            goto L80
        L7e:
            r22 = r0
        L80:
            java.lang.String r0 = r28.getChannelTitle()
            if (r0 != 0) goto L89
            r25 = r14
            goto L8b
        L89:
            r25 = r0
        L8b:
            boolean r23 = r28.isActiveSponsor()
            com.app.pornhub.data.model.user.UserModel r0 = r28.getUser()
            r14 = r27
            com.app.pornhub.domain.model.user.UserMetaData r24 = r14.s(r0)
            com.app.pornhub.domain.model.video.VideoMetaData r26 = new com.app.pornhub.domain.model.video.VideoMetaData
            r0 = r26
            r14 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            r20 = r21
            r21 = r22
            r22 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.u(com.app.pornhub.data.model.videos.VideoModel):com.app.pornhub.domain.model.video.VideoMetaData");
    }

    public final List<VideoMetaData> v(List<VideoModel> list) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (VideoModel videoModel : list) {
            arrayList.add(u(videoModel));
        }
        return arrayList;
    }

    public final List<String> w(String str) {
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        return str.length() == 0 ? CollectionsKt.emptyList() : StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
    }
}
