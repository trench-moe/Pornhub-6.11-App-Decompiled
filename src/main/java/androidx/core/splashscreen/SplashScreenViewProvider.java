package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.window.SplashScreenView;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.app.pornhub.R;
import java.util.Objects;
import k0.i;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class SplashScreenViewProvider {
    @SuppressLint({"NewApi"})

    /* renamed from: a  reason: collision with root package name */
    public final ViewImpl f1877a;

    /* loaded from: classes.dex */
    public static class ViewImpl {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f1878a;

        /* renamed from: b  reason: collision with root package name */
        public final Lazy f1879b;

        public ViewImpl(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f1878a = activity;
            this.f1879b = LazyKt.lazy(new Function0<ViewGroup>() { // from class: androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl$_splashScreenView$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public ViewGroup invoke() {
                    View inflate = FrameLayout.inflate(SplashScreenViewProvider.ViewImpl.this.f1878a, R.layout.splash_screen_view, null);
                    Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    return (ViewGroup) inflate;
                }
            });
        }

        public void a() {
            View rootView = ((ViewGroup) this.f1878a.findViewById(16908290)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null) {
                return;
            }
            viewGroup.addView((ViewGroup) this.f1879b.getValue());
        }

        public ViewGroup b() {
            return (ViewGroup) this.f1879b.getValue();
        }

        public void c() {
            ViewParent parent = b().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            viewGroup.removeView(b());
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends ViewImpl {

        /* renamed from: c  reason: collision with root package name */
        public SplashScreenView f1880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void a() {
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public ViewGroup b() {
            SplashScreenView splashScreenView = this.f1880c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("platformView");
            return null;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void c() {
            SplashScreenView splashScreenView = this.f1880c;
            if (splashScreenView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("platformView");
                splashScreenView = null;
            }
            splashScreenView.remove();
            Resources.Theme theme = this.f1878a.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
            View decorView = this.f1878a.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
            i.b(theme, decorView, new TypedValue());
        }
    }

    public SplashScreenViewProvider(Activity ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        int i10 = Build.VERSION.SDK_INT;
        ViewImpl aVar = i10 >= 31 ? new a(ctx) : (i10 != 30 || Build.VERSION.PREVIEW_SDK_INT <= 0) ? new ViewImpl(ctx) : new a(ctx);
        aVar.a();
        this.f1877a = aVar;
    }

    public final View a() {
        return this.f1877a.b();
    }
}
