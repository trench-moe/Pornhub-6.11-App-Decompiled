package v3;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import j.a;
import kotlin.jvm.internal.Intrinsics;
import x4.e;
import x4.i;
import x4.k;

/* loaded from: classes2.dex */
public final class a implements a.InterfaceC0159a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f15998a;

    public a(b bVar) {
        this.f15998a = bVar;
    }

    @Override // j.a.InterfaceC0159a
    public boolean a(j.a mode, Menu menu) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        mode.f().inflate(R.menu.menu_offline_videos_action_mode, menu);
        return true;
    }

    @Override // j.a.InterfaceC0159a
    public void b(j.a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Fragment I = this.f15998a.u().I(e.class.getSimpleName());
        e eVar = I instanceof e ? (e) I : null;
        if (eVar == null) {
            return;
        }
        i iVar = eVar.f17925s0;
        iVar.f17937j.clear();
        iVar.f2802a.b();
        iVar.f17938k = false;
    }

    @Override // j.a.InterfaceC0159a
    public boolean c(j.a mode, MenuItem item) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.offline_videos_action_delete) {
            Fragment I = this.f15998a.u().I(e.class.getSimpleName());
            e eVar = I instanceof e ? (e) I : null;
            if (eVar != null) {
                if (!eVar.f17925s0.f17937j.isEmpty()) {
                    String I2 = eVar.I(R.string.delete_selected_videos);
                    String I3 = eVar.I(R.string.remove);
                    String I4 = eVar.I(R.string.cancel);
                    String str = k.D0;
                    Bundle bundle = new Bundle();
                    bundle.putString("title", I2);
                    bundle.putString("positive_btn_txt", I3);
                    bundle.putString("negative_btn_txt", I4);
                    k kVar = new k();
                    kVar.A0(bundle);
                    kVar.G0(eVar, 11);
                    kVar.Q0(eVar.n().u(), k.D0);
                }
                return true;
            }
        }
        return false;
    }

    @Override // j.a.InterfaceC0159a
    public boolean d(j.a mode, Menu menu) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }
}
