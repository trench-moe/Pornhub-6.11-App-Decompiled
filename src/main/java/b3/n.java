package b3;

import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.model.user.UserMetaData;
import io.reactivex.Single;
import java.util.List;

/* loaded from: classes.dex */
public interface n {
    Single<User> a(String str);

    Single<List<UserMetaData>> b(String str, int i10, int i11);

    Single<List<UserMetaData>> c(String str, int i10, int i11);

    Single<List<UserMetaData>> d(String str, int i10, int i11);
}
