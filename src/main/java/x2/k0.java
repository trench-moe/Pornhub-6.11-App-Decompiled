package x2;

import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17773c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ k0 f17766f = new k0(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ k0 f17767j = new k0(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ k0 f17768m = new k0(2);
    public static final /* synthetic */ k0 n = new k0(3);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ k0 f17769t = new k0(4);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ k0 f17770u = new k0(5);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ k0 f17771w = new k0(6);
    public static final /* synthetic */ k0 y = new k0(7);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ k0 f17772z = new k0(8);
    public static final /* synthetic */ k0 A = new k0(9);
    public static final /* synthetic */ k0 B = new k0(10);
    public static final /* synthetic */ k0 C = new k0(11);
    public static final /* synthetic */ k0 D = new k0(12);
    public static final /* synthetic */ k0 E = new k0(13);
    public static final /* synthetic */ k0 F = new k0(14);
    public static final /* synthetic */ k0 G = new k0(15);
    public static final /* synthetic */ k0 H = new k0(16);

    public /* synthetic */ k0(int i10) {
        this.f17773c = i10;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17773c) {
            case 0:
                User it = (User) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getUserMetaData();
            case 1:
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new UseCaseResult.Failure(it2);
            case 2:
                List it3 = (List) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new UseCaseResult.Result(it3);
            case 3:
                List it4 = (List) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return new UseCaseResult.Result(it4);
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
                UsersConfig.Companion companion = UsersConfig.Companion;
                UserMetaData userMetaData = (UserMetaData) it7.getValue();
                return companion.getUserAuthLevel(userMetaData == null ? null : userMetaData.getUserType());
            case 7:
                Throwable it8 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new UseCaseResult.Failure(it8);
            case 8:
                Throwable it9 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new UseCaseResult.Failure(it9);
            case 9:
                List it10 = (List) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new UseCaseResult.Result(it10);
            case 10:
                Throwable it11 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new UseCaseResult.Failure(it11);
            case 11:
                Throwable it12 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new UseCaseResult.Failure(it12);
            case 12:
                Throwable it13 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new UseCaseResult.Failure(it13);
            case 13:
                Throwable it14 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new UseCaseResult.Failure(it14);
            case 14:
                Throwable it15 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new UseCaseResult.Failure(it15);
            case 15:
                List it16 = (List) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new UseCaseResult.Result(it16);
            default:
                Boolean it17 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new UseCaseResult.Result(it17);
        }
    }
}
