package u1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import x2.l0;

/* loaded from: classes2.dex */
public class f implements d {

    /* renamed from: f  reason: collision with root package name */
    public static Class f15472f;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f15473j;

    /* renamed from: m  reason: collision with root package name */
    public static Method f15474m;
    public static boolean n;

    /* renamed from: t  reason: collision with root package name */
    public static Method f15475t;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f15476u;

    /* renamed from: c  reason: collision with root package name */
    public Object f15477c;

    public /* synthetic */ f() {
    }

    public /* synthetic */ f(b3.c channelsRepository) {
        Intrinsics.checkNotNullParameter(channelsRepository, "channelsRepository");
        this.f15477c = channelsRepository;
    }

    public /* synthetic */ f(b3.f dvdsRepository) {
        Intrinsics.checkNotNullParameter(dvdsRepository, "dvdsRepository");
        this.f15477c = dvdsRepository;
    }

    public /* synthetic */ f(b3.h gifsRepository) {
        Intrinsics.checkNotNullParameter(gifsRepository, "gifsRepository");
        this.f15477c = gifsRepository;
    }

    public /* synthetic */ f(Object obj) {
        this.f15477c = obj;
    }

    public static void c() {
        if (!f15473j) {
            try {
                f15472f = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e10) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e10);
            }
            f15473j = true;
        }
    }

    @Override // u1.d
    public void a(ViewGroup viewGroup, View view) {
    }

    public Observable b(String channelId, int i10, String str) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Observable startWith = ((b3.c) this.f15477c).a(channelId, 8, i10, str).toObservable().map(l0.f17786t).onErrorReturn(x2.y.n).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "channelsRepository.getCh…th(UseCaseResult.Loading)");
        return startWith;
    }

    @Override // u1.d
    public void setVisibility(int i10) {
        ((View) this.f15477c).setVisibility(i10);
    }
}
