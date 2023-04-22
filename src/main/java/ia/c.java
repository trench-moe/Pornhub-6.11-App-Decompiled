package ia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* loaded from: classes2.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10676a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f10677b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10678c;
    public final /* synthetic */ boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f10679e;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f10679e = bottomAppBar;
        this.f10677b = actionMenuView;
        this.f10678c = i10;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f10676a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f10676a) {
            BottomAppBar bottomAppBar = this.f10679e;
            int i10 = bottomAppBar.w0;
            boolean z10 = i10 != 0;
            if (i10 != 0) {
                bottomAppBar.w0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.n(i10);
            }
            BottomAppBar bottomAppBar2 = this.f10679e;
            ActionMenuView actionMenuView = this.f10677b;
            int i11 = this.f10678c;
            boolean z11 = this.d;
            Objects.requireNonNull(bottomAppBar2);
            d dVar = new d(bottomAppBar2, actionMenuView, i11, z11);
            if (z10) {
                actionMenuView.post(dVar);
                return;
            }
            dVar.run();
        }
    }
}
