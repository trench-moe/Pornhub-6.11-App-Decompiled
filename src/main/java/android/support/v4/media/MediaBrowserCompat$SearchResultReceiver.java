package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends a.b {
    @Override // a.b
    public void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.f(bundle);
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        Objects.requireNonNull(parcelableArray);
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
