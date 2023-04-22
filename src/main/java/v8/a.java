package v8;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.internal.cast.zzju;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import t9.t0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<WeakReference<MenuItem>> f16058a;

    static {
        h9.o.f("CastButtonFactory", "The log tag cannot be null or empty.");
        f16058a = new ArrayList();
        new ArrayList();
    }

    public static MenuItem a(Context context, Menu menu, int i10) {
        h9.o.d("Must be called from the main thread.");
        Objects.requireNonNull(menu, "null reference");
        MenuItem findItem = menu.findItem(i10);
        if (findItem != null) {
            try {
                b(context, findItem);
                ((ArrayList) f16058a).add(new WeakReference(findItem));
                t0.b(zzju.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
                return findItem;
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i10)));
            }
        }
        throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i10)));
    }

    public static void b(Context context, MenuItem menuItem) {
        Object obj;
        h9.o.d("Must be called from the main thread.");
        j1.k kVar = null;
        if (menuItem instanceof h0.b) {
            obj = ((h0.b) menuItem).b();
        } else {
            Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
            obj = kVar;
        }
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) obj;
        if (mediaRouteActionProvider == null) {
            throw new IllegalArgumentException();
        }
        b d = b.d(context);
        if (d != null) {
            h9.o.d("Must be called from the main thread.");
            try {
                kVar = j1.k.b(d.f16064b.d());
            } catch (RemoteException e10) {
                b.f16060i.b(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", k0.class.getSimpleName());
            }
            if (kVar == null || mediaRouteActionProvider.f2430f.equals(kVar)) {
                return;
            }
            if (!mediaRouteActionProvider.f2430f.c()) {
                mediaRouteActionProvider.d.i(mediaRouteActionProvider.f2429e);
            }
            if (!kVar.c()) {
                mediaRouteActionProvider.d.a(kVar, mediaRouteActionProvider.f2429e, 0);
            }
            mediaRouteActionProvider.f2430f = kVar;
            mediaRouteActionProvider.j();
            MediaRouteButton mediaRouteButton = mediaRouteActionProvider.f2432h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setRouteSelector(kVar);
            }
        }
    }
}
