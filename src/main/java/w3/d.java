package w3;

import android.content.DialogInterface;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ d f16380f = new d(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ d f16381j = new d(1);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16382c;

    public /* synthetic */ d(int i10) {
        this.f16382c = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f16382c) {
            case 0:
                int i11 = PremiumRegistrationActivity.P;
                dialogInterface.dismiss();
                return;
            default:
                int i12 = r4.a.E0;
                dialogInterface.cancel();
                return;
        }
    }
}
