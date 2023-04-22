package b3;

import com.app.pornhub.domain.model.update.ProgressEvent;
import io.reactivex.Observable;
import io.reactivex.Single;

/* loaded from: classes.dex */
public interface m {
    Single<Boolean> a();

    Observable<ProgressEvent> b();
}
