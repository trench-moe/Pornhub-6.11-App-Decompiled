package ia;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f10680c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f10681f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f10682j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f10683m;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f10683m = bottomAppBar;
        this.f10680c = actionMenuView;
        this.f10681f = i10;
        this.f10682j = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActionMenuView actionMenuView = this.f10680c;
        actionMenuView.setTranslationX(this.f10683m.F(actionMenuView, this.f10681f, this.f10682j));
    }
}
