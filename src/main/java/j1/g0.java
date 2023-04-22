package j1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.MenuItem;
import androidx.appcompat.widget.e0;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import com.google.android.exoplayer2.PlaybackException;
import j1.f0;
import java.util.List;
import k8.m;
import kotlin.jvm.internal.Intrinsics;
import r4.c;
import s6.s;
import x6.c0;

/* loaded from: classes2.dex */
public final /* synthetic */ class g0 implements f0.b, e0.a, s.b, m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11213c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f11214f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f11215j;

    public /* synthetic */ g0(Object obj, Object obj2, int i10) {
        this.f11213c = i10;
        this.f11214f = obj;
        this.f11215j = obj2;
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        s6.s sVar = (s6.s) this.f11214f;
        i6.b bVar = s6.s.f14890t;
        Long h10 = sVar.h((SQLiteDatabase) obj, (l6.q) this.f11215j);
        if (h10 == null) {
            return Boolean.FALSE;
        }
        Cursor rawQuery = sVar.f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h10.toString()});
        try {
            return Boolean.valueOf(rawQuery.moveToNext());
        } finally {
            rawQuery.close();
        }
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f11213c) {
            case 3:
                ((x6.c0) obj).o((c0.a) this.f11214f, (PlaybackException) this.f11215j);
                return;
            case 4:
                ((x6.c0) obj).B((c0.a) this.f11214f, (List) this.f11215j);
                return;
            default:
                c0.a aVar = (c0.a) this.f11214f;
                z6.d dVar = (z6.d) this.f11215j;
                x6.c0 c0Var = (x6.c0) obj;
                c0Var.I(aVar, dVar);
                c0Var.Q(aVar, 1, dVar);
                return;
        }
    }

    @Override // androidx.appcompat.widget.e0.a
    public boolean onMenuItemClick(MenuItem menuItem) {
        PlaylistsOverviewAdapter this$0 = (PlaylistsOverviewAdapter) this.f11214f;
        Playlist playlist = (Playlist) this.f11215j;
        int i10 = PlaylistsOverviewAdapter.e.f5262w;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(playlist, "$playlist");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.about) {
            this$0.d.a(playlist, c.a.f14656a);
            return true;
        } else if (itemId != R.id.share) {
            return true;
        } else {
            this$0.d.a(playlist, c.d.f14659a);
            return true;
        }
    }
}
