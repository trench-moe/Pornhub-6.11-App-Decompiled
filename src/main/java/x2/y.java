package x2;

import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.performer.PerformerSortingConfig;
import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17897c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ y f17890f = new y(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ y f17891j = new y(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ y f17892m = new y(2);
    public static final /* synthetic */ y n = new y(3);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ y f17893t = new y(4);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ y f17894u = new y(5);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ y f17895w = new y(6);
    public static final /* synthetic */ y y = new y(7);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ y f17896z = new y(8);
    public static final /* synthetic */ y A = new y(9);
    public static final /* synthetic */ y B = new y(10);
    public static final /* synthetic */ y C = new y(11);
    public static final /* synthetic */ y D = new y(12);
    public static final /* synthetic */ y E = new y(13);
    public static final /* synthetic */ y F = new y(14);
    public static final /* synthetic */ y G = new y(15);
    public static final /* synthetic */ y H = new y(16);
    public static final /* synthetic */ y I = new y(17);
    public static final /* synthetic */ y J = new y(18);

    public /* synthetic */ y(int i10) {
        this.f17897c = i10;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17897c) {
            case 0:
                User it = (User) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getUserMetaData();
            case 1:
                PromoBanner it2 = (PromoBanner) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.isAvailable() ? new UseCaseResult.Result(it2) : new UseCaseResult.Failure(new IllegalStateException("Promo Banner not available"));
            case 2:
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new UseCaseResult.Failure(it3);
            case 3:
                Throwable it4 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return new UseCaseResult.Failure(it4);
            case 4:
                Throwable it5 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return new UseCaseResult.Failure(it5);
            case 5:
                Throwable it6 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return new UseCaseResult.Failure(it6);
            case 6:
                Optional it7 = (Optional) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (it7.getValue() != null) {
                    return new UseCaseResult.Result(it7.getValue());
                }
                throw new OperationException(0, BuildConfig.FLAVOR);
            case 7:
                Throwable it8 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new UseCaseResult.Failure(it8);
            case 8:
                Throwable it9 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new UseCaseResult.Failure(it9);
            case 9:
                Throwable it10 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new UseCaseResult.Failure(it10);
            case 10:
                List it11 = (List) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new UseCaseResult.Result(it11);
            case 11:
                List it12 = (List) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new UseCaseResult.Result(it12);
            case 12:
                Throwable it13 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new UseCaseResult.Failure(it13);
            case 13:
                Throwable it14 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new UseCaseResult.Failure(it14);
            case 14:
                PerformerSortingConfig it15 = (PerformerSortingConfig) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new UseCaseResult.Result(it15);
            case 15:
                Throwable it16 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new UseCaseResult.Failure(it16);
            case 16:
                User it17 = (User) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new UseCaseResult.Result(it17);
            case 17:
                List it18 = (List) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new UseCaseResult.Result(it18);
            default:
                Throwable it19 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new UseCaseResult.Failure(it19);
        }
    }
}
