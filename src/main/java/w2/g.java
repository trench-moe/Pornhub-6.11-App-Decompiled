package w2;

import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;
import pe.a0;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\t"}, d2 = {"Lw2/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "segment", "Lio/reactivex/Single;", "Lpe/a0;", "a", "userId", "b", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface g {
    @jf.f("explore")
    Single<a0> a(@t("segment") String str);

    @jf.f("discover")
    Single<a0> b(@t("userId") String str, @t("segment") String str2);
}
