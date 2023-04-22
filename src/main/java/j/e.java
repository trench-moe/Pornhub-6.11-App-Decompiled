package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import j.a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11051a;

    /* renamed from: b  reason: collision with root package name */
    public final j.a f11052b;

    /* loaded from: classes2.dex */
    public static class a implements a.InterfaceC0159a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f11053a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f11054b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f11055c = new ArrayList<>();
        public final p.g<Menu, Menu> d = new p.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f11054b = context;
            this.f11053a = callback;
        }

        @Override // j.a.InterfaceC0159a
        public boolean a(j.a aVar, Menu menu) {
            return this.f11053a.onCreateActionMode(e(aVar), f(menu));
        }

        @Override // j.a.InterfaceC0159a
        public void b(j.a aVar) {
            this.f11053a.onDestroyActionMode(e(aVar));
        }

        @Override // j.a.InterfaceC0159a
        public boolean c(j.a aVar, MenuItem menuItem) {
            return this.f11053a.onActionItemClicked(e(aVar), new k.c(this.f11054b, (h0.b) menuItem));
        }

        @Override // j.a.InterfaceC0159a
        public boolean d(j.a aVar, Menu menu) {
            return this.f11053a.onPrepareActionMode(e(aVar), f(menu));
        }

        public ActionMode e(j.a aVar) {
            int size = this.f11055c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f11055c.get(i10);
                if (eVar != null && eVar.f11052b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f11054b, aVar);
            this.f11055c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault == null) {
                orDefault = new k.e(this.f11054b, (h0.a) menu);
                this.d.put(menu, orDefault);
            }
            return orDefault;
        }
    }

    public e(Context context, j.a aVar) {
        this.f11051a = context;
        this.f11052b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f11052b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f11052b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new k.e(this.f11051a, (h0.a) this.f11052b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f11052b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f11052b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f11052b.f11040c;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f11052b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f11052b.f11041f;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f11052b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f11052b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f11052b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f11052b.l(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f11052b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f11052b.f11040c = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f11052b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f11052b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f11052b.p(z10);
    }
}
