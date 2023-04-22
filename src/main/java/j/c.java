package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes2.dex */
public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f11042a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f11043b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f11044c;
    public Configuration d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f11045e;

    public c() {
        super(null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f11042a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f11043b = theme;
    }

    public void a(Configuration configuration) {
        if (this.f11045e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f11043b == null) {
            this.f11043b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11043b.setTo(theme);
            }
        }
        this.f11043b.applyStyle(this.f11042a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f11045e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                this.f11045e = super.getResources();
                return this.f11045e;
            }
            this.f11045e = createConfigurationContext(configuration).getResources();
        }
        return this.f11045e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f11044c == null) {
                this.f11044c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f11044c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11043b;
        if (theme != null) {
            return theme;
        }
        if (this.f11042a == 0) {
            this.f11042a = 2132017750;
        }
        b();
        return this.f11043b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f11042a != i10) {
            this.f11042a = i10;
            b();
        }
    }
}
