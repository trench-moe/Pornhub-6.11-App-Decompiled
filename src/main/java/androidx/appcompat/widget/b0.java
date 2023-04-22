package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b0 extends ListPopupWindow implements a0 {
    public static Method T;
    public a0 S;

    /* loaded from: classes.dex */
    public static class a extends w {
        public final int D;
        public final int E;
        public a0 F;
        public MenuItem G;

        public a(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.D = 21;
                this.E = 22;
                return;
            }
            this.D = 22;
            this.E = 21;
        }

        @Override // androidx.appcompat.widget.w, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            androidx.appcompat.view.menu.d dVar;
            int pointToPosition;
            int i11;
            if (this.F != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                androidx.appcompat.view.menu.g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < dVar.getCount()) {
                    gVar = dVar.getItem(i11);
                }
                MenuItem menuItem = this.G;
                if (menuItem != gVar) {
                    androidx.appcompat.view.menu.e eVar = dVar.f637c;
                    if (menuItem != null) {
                        this.F.g(eVar, menuItem);
                    }
                    this.G = gVar;
                    if (gVar != null) {
                        this.F.a(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.D) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.E) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).f637c.c(false);
                return true;
            }
        }

        public void setHoverListener(a0 a0Var) {
            this.F = a0Var;
        }

        @Override // androidx.appcompat.widget.w, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public b0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.a0
    public void a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        a0 a0Var = this.S;
        if (a0Var != null) {
            a0Var.a(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void g(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        a0 a0Var = this.S;
        if (a0Var != null) {
            a0Var.g(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public w q(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }
}
