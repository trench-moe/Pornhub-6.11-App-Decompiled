package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.mediarouter.app.OverlayListView;
import j1.l;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f2538c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f2539f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f f2540j;

    public g(f fVar, Map map, Map map2) {
        this.f2540j = fVar;
        this.f2538c = map;
        this.f2539f = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        OverlayListView.a aVar;
        l.i iVar;
        this.f2540j.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        f fVar = this.f2540j;
        Map map = this.f2538c;
        Map map2 = this.f2539f;
        Set<l.i> set = fVar.T;
        if (set == null || fVar.U == null) {
            return;
        }
        int size = set.size() - fVar.U.size();
        h hVar = new h(fVar);
        int firstVisiblePosition = fVar.Q.getFirstVisiblePosition();
        boolean z10 = false;
        for (int i10 = 0; i10 < fVar.Q.getChildCount(); i10++) {
            View childAt = fVar.Q.getChildAt(i10);
            l.i item = fVar.R.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(item);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (fVar.f2488a0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set<l.i> set2 = fVar.T;
            if (set2 == null || !set2.contains(item)) {
                iVar = item;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                iVar = item;
                alphaAnimation.setDuration(fVar.f2511u0);
                animationSet.addAnimation(alphaAnimation);
                i11 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11 - top, 0.0f);
            translateAnimation.setDuration(fVar.f2509t0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(fVar.w0);
            if (!z10) {
                animationSet.setAnimationListener(hVar);
                z10 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            l.i iVar2 = iVar;
            map.remove(iVar2);
            map2.remove(iVar2);
        }
        for (Map.Entry entry : map2.entrySet()) {
            l.i iVar3 = (l.i) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(iVar3);
            if (fVar.U.contains(iVar3)) {
                aVar = new OverlayListView.a(bitmapDrawable, rect2);
                aVar.f2465h = 1.0f;
                aVar.f2466i = 0.0f;
                aVar.f2462e = fVar.f2512v0;
                aVar.d = fVar.w0;
            } else {
                OverlayListView.a aVar2 = new OverlayListView.a(bitmapDrawable, rect2);
                aVar2.f2464g = fVar.f2488a0 * size;
                aVar2.f2462e = fVar.f2509t0;
                aVar2.d = fVar.w0;
                aVar2.f2470m = new c(fVar, iVar3);
                fVar.V.add(iVar3);
                aVar = aVar2;
            }
            fVar.Q.f2458c.add(aVar);
        }
    }
}
