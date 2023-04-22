package b3;

import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.user.UserSettings;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

/* loaded from: classes.dex */
public interface e {
    Single<Boolean> a();

    void b(UserSettings userSettings);

    String c();

    String d(String str);

    Single<UserMetaData> e(String str);

    UserSettings f();

    void g(boolean z10);

    Single<UserMetaData> h(String str);

    UserOrientation i();

    Observable<UserSettings> j();

    UserMetaData k();

    void l();

    void m(VideoQuality videoQuality);

    Completable n();

    Single<Optional<UserMetaData>> o();

    UserMetaData p();

    Observable<UserOrientation> q();

    Single<UserMetaData> r(String str, String str2, String str3, String str4);

    Observable<Optional<UserMetaData>> s();

    Single<UserMetaData> t(String str, String str2, String str3);
}
