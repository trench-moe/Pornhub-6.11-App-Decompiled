package x2;

import com.app.pornhub.data.model.update.UpdateMetadataModel;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.repository.DataWrapper;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17751c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ i1 f17744f = new i1(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ i1 f17745j = new i1(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ i1 f17746m = new i1(2);
    public static final /* synthetic */ i1 n = new i1(3);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ i1 f17747t = new i1(4);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ i1 f17748u = new i1(5);

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ i1 f17749w = new i1(6);
    public static final /* synthetic */ i1 y = new i1(7);

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ i1 f17750z = new i1(8);
    public static final /* synthetic */ i1 A = new i1(9);
    public static final /* synthetic */ i1 B = new i1(10);
    public static final /* synthetic */ i1 C = new i1(11);
    public static final /* synthetic */ i1 D = new i1(12);
    public static final /* synthetic */ i1 E = new i1(13);
    public static final /* synthetic */ i1 F = new i1(14);
    public static final /* synthetic */ i1 G = new i1(15);

    public /* synthetic */ i1(int i10) {
        this.f17751c = i10;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17751c) {
            case 0:
                UpdateMetadataModel it = (UpdateMetadataModel) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                kf.a.f12078a.a("Update check metadata fetched ::: %s", it);
                return Boolean.valueOf(it.getVersionCode() > 2359);
            case 1:
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new UseCaseResult.Failure(it2);
            case 2:
                DataWrapper it3 = (DataWrapper) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof DataWrapper.Success) {
                    return new UseCaseResult.Result(((DataWrapper.Success) it3).a());
                }
                throw ((DataWrapper.Error) it3).a();
            case 3:
                List it4 = (List) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return new UseCaseResult.Result(it4);
            case 4:
                List it5 = (List) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return new UseCaseResult.Result(it5);
            case 5:
                Throwable it6 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return new UseCaseResult.Failure(it6);
            case 6:
                UserMetaData it7 = (UserMetaData) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return new UseCaseResult.Result(it7);
            case 7:
                Boolean it8 = (Boolean) obj;
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
                PerformerContainer it11 = (PerformerContainer) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new UseCaseResult.Result(it11);
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
                List it15 = (List) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new UseCaseResult.Result(it15);
            default:
                List it16 = (List) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new UseCaseResult.Result(it16);
        }
    }
}
