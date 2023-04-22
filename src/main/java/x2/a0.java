package x2;

import com.app.pornhub.data.model.ResultResponse;
import com.app.pornhub.domain.model.OptionalKt;
import com.app.pornhub.domain.model.ads_promo.PornhubAd;
import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.domain.model.gif.MostRecentGifsContainer;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17678c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ a0 f17671f = new a0(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ a0 f17672j = new a0(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ a0 f17673m = new a0(2);
    public static final /* synthetic */ a0 n = new a0(3);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ a0 f17674t = new a0(4);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ a0 f17675u = new a0(5);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ a0 f17676w = new a0(6);
    public static final /* synthetic */ a0 y = new a0(7);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ a0 f17677z = new a0(8);
    public static final /* synthetic */ a0 A = new a0(9);
    public static final /* synthetic */ a0 B = new a0(10);
    public static final /* synthetic */ a0 C = new a0(11);
    public static final /* synthetic */ a0 D = new a0(12);
    public static final /* synthetic */ a0 E = new a0(13);
    public static final /* synthetic */ a0 F = new a0(14);
    public static final /* synthetic */ a0 G = new a0(15);
    public static final /* synthetic */ a0 H = new a0(16);
    public static final /* synthetic */ a0 I = new a0(17);
    public static final /* synthetic */ a0 J = new a0(18);
    public static final /* synthetic */ a0 K = new a0(19);
    public static final /* synthetic */ a0 L = new a0(20);
    public static final /* synthetic */ a0 M = new a0(21);
    public static final /* synthetic */ a0 N = new a0(22);
    public static final /* synthetic */ a0 O = new a0(23);

    public /* synthetic */ a0(int i10) {
        this.f17678c = i10;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17678c) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj, "it");
                return OptionalKt.asOptional(null);
            case 1:
                ResultResponse it = (ResultResponse) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getResult());
            case 2:
                ResultResponse it2 = (ResultResponse) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.getResult());
            case 3:
                PornhubAd it3 = (PornhubAd) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new UseCaseResult.Result(it3);
            case 4:
                Throwable it4 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return new UseCaseResult.Failure(it4);
            case 5:
                Throwable it5 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return new UseCaseResult.Failure(it5);
            case 6:
                Throwable it6 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return new UseCaseResult.Failure(it6);
            case 7:
                Throwable it7 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return new UseCaseResult.Failure(it7);
            case 8:
                UserMetaData it8 = (UserMetaData) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new UseCaseResult.Result(it8);
            case 9:
                UserMetaData it9 = (UserMetaData) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new UseCaseResult.Result(it9);
            case 10:
                Throwable it10 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new UseCaseResult.Failure(it10);
            case 11:
                Throwable it11 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new UseCaseResult.Failure(it11);
            case 12:
                Gif it12 = (Gif) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new UseCaseResult.Result(it12);
            case 13:
                MostRecentGifsContainer it13 = (MostRecentGifsContainer) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new UseCaseResult.Result(it13);
            case 14:
                List it14 = (List) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new UseCaseResult.Result(it14);
            case 15:
                Throwable it15 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new UseCaseResult.Failure(it15);
            case 16:
                Throwable it16 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new UseCaseResult.Failure(it16);
            case 17:
                Throwable it17 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new UseCaseResult.Failure(it17);
            case 18:
                PerformerContainer it18 = (PerformerContainer) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new UseCaseResult.Result(it18);
            case 19:
                List it19 = (List) obj;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new UseCaseResult.Result(it19);
            case 20:
                Throwable it20 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new UseCaseResult.Failure(it20);
            case 21:
                List it21 = (List) obj;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new UseCaseResult.Result(it21);
            case 22:
                List it22 = (List) obj;
                Intrinsics.checkNotNullParameter(it22, "it");
                return new UseCaseResult.Result(it22);
            default:
                Throwable it23 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it23, "it");
                return new UseCaseResult.Failure(it23);
        }
    }
}
