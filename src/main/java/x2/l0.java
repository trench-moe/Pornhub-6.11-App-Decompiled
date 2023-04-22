package x2;

import com.app.pornhub.data.model.ResultResponse;
import com.app.pornhub.domain.model.channel.ChannelContainer;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.dvd.DvdContainer;
import com.app.pornhub.domain.model.playlist.PlaylistsOverview;
import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.repository.DataWrapper;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17790c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ l0 f17783f = new l0(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ l0 f17784j = new l0(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ l0 f17785m = new l0(2);
    public static final /* synthetic */ l0 n = new l0(3);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ l0 f17786t = new l0(4);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ l0 f17787u = new l0(5);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ l0 f17788w = new l0(6);
    public static final /* synthetic */ l0 y = new l0(7);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ l0 f17789z = new l0(8);
    public static final /* synthetic */ l0 A = new l0(9);
    public static final /* synthetic */ l0 B = new l0(10);
    public static final /* synthetic */ l0 C = new l0(11);
    public static final /* synthetic */ l0 D = new l0(12);
    public static final /* synthetic */ l0 E = new l0(13);
    public static final /* synthetic */ l0 F = new l0(14);
    public static final /* synthetic */ l0 G = new l0(15);
    public static final /* synthetic */ l0 H = new l0(16);
    public static final /* synthetic */ l0 I = new l0(17);

    public /* synthetic */ l0(int i10) {
        this.f17790c = i10;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17790c) {
            case 0:
                User it = (User) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getUserMetaData();
            case 1:
                ResultResponse it2 = (ResultResponse) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.getResult());
            case 2:
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new UseCaseResult.Failure(it3);
            case 3:
                DataWrapper it4 = (DataWrapper) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof DataWrapper.Success) {
                    return new UseCaseResult.Result(((DataWrapper.Success) it4).a());
                }
                throw ((DataWrapper.Error) it4).a();
            case 4:
                ChannelContainer it5 = (ChannelContainer) obj;
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
                DvdContainer it9 = (DvdContainer) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new UseCaseResult.Result(it9);
            case 9:
                List it10 = (List) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new UseCaseResult.Result(it10);
            case 10:
                Boolean it11 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new UseCaseResult.Result(it11);
            case 11:
                Throwable it12 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new UseCaseResult.Failure(it12);
            case 12:
                List it13 = (List) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new UseCaseResult.Result(it13);
            case 13:
                PlaylistsOverview it14 = (PlaylistsOverview) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new UseCaseResult.Result(it14);
            case 14:
                Boolean it15 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new UseCaseResult.Result(it15);
            case 15:
                Throwable it16 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new UseCaseResult.Failure(it16);
            case 16:
                Throwable it17 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new UseCaseResult.Failure(it17);
            default:
                List it18 = (List) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new UseCaseResult.Result(it18);
        }
    }
}
