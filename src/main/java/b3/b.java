package b3;

import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.repository.DataWrapper;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface b {
    String a(String str);

    Single<List<Category>> b(Collection<String> collection);

    Single<List<String>> c(String str);

    Single<List<Category>> d(Collection<String> collection);

    Observable<DataWrapper<List<Category>>> e();

    Observable<DataWrapper<List<Category>>> f();
}
