package u4;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ b f15527f = new b(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ b f15528j = new b(1);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15529c;

    public /* synthetic */ b(int i10) {
        this.f15529c = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f15529c) {
            case 0:
                String str = d.U0;
                return;
            default:
                String str2 = com.app.pornhub.view.videodetails.a.H0;
                dialogInterface.dismiss();
                return;
        }
    }
}
