package k0;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.app.pornhub.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f11749a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f11750b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f11751c;
    public Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11752e;

    /* renamed from: f  reason: collision with root package name */
    public g f11753f;

    /* renamed from: g  reason: collision with root package name */
    public h f11754g;

    /* renamed from: h  reason: collision with root package name */
    public SplashScreenViewProvider f11755h;

    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f11757f;

        public a(View view) {
            this.f11757f = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (d.this.f11753f.g()) {
                return false;
            }
            this.f11757f.getViewTreeObserver().removeOnPreDrawListener(this);
            d dVar = d.this;
            SplashScreenViewProvider splashScreenViewProvider = dVar.f11755h;
            if (splashScreenViewProvider != null) {
                dVar.a(splashScreenViewProvider);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ SplashScreenViewProvider f11759f;

        public b(SplashScreenViewProvider splashScreenViewProvider) {
            this.f11759f = splashScreenViewProvider;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.isAttachedToWindow()) {
                view.removeOnLayoutChangeListener(this);
                if (!d.this.f11753f.g()) {
                    d.this.a(this.f11759f);
                    return;
                }
                d.this.f11755h = this.f11759f;
            }
        }
    }

    public d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f11749a = activity;
        this.f11753f = c.f11741f;
    }

    public final void a(SplashScreenViewProvider splashScreenViewProvider) {
        Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
        h hVar = this.f11754g;
        if (hVar == null) {
            return;
        }
        this.f11754g = null;
        splashScreenViewProvider.a().postOnAnimation(new k0.b(hVar, splashScreenViewProvider, 0));
    }

    public void b() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme currentTheme = this.f11749a.getTheme();
        boolean z10 = true;
        if (currentTheme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
            this.f11750b = Integer.valueOf(typedValue.resourceId);
            this.f11751c = Integer.valueOf(typedValue.data);
        }
        if (currentTheme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.d = currentTheme.getDrawable(typedValue.resourceId);
        }
        if (currentTheme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
            if (typedValue.resourceId != R.dimen.splashscreen_icon_size_with_background) {
                z10 = false;
            }
            this.f11752e = z10;
        }
        Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
        e(currentTheme, typedValue);
    }

    public void c(g keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        this.f11753f = keepOnScreenCondition;
        View findViewById = this.f11749a.findViewById(16908290);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new a(findViewById));
    }

    public void d(h exitAnimationListener) {
        float dimension;
        Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
        this.f11754g = exitAnimationListener;
        SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(this.f11749a);
        Integer num = this.f11750b;
        Integer num2 = this.f11751c;
        View a10 = splashScreenViewProvider.a();
        if (num != null && num.intValue() != 0) {
            a10.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            a10.setBackgroundColor(num2.intValue());
        } else {
            a10.setBackground(this.f11749a.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            ImageView imageView = (ImageView) a10.findViewById(R.id.splashscreen_icon_view);
            if (this.f11752e) {
                Drawable drawable2 = imageView.getContext().getDrawable(R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawable2 != null) {
                    imageView.setBackground(new k0.a(drawable2, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new k0.a(drawable, dimension));
        }
        a10.addOnLayoutChangeListener(new b(splashScreenViewProvider));
    }

    public final void e(Resources.Theme currentTheme, TypedValue typedValue) {
        int i10;
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (!currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i10 = typedValue.resourceId) == 0) {
            return;
        }
        this.f11749a.setTheme(i10);
    }
}
