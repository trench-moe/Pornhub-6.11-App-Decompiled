package x2;

import com.app.pornhub.data.model.adspromos.PromoBannerResponse;
import com.app.pornhub.data.model.gifs.GifListResponse;
import com.app.pornhub.data.model.pornstar.PerformerVideoInfoModel;
import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.data.model.videos.EncodingsModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.data.model.videos.VideoResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoEncodings;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.login.LoginFragment;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17712c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17713f;

    public /* synthetic */ e(Object obj, int i10) {
        this.f17712c = i10;
        this.f17713f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.util.List] */
    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        ArrayList arrayList;
        int i10 = this.f17712c;
        boolean z10 = true;
        String str = BuildConfig.FLAVOR;
        switch (i10) {
            case 0:
                f this$0 = (f) this.f17713f;
                PromoBannerResponse promoBannerResponse = (PromoBannerResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(promoBannerResponse, "it");
                Objects.requireNonNull(this$0.f17721c);
                Intrinsics.checkNotNullParameter(promoBannerResponse, "promoBannerResponse");
                String image = promoBannerResponse.getImage();
                if (image == null) {
                    image = BuildConfig.FLAVOR;
                }
                String url = promoBannerResponse.getUrl();
                if (url != null) {
                    str = url;
                }
                return new PromoBanner(image, str);
            case 1:
                final m0 this$02 = (m0) this.f17713f;
                Optional it = (Optional) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getValue() != null) {
                    Object value = it.getValue();
                    Intrinsics.checkNotNull(value);
                    final UserMetaData userMetaData = (UserMetaData) value;
                    Objects.requireNonNull(this$02);
                    String accessToken = userMetaData.getAccessToken();
                    if (accessToken != null && accessToken.length() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        throw new IllegalStateException("Access token can not be empty");
                    }
                    p2.d dVar = this$02.f17796b;
                    String accessToken2 = userMetaData.getAccessToken();
                    Intrinsics.checkNotNull(accessToken2);
                    Single onErrorResumeNext = dVar.a(accessToken2).map(new Function() { // from class: x2.i0
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj2) {
                            m0 this$03 = m0.this;
                            UserMetaData userMetaData2 = userMetaData;
                            UserResponse it2 = (UserResponse) obj2;
                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                            Intrinsics.checkNotNullParameter(userMetaData2, "$userMetaData");
                            Intrinsics.checkNotNullParameter(it2, "it");
                            if (it2.getUser() != null) {
                                UserMetaData s10 = this$03.d.s(it2.getUser());
                                s10.setUserType(userMetaData2.getUserType());
                                s10.setVerified(userMetaData2.isVerified());
                                s10.setEmailVerificationRequired(userMetaData2.getEmailVerificationRequired());
                                return s10;
                            }
                            throw this$03.v("Couldn't fetch user profile data. UserResponse object didn't contain any of expected data elements.");
                        }
                    }).onErrorResumeNext(new e(userMetaData, 2));
                    Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "tokenService.getUserProf…t(userMetaData)\n        }");
                    return onErrorResumeNext;
                }
                return null;
            case 2:
                UserMetaData userMetaData2 = (UserMetaData) this.f17713f;
                Intrinsics.checkNotNullParameter(userMetaData2, "$userMetaData");
                Intrinsics.checkNotNullParameter((Throwable) obj, "it");
                return Single.just(userMetaData2);
            case 3:
                o0 this$03 = (o0) this.f17713f;
                pe.a0 it2 = (pe.a0) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                return this$03.f17824c.j(this$03.d.a(it2.c()));
            case 4:
                r0 this$04 = (r0) this.f17713f;
                GifListResponse gifListResponse = (GifListResponse) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(gifListResponse, "it");
                if (gifListResponse.getError() == null) {
                    s2.a aVar = this$04.f17843b;
                    Objects.requireNonNull(aVar);
                    Intrinsics.checkNotNullParameter(gifListResponse, "gifListResponse");
                    return aVar.k(gifListResponse.getGifs());
                }
                throw new PornhubException(gifListResponse.getError().getCode(), gifListResponse.getError().getMessage());
            case 5:
                s1 this$05 = (s1) this.f17713f;
                VideoResponse it3 = (VideoResponse) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3.getError() == null) {
                    s2.a aVar2 = this$05.d;
                    VideoModel videoModel = it3.getVideo();
                    Objects.requireNonNull(aVar2);
                    Intrinsics.checkNotNullParameter(videoModel, "videoModel");
                    VideoMetaData u2 = aVar2.u(videoModel);
                    UserMetaData s10 = aVar2.s(videoModel.getUser());
                    String categories = videoModel.getCategories();
                    String str2 = categories == null ? BuildConfig.FLAVOR : categories;
                    List<String> w10 = aVar2.w(videoModel.getTags());
                    String production = videoModel.getProduction();
                    String str3 = production == null ? BuildConfig.FLAVOR : production;
                    List<PerformerVideoInfoModel> pornstars = videoModel.getPornstars();
                    if (pornstars == null) {
                        arrayList = CollectionsKt.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(pornstars, 10));
                        for (PerformerVideoInfoModel performerVideoInfoModel : pornstars) {
                            arrayList2.add(new PerformerMetaData(performerVideoInfoModel.getSlug(), performerVideoInfoModel.getName(), BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, -1, false, false, BuildConfig.FLAVOR, false));
                        }
                        arrayList = arrayList2;
                    }
                    Long addedOn = videoModel.getAddedOn();
                    long longValue = addedOn == null ? 0L : addedOn.longValue();
                    EncodingsModel encodingsModel = videoModel.getEncodings();
                    Intrinsics.checkNotNull(encodingsModel);
                    Intrinsics.checkNotNullParameter(encodingsModel, "encodingsModel");
                    String res480Url = encodingsModel.getRes480Url();
                    String res720Url = encodingsModel.getRes720Url();
                    String str4 = res720Url == null ? BuildConfig.FLAVOR : res720Url;
                    String res1080Url = encodingsModel.getRes1080Url();
                    String str5 = res1080Url == null ? BuildConfig.FLAVOR : res1080Url;
                    String res1440Url = encodingsModel.getRes1440Url();
                    String str6 = res1440Url == null ? BuildConfig.FLAVOR : res1440Url;
                    String res2160Url = encodingsModel.getRes2160Url();
                    VideoEncodings videoEncodings = new VideoEncodings(res480Url, str4, str5, str6, res2160Url == null ? BuildConfig.FLAVOR : res2160Url, encodingsModel.is1440pAvailable(), encodingsModel.is2160pAvailable());
                    Integer vrProjectionType = videoModel.getVrProjectionType();
                    int intValue = vrProjectionType == null ? 0 : vrProjectionType.intValue();
                    Integer vrStereoType = videoModel.getVrStereoType();
                    int intValue2 = vrStereoType == null ? 0 : vrStereoType.intValue();
                    Boolean vrStereoSrc = videoModel.getVrStereoSrc();
                    boolean booleanValue = vrStereoSrc == null ? false : vrStereoSrc.booleanValue();
                    Boolean isPaidToDownload = videoModel.isPaidToDownload();
                    boolean booleanValue2 = isPaidToDownload == null ? false : isPaidToDownload.booleanValue();
                    String trackUrl = videoModel.getTrackUrl();
                    Video video = new Video(u2, s10, str2, w10, str3, arrayList, longValue, videoEncodings, intValue, booleanValue, intValue2, booleanValue2, trackUrl == null ? BuildConfig.FLAVOR : trackUrl, null, BuildConfig.FLAVOR, ConstantsKt.DEFAULT_BUFFER_SIZE, null);
                    video.getEncodings();
                    video.setUrlVideo(BuildConfig.FLAVOR);
                    return video;
                }
                throw new PornhubException(it3.getError().getCode(), it3.getError().getMessage());
            case 6:
                VideoMetaData videoMetaData = (VideoMetaData) obj;
                int i11 = VideoDlService.C;
                ((VideoDlService) this.f17713f).f(videoMetaData);
                return videoMetaData;
            default:
                CharSequence charSequence = (CharSequence) obj;
                String trim = ((LoginFragment) this.f17713f).f5389r0.f4610g.getText().toString().trim();
                return Boolean.valueOf(!trim.isEmpty() && trim.length() >= 3 && trim.length() <= 18);
        }
    }
}
