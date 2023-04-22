package y8;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f18551c;

    public c(b bVar) {
        this.f18551c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView = (ImageView) view;
        v8.d c10 = v8.b.c(this.f18551c.f18547c.getApplicationContext()).b().c();
        if (c10 != null && c10.c()) {
            try {
                c10.n(!c10.m());
            } catch (IOException | IllegalArgumentException e10) {
                a9.b bVar = b.f18546t;
                Log.e(bVar.f254a, bVar.e("Unable to call CastSession.setMute(boolean).", e10));
            }
        }
    }
}
