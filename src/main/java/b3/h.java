package b3;

import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.gif.MostRecentGifsContainer;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;

/* loaded from: classes.dex */
public interface h {
    Single<Gif> a(String str);

    Single<List<GifMetaData>> b(String str, int i10, int i11);

    Completable c(String str, int i10, String str2);

    Single<List<GifMetaData>> d(String str, String str2, int i10, int i11, String str3);

    Single<MostRecentGifsContainer> e(String str, int i10, int i11);

    Single<Boolean> f(String str, boolean z10);

    Completable g(String str);

    Completable h(String str);
}
