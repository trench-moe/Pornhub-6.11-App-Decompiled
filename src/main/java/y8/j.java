package y8;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;

/* loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f18560c;

    public j(b bVar) {
        this.f18560c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f18560c;
        w8.g p10 = bVar.p();
        if (p10 != null) {
            if (!p10.j() || !(bVar.f18547c instanceof o)) {
                return;
            }
            w8.h hVar = new w8.h();
            o oVar = (o) bVar.f18547c;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(oVar.u());
            Fragment I = oVar.u().I("TRACKS_CHOOSER_DIALOG_TAG");
            if (I != null) {
                aVar.h(I);
            }
            hVar.A0 = false;
            hVar.B0 = true;
            aVar.g(0, hVar, "TRACKS_CHOOSER_DIALOG_TAG", 1);
            hVar.f2189z0 = false;
            hVar.f2186v0 = aVar.d();
        }
    }
}
