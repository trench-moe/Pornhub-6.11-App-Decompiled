package b3;

import com.app.pornhub.domain.model.dvd.DvdContainer;
import com.app.pornhub.domain.model.dvd.DvdListContainer;
import io.reactivex.Single;

/* loaded from: classes.dex */
public interface f {
    Single<DvdListContainer> a(String str, String str2, String str3, int i10, int i11);

    Single<DvdContainer> b(String str, int i10, int i11);
}
