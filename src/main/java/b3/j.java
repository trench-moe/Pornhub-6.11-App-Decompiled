package b3;

import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.domain.model.photo.Photo;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;

/* loaded from: classes.dex */
public interface j {
    Observable<AlbumFilters> a();

    List<Photo> b();

    void c(AlbumFilters albumFilters);

    Single<List<Album>> d(String str, String str2, int i10, int i11, String str3);

    Single<List<Photo>> e(String str, int i10, int i11);

    Single<List<Photo>> f(String str, int i10, int i11);

    AlbumFilters g();

    Single<List<Album>> h(String str, int i10, int i11, boolean z10);

    AlbumFilters i();
}
