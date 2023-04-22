package x2;

import com.app.pornhub.data.model.videos.RelatedVideosResponse;
import com.app.pornhub.data.model.videos.UserVideosResponse;
import com.app.pornhub.domain.error.PornhubException;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17845c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s1 f17846f;

    public /* synthetic */ r1(s1 s1Var, int i10) {
        this.f17845c = i10;
        this.f17846f = s1Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17845c) {
            case 0:
                s1 this$0 = this.f17846f;
                RelatedVideosResponse it = (RelatedVideosResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    return this$0.d.v(it.getRelatedVideos());
                }
                throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
            default:
                s1 this$02 = this.f17846f;
                UserVideosResponse it2 = (UserVideosResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getError() == null) {
                    return this$02.d.v(it2.getUserVideos());
                }
                throw new PornhubException(it2.getError().getCode(), it2.getError().getMessage());
        }
    }
}
