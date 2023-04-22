package e;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.w0;
import com.app.pornhub.R;
import j.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class g extends androidx.fragment.app.o implements h {
    public androidx.appcompat.app.c D;

    public g() {
        this.f1828m.f3134b.b("androidx:appcompat", new e(this));
        r(new f(this));
    }

    public g(int i10) {
        super(i10);
        this.f1828m.f3134b.b("androidx:appcompat", new e(this));
        r(new f(this));
    }

    private void t() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public void A(Toolbar toolbar) {
        x().x(toolbar);
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        x().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(x().d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar y = y();
        if (getWindow().hasFeature(0)) {
            if (y == null || !y.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // b0.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar y = y();
        if (keyCode == 82 && y != null && y.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) x().e(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return x().g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i10 = w0.f1139a;
        return super.getResources();
    }

    @Override // e.h
    public void h(j.a aVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        x().j();
    }

    @Override // e.h
    public void n(j.a aVar) {
    }

    @Override // androidx.fragment.app.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x().k(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        x().m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.fragment.app.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r7, android.view.MenuItem r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.onMenuItemSelected(int, android.view.MenuItem):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        x().n(bundle);
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        x().o();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onStart() {
        super.onStart();
        x().q();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onStop() {
        super.onStop();
        x().r();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        x().z(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar y = y();
        if (getWindow().hasFeature(0)) {
            if (y == null || !y.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // e.h
    public j.a p(a.InterfaceC0159a interfaceC0159a) {
        return null;
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        t();
        x().u(i10);
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        t();
        x().v(view);
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        x().w(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        x().y(i10);
    }

    @Override // androidx.fragment.app.o
    public void w() {
        x().j();
    }

    public androidx.appcompat.app.c x() {
        if (this.D == null) {
            p.c<WeakReference<androidx.appcompat.app.c>> cVar = androidx.appcompat.app.c.f498c;
            this.D = new androidx.appcompat.app.d(this, null, this, this);
        }
        return this.D;
    }

    public ActionBar y() {
        return x().h();
    }

    public Intent z() {
        return b0.h.a(this);
    }
}
