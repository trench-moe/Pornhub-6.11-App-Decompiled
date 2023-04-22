package s3;

import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.rx.QueuedVideoProducer;
import com.app.pornhub.service.VideoDlService;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.Objects;
import k8.m;
import l6.q;
import r6.i;
import t6.a;
import x6.c0;
import z6.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ObservableOnSubscribe, a.InterfaceC0268a, m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14810c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14811f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14812j;

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f14810c = i10;
        this.f14811f = obj;
        this.f14812j = obj2;
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        return ((i) this.f14811f).f14704c.W((q) this.f14812j);
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f14810c) {
            case 2:
                ((c0) obj).s((c0.a) this.f14811f, (Exception) this.f14812j);
                return;
            default:
                c0.a aVar = (c0.a) this.f14811f;
                d dVar = (d) this.f14812j;
                c0 c0Var = (c0) obj;
                c0Var.n(aVar, dVar);
                c0Var.Q(aVar, 2, dVar);
                return;
        }
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        VideoDlService videoDlService = (VideoDlService) this.f14811f;
        int i10 = VideoDlService.C;
        Objects.requireNonNull(videoDlService);
        QueuedVideoProducer<VideoMetaData> queuedVideoProducer = new QueuedVideoProducer<>(observableEmitter);
        videoDlService.n = queuedVideoProducer;
        queuedVideoProducer.d(1L);
        videoDlService.n.c((VideoMetaData) this.f14812j);
    }
}
