package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c0.a;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class a implements h0.b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f11709a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f11710b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f11711c;
    public char d;

    /* renamed from: f  reason: collision with root package name */
    public char f11713f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f11715h;

    /* renamed from: i  reason: collision with root package name */
    public Context f11716i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f11717j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f11718k;

    /* renamed from: e  reason: collision with root package name */
    public int f11712e = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: g  reason: collision with root package name */
    public int f11714g = ConstantsKt.DEFAULT_BLOCK_SIZE;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f11719l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f11720m = null;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11721o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f11722p = 16;

    public a(Context context, int i10, int i11, int i12, CharSequence charSequence) {
        this.f11716i = context;
        this.f11709a = charSequence;
    }

    @Override // h0.b
    public h0.b a(n0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b
    public n0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f11715h;
        if (drawable != null && (this.n || this.f11721o)) {
            Drawable h10 = f0.a.h(drawable);
            this.f11715h = h10;
            Drawable mutate = h10.mutate();
            this.f11715h = mutate;
            if (this.n) {
                mutate.setTintList(this.f11719l);
            }
            if (this.f11721o) {
                this.f11715h.setTintMode(this.f11720m);
            }
        }
    }

    @Override // h0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // h0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f11714g;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f11713f;
    }

    @Override // h0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f11717j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f11715h;
    }

    @Override // h0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f11719l;
    }

    @Override // h0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f11720m;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f11711c;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f11712e;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f11709a;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11710b;
        return charSequence != null ? charSequence : this.f11709a;
    }

    @Override // h0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f11718k;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // h0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f11722p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f11722p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f11722p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f11722p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f11713f = Character.toLowerCase(c10);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f11713f = Character.toLowerCase(c10);
        this.f11714g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f11722p = (z10 ? 1 : 0) | (this.f11722p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f11722p = (z10 ? 2 : 0) | (this.f11722p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f11717j = charSequence;
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public h0.b setContentDescription(CharSequence charSequence) {
        this.f11717j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f11722p = (z10 ? 16 : 0) | (this.f11722p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        Context context = this.f11716i;
        Object obj = c0.a.f3717a;
        this.f11715h = a.c.b(context, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f11715h = drawable;
        c();
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11719l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11720m = mode;
        this.f11721o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f11711c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.d = c10;
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.d = c10;
        this.f11712e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.d = c10;
        this.f11713f = Character.toLowerCase(c11);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d = c10;
        this.f11712e = KeyEvent.normalizeMetaState(i10);
        this.f11713f = Character.toLowerCase(c11);
        this.f11714g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // h0.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f11709a = this.f11716i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f11709a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11710b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f11718k = charSequence;
        return this;
    }

    @Override // h0.b, android.view.MenuItem
    public h0.b setTooltipText(CharSequence charSequence) {
        this.f11718k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f11722p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f11722p = i11 | i10;
        return this;
    }
}
