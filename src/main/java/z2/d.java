package z2;

import android.content.Context;
import android.provider.Settings;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18771a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f18772b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18773c;

    public d(cb.e eVar, ie.a aVar) {
        this.f18773c = eVar;
        this.f18772b = aVar;
    }

    public d(ie.a aVar, ie.a aVar2) {
        this.f18772b = aVar;
        this.f18773c = aVar2;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f18771a) {
            case 0:
                Context context = (Context) this.f18772b.get();
                Objects.requireNonNull((cb.e) this.f18773c);
                Intrinsics.checkNotNullParameter(context, "context");
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                Intrinsics.checkNotNullExpressionValue(string, "getString(\n        conte…s.Secure.ANDROID_ID\n    )");
                Objects.requireNonNull(string, "Cannot return null from a non-@Nullable @Provides method");
                return string;
            default:
                return new com.app.pornhub.view.performerdetails.a((f3.o) this.f18772b.get(), (k3.c) ((ie.a) this.f18773c).get());
        }
    }
}
