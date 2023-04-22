package x2;

import com.app.pornhub.domain.model.channel.ChannelListContainer;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.dvd.DvdListContainer;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.search.SearchSuggestions;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17907c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ z f17900f = new z(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ z f17901j = new z(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ z f17902m = new z(2);
    public static final /* synthetic */ z n = new z(3);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ z f17903t = new z(4);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ z f17904u = new z(5);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ z f17905w = new z(6);
    public static final /* synthetic */ z y = new z(7);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ z f17906z = new z(8);
    public static final /* synthetic */ z A = new z(9);
    public static final /* synthetic */ z B = new z(10);
    public static final /* synthetic */ z C = new z(11);
    public static final /* synthetic */ z D = new z(12);
    public static final /* synthetic */ z E = new z(13);
    public static final /* synthetic */ z F = new z(14);
    public static final /* synthetic */ z G = new z(15);
    public static final /* synthetic */ z H = new z(16);
    public static final /* synthetic */ z I = new z(17);
    public static final /* synthetic */ z J = new z(18);
    public static final /* synthetic */ z K = new z(19);

    public /* synthetic */ z(int i10) {
        this.f17907c = i10;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17907c) {
            case 0:
                UserSettings it = (UserSettings) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrientation();
            case 1:
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new UseCaseResult.Failure(it2);
            case 2:
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new UseCaseResult.Failure(it3);
            case 3:
                List it4 = (List) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return new UseCaseResult.Result(it4);
            case 4:
                ChannelListContainer it5 = (ChannelListContainer) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return new UseCaseResult.Result(it5);
            case 5:
                CommentActionResult it6 = (CommentActionResult) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return new UseCaseResult.Result(it6);
            case 6:
                Throwable it7 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return new UseCaseResult.Failure(it7);
            case 7:
                CommentActionResult it8 = (CommentActionResult) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new UseCaseResult.Result(it8);
            case 8:
                Throwable it9 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new UseCaseResult.Failure(it9);
            case 9:
                Throwable it10 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new UseCaseResult.Failure(it10);
            case 10:
                DvdListContainer it11 = (DvdListContainer) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new UseCaseResult.Result(it11);
            case 11:
                List it12 = (List) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new UseCaseResult.Result(it12);
            case 12:
                List it13 = (List) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new UseCaseResult.Result(it13);
            case 13:
                Playlist it14 = (Playlist) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new UseCaseResult.Result(it14);
            case 14:
                List it15 = (List) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new UseCaseResult.Result(it15);
            case 15:
                Throwable it16 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new UseCaseResult.Failure(it16);
            case 16:
                SearchSuggestions it17 = (SearchSuggestions) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new UseCaseResult.Result(it17);
            case 17:
                Throwable it18 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new UseCaseResult.Failure(it18);
            case 18:
                Throwable it19 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new UseCaseResult.Failure(it19);
            default:
                Video it20 = (Video) obj;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new UseCaseResult.Result(it20);
        }
    }
}
