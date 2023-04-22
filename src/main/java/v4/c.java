package v4;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.app.pornhub.view.offline.a;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16011c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f16012f;

    public /* synthetic */ c(Fragment fragment, int i10) {
        this.f16011c = i10;
        this.f16012f = fragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f16011c) {
            case 0:
                int i11 = com.app.pornhub.view.launch.a.f5378x0;
                ((com.app.pornhub.view.launch.a) this.f16012f).N0();
                dialogInterface.dismiss();
                return;
            default:
                com.app.pornhub.view.offline.a aVar = (com.app.pornhub.view.offline.a) this.f16012f;
                String str = com.app.pornhub.view.offline.a.E0;
                Objects.requireNonNull(aVar);
                dialogInterface.dismiss();
                a.InterfaceC0057a interfaceC0057a = aVar.D0;
                if (interfaceC0057a != null) {
                    interfaceC0057a.f();
                    return;
                }
                return;
        }
    }
}
