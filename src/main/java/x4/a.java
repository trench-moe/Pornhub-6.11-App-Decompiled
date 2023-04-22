package x4;

import android.content.DialogInterface;
import androidx.fragment.app.l;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.view.offline.a;
import f3.u;
import io.realm.Case;
import io.realm.RealmQuery;
import io.realm.p;
import io.realm.v;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17918c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17919f;

    public /* synthetic */ a(l lVar, int i10) {
        this.f17918c = i10;
        this.f17919f = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f17918c) {
            case 0:
                com.app.pornhub.view.offline.a aVar = (com.app.pornhub.view.offline.a) this.f17919f;
                String str = com.app.pornhub.view.offline.a.E0;
                Objects.requireNonNull(aVar);
                p t2 = p.t();
                t2.e();
                RealmQuery realmQuery = new RealmQuery(t2, r3.d.class);
                String string = aVar.f2019u.getString("vkey");
                Case r32 = Case.SENSITIVE;
                realmQuery.f10812a.e();
                realmQuery.c("vkey", string, r32);
                r3.d dVar = (r3.d) realmQuery.e();
                if (dVar != null && v.w(dVar)) {
                    t2.a();
                    dVar.u();
                    t2.f();
                }
                t2.close();
                aVar.L0(false, false);
                a.InterfaceC0057a interfaceC0057a = aVar.D0;
                if (interfaceC0057a != null) {
                    interfaceC0057a.k();
                    return;
                }
                return;
            default:
                com.app.pornhub.view.videodetails.a aVar2 = (com.app.pornhub.view.videodetails.a) this.f17919f;
                u uVar = aVar2.E0;
                uVar.f9390a.g(aVar2.G0);
                if (aVar2.F0 != null) {
                    VideoQuality videoQuality = (VideoQuality) aVar2.f2019u.getSerializable("quality");
                    u uVar2 = aVar2.D0;
                    Objects.requireNonNull(uVar2);
                    Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
                    uVar2.f9390a.m(videoQuality);
                    aVar2.F0.e();
                    return;
                }
                return;
        }
    }
}
