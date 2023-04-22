package p4;

import android.content.DialogInterface;
import x4.k;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ b f13791f = new b(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ b f13792j = new b(1);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13793c;

    public /* synthetic */ b(int i10) {
        this.f13793c = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f13793c) {
            case 0:
                String str = d.G0;
                dialogInterface.dismiss();
                return;
            default:
                String str2 = k.D0;
                dialogInterface.dismiss();
                return;
        }
    }
}
