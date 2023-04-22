package androidx.navigation.fragment;

import a0.b;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.l;
import androidx.navigation.NavController;
import androidx.navigation.i;
import androidx.navigation.j;
import androidx.navigation.m;
import androidx.navigation.q;
import androidx.navigation.u;
import androidx.navigation.v;
import androidx.navigation.w;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: n0  reason: collision with root package name */
    public q f2653n0;

    /* renamed from: o0  reason: collision with root package name */
    public Boolean f2654o0 = null;

    /* renamed from: p0  reason: collision with root package name */
    public View f2655p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2656q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2657r0;

    public static NavController K0(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.L) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).L0();
            }
            Fragment fragment3 = fragment2.z().f2300t;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).L0();
            }
        }
        View view = fragment.W;
        if (view != null) {
            return u.a(view);
        }
        Dialog dialog = fragment instanceof l ? ((l) fragment).f2188y0 : null;
        if (dialog == null || dialog.getWindow() == null) {
            throw new IllegalStateException(a1.a.k("Fragment ", fragment, " does not have a NavController set"));
        }
        return u.a(dialog.getWindow().getDecorView());
    }

    public final NavController L0() {
        q qVar = this.f2653n0;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    @Override // androidx.fragment.app.Fragment
    public void S(Context context) {
        super.S(context);
        if (this.f2657r0) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(z());
            aVar.s(this);
            aVar.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void T(Fragment fragment) {
        w wVar = this.f2653n0.f2633k;
        Objects.requireNonNull(wVar);
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) wVar.c(w.b(DialogFragmentNavigator.class));
        if (dialogFragmentNavigator.d.remove(fragment.O)) {
            fragment.f2009f0.a(dialogFragmentNavigator.f2652e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.fragment.app.Fragment
    public void U(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.NavHostFragment.U(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i10 = this.M;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i10);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        View view = this.f2655p0;
        if (view != null && u.a(view) == this.f2653n0) {
            this.f2655p0.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f2655p0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.b0(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mb.a.f13054f);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f2656q0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f120j);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f2657r0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void e0(boolean z10) {
        q qVar = this.f2653n0;
        if (qVar == null) {
            this.f2654o0 = Boolean.valueOf(z10);
            return;
        }
        qVar.f2636o = z10;
        qVar.o();
    }

    @Override // androidx.fragment.app.Fragment
    public void h0(Bundle bundle) {
        Bundle bundle2;
        q qVar = this.f2653n0;
        Objects.requireNonNull(qVar);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        loop0: while (true) {
            for (Map.Entry<String, v<? extends m>> entry : qVar.f2633k.f2733a.entrySet()) {
                String key = entry.getKey();
                Bundle d = entry.getValue().d();
                if (d != null) {
                    arrayList.add(key);
                    bundle3.putBundle(key, d);
                }
            }
        }
        if (arrayList.isEmpty()) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        }
        if (!qVar.f2630h.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[qVar.f2630h.size()];
            int i10 = 0;
            for (i iVar : qVar.f2630h) {
                parcelableArr[i10] = new j(iVar);
                i10++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (qVar.f2629g) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", qVar.f2629g);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f2657r0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i11 = this.f2656q0;
        if (i11 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        view.setTag(R.id.nav_controller_view_tag, this.f2653n0);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f2655p0 = view2;
            if (view2.getId() == this.M) {
                this.f2655p0.setTag(R.id.nav_controller_view_tag, this.f2653n0);
            }
        }
    }
}
