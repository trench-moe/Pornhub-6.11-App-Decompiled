package w3;

import android.content.DialogInterface;
import b3.j;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16378c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f16379f;

    public /* synthetic */ c(Object obj, int i10) {
        this.f16378c = i10;
        this.f16379f = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f16378c) {
            case 0:
                int i11 = PremiumRegistrationActivity.P;
                ((PremiumRegistrationActivity) this.f16379f).finish();
                return;
            case 1:
                i4.e eVar = (i4.e) this.f16379f;
                eVar.J0.setSegmentSelection(eVar.H0.f10524f);
                kf.a.f12078a.a("Saving album filters: %s", eVar.J0);
                sc.c cVar = eVar.F0;
                AlbumFilters albumFilters = eVar.J0;
                Objects.requireNonNull(cVar);
                Intrinsics.checkNotNullParameter(albumFilters, "albumFilters");
                ((j) cVar.f14954f).c(albumFilters);
                eVar.L0(false, false);
                return;
            case 2:
                com.app.pornhub.view.launch.a aVar = (com.app.pornhub.view.launch.a) this.f16379f;
                int i12 = com.app.pornhub.view.launch.a.f5378x0;
                Objects.requireNonNull(aVar);
                dialogInterface.dismiss();
                aVar.n().finish();
                return;
            default:
                String str = x4.b.D0;
                ((x4.b) this.f16379f).L0(false, false);
                return;
        }
    }
}
