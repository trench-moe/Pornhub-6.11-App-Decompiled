package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import n0.b;

/* loaded from: classes.dex */
public final class g implements h0.b {
    public n0.b A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a  reason: collision with root package name */
    public final int f667a;

    /* renamed from: b  reason: collision with root package name */
    public final int f668b;

    /* renamed from: c  reason: collision with root package name */
    public final int f669c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f670e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f671f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f672g;

    /* renamed from: h  reason: collision with root package name */
    public char f673h;

    /* renamed from: j  reason: collision with root package name */
    public char f675j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f677l;
    public e n;

    /* renamed from: o  reason: collision with root package name */
    public l f679o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f680p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f681q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f682r;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public View f689z;

    /* renamed from: i  reason: collision with root package name */
    public int f674i = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: k  reason: collision with root package name */
    public int f676k = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: m  reason: collision with root package name */
    public int f678m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f683s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f684t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f685u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f686v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f687w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f688x = 16;
    public boolean C = false;

    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0217b {
        public a() {
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.y = 0;
        this.n = eVar;
        this.f667a = i11;
        this.f668b = i10;
        this.f669c = i12;
        this.d = i13;
        this.f670e = charSequence;
        this.y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // h0.b
    public h0.b a(n0.b bVar) {
        n0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f13099c = null;
            bVar2.f13098b = null;
        }
        this.f689z = null;
        this.A = bVar;
        this.n.p(true);
        n0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // h0.b
    public n0.b b() {
        return this.A;
    }

    @Override // h0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f689z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f687w && (this.f685u || this.f686v)) {
            drawable = f0.a.h(drawable).mutate();
            if (this.f685u) {
                drawable.setTintList(this.f683s);
            }
            if (this.f686v) {
                drawable.setTintMode(this.f684t);
            }
            this.f687w = false;
        }
        return drawable;
    }

    public char e() {
        return this.n.n() ? this.f675j : this.f673h;
    }

    @Override // h0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (f()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.n.f(this);
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        n0.b bVar;
        if ((this.y & 8) != 0) {
            if (this.f689z == null && (bVar = this.A) != null) {
                this.f689z = bVar.d(this);
            }
            return this.f689z != null;
        }
        return false;
    }

    public boolean g() {
        return (this.f688x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // h0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f689z;
        if (view != null) {
            return view;
        }
        n0.b bVar = this.A;
        if (bVar != null) {
            View d = bVar.d(this);
            this.f689z = d;
            return d;
        }
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f676k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f675j;
    }

    @Override // h0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f681q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f668b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f677l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f678m;
        if (i10 != 0) {
            Drawable a10 = f.a.a(this.n.f642a, i10);
            this.f678m = 0;
            this.f677l = a10;
            return d(a10);
        }
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f683s;
    }

    @Override // h0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f684t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f672g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f667a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // h0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f674i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f673h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f669c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f679o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f670e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f671f;
        return charSequence != null ? charSequence : this.f670e;
    }

    @Override // h0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f682r;
    }

    public boolean h() {
        return (this.f688x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f679o != null;
    }

    public h0.b i(View view) {
        int i10;
        this.f689z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f667a) > 0) {
            view.setId(i10);
        }
        e eVar = this.n;
        eVar.f651k = true;
        eVar.p(true);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f688x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f688x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f688x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        n0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f688x & 8) == 0 : (this.f688x & 8) == 0 && this.A.b();
    }

    public void j(boolean z10) {
        int i10 = this.f688x;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f688x = i11;
        if (i10 != i11) {
            this.n.p(false);
        }
    }

    public void k(boolean z10) {
        this.f688x = (z10 ? 4 : 0) | (this.f688x & (-5));
    }

    public void l(boolean z10) {
        if (z10) {
            this.f688x |= 32;
        } else {
            this.f688x &= -33;
        }
    }

    public boolean m(boolean z10) {
        int i10 = this.f688x;
        boolean z11 = false;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f688x = i11;
        if (i10 != i11) {
            z11 = true;
        }
        return z11;
    }

    public boolean n() {
        return this.n.o() && e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setActionView(int i10) {
        Context context = this.n.f642a;
        i(LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f675j == c10) {
            return this;
        }
        this.f675j = Character.toLowerCase(c10);
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f675j == c10 && this.f676k == i10) {
            return this;
        }
        this.f675j = Character.toLowerCase(c10);
        this.f676k = KeyEvent.normalizeMetaState(i10);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f688x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f688x = i11;
        if (i10 != i11) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f688x & 4) != 0) {
            e eVar = this.n;
            Objects.requireNonNull(eVar);
            int groupId = getGroupId();
            int size = eVar.f646f.size();
            eVar.A();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = eVar.f646f.get(i10);
                if (gVar.f668b == groupId && gVar.h() && gVar.isCheckable()) {
                    gVar.j(gVar == this);
                }
            }
            eVar.z();
        } else {
            j(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f681q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public h0.b setContentDescription(CharSequence charSequence) {
        this.f681q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f688x |= 16;
        } else {
            this.f688x &= -17;
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f677l = null;
        this.f678m = i10;
        this.f687w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f678m = 0;
        this.f677l = drawable;
        this.f687w = true;
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f683s = colorStateList;
        this.f685u = true;
        this.f687w = true;
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f684t = mode;
        this.f686v = true;
        this.f687w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f672g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f673h == c10) {
            return this;
        }
        this.f673h = c10;
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f673h == c10 && this.f674i == i10) {
            return this;
        }
        this.f673h = c10;
        this.f674i = KeyEvent.normalizeMetaState(i10);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f680p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f673h = c10;
        this.f675j = Character.toLowerCase(c11);
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f673h = c10;
        this.f674i = KeyEvent.normalizeMetaState(i10);
        this.f675j = Character.toLowerCase(c11);
        this.f676k = KeyEvent.normalizeMetaState(i11);
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i10;
        e eVar = this.n;
        eVar.f651k = true;
        eVar.p(true);
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        setTitle(this.n.f642a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f670e = charSequence;
        this.n.p(false);
        l lVar = this.f679o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f671f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f682r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public h0.b setTooltipText(CharSequence charSequence) {
        this.f682r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m(z10)) {
            e eVar = this.n;
            eVar.f648h = true;
            eVar.p(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f670e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
