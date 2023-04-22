package k0;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.core.splashscreen.SplashScreenViewProvider;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends d {

    /* renamed from: i  reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f11762i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11763j;

    /* renamed from: k  reason: collision with root package name */
    public final ViewGroup.OnHierarchyChangeListener f11764k;

    /* loaded from: classes2.dex */
    public static final class a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Activity f11766f;

        public a(Activity activity) {
            this.f11766f = activity;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view2 instanceof SplashScreenView) {
                f fVar = f.this;
                SplashScreenView child = (SplashScreenView) view2;
                Objects.requireNonNull(fVar);
                Intrinsics.checkNotNullParameter(child, "child");
                WindowInsets build = new WindowInsets.Builder().build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
                Rect rect = new Rect(IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE);
                fVar.f11763j = (build == child.getRootView().computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
                ((ViewGroup) this.f11766f.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f11768f;

        public b(View view) {
            this.f11768f = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (f.this.f11753f.g()) {
                return false;
            }
            this.f11768f.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f11763j = true;
        this.f11764k = new a(activity);
    }

    @Override // k0.d
    public void b() {
        Resources.Theme theme = this.f11749a.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
        e(theme, new TypedValue());
        ((ViewGroup) this.f11749a.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f11764k);
    }

    @Override // k0.d
    public void c(g keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "<set-?>");
        this.f11753f = keepOnScreenCondition;
        View findViewById = this.f11749a.findViewById(16908290);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.f11762i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f11762i);
        }
        b bVar = new b(findViewById);
        this.f11762i = bVar;
        viewTreeObserver.addOnPreDrawListener(bVar);
    }

    @Override // k0.d
    public void d(final h exitAnimationListener) {
        Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
        this.f11749a.getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: k0.e
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView platformView) {
                f this$0 = f.this;
                h exitAnimationListener2 = exitAnimationListener;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(exitAnimationListener2, "$exitAnimationListener");
                Intrinsics.checkNotNullParameter(platformView, "splashScreenView");
                Objects.requireNonNull(this$0);
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = this$0.f11749a.getTheme();
                Window window = this$0.f11749a.getWindow();
                if (theme.resolveAttribute(16843857, typedValue, true)) {
                    window.setStatusBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(16843858, typedValue, true)) {
                    window.setNavigationBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(16843856, typedValue, true)) {
                    if (typedValue.data != 0) {
                        window.addFlags(IntCompanionObject.MIN_VALUE);
                    } else {
                        window.clearFlags(IntCompanionObject.MIN_VALUE);
                    }
                }
                if (theme.resolveAttribute(16844293, typedValue, true)) {
                    window.setNavigationBarContrastEnforced(typedValue.data != 0);
                }
                if (theme.resolveAttribute(16844292, typedValue, true)) {
                    window.setStatusBarContrastEnforced(typedValue.data != 0);
                }
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(theme, "theme");
                i.b(theme, viewGroup, typedValue);
                viewGroup.setOnHierarchyChangeListener(null);
                window.setDecorFitsSystemWindows(this$0.f11763j);
                Activity ctx = this$0.f11749a;
                Intrinsics.checkNotNullParameter(platformView, "platformView");
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(ctx);
                SplashScreenViewProvider.a aVar = (SplashScreenViewProvider.a) splashScreenViewProvider.f1877a;
                Objects.requireNonNull(aVar);
                Intrinsics.checkNotNullParameter(platformView, "<set-?>");
                aVar.f1880c = platformView;
                ((c) exitAnimationListener2).i(splashScreenViewProvider);
            }
        });
    }
}
