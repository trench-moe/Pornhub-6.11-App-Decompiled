package z2;

import android.app.Application;
import android.content.SharedPreferences;
import com.app.pornhub.view.editplaylist.EditPlaylistViewModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18826a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f18827b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18828c;

    public f(cb.e eVar, ie.a aVar) {
        this.f18828c = eVar;
        this.f18827b = aVar;
    }

    public f(ie.a aVar, ie.a aVar2) {
        this.f18827b = aVar;
        this.f18828c = aVar2;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f18826a) {
            case 0:
                Application application = (Application) this.f18827b.get();
                Objects.requireNonNull((cb.e) this.f18828c);
                Intrinsics.checkNotNullParameter(application, "application");
                SharedPreferences sharedPreferences = application.getSharedPreferences("persistent_prefs", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "application.getSharedPre…ME, Context.MODE_PRIVATE)");
                Objects.requireNonNull(sharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
                return sharedPreferences;
            default:
                return new EditPlaylistViewModel((j3.e) this.f18827b.get(), (f3.o) ((ie.a) this.f18828c).get());
        }
    }
}
